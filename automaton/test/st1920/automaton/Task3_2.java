package st1920.automaton;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task3_2 {

    @Test
	public void testTask3_2_01() {
		REString reString = new REString("x{0}");
		MatchString mString = new MatchString("x");
		assertFalse(RegexWrapper.matches(mString, reString));
	}

	@Test
	public void testTask3_2_02() {
		REString reString = new REString("x{0,}");
		MatchString mString = new MatchString("xxxxx");
		assertTrue(RegexWrapper.matches(mString, reString));
	}

	@Test
	public void testTask3_2_03() {
		REString reString = new REString("x{0,2}");
		MatchString mString = new MatchString("x");
		assertTrue(RegexWrapper.matches(mString, reString));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTask3_2_04() {
		REString reString = new REString("x{2, 3}");
		MatchString mString = new MatchString("xxxx");
		assertFalse(RegexWrapper.matches(mString, reString));
	}

	@Test
	public void testTask3_2_05() {
		REString reString = new REString("x{2,1}");
		MatchString mString = new MatchString("x");
		assertFalse(RegexWrapper.matches(mString, reString));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTask3_2_06() {
		REString reString = new REString("1{x,y}");
		MatchString mString = new MatchString("x");
		assertFalse(RegexWrapper.matches(mString, reString));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTask3_2_07() {
		REString reString = new REString("x{1, 20}");
		MatchString mString = new MatchString("x");
		assertTrue(RegexWrapper.matches(mString, reString));
	}
	
	@Test
	public void testTask3_2_08() {
		REString reString = new REString("a+");
		MatchString mString = new MatchString("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		assertFalse(RegexWrapper.matches(mString, reString));
	}
	@Test
	public void testTask3_2_09() {
		REString reString = new REString(".*&x");
		MatchString mString = new MatchString("x");
		assertTrue(RegexWrapper.matches(mString, reString));
	}

	@Test
	public void testTask3_2_10() {
		REString reString = new REString("x&.*");
		MatchString mString = new MatchString("x");
		assertTrue(RegexWrapper.matches(mString, reString));
	}

	@Test
	public void testTask3_2_11() {
		REString reString = new REString(".*&.*");
		MatchString mString = new MatchString("x");

		assertTrue(RegexWrapper.matches(mString, reString));
	}

	@Test
	public void testTask3_2_12() {
		REString reString = new REString("~x");
		MatchString mString = new MatchString("x");
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
	
	@Test
	public void testTask3_2_19() {
		REString reString = new REString("'");
		MatchString mString = new MatchString("'");
		assertTrue(RegexWrapper.matches(mString, reString));
	}
	
	@Test(expected = java.lang.AssertionError.class)
	public void testTask3_2_20() {
		REString reString = new REString("\"a#\"");
		MatchString mString = new MatchString("\"a\"");
		assert(RegexWrapper.matches(mString, reString));
	}
	
	@Test(expected = java.lang.AssertionError.class)
	public void testTask3_2_21() {
		REString reString = new REString("##########################");
		MatchString mString = new MatchString("@@@");
		assert(RegexWrapper.matches(mString, reString));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testTask3_2_22() {
		REString reString = new REString("(x+");
		MatchString mString = new MatchString("x");
		assert(RegexWrapper.matches(mString, reString));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testTask3_2_23() {
		REString reString = new REString("<---123");
		MatchString mString = new MatchString("1");
		assert(RegexWrapper.matches(mString, reString));
	}
	
}
