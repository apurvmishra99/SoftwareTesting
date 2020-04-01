package st1920.automaton;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task3_2 {

	@Test
	public void testTask3_2_01() {
		assertFalse(RegExpMatcher.matches("a", "a{0}"));
	}

	@Test
	public void testTask3_2_02() {
		assertTrue(RegExpMatcher.matches("a", "a{0,}"));
	}

	@Test
	public void testTask3_2_03() {
		assertTrue(RegExpMatcher.matches("a", "a{0,2}"));
	}

	@Test
	public void testTask3_2_04() {
		assertFalse(RegExpMatcher.matches("a", "a{2,3}"));
	}

	@Test
	public void testTask3_2_05() {
		assertFalse(RegExpMatcher.matches("a", "a{2,1}"));
	}

	@Test
	public void testTask3_2_06() {
		assertFalse(RegExpMatcher.matches("a", "1{a,b}"));
	}

	@Test
	public void testTask3_2_07() {
		assertTrue(RegExpMatcher.matches("a", "a{1,20}"));
	}

	@Test
	public void testTask3_2_08() {
		assertTrue(RegExpMatcher.matches("a", "a&a"));
	}

	@Test
	public void testTask3_2_09() {
		assertFalse(RegExpMatcher.matches("a", ".*&a"));
	}

	@Test
	public void testTask3_2_10() {
		assertFalse(RegExpMatcher.matches("a", "a&.*"));
	}

	@Test
	public void testTask3_2_11() {
		assertTrue(RegExpMatcher.matches("a", ".*&.*"));
	}

	@Test
	public void testTask3_2_12() {
		assertTrue(RegExpMatcher.matches("a", "~a"));
	}

	@Test
	public void testTask3_2_13() {
		assertFalse(RegExpMatcher.matches("a", "<11>"));
	}

	@Test
	public void testTask3_2_14() {
		assertFalse(RegExpMatcher.matches("a", "<2"));
	}

	@Test
	public void testTask3_2_15() {
		assertFalse(RegExpMatcher.matches("a", "\""));
	}

	@Test
	public void testTask3_2_16() {
		assertFalse(RegExpMatcher.matches("a", "[^1-9a-]]"));
	}

	@Test
	public void testTask3_2_17() {
		assertTrue(RegExpMatcher.matches("a", "<3-2>"));
	}

	@Test
	public void testTask3_2_18() {
		assertTrue(RegExpMatcher.matches("a", "<0-1>"));
	}

}