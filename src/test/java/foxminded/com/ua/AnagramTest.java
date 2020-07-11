package foxminded.com.ua;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import foxminded.com.ua.task1.Anagram;

class AnagramTest {
    Anagram anagram = new Anagram();
    
    @Test
    void createAnagram_ShouldThrowNullPointerException_WhenInputNull() {
        assertThrows(NullPointerException.class, () -> {
            anagram.createAnagram(null);
        });
    }
    
    @Test
    void createAnagram_ShouldReturnEmptyString_WhenInpitIsEmptyString() {
        String actual = anagram.createAnagram("");
        assertEquals("", actual);
    }
    
    @Test
    void createAnagram_ShouldReturnEmptyString_WhenInpitIsOneSpaceString() {
        String actual = anagram.createAnagram(" ");
        assertEquals("", actual);
    }
    
    @Test
    void createAnagram_ShouldReturnEmptyString_WhenInpitIsTwoSpacesString() {
        String actual = anagram.createAnagram("  ");
        assertEquals("", actual);
    }
    
    @Test
    void createAnagram_ShouldReturnOneLetterAfterOneSpaceString_WhenInpitIsOneLetterBetweenTwoSpacesString() {
        String actual = anagram.createAnagram(" a ");
        assertEquals(" a", actual);
    }
    
    @Test
    void createAnagram_ShouldReturnOneLetterString_WhenInpitIsOneLetterString() {
        String actual = anagram.createAnagram("b");
        assertEquals("b", actual);
    }
    
    @Test
    void createAnagram_ShouldReturnSevenSameLettersStringInLowerCase_WhenInpitIsSevenSameLettersStringInLowerCase() {
        String actual = anagram.createAnagram("ccccccc");
        assertEquals("ccccccc", actual);
    }
    
    @Test
    void createAnagram_ShouldReturnSevenSameLettersStringInUpperCase_WhenInpitIsSevenSameLettersStringInUpperCase() {
        String actual = anagram.createAnagram("CCCCCCC");
        assertEquals("CCCCCCC", actual);
    }
    
    @Test
    void createAnagram_ShouldReturnReverceString_WhenInpitIsUpperAndLowerCaseStringWithTheSameLetter() {
        String actual = anagram.createAnagram("aaaAaaAAAAaaAaaA");
        assertEquals("AaaAaaAAAAaaAaaa", actual);
    }
    
    @Test
    void createAnagram_ShouldNotReverseAnySymbol_WhenInputContainsOnlyNonLetters() {
        String actual = anagram.createAnagram("123#@!112#!@#^&*");
        assertEquals("123#@!112#!@#^&*", actual);
    }
    
    @Test
    void createAnagram_ShouldReverseOnlyLetters_WhenInpitContainsLettersAndNonLetters() {
        String actual = anagram.createAnagram("1abc23de#g12H");
        assertEquals("1Hge23dc#b12a", actual);
    }
    
    @Test
    void createAnagram_ShouldReverseOneWord_WhenInpitIsOneWord() {
        String actual = anagram.createAnagram("Hello");
        assertEquals("olleH", actual);
    }
    
    @Test
    void createAnagram_ShouldReverseTwoWords_WhenInputIsTwoWords() {
        String actual = anagram.createAnagram("Hello world");
        assertEquals("olleH dlrow", actual);
    }
    
    @Test
    void createAnagram_ShouldReverseOnlyLettersInTheWords_WhenInpitContainsWordsWithNonLetterSymbols() {
        String actual = anagram.createAnagram("H12e2l3lo44 w5o6r7l8d");
        assertEquals("o12l2l3eH44 d5l6r7o8w", actual);
    }
}
