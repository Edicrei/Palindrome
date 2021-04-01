package test.java.com.palindrometest;

import static org.junit.Assert.assertThat;

import com.example.Palindrome.Sentence;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;



public class TestPalindromeFinder {  

    @Test
    public void oneCharacterStringIsPalindrome(){
        assertThat(Sentence.isPalindrome("1"),is(true));
    }

   

    @Test
    public void bobIsPalindrome(){
        assertThat(Sentence.isPalindrome("bob"),is(true));
    }

    @Test
    public void madamIsPalindrome(){
        assertThat(Sentence.isPalindrome("madam"),is(true));
    }
   
    @Test
    public void mAlAyAlamIsPalindrome(){
        assertThat(Sentence.isPalindrome("mAlAyAlam"),is(true));
    }

    @Test
    public void aStringWithSpacesCanAlsoBePalindrome(){
        assertThat(Sentence.isPalindrome("Able was I, ere I saw Elba"),is(true));
    }
    

    @Test
    public void aStringWithSpacesAndSpecialCharactersCanAlsoBePalindrome(){
        assertThat(Sentence.isPalindrome("Madam I’m Adam"),is(true));
    }

    @Test
    public void aStringWithCapitalLettersCanAlsoBePalindrome(){
        assertThat(Sentence.isPalindrome("Step on no pets."),is(true));
    }

    @Test
    public void aStringWithCapitalLettersSpaceCanAlsoBePalindrome(){
        assertThat(Sentence.isPalindrome("Top spot!"),is(true));
    }

    @Test
    public void xyzIsNotPalindrome(){
        assertThat(Sentence.isPalindrome("xyz"),is(false));
    }

    @Test
    public void elephantIsNotPalindrome(){
        assertThat(Sentence.isPalindrome("elephant"),is(false));
    }

    @Test
    public void CountryIsNotPalindrome(){
        assertThat(Sentence.isPalindrome("Country"),is(false));
    }

    @Test
    public void aStringWithSpacesAndSpecialCharactersIsNotPalindrome(){
        assertThat(Sentence.isPalindrome("Top . post!"),is(false));
    }

    @Test
    public void aStringWithCapitalLettersIsNotPalindrome(){
        assertThat(Sentence.isPalindrome("Wonderful-fool"),is(false));
    }

    @Test
    public void aStringWithCapitalLettersSpacesIsNotPalindrome(){
        assertThat(Sentence.isPalindrome("Wild imagintation!"),is(false));
    }

    
}
