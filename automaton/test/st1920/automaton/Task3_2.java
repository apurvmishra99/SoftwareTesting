package st1920.automaton;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task3_2 {

	@Test
	public void testTask3_2_01() {
		REString reString = new REString("a{0}");
		MatchString mString = new MatchString("a");
		assertFalse(RegexWrapper.matches(mString, reString));
	}

	@Test
	public void testTask3_2_02() {
		REString reString = new REString("a{0,}");
		MatchString mString = new MatchString("a");
		assertTrue(RegexWrapper.matches(mString, reString));
	}

	@Test
	public void testTask3_2_03() {
		REString reString = new REString("a{0,2}");
		MatchString mString = new MatchString("a");
		assertTrue(RegexWrapper.matches(mString, reString));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTask3_2_04() {
		REString reString = new REString("a{2, 3}");
		MatchString mString = new MatchString("a");
		assertFalse(RegexWrapper.matches(mString, reString));
	}

	@Test
	public void testTask3_2_05() {
		REString reString = new REString("a{2,1}");
		MatchString mString = new MatchString("a");
		assertFalse(RegexWrapper.matches(mString, reString));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTask3_2_06() {
		REString reString = new REString("1{a,b}");
		MatchString mString = new MatchString("a");
		assertFalse(RegexWrapper.matches(mString, reString));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTask3_2_07() {
		REString reString = new REString("a{1, 20}");
		MatchString mString = new MatchString("a");
		assertTrue(RegexWrapper.matches(mString, reString));
	}

	@Test
	public void testTask3_2_08() {
		REString reString = new REString("a{0}");
		MatchString mString = new MatchString("a");
		assertFalse(RegexWrapper.matches(mString, reString));
	}

	@Test
	public void testTask3_2_09() {
		REString reString = new REString(".*&a");
		MatchString mString = new MatchString("a");
		assertTrue(RegexWrapper.matches(mString, reString));
	}

	@Test
	public void testTask3_2_10() {
		REString reString = new REString("a&.*");
		MatchString mString = new MatchString("a");
		assertTrue(RegexWrapper.matches(mString, reString));
	}

	@Test
	public void testTask3_2_11() {
		REString reString = new REString(".*&.*");
		MatchString mString = new MatchString("a");

		assertTrue(RegexWrapper.matches(mString, reString));
	}

	@Test
	public void testTask3_2_12() {
		REString reString = new REString("~a");
		MatchString mString = new MatchString("a");
		assertFalse(RegexWrapper.matches(mString, reString));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTask3_2_13() {
		REString reString = new REString("<11>");
		MatchString mString = new MatchString("a");
		assertFalse(RegexWrapper.matches(mString, reString));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTask3_2_14() {
		REString reString = new REString("<2");
		MatchString mString = new MatchString("a");
		assertFalse(RegexWrapper.matches(mString, reString));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTask3_2_15() {
		REString reString = new REString("\"");
		MatchString mString = new MatchString("a");
		assertFalse(RegexWrapper.matches(mString, reString));
	}

	@Test
	public void testTask3_2_16() {
		REString reString = new REString("[^1-9a-]]");
		MatchString mString = new MatchString("a");
		assertFalse(RegexWrapper.matches(mString, reString));
	}

	@Test
	public void testTask3_2_17() {
		REString reString = new REString("<3-2>");
		MatchString mString = new MatchString("a");
		assertFalse(RegexWrapper.matches(mString, reString));
	}

	@Test
	public void testTask3_2_18() {
		REString reString = new REString("<0-1>");
		MatchString mString = new MatchString("a");
		assertFalse(RegexWrapper.matches(mString, reString));
	}

}