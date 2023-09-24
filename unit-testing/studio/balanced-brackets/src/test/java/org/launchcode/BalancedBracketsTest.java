package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        String message = "a single set of balanced brackets returns true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"), message);
    }

//    POSITIVE TEST CASES

    //    TODO: Test balanced brackets in front of other characters - "[]LaunchCode"
    @Test
    public void singleBracketsBeforeOtherCharacters(){
        String message = "balanced brackets in front of other characters returns true";
        String testData = "[]LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    //    TODO: Test balanced brackets around other characters - "Launch[Code]"
    @Test
    public void singleBracketAroundOtherCharacters() {
        String message = "balanced brackets around other characters returns true";
        String testData = "[LaunchCode]";
        boolean result  = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result,message);
    }
    //    TODO: Test balanced brackets within other characters - "launch[Code}"
    @Test
    public void mixedBracketsWithinOtherCharacters() {
        String message = "balanced brackets within other characters returns true";
        String testData = "launch[Code]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    //    TODO: Test multiple consecutive pairs of balanced brackets - "[][][]"
    @Test
    public void consecutiveBrackets() {
        String message = "empty consecutive brackets returns true";
        String testData = "[][][]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }
    //    TODO:Test multiple nested balanced brackets - "[[[]]]"
    @Test
    public void multipleNestedBalancedBrackets() {
        String message = "multiple nexted balanced brackets returns true";
        String testData = "[[[]]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

//  NEGATIVE TEST CASES

    //    TODO: TEST SINGLE OPENING BRACKET - "["
    @Test
    public void singleOpeningBrackets() {
        String message = "single opening bracket returns false";
        String testData = "[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }
    //    TODO: TEST SINGLE CLOSING BRACKET - "]"
    @Test
    public void singleClosingBracket() {
        String message = "single closing bracket returns false";
        String testData = "]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }
    //    TODO: TEST REVERSED BRACKETS - "]["
    @Test
    public void reversedBrackets() {
        String message = "reversed brackets returns false";
        String testData = "][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }
    //    TODO: TEST SINGLE BRACKET WITH OTHER CHARACTERS "[Launchcode"
    @Test
    public void singleBracketWithOtherCharacters() {
        String message = "single bracket with other Characters returns false";
        String testData = "[Launchcode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

// TODO: TEST UNBALANCED BRACKETS AMONG OTHER CHARACTERS - "Launch]Code["
@Test
public void unbalancedBracketsAmongOtherCharacters() {
    String message = "single opening bracket returns false";
    String testData = "Launch]Code[";
    boolean result = BalancedBrackets.hasBalancedBrackets(testData);
    assertFalse(result, message);
}

// TODO: TEST A SERIES OF MIXED, UNBALANCED BRACKETS - "[[]][]["
@Test
public void MixedUnbalancedBracketsAmongOtherCharacters() {
    String message = "mixed balanced brackets among other characters returns false";
    String testData = "[[]][][";
    boolean result = BalancedBrackets.hasBalancedBrackets(testData);
    assertFalse(result, message);
}



    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
}