package exercises.herosQuestBoard.permutationOfAPalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WordAccessTest {
    private WordAccess wordAccess = new WordAccess();


    @Test
    void isPalindromeWithoutSpace() {
        Boolean actual = wordAccess.isPermutation("nan");
        assertTrue(actual);
    }

    @Test
    void isPalindromeWithSpace() {
        Boolean actual = wordAccess.isPermutation("Tact Coa");
        assertTrue(actual);
    }

    @Test
    void isPalindromeWithSpaces() {
        Boolean actual = wordAccess.isPermutation("never odd or even");
        assertTrue(actual);
    }

    @Test
    void isPalindromePermutation1() {
        Boolean actual = wordAccess.isPermutation("taco cat");
        assertTrue(actual);
    }

    @Test
    void isPalindromePermutation2() {
        Boolean actual = wordAccess.isPermutation("atco cta");
        assertTrue(actual);
    }

    @Test
    void notPolindrome() {
        Boolean actual = wordAccess.isPermutation("I am diba");
        assertFalse(actual);
    }

    @Test
    void notPolindrome2() {
        Boolean actual = wordAccess.isPermutation("ASHKAN mahtab Khajag DIBA");
        assertFalse(actual);
    }
}

