package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void MatchingPairContainsCharactersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launchcode]"));
    }


    @Test
    public void DoubleMatchingPairContainsCharactersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[Launchcode]]"));
    }

    @Test
    public void MatchingBracketsWithinStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void MatchingBracketsBeforeStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void MatchingBracketsReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void UnmatchedOpeningBeforeBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void UnmatchedWithinStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void UnmatchedOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void UnmatchedPairReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void Complicated  () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]][[]"));
    }

}

