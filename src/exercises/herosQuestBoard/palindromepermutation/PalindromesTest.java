package exercises.herosQuestBoard.palindromepermutation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromesTest {

    private Palindromes palindromes = new Palindromes();

    @Test
    void testIsPalindromePermutation() {
        String text = "taco cat";
        boolean result = palindromes.isPalindromePermutation(text);
        Assertions.assertTrue(result, "It is a palindrome permutation");
    }

    @Test
    void testIsNotPalindromePermutation() {
        String text = "ab";
        boolean result = palindromes.isPalindromePermutation(text);
        Assertions.assertFalse(result, "It is not a palindrome permutation");
    }

}
