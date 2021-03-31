public final class Sentence { 
        
    private Sentence(){
        throw new AssertionError("This class should not be instantiated");
    }

    public static boolean isPalindrome(String sentence){
        String readableSentence = removeSpecialCharacters(sentence);
        String readableLowerCaseSentence = readableSentence.toLowerCase();
        return isPalindromeStringWithoutSpecialCharacters(readableLowerCaseSentence);
    }

    private static String removeSpecialCharacters(String sentence) {
        return sentence.replaceAll("[ !¡,]", "");
    }

    private static boolean isPalindromeStringWithoutSpecialCharacters(String sentence) {
        if(sentence.isEmpty() || isAOneCharacterSentence(sentence)){
            return true;
        }
        else if ( areFirstAndLastCharacterEqual(sentence) ){
            return isPalindromeStringWithoutSpecialCharacters(substringWithoutFirstAndLastCharacter(sentence));
        }
        else{
            return false;
        }
    }

    private static boolean isAOneCharacterSentence(String sentence) {
        return sentence.length() == 1;
    }

    private static boolean areFirstAndLastCharacterEqual(String sentence) {
        return sentence.charAt(0) == sentence.charAt(sentence.length()-1);
    }

    private static String substringWithoutFirstAndLastCharacter(String sentence) {
        return sentence.substring(1,sentence.length()-1);
    }
}
