import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void returnFalseForNonPalindrome() {
        assertFalse(Main.isPalindrome("ab"));
        assertFalse(Main.isPalindrome("test"));
    }

    @Test
    void returnTrueForPalindrome() {
        assertTrue(Main.isPalindrome("abba"));
        assertTrue(Main.isPalindrome("x"));
        assertTrue(Main.isPalindrome("madam"));
    }

    @Test
    void returnCorrectResultForSpecialCharacters() {
        assertTrue(Main.isPalindrome("abcd dcba"));
        assertTrue(Main.isPalindrome("12345&&54321"));
        assertFalse(Main.isPalindrome("ab cd"));
        assertFalse(Main.isPalindrome("not a $ palindr0m£"));
    }
}