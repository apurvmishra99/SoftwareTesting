package st1920.automaton;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class Task1 {

	//1 - Easy
	@Test
	public void emptyTest1() {
		REString reString = new REString("");
		MatchString mString = new MatchString("");
		assertTrue(RegexWrapper.matches(mString, reString));
	}

	//2 - Easy
	@Test
	public void emptyTest2() {
		REString reString = new REString("x");
		MatchString mString = new MatchString("");
		assertFalse(RegexWrapper.matches(mString, reString));
	}

	//3 - Easy
	@Test
	public void testOr() {
		REString reString = new REString("x|y");
		MatchString mString = new MatchString("x");
		assertTrue(RegexWrapper.matches(mString, reString));
	}

	//4 - Easy
	@Test
	public void testMultiples() {
		REString reString = new REString("(ab)\\2");
		MatchString mString = new MatchString("abab");
		assertFalse(RegexWrapper.matches(mString, reString));
	}

	//5- Hard
	@Test
	public void testNumBetween() {
		REString reString = new REString("[1--4]");
		MatchString mString = new MatchString("3");
		assertFalse(RegexWrapper.matches(mString, reString));
	}

	//6 - Hard
	@Test
	public void testLongStr() {

		String strX = "LongBoi";
		String longStrX = strX;

		for (int i=0; i <= 20; i++) {
			longStrX += strX;
		}

		REString reString = new REString(strX);
		MatchString mString = new MatchString(longStrX);
		assertFalse(RegexWrapper.matches(mString, reString));

	}

	//7 - Medium
	@Test(expected = IllegalArgumentException.class)
	public void testAnyOccurances() {
		REString reString = new REString("a{*}");
		MatchString mString = new MatchString("aa");
		assertTrue(RegexWrapper.matches(mString, reString));
	}

	//8 - Medium
	@Test
	public void testZeroOrMoreTwice() {
		REString reString = new REString("a**");
		MatchString mString = new MatchString("a");
		assertTrue(RegexWrapper.matches(mString, reString));
	}

	//9 - Medium
	@Test(expected = IllegalArgumentException.class)
	public void testNOccurances() {
		REString reString = new REString("<-1>");
		MatchString mString = new MatchString("a");
		assertFalse(RegexWrapper.matches(mString, reString));

	}

	//10 - Hard
	@Test
	public void testFirstMatch() {
		REString reString = new REString("xyz");
		MatchString mString = new MatchString("xyz-420");
		assertFalse(RegexWrapper.matches(mString, reString));

	}

	//11 - Easy
	@Test
	public void testZeroOrOne() {
		REString reString = new REString("xx?x");
		MatchString mString = new MatchString("xxx");
		assertTrue(RegexWrapper.matches(mString, reString));
	}

	//12 - Hard
	@Test
	public void testParenthesis1() {
		REString reString = new REString("((x))");
		MatchString mString = new MatchString("xyz");
		assertFalse(RegexWrapper.matches(mString, reString));
	}

	//13 - Hard
	@Test
	public void testParenthesis2() {
		REString reString = new REString("()eet");
		MatchString mString = new MatchString("yeet");
		assertFalse(RegexWrapper.matches(mString, reString));
	}

	//14 - Medium
	@Test(expected = IllegalArgumentException.class)
	public void testDoesNotMatchStr() {
		REString reString = new REString("[^a");
		MatchString mString = new MatchString("yeet");
		assertFalse(RegexWrapper.matches(mString, reString));

	}

	//15 - Medium
	@Test
	public void testSubstring() {
		REString reString = new REString("abc");
		MatchString mString = new MatchString("a-123-b-456-c");
		assertFalse(RegexWrapper.matches(mString, reString));
	}

}