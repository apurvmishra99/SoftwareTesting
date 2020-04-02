package st1920.automaton;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import st1920.automaton.RegExpMatcher;


public class Task1 {
	
	//1 - Easy
	@Test
	public void emptyTest1() {

		assertTrue(RegExpMatcher.matches("", ""));
	}

	//2 - Easy
	@Test
	public void emptyTest2() {

		assertFalse(RegExpMatcher.matches("x", ""));
	}

	//3 - Easy
	@Test
	public void testOr() {
		
		assertTrue(RegExpMatcher.matches("x", "x|y"));
	}
	
	//4 - Easy
	@Test
	public void testMultiples() {
		assertFalse(RegExpMatcher.matches("abab", "(ab)\\2"));
		
	}

	//5- Hard
	@Test
	public void testNumBetween() {
		assertFalse(RegExpMatcher.matches("3", "[1--4]"));
	}
	
	//6 - Hard
	@Test
	public void testLongStr() {
		
		String strX = "LongBoi";
		String longStrX = strX;
		
		for (int i=0; i <= 20; i++) {
			longStrX += strX;
		}
		
		assertFalse(RegExpMatcher.matches(longStrX, strX));
	}

	//7 - Medium
	@Test(expected = IllegalArgumentException.class)
	public void testAnyOccurances() {
		assertFalse(RegExpMatcher.matches("aa", "a{*}"));
	}
	
	//8 - Medium
	@Test
	public void testZeroOrMoreTwice() {
		assertTrue(RegExpMatcher.matches("a", "a**"));	
	}

	//9 - Medium
	@Test(expected = IllegalArgumentException.class)
	public void testNOccurances() {
		assertFalse(RegExpMatcher.matches("a", "<-1>"));
		
	}

	//10 - Hard
	@Test
	public void testFirstMatch() {
		assertFalse(RegExpMatcher.matches("xyz-420", "xyz"));
		
	}

	//11 - Easy
	@Test
	public void testZeroOrOne() {
		assertTrue(RegExpMatcher.matches("xxx", "xx?x"));
	}

	//12 - Hard
	@Test
	public void testParenthesis1() {
		assertFalse(RegExpMatcher.matches("xyz", "((x))"));		
	}

	//13 - Hard
	@Test
	public void testParenthesis2() {
		assertFalse(RegExpMatcher.matches("yeet", "()eet"));
	}

	//14 - Medium
	@Test(expected = IllegalArgumentException.class)
	public void testDoesNotMatchStr() {
		assertFalse(RegExpMatcher.matches("yeet", "[^a"));
	}

	//15 - Medium
	@Test
	public void testSubstring() {
		assertFalse(RegExpMatcher.matches("a-123-b-456-c", "abc"));

	}

}