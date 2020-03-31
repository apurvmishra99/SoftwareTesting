package st1920.autmaton;
import org.junit.Test;

import st1920.automaton.RegExpMatcher;


class Task1 {
	
	//1 - Easy
	@Test
	public void emptyTest1() {

		assert(RegExpMatcher.matches("", ""));
	}

	//2 - Easy
	@Test
	public void emptyTest2() {

		assert(RegExpMatcher.matches("x", ""));
	}

	//3 - Easy
	@Test
	public void testOr() {
		
		assert(RegExpMatcher.matches("x", "x|y"));
	}
	
	//4 - Easy
	@Test
	public void testMultiples() {
		assert(RegExpMatcher.matches("abab", "(ab)\\2"));
		
	}

	//5- Hard
	@Test
	public void testNumBetween() {
		assert(RegExpMatcher.matches("3", "[1--4]"));
	}
	
	//6 - Hard
	@Test
	public void testLongStr() {
		
		String strX = "LongBoi";
		String longStrX = strX;
		
		for (int i=0; i <= 20; i++) {
			longStrX += strX;
		}
		
		assert(RegExpMatcher.matches(longStrX, strX));
	}

	//7 - Medium
	@Test
	public void testAnyOccurances() {
		assert(RegExpMatcher.matches("aa", "a{*}"));
	}
	
	//8 - Medium
	@Test
	public void testZeroOrMoreTwice() {
		assert(RegExpMatcher.matches("a", "a**"));	
	}

	//9 - Medium
	@Test
	public void testNOccurances() {
		assert(RegExpMatcher.matches("a", "<-1>"));
		
	}

	//10 - Hard
	@Test
	public void testFirstMatch() {
		assert(RegExpMatcher.matches("xyz-420", "xyz"));
		
	}

	//11 - Easy
	@Test
	public void testZeroOrOne() {
		assert(RegExpMatcher.matches("xxx", "xx?x"));
	}

	//12 - Hard
	@Test
	public void testParenthesis1() {
		assert(RegExpMatcher.matches("xyz", "((x))"));		
	}

	//13 - Hard
	@Test
	public void testParenthesis2() {
		assert(RegExpMatcher.matches("yeet", "()eet"));
	}

	//14 - Medium
	@Test
	public void testDoesNotMatchStr() {
		assert(RegExpMatcher.matches("yeet", "[^a"));
	}

	//15 - Medium
	@Test
	public void testSubstring() {
		assert(RegExpMatcher.matches("a-123-b-456-c", "abc"));

	}

}