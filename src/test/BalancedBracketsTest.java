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
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void pairsOfOpenCloseBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void nonBracketCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("{}"));
    }

    @Test
    public void onlyFrontBracketFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void bracketsWithStringOutside() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void bracketsWithStringInside() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void bracketWithBackwardsFalse() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void oppositeBracketFalse() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void stringWithMultipleBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][][]"));
    }

    @Test
    public void stringWithNoBracket() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void frontBracketWithString() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void onlyBackBracketWithStringReturnsFalse() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
}

