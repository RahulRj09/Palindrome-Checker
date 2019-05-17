package strings;

import org.junit.Test;
import palindrome.PalindromeChecker;

import static org.junit.Assert.*;

public class PalindromeTest {
    @Test
    public void emptyStringShouldBeAPalindrome() {
        assertTrue("Expected empty string to be a palindrome", PalindromeChecker.isPalindrome(""));
    }
    @Test
    public void singleStringShouldBeAPalindrome() {
        assertTrue("Expected single string to be a palindrome", PalindromeChecker.isPalindrome("a"));
    }
    @Test
    public void stringHavinfFirstAndLastIndexSameShouldBeAPalindrome() {
        assertTrue("Expected first and last index same string to be a palindrome", PalindromeChecker.isPalindrome("aa"));
    }
    @Test
    public void stringHavinfFirstAndLastIndexSameNotShouldBeANotPalindrome() {
        assertFalse("Expected first and last index same string to be a palindrome", PalindromeChecker.isPalindrome("ab"));
    }
    @Test
    public void stringAfterRevresedIfSameShouldBeAPalindrome(){
        assertTrue("Expected first and last index same string to be a palindrome", PalindromeChecker.isPalindrome("nitin"));
    }
    @Test
    public void stringAfterRevresedIfSameNotShouldBeANotPalindrome(){
        assertFalse("Expected first and last index same string to be a palindrome", PalindromeChecker.isPalindrome("rahul"));
    }
}
