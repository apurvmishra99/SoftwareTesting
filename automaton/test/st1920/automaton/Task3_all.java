package st1920.automaton;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Task3_all {

	public static boolean debug = false;
	
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

	@Test
	public void test01() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test01");
		st1920.automaton.REString rEString1 = null;
		// The following exception was thrown during execution in test generation
		try {
			boolean boolean2 = st1920.automaton.RegexWrapper.matches("", rEString1);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
	}

	@Test
	public void test02() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test02");
		st1920.automaton.RegexWrapper regexWrapper0 = new st1920.automaton.RegexWrapper();
	}

	@Test
	public void test03() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test03");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = rEString1.makeClass(rEString3);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = rEString6.makeOneOrMore(rEString8);
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = rEString11.makeOneOrMore(rEString13);
		st1920.automaton.REString rEString15 = rEString6.makeRange(rEString14);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = rEString17.makeOneOrMore(rEString19);
		st1920.automaton.REString rEString21 = rEString15.makeRange(rEString17);
		st1920.automaton.REString rEString22 = rEString3.makeGroup(rEString21);
		rEString3.setReString("");
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString29 = rEString26.makeOneOrMore(rEString28);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = rEString31.makeOneOrMore(rEString33);
		st1920.automaton.REString rEString35 = rEString26.makeRange(rEString34);
		st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = rEString37.makeOneOrMore(rEString39);
		st1920.automaton.REString rEString41 = rEString35.makeRange(rEString37);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = rEString43.makeClass(rEString45);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = rEString48.makeOneOrMore(rEString50);
		st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString56 = rEString53.makeOneOrMore(rEString55);
		st1920.automaton.REString rEString57 = rEString48.makeRange(rEString56);
		st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString62 = rEString59.makeOneOrMore(rEString61);
		st1920.automaton.REString rEString63 = rEString57.makeRange(rEString59);
		st1920.automaton.REString rEString64 = rEString45.makeGroup(rEString63);
		st1920.automaton.REString rEString65 = rEString41.makeZeroOrMore(rEString63);
		st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString70 = rEString67.makeClass(rEString69);
		st1920.automaton.REString rEString72 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString74 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString77 = rEString74.makeOneOrMore(rEString76);
		st1920.automaton.REString rEString79 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString81 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString82 = rEString79.makeOneOrMore(rEString81);
		st1920.automaton.REString rEString83 = rEString74.makeRange(rEString82);
		st1920.automaton.REString rEString84 = rEString72.makeZeroOrMore(rEString83);
		st1920.automaton.REString rEString85 = rEString70.makeExcludeClass(rEString83);
		st1920.automaton.REString rEString86 = rEString65.makeAny(rEString70);
		st1920.automaton.REString rEString89 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString91 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString92 = rEString89.makeClass(rEString91);
		boolean boolean93 = st1920.automaton.RegexWrapper.matches("+", rEString89);
		st1920.automaton.REString rEString94 = rEString86.makeRange(rEString89);
		st1920.automaton.REString rEString95 = rEString3.makeRepeatExact(rEString94);
		st1920.automaton.REString rEString96 = st1920.automaton.REString.makeAlpha(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString63);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString77);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString82);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString83);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString84);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString85);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString86);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString92);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString94);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString95);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString96);
	}

	@Test
	public void test04() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test04");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeClass(rEString4);
		boolean boolean6 = st1920.automaton.RegexWrapper.matches("+", rEString2);
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString11 = rEString8.makeOneOrMore(rEString10);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = rEString13.makeOneOrMore(rEString15);
		st1920.automaton.REString rEString17 = rEString8.makeRange(rEString16);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = rEString19.makeOneOrMore(rEString21);
		st1920.automaton.REString rEString23 = rEString17.makeRange(rEString19);
		st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString28 = rEString25.makeOneOrMore(rEString27);
		st1920.automaton.REString rEString29 = st1920.automaton.REString.makeAlpha(rEString27);
		st1920.automaton.REString rEString30 = rEString19.makeAny(rEString27);
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString35 = rEString32.makeOneOrMore(rEString34);
		st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = rEString37.makeClass(rEString39);
		st1920.automaton.REString rEString41 = rEString35.makeRepeatMoreThan(rEString39);
		st1920.automaton.REString rEString42 = rEString27.makeNothing(rEString35);
		st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString47 = rEString44.makeClass(rEString46);
		st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString52 = rEString49.makeOneOrMore(rEString51);
		st1920.automaton.REString rEString53 = rEString47.makeExcludeClass(rEString52);
		st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString58 = rEString55.makeOneOrMore(rEString57);
		st1920.automaton.REString rEString59 = rEString47.makeAny(rEString55);
		st1920.automaton.REString rEString60 = rEString27.makeOneOrMore(rEString47);
		st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString65 = rEString62.makeClass(rEString64);
		st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString70 = rEString67.makeOneOrMore(rEString69);
		st1920.automaton.REString rEString72 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString74 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString75 = rEString72.makeOneOrMore(rEString74);
		st1920.automaton.REString rEString76 = rEString67.makeRange(rEString75);
		st1920.automaton.REString rEString78 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString80 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString81 = rEString78.makeOneOrMore(rEString80);
		st1920.automaton.REString rEString82 = rEString76.makeRange(rEString78);
		st1920.automaton.REString rEString83 = rEString64.makeGroup(rEString82);
		st1920.automaton.REString rEString84 = rEString47.makeAny(rEString83);
		st1920.automaton.REString rEString85 = rEString2.makeZeroOrMore(rEString83);
		st1920.automaton.REString rEString87 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString89 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString90 = rEString87.makeClass(rEString89);
		st1920.automaton.REString rEString91 = st1920.automaton.REString.makeAlpha(rEString87);
		st1920.automaton.REString rEString92 = rEString85.makeExclude(rEString87);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString75);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString76);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString81);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString82);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString83);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString84);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString85);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString90);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString91);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString92);
	}

	@Test
	public void test05() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test05");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeOneOrMore(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeOneOrMore(rEString9);
		st1920.automaton.REString rEString11 = rEString2.makeRange(rEString10);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = rEString13.makeOneOrMore(rEString15);
		st1920.automaton.REString rEString17 = rEString11.makeRange(rEString13);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = rEString19.makeOneOrMore(rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.REString.makeAlpha(rEString21);
		st1920.automaton.REString rEString24 = rEString13.makeAny(rEString21);
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString29 = rEString26.makeOneOrMore(rEString28);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = rEString31.makeClass(rEString33);
		st1920.automaton.REString rEString35 = rEString29.makeRepeatMoreThan(rEString33);
		st1920.automaton.REString rEString36 = rEString21.makeNothing(rEString29);
		st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString41 = rEString38.makeClass(rEString40);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = rEString43.makeOneOrMore(rEString45);
		st1920.automaton.REString rEString47 = rEString41.makeExcludeClass(rEString46);
		st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString52 = rEString49.makeOneOrMore(rEString51);
		st1920.automaton.REString rEString53 = rEString41.makeAny(rEString49);
		st1920.automaton.REString rEString54 = rEString21.makeOneOrMore(rEString41);
		boolean boolean55 = st1920.automaton.RegexWrapper.matches("[]+{721,}", rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
	}

	@Test
	public void test06() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test06");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("[]+{721,}");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = rEString4.makeClass(rEString6);
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString12 = rEString9.makeOneOrMore(rEString11);
		st1920.automaton.REString rEString13 = rEString7.makeExcludeClass(rEString12);
		boolean boolean14 = st1920.automaton.RegexWrapper.matches("hi!", rEString12);
		st1920.automaton.REString rEString15 = rEString1.makeZeroOrMore(rEString12);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("[]");
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = rEString19.makeOneOrMore(rEString21);
		st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = rEString24.makeOneOrMore(rEString26);
		st1920.automaton.REString rEString28 = rEString19.makeRange(rEString27);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = rEString30.makeOneOrMore(rEString32);
		st1920.automaton.REString rEString34 = rEString28.makeRange(rEString30);
		st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString39 = rEString36.makeOneOrMore(rEString38);
		st1920.automaton.REString rEString40 = st1920.automaton.REString.makeAlpha(rEString38);
		st1920.automaton.REString rEString41 = rEString30.makeAny(rEString38);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = rEString43.makeOneOrMore(rEString45);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = rEString48.makeClass(rEString50);
		st1920.automaton.REString rEString52 = rEString46.makeRepeatMoreThan(rEString50);
		st1920.automaton.REString rEString53 = rEString38.makeNothing(rEString46);
		st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString58 = rEString55.makeOneOrMore(rEString57);
		st1920.automaton.REString rEString60 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString63 = rEString60.makeOneOrMore(rEString62);
		st1920.automaton.REString rEString64 = rEString55.makeRange(rEString63);
		st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString69 = rEString66.makeOneOrMore(rEString68);
		st1920.automaton.REString rEString70 = rEString64.makeRange(rEString66);
		st1920.automaton.REString rEString71 = rEString38.makeOneOrMore(rEString66);
		st1920.automaton.REString rEString73 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString75 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString76 = rEString73.makeClass(rEString75);
		st1920.automaton.REString rEString78 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString80 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString82 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString83 = rEString80.makeOneOrMore(rEString82);
		st1920.automaton.REString rEString85 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString87 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString88 = rEString85.makeOneOrMore(rEString87);
		st1920.automaton.REString rEString89 = rEString80.makeRange(rEString88);
		st1920.automaton.REString rEString90 = rEString78.makeZeroOrMore(rEString89);
		st1920.automaton.REString rEString91 = rEString76.makeExcludeClass(rEString89);
		java.lang.String str92 = rEString76.getReString();
		st1920.automaton.REString rEString93 = rEString71.makeOneOrMore(rEString76);
		st1920.automaton.REString rEString94 = rEString17.makeNothing(rEString71);
		st1920.automaton.REString rEString95 = rEString12.makeRepeatExact(rEString71);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString63);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString69);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString76);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString83);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString88);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString89);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString90);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString91);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str92 + "' != '" + "[]" + "'", str92.equals("[]"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString93);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString94);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString95);
	}

	@Test
	public void test07() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test07");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeClass(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeOneOrMore(rEString9);
		st1920.automaton.REString rEString11 = rEString5.makeExcludeClass(rEString10);
		boolean boolean12 = st1920.automaton.RegexWrapper.matches("hi!", rEString10);
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("[]");
		st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = rEString16.makeOneOrMore(rEString18);
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString24 = rEString21.makeOneOrMore(rEString23);
		st1920.automaton.REString rEString25 = rEString16.makeRange(rEString24);
		st1920.automaton.REString rEString27 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString30 = rEString27.makeOneOrMore(rEString29);
		st1920.automaton.REString rEString31 = rEString25.makeRange(rEString27);
		st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString36 = rEString33.makeOneOrMore(rEString35);
		st1920.automaton.REString rEString37 = st1920.automaton.REString.makeAlpha(rEString35);
		st1920.automaton.REString rEString38 = rEString27.makeAny(rEString35);
		st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString43 = rEString40.makeOneOrMore(rEString42);
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString48 = rEString45.makeClass(rEString47);
		st1920.automaton.REString rEString49 = rEString43.makeRepeatMoreThan(rEString47);
		st1920.automaton.REString rEString50 = rEString35.makeNothing(rEString43);
		st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString55 = rEString52.makeOneOrMore(rEString54);
		st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString60 = rEString57.makeOneOrMore(rEString59);
		st1920.automaton.REString rEString61 = rEString52.makeRange(rEString60);
		st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString66 = rEString63.makeOneOrMore(rEString65);
		st1920.automaton.REString rEString67 = rEString61.makeRange(rEString63);
		st1920.automaton.REString rEString68 = rEString35.makeOneOrMore(rEString63);
		st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString72 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString73 = rEString70.makeClass(rEString72);
		st1920.automaton.REString rEString75 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString77 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString79 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString80 = rEString77.makeOneOrMore(rEString79);
		st1920.automaton.REString rEString82 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString84 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString85 = rEString82.makeOneOrMore(rEString84);
		st1920.automaton.REString rEString86 = rEString77.makeRange(rEString85);
		st1920.automaton.REString rEString87 = rEString75.makeZeroOrMore(rEString86);
		st1920.automaton.REString rEString88 = rEString73.makeExcludeClass(rEString86);
		java.lang.String str89 = rEString73.getReString();
		st1920.automaton.REString rEString90 = rEString68.makeOneOrMore(rEString73);
		st1920.automaton.REString rEString91 = rEString14.makeNothing(rEString68);
		st1920.automaton.REString rEString92 = rEString10.makeZeroOrOne(rEString68);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString67);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString68);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString73);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString80);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString85);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString86);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString87);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString88);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str89 + "' != '" + "[]" + "'", str89.equals("[]"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString90);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString91);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString92);
	}

	@Test
	public void test08() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test08");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = rEString1.makeClass(rEString3);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = rEString6.makeOneOrMore(rEString8);
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = rEString11.makeOneOrMore(rEString13);
		st1920.automaton.REString rEString15 = rEString6.makeRange(rEString14);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = rEString17.makeOneOrMore(rEString19);
		st1920.automaton.REString rEString21 = rEString15.makeRange(rEString17);
		st1920.automaton.REString rEString22 = rEString3.makeGroup(rEString21);
		rEString3.setReString("");
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString29 = rEString26.makeOneOrMore(rEString28);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = rEString31.makeOneOrMore(rEString33);
		st1920.automaton.REString rEString35 = rEString26.makeRange(rEString34);
		st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = rEString37.makeOneOrMore(rEString39);
		st1920.automaton.REString rEString41 = rEString35.makeRange(rEString37);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = rEString43.makeClass(rEString45);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = rEString48.makeOneOrMore(rEString50);
		st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString56 = rEString53.makeOneOrMore(rEString55);
		st1920.automaton.REString rEString57 = rEString48.makeRange(rEString56);
		st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString62 = rEString59.makeOneOrMore(rEString61);
		st1920.automaton.REString rEString63 = rEString57.makeRange(rEString59);
		st1920.automaton.REString rEString64 = rEString45.makeGroup(rEString63);
		st1920.automaton.REString rEString65 = rEString41.makeZeroOrMore(rEString63);
		st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString70 = rEString67.makeClass(rEString69);
		st1920.automaton.REString rEString72 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString74 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString77 = rEString74.makeOneOrMore(rEString76);
		st1920.automaton.REString rEString79 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString81 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString82 = rEString79.makeOneOrMore(rEString81);
		st1920.automaton.REString rEString83 = rEString74.makeRange(rEString82);
		st1920.automaton.REString rEString84 = rEString72.makeZeroOrMore(rEString83);
		st1920.automaton.REString rEString85 = rEString70.makeExcludeClass(rEString83);
		st1920.automaton.REString rEString86 = rEString65.makeAny(rEString70);
		st1920.automaton.REString rEString89 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString91 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString92 = rEString89.makeClass(rEString91);
		boolean boolean93 = st1920.automaton.RegexWrapper.matches("+", rEString89);
		st1920.automaton.REString rEString94 = rEString86.makeRange(rEString89);
		st1920.automaton.REString rEString95 = rEString3.makeRepeatExact(rEString94);
		java.lang.String str96 = rEString3.getReString();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString63);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString77);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString82);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString83);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString84);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString85);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString86);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString92);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString94);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString95);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str96 + "' != '" + "" + "'", str96.equals(""));
	}

	@Test
	public void test09() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test09");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeClass(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeOneOrMore(rEString9);
		st1920.automaton.REString rEString11 = rEString5.makeExcludeClass(rEString10);
		boolean boolean12 = st1920.automaton.RegexWrapper.matches("hi!", rEString10);
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString17 = rEString14.makeOneOrMore(rEString16);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = rEString19.makeOneOrMore(rEString21);
		st1920.automaton.REString rEString23 = rEString14.makeRange(rEString22);
		st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString28 = rEString25.makeOneOrMore(rEString27);
		st1920.automaton.REString rEString29 = rEString23.makeRange(rEString25);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = rEString31.makeClass(rEString33);
		st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString39 = rEString36.makeOneOrMore(rEString38);
		st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString44 = rEString41.makeOneOrMore(rEString43);
		st1920.automaton.REString rEString45 = rEString36.makeRange(rEString44);
		st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = rEString47.makeOneOrMore(rEString49);
		st1920.automaton.REString rEString51 = rEString45.makeRange(rEString47);
		st1920.automaton.REString rEString52 = rEString33.makeGroup(rEString51);
		st1920.automaton.REString rEString53 = rEString29.makeZeroOrMore(rEString51);
		st1920.automaton.REString rEString54 = rEString10.makeAny(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
	}

	@Test
	public void test10() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test10");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = rEString1.makeOneOrMore(rEString3);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = rEString6.makeOneOrMore(rEString8);
		st1920.automaton.REString rEString10 = rEString1.makeRange(rEString9);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = rEString12.makeOneOrMore(rEString14);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = rEString17.makeOneOrMore(rEString19);
		st1920.automaton.REString rEString21 = rEString12.makeRange(rEString20);
		st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = rEString23.makeOneOrMore(rEString25);
		st1920.automaton.REString rEString27 = rEString21.makeRange(rEString23);
		st1920.automaton.REString rEString28 = rEString9.makeOneOrMore(rEString27);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = rEString30.makeOneOrMore(rEString32);
		st1920.automaton.REString rEString34 = st1920.automaton.REString.makeAlpha(rEString32);
		st1920.automaton.REString rEString35 = rEString28.makeRepeatExact(rEString32);
		st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = rEString37.makeClass(rEString39);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = rEString43.makeClass(rEString45);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = rEString48.makeOneOrMore(rEString50);
		st1920.automaton.REString rEString52 = rEString46.makeExcludeClass(rEString51);
		boolean boolean53 = st1920.automaton.RegexWrapper.matches("hi!", rEString51);
		st1920.automaton.REString rEString54 = rEString40.makeZeroOrMore(rEString51);
		st1920.automaton.REString rEString55 = rEString32.makeZeroOrOne(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
	}

	@Test
	public void test11() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test11");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString6 = rEString3.makeClass(rEString5);
		boolean boolean7 = st1920.automaton.RegexWrapper.matches("+", rEString3);
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString12 = rEString9.makeOneOrMore(rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.REString.makeAlpha(rEString11);
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString18 = rEString15.makeOneOrMore(rEString17);
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString23 = rEString20.makeOneOrMore(rEString22);
		st1920.automaton.REString rEString24 = rEString15.makeRange(rEString23);
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString29 = rEString26.makeOneOrMore(rEString28);
		st1920.automaton.REString rEString30 = rEString24.makeRange(rEString26);
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString35 = rEString32.makeOneOrMore(rEString34);
		st1920.automaton.REString rEString36 = st1920.automaton.REString.makeAlpha(rEString34);
		st1920.automaton.REString rEString37 = rEString26.makeAny(rEString34);
		st1920.automaton.REString rEString38 = rEString13.makeRepeatExact(rEString34);
		st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString43 = rEString40.makeClass(rEString42);
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = rEString47.makeOneOrMore(rEString49);
		st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString55 = rEString52.makeOneOrMore(rEString54);
		st1920.automaton.REString rEString56 = rEString47.makeRange(rEString55);
		st1920.automaton.REString rEString57 = rEString45.makeZeroOrMore(rEString56);
		st1920.automaton.REString rEString58 = rEString43.makeExcludeClass(rEString56);
		st1920.automaton.REString rEString60 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString63 = rEString60.makeOneOrMore(rEString62);
		st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString68 = rEString65.makeOneOrMore(rEString67);
		st1920.automaton.REString rEString69 = rEString60.makeRange(rEString68);
		st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString73 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString74 = rEString71.makeOneOrMore(rEString73);
		st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString78 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString79 = rEString76.makeOneOrMore(rEString78);
		st1920.automaton.REString rEString80 = rEString71.makeRange(rEString79);
		st1920.automaton.REString rEString82 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString84 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString85 = rEString82.makeOneOrMore(rEString84);
		st1920.automaton.REString rEString86 = rEString80.makeRange(rEString82);
		st1920.automaton.REString rEString87 = rEString68.makeOneOrMore(rEString86);
		st1920.automaton.REString rEString88 = rEString43.makeGroup(rEString87);
		st1920.automaton.REString rEString89 = rEString38.makeRepeatMoreThan(rEString43);
		st1920.automaton.REString rEString90 = rEString3.makeAnyChar(rEString89);
		// The following exception was thrown during execution in test generation
		try {
			boolean boolean91 = st1920.automaton.RegexWrapper.matches("+", rEString89);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: expected ']' at position 8");
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString63);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString68);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString69);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString74);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString79);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString80);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString85);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString86);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString87);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString88);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString89);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString90);
	}

	@Test
	public void test12() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test12");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeOneOrMore(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeOneOrMore(rEString9);
		st1920.automaton.REString rEString11 = rEString2.makeRange(rEString10);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = rEString13.makeOneOrMore(rEString15);
		st1920.automaton.REString rEString17 = rEString11.makeRange(rEString13);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = rEString19.makeOneOrMore(rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.REString.makeAlpha(rEString21);
		st1920.automaton.REString rEString24 = rEString13.makeAny(rEString21);
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString29 = rEString26.makeOneOrMore(rEString28);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = rEString31.makeOneOrMore(rEString33);
		st1920.automaton.REString rEString35 = rEString26.makeRange(rEString34);
		java.lang.String str36 = rEString34.getReString();
		java.lang.String str37 = rEString34.getReString();
		st1920.automaton.REString rEString38 = rEString24.makeRepeatRange(rEString34);
		st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString43 = rEString40.makeClass(rEString42);
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = rEString47.makeOneOrMore(rEString49);
		st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString55 = rEString52.makeOneOrMore(rEString54);
		st1920.automaton.REString rEString56 = rEString47.makeRange(rEString55);
		st1920.automaton.REString rEString57 = rEString45.makeZeroOrMore(rEString56);
		st1920.automaton.REString rEString58 = rEString43.makeExcludeClass(rEString56);
		st1920.automaton.REString rEString59 = rEString34.makeZeroOrOne(rEString43);
		st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString64 = rEString61.makeClass(rEString63);
		st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString69 = rEString66.makeOneOrMore(rEString68);
		st1920.automaton.REString rEString70 = rEString64.makeExcludeClass(rEString69);
		st1920.automaton.REString rEString72 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString74 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString75 = rEString72.makeOneOrMore(rEString74);
		st1920.automaton.REString rEString76 = rEString64.makeAny(rEString72);
		st1920.automaton.REString rEString78 = new st1920.automaton.REString("hi!");
		st1920.automaton.REString rEString79 = rEString72.makeGroup(rEString78);
		st1920.automaton.REString rEString81 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString83 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString84 = rEString81.makeClass(rEString83);
		st1920.automaton.REString rEString86 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString88 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString89 = rEString86.makeOneOrMore(rEString88);
		st1920.automaton.REString rEString90 = rEString84.makeExcludeClass(rEString89);
		st1920.automaton.REString rEString91 = rEString79.makeClass(rEString89);
		st1920.automaton.REString rEString92 = rEString43.makeZeroOrMore(rEString91);
		boolean boolean93 = st1920.automaton.RegexWrapper.matches("+", rEString91);
		java.lang.String str94 = rEString91.getReString();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str36 + "' != '" + "+" + "'", str36.equals("+"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str37 + "' != '" + "+" + "'", str37.equals("+"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString69);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString75);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString76);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString79);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString84);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString89);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString90);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString91);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString92);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str94 + "' != '" + "[+]" + "'", str94.equals("[+]"));
	}

	@Test
	public void test13() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test13");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString6 = rEString3.makeClass(rEString5);
		boolean boolean7 = st1920.automaton.RegexWrapper.matches("+", rEString3);
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString12 = rEString9.makeOneOrMore(rEString11);
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString17 = rEString14.makeOneOrMore(rEString16);
		st1920.automaton.REString rEString18 = rEString9.makeRange(rEString17);
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString23 = rEString20.makeOneOrMore(rEString22);
		st1920.automaton.REString rEString24 = rEString18.makeRange(rEString20);
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString29 = rEString26.makeOneOrMore(rEString28);
		st1920.automaton.REString rEString30 = st1920.automaton.REString.makeAlpha(rEString28);
		st1920.automaton.REString rEString31 = rEString20.makeAny(rEString28);
		st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString36 = rEString33.makeOneOrMore(rEString35);
		st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString41 = rEString38.makeClass(rEString40);
		st1920.automaton.REString rEString42 = rEString36.makeRepeatMoreThan(rEString40);
		st1920.automaton.REString rEString43 = rEString28.makeNothing(rEString36);
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString48 = rEString45.makeClass(rEString47);
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString53 = rEString50.makeOneOrMore(rEString52);
		st1920.automaton.REString rEString54 = rEString48.makeExcludeClass(rEString53);
		st1920.automaton.REString rEString56 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString59 = rEString56.makeOneOrMore(rEString58);
		st1920.automaton.REString rEString60 = rEString48.makeAny(rEString56);
		st1920.automaton.REString rEString61 = rEString28.makeOneOrMore(rEString48);
		st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString66 = rEString63.makeClass(rEString65);
		st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString71 = rEString68.makeOneOrMore(rEString70);
		st1920.automaton.REString rEString73 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString75 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString76 = rEString73.makeOneOrMore(rEString75);
		st1920.automaton.REString rEString77 = rEString68.makeRange(rEString76);
		st1920.automaton.REString rEString79 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString81 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString82 = rEString79.makeOneOrMore(rEString81);
		st1920.automaton.REString rEString83 = rEString77.makeRange(rEString79);
		st1920.automaton.REString rEString84 = rEString65.makeGroup(rEString83);
		st1920.automaton.REString rEString85 = rEString48.makeAny(rEString84);
		st1920.automaton.REString rEString86 = rEString3.makeZeroOrMore(rEString84);
		boolean boolean87 = st1920.automaton.RegexWrapper.matches("", rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString76);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString77);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString82);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString83);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString84);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString85);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString86);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
	}

	@Test
	public void test14() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test14");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeOneOrMore(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeOneOrMore(rEString9);
		st1920.automaton.REString rEString11 = rEString2.makeRange(rEString10);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = rEString13.makeOneOrMore(rEString15);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = rEString18.makeOneOrMore(rEString20);
		st1920.automaton.REString rEString22 = rEString13.makeRange(rEString21);
		st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = rEString24.makeOneOrMore(rEString26);
		st1920.automaton.REString rEString28 = rEString22.makeRange(rEString24);
		st1920.automaton.REString rEString29 = rEString11.makeClass(rEString24);
		boolean boolean30 = st1920.automaton.RegexWrapper.matches("[]", rEString11);
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString35 = rEString32.makeOneOrMore(rEString34);
		st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = rEString37.makeOneOrMore(rEString39);
		st1920.automaton.REString rEString41 = rEString32.makeRange(rEString40);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = rEString43.makeOneOrMore(rEString45);
		st1920.automaton.REString rEString47 = rEString41.makeRange(rEString43);
		st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString52 = rEString49.makeOneOrMore(rEString51);
		st1920.automaton.REString rEString53 = st1920.automaton.REString.makeAlpha(rEString51);
		st1920.automaton.REString rEString54 = rEString43.makeAny(rEString51);
		st1920.automaton.REString rEString56 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString59 = rEString56.makeOneOrMore(rEString58);
		st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString64 = rEString61.makeClass(rEString63);
		st1920.automaton.REString rEString65 = rEString59.makeRepeatMoreThan(rEString63);
		st1920.automaton.REString rEString66 = rEString51.makeNothing(rEString59);
		st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString71 = rEString68.makeClass(rEString70);
		st1920.automaton.REString rEString73 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString75 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString76 = rEString73.makeOneOrMore(rEString75);
		st1920.automaton.REString rEString77 = rEString71.makeExcludeClass(rEString76);
		st1920.automaton.REString rEString79 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString81 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString82 = rEString79.makeOneOrMore(rEString81);
		st1920.automaton.REString rEString83 = rEString71.makeAny(rEString79);
		st1920.automaton.REString rEString84 = rEString51.makeOneOrMore(rEString71);
		st1920.automaton.REString rEString85 = rEString11.makeRepeatExact(rEString84);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString76);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString77);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString82);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString83);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString84);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString85);
	}

	@Test
	public void test15() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test15");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeOneOrMore(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeOneOrMore(rEString9);
		st1920.automaton.REString rEString11 = rEString2.makeRange(rEString10);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = rEString13.makeOneOrMore(rEString15);
		st1920.automaton.REString rEString17 = rEString11.makeRange(rEString13);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = rEString19.makeClass(rEString21);
		st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = rEString24.makeOneOrMore(rEString26);
		st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = rEString29.makeOneOrMore(rEString31);
		st1920.automaton.REString rEString33 = rEString24.makeRange(rEString32);
		st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString38 = rEString35.makeOneOrMore(rEString37);
		st1920.automaton.REString rEString39 = rEString33.makeRange(rEString35);
		st1920.automaton.REString rEString40 = rEString21.makeGroup(rEString39);
		st1920.automaton.REString rEString41 = rEString17.makeZeroOrMore(rEString39);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = rEString43.makeClass(rEString45);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString53 = rEString50.makeOneOrMore(rEString52);
		st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString58 = rEString55.makeOneOrMore(rEString57);
		st1920.automaton.REString rEString59 = rEString50.makeRange(rEString58);
		st1920.automaton.REString rEString60 = rEString48.makeZeroOrMore(rEString59);
		st1920.automaton.REString rEString61 = rEString46.makeExcludeClass(rEString59);
		st1920.automaton.REString rEString62 = rEString41.makeAny(rEString46);
		st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString68 = rEString65.makeClass(rEString67);
		boolean boolean69 = st1920.automaton.RegexWrapper.matches("+", rEString65);
		st1920.automaton.REString rEString70 = rEString62.makeRange(rEString65);
		boolean boolean71 = st1920.automaton.RegexWrapper.matches("[]", rEString70);
		st1920.automaton.REString rEString72 = null;
		// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString73 = rEString70.makeGroup(rEString72);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString68);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
	}

	@Test
	public void test16() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test16");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = rEString1.makeOneOrMore(rEString3);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = rEString6.makeOneOrMore(rEString8);
		st1920.automaton.REString rEString10 = rEString1.makeRange(rEString9);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = rEString12.makeOneOrMore(rEString14);
		st1920.automaton.REString rEString16 = rEString10.makeRange(rEString12);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = rEString18.makeClass(rEString20);
		st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = rEString23.makeOneOrMore(rEString25);
		st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString31 = rEString28.makeOneOrMore(rEString30);
		st1920.automaton.REString rEString32 = rEString23.makeRange(rEString31);
		st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString37 = rEString34.makeOneOrMore(rEString36);
		st1920.automaton.REString rEString38 = rEString32.makeRange(rEString34);
		st1920.automaton.REString rEString39 = rEString20.makeGroup(rEString38);
		st1920.automaton.REString rEString40 = rEString16.makeZeroOrMore(rEString38);
		st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = rEString42.makeClass(rEString44);
		st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString52 = rEString49.makeOneOrMore(rEString51);
		st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString56 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString57 = rEString54.makeOneOrMore(rEString56);
		st1920.automaton.REString rEString58 = rEString49.makeRange(rEString57);
		st1920.automaton.REString rEString59 = rEString47.makeZeroOrMore(rEString58);
		st1920.automaton.REString rEString60 = rEString45.makeExcludeClass(rEString58);
		st1920.automaton.REString rEString61 = rEString40.makeAny(rEString45);
		st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString67 = rEString64.makeClass(rEString66);
		boolean boolean68 = st1920.automaton.RegexWrapper.matches("+", rEString64);
		st1920.automaton.REString rEString69 = rEString61.makeRange(rEString64);
		st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString73 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString74 = rEString71.makeClass(rEString73);
		st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString78 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString79 = rEString76.makeOneOrMore(rEString78);
		st1920.automaton.REString rEString80 = rEString74.makeExcludeClass(rEString79);
		st1920.automaton.REString rEString82 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString84 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString85 = rEString82.makeOneOrMore(rEString84);
		st1920.automaton.REString rEString86 = rEString74.makeAny(rEString82);
		st1920.automaton.REString rEString88 = new st1920.automaton.REString("hi!");
		st1920.automaton.REString rEString89 = rEString82.makeGroup(rEString88);
		st1920.automaton.REString rEString90 = st1920.automaton.REString.makeAlpha(rEString88);
		st1920.automaton.REString rEString92 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString94 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString95 = rEString92.makeOneOrMore(rEString94);
		st1920.automaton.REString rEString96 = rEString90.makeRepeatExact(rEString95);
		st1920.automaton.REString rEString97 = rEString69.makeRange(rEString96);
		rEString69.setReString("+");
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString67);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString69);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString74);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString79);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString80);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString85);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString86);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString89);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString90);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString95);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString96);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString97);
	}

	@Test
	public void test17() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test17");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeOneOrMore(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeOneOrMore(rEString9);
		st1920.automaton.REString rEString11 = rEString2.makeRange(rEString10);
		java.lang.String str12 = rEString10.getReString();
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString17 = rEString14.makeClass(rEString16);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = rEString19.makeOneOrMore(rEString21);
		st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = rEString24.makeOneOrMore(rEString26);
		st1920.automaton.REString rEString28 = rEString19.makeRange(rEString27);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = rEString30.makeOneOrMore(rEString32);
		st1920.automaton.REString rEString34 = rEString28.makeRange(rEString30);
		st1920.automaton.REString rEString35 = rEString16.makeGroup(rEString34);
		st1920.automaton.REString rEString36 = rEString10.makeRepeatMoreThan(rEString16);
		st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString41 = rEString38.makeOneOrMore(rEString40);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = rEString43.makeClass(rEString45);
		st1920.automaton.REString rEString47 = rEString41.makeRepeatMoreThan(rEString45);
		st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString52 = rEString49.makeClass(rEString51);
		st1920.automaton.REString rEString53 = st1920.automaton.REString.makeAlpha(rEString49);
		st1920.automaton.REString rEString54 = rEString47.makeZeroOrMore(rEString49);
		st1920.automaton.REString rEString55 = rEString16.makeOneOrMore(rEString54);
		st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString60 = rEString57.makeOneOrMore(rEString59);
		st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString65 = rEString62.makeOneOrMore(rEString64);
		st1920.automaton.REString rEString66 = rEString57.makeRange(rEString65);
		st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString71 = rEString68.makeOneOrMore(rEString70);
		st1920.automaton.REString rEString72 = rEString66.makeRange(rEString68);
		st1920.automaton.REString rEString73 = rEString55.makeRepeatRange(rEString66);
		boolean boolean74 = st1920.automaton.RegexWrapper.matches("+<694-938><327-451>", rEString73);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str12 + "' != '" + "+" + "'", str12.equals("+"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString73);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
	}

	@Test
	public void test18() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test18");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = rEString1.makeOneOrMore(rEString3);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = rEString6.makeOneOrMore(rEString8);
		st1920.automaton.REString rEString10 = rEString1.makeRange(rEString9);
		java.lang.String str11 = rEString9.getReString();
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = rEString13.makeClass(rEString15);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = rEString18.makeOneOrMore(rEString20);
		st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = rEString23.makeOneOrMore(rEString25);
		st1920.automaton.REString rEString27 = rEString18.makeRange(rEString26);
		st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = rEString29.makeOneOrMore(rEString31);
		st1920.automaton.REString rEString33 = rEString27.makeRange(rEString29);
		st1920.automaton.REString rEString34 = rEString15.makeGroup(rEString33);
		st1920.automaton.REString rEString35 = rEString9.makeRepeatMoreThan(rEString15);
		st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString41 = rEString38.makeClass(rEString40);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString48 = rEString45.makeOneOrMore(rEString47);
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString53 = rEString50.makeOneOrMore(rEString52);
		st1920.automaton.REString rEString54 = rEString45.makeRange(rEString53);
		st1920.automaton.REString rEString55 = rEString43.makeZeroOrMore(rEString54);
		st1920.automaton.REString rEString56 = rEString41.makeExcludeClass(rEString54);
		st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString60 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString61 = rEString58.makeOneOrMore(rEString60);
		st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString66 = rEString63.makeOneOrMore(rEString65);
		st1920.automaton.REString rEString67 = rEString58.makeRange(rEString66);
		st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString72 = rEString69.makeOneOrMore(rEString71);
		st1920.automaton.REString rEString74 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString77 = rEString74.makeOneOrMore(rEString76);
		st1920.automaton.REString rEString78 = rEString69.makeRange(rEString77);
		st1920.automaton.REString rEString80 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString82 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString83 = rEString80.makeOneOrMore(rEString82);
		st1920.automaton.REString rEString84 = rEString78.makeRange(rEString80);
		st1920.automaton.REString rEString85 = rEString66.makeOneOrMore(rEString84);
		st1920.automaton.REString rEString86 = rEString41.makeGroup(rEString85);
		boolean boolean87 = st1920.automaton.RegexWrapper.matches("[]", rEString85);
		st1920.automaton.REString rEString88 = rEString35.makeClass(rEString85);
		java.lang.Class<?> wildcardClass89 = rEString35.getClass();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str11 + "' != '" + "+" + "'", str11.equals("+"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString67);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString77);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString78);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString83);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString84);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString85);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString86);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString88);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass89);
	}

	@Test
	public void test19() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test19");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeClass(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString12 = rEString9.makeOneOrMore(rEString11);
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString17 = rEString14.makeOneOrMore(rEString16);
		st1920.automaton.REString rEString18 = rEString9.makeRange(rEString17);
		st1920.automaton.REString rEString19 = rEString7.makeZeroOrMore(rEString18);
		st1920.automaton.REString rEString20 = rEString5.makeExcludeClass(rEString18);
		// The following exception was thrown during execution in test generation
		try {
			boolean boolean21 = st1920.automaton.RegexWrapper.matches("", rEString5);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: expected ']' at position 2");
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
	}

	@Test
	public void test20() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test20");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = rEString1.makeOneOrMore(rEString3);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = rEString6.makeOneOrMore(rEString8);
		st1920.automaton.REString rEString10 = rEString1.makeRange(rEString9);
		java.lang.String str11 = rEString9.getReString();
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = rEString13.makeClass(rEString15);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = rEString18.makeOneOrMore(rEString20);
		st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = rEString23.makeOneOrMore(rEString25);
		st1920.automaton.REString rEString27 = rEString18.makeRange(rEString26);
		st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = rEString29.makeOneOrMore(rEString31);
		st1920.automaton.REString rEString33 = rEString27.makeRange(rEString29);
		st1920.automaton.REString rEString34 = rEString15.makeGroup(rEString33);
		st1920.automaton.REString rEString35 = rEString9.makeRepeatMoreThan(rEString15);
		st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString41 = rEString38.makeClass(rEString40);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString48 = rEString45.makeOneOrMore(rEString47);
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString53 = rEString50.makeOneOrMore(rEString52);
		st1920.automaton.REString rEString54 = rEString45.makeRange(rEString53);
		st1920.automaton.REString rEString55 = rEString43.makeZeroOrMore(rEString54);
		st1920.automaton.REString rEString56 = rEString41.makeExcludeClass(rEString54);
		st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString60 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString61 = rEString58.makeOneOrMore(rEString60);
		st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString66 = rEString63.makeOneOrMore(rEString65);
		st1920.automaton.REString rEString67 = rEString58.makeRange(rEString66);
		st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString72 = rEString69.makeOneOrMore(rEString71);
		st1920.automaton.REString rEString74 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString77 = rEString74.makeOneOrMore(rEString76);
		st1920.automaton.REString rEString78 = rEString69.makeRange(rEString77);
		st1920.automaton.REString rEString80 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString82 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString83 = rEString80.makeOneOrMore(rEString82);
		st1920.automaton.REString rEString84 = rEString78.makeRange(rEString80);
		st1920.automaton.REString rEString85 = rEString66.makeOneOrMore(rEString84);
		st1920.automaton.REString rEString86 = rEString41.makeGroup(rEString85);
		boolean boolean87 = st1920.automaton.RegexWrapper.matches("[]", rEString85);
		st1920.automaton.REString rEString88 = rEString35.makeClass(rEString85);
		st1920.automaton.REString rEString90 = new st1920.automaton.REString("");
		java.lang.String str91 = rEString90.getReString();
		st1920.automaton.REString rEString92 = rEString88.makeRepeatMoreThan(rEString90);
		java.lang.Class<?> wildcardClass93 = rEString92.getClass();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str11 + "' != '" + "+" + "'", str11.equals("+"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString67);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString77);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString78);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString83);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString84);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString85);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString86);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString88);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str91 + "' != '" + "" + "'", str91.equals(""));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString92);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass93);
	}

	@Test
	public void test21() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test21");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeOneOrMore(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeOneOrMore(rEString9);
		st1920.automaton.REString rEString11 = rEString2.makeRange(rEString10);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = rEString13.makeOneOrMore(rEString15);
		st1920.automaton.REString rEString17 = rEString11.makeRange(rEString13);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = rEString19.makeOneOrMore(rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.REString.makeAlpha(rEString21);
		st1920.automaton.REString rEString24 = rEString13.makeAny(rEString21);
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString29 = rEString26.makeOneOrMore(rEString28);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = rEString31.makeOneOrMore(rEString33);
		st1920.automaton.REString rEString35 = rEString26.makeRange(rEString34);
		java.lang.String str36 = rEString34.getReString();
		java.lang.String str37 = rEString34.getReString();
		st1920.automaton.REString rEString38 = rEString24.makeRepeatRange(rEString34);
		st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString43 = rEString40.makeClass(rEString42);
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = rEString47.makeOneOrMore(rEString49);
		st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString55 = rEString52.makeOneOrMore(rEString54);
		st1920.automaton.REString rEString56 = rEString47.makeRange(rEString55);
		st1920.automaton.REString rEString57 = rEString45.makeZeroOrMore(rEString56);
		st1920.automaton.REString rEString58 = rEString43.makeExcludeClass(rEString56);
		st1920.automaton.REString rEString59 = rEString34.makeZeroOrOne(rEString43);
		// The following exception was thrown during execution in test generation
		try {
			boolean boolean60 = st1920.automaton.RegexWrapper.matches("[+]", rEString59);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: expected ']' at position 3");
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str36 + "' != '" + "+" + "'", str36.equals("+"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str37 + "' != '" + "+" + "'", str37.equals("+"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
	}

	@Test
	public void test22() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test22");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = rEString1.makeOneOrMore(rEString3);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = rEString6.makeOneOrMore(rEString8);
		st1920.automaton.REString rEString10 = rEString1.makeRange(rEString9);
		java.lang.String str11 = rEString9.getReString();
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = rEString13.makeClass(rEString15);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = rEString18.makeOneOrMore(rEString20);
		st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = rEString23.makeOneOrMore(rEString25);
		st1920.automaton.REString rEString27 = rEString18.makeRange(rEString26);
		st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = rEString29.makeOneOrMore(rEString31);
		st1920.automaton.REString rEString33 = rEString27.makeRange(rEString29);
		st1920.automaton.REString rEString34 = rEString15.makeGroup(rEString33);
		st1920.automaton.REString rEString35 = rEString9.makeRepeatMoreThan(rEString15);
		st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString41 = rEString38.makeClass(rEString40);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString48 = rEString45.makeOneOrMore(rEString47);
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString53 = rEString50.makeOneOrMore(rEString52);
		st1920.automaton.REString rEString54 = rEString45.makeRange(rEString53);
		st1920.automaton.REString rEString55 = rEString43.makeZeroOrMore(rEString54);
		st1920.automaton.REString rEString56 = rEString41.makeExcludeClass(rEString54);
		st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString60 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString61 = rEString58.makeOneOrMore(rEString60);
		st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString66 = rEString63.makeOneOrMore(rEString65);
		st1920.automaton.REString rEString67 = rEString58.makeRange(rEString66);
		st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString72 = rEString69.makeOneOrMore(rEString71);
		st1920.automaton.REString rEString74 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString77 = rEString74.makeOneOrMore(rEString76);
		st1920.automaton.REString rEString78 = rEString69.makeRange(rEString77);
		st1920.automaton.REString rEString80 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString82 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString83 = rEString80.makeOneOrMore(rEString82);
		st1920.automaton.REString rEString84 = rEString78.makeRange(rEString80);
		st1920.automaton.REString rEString85 = rEString66.makeOneOrMore(rEString84);
		st1920.automaton.REString rEString86 = rEString41.makeGroup(rEString85);
		boolean boolean87 = st1920.automaton.RegexWrapper.matches("[]", rEString85);
		st1920.automaton.REString rEString88 = rEString35.makeClass(rEString85);
		st1920.automaton.REString rEString90 = new st1920.automaton.REString("");
		java.lang.String str91 = rEString90.getReString();
		st1920.automaton.REString rEString92 = rEString88.makeRepeatMoreThan(rEString90);
		st1920.automaton.REString rEString93 = st1920.automaton.REString.makeAlpha(rEString90);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str11 + "' != '" + "+" + "'", str11.equals("+"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString67);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString77);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString78);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString83);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString84);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString85);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString86);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString88);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str91 + "' != '" + "" + "'", str91.equals(""));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString92);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString93);
	}

	@Test
	public void test23() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test23");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeClass(rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.REString.makeAlpha(rEString2);
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString11 = rEString8.makeOneOrMore(rEString10);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = rEString13.makeOneOrMore(rEString15);
		st1920.automaton.REString rEString17 = rEString8.makeRange(rEString16);
		java.lang.String str18 = rEString16.getReString();
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString23 = rEString20.makeClass(rEString22);
		st1920.automaton.REString rEString24 = st1920.automaton.REString.makeAlpha(rEString23);
		st1920.automaton.REString rEString25 = rEString16.makeExcludeClass(rEString23);
		st1920.automaton.REString rEString26 = rEString2.makeExclude(rEString16);
		boolean boolean27 = st1920.automaton.RegexWrapper.matches("+<849-689>", rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str18 + "' != '" + "+" + "'", str18.equals("+"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
	}

	@Test
	public void test24() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test24");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeOneOrMore(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeClass(rEString9);
		st1920.automaton.REString rEString11 = rEString5.makeRepeatMoreThan(rEString9);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = rEString13.makeClass(rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.REString.makeAlpha(rEString13);
		st1920.automaton.REString rEString18 = rEString11.makeZeroOrMore(rEString13);
		boolean boolean19 = st1920.automaton.RegexWrapper.matches("hi!", rEString18);
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString24 = rEString21.makeOneOrMore(rEString23);
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString29 = rEString26.makeOneOrMore(rEString28);
		st1920.automaton.REString rEString30 = rEString21.makeRange(rEString29);
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString35 = rEString32.makeOneOrMore(rEString34);
		st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = rEString37.makeOneOrMore(rEString39);
		st1920.automaton.REString rEString41 = rEString32.makeRange(rEString40);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = rEString43.makeOneOrMore(rEString45);
		st1920.automaton.REString rEString47 = rEString41.makeRange(rEString43);
		st1920.automaton.REString rEString48 = rEString29.makeOneOrMore(rEString47);
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString53 = rEString50.makeOneOrMore(rEString52);
		st1920.automaton.REString rEString54 = st1920.automaton.REString.makeAlpha(rEString52);
		st1920.automaton.REString rEString55 = rEString48.makeRepeatExact(rEString52);
		st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString60 = rEString57.makeOneOrMore(rEString59);
		st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString65 = rEString62.makeOneOrMore(rEString64);
		st1920.automaton.REString rEString66 = rEString57.makeRange(rEString65);
		st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString71 = rEString68.makeOneOrMore(rEString70);
		st1920.automaton.REString rEString72 = rEString66.makeRange(rEString68);
		st1920.automaton.REString rEString74 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString77 = rEString74.makeOneOrMore(rEString76);
		st1920.automaton.REString rEString78 = st1920.automaton.REString.makeAlpha(rEString76);
		st1920.automaton.REString rEString79 = rEString68.makeAny(rEString76);
		st1920.automaton.REString rEString80 = rEString55.makeZeroOrMore(rEString76);
		st1920.automaton.REString rEString81 = rEString18.makeRepeatMoreThan(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString77);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString78);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString79);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString80);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString81);
	}

	@Test
	public void test25() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test25");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString6 = rEString3.makeOneOrMore(rEString5);
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString11 = rEString8.makeClass(rEString10);
		st1920.automaton.REString rEString12 = rEString6.makeRepeatMoreThan(rEString10);
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString17 = rEString14.makeClass(rEString16);
		st1920.automaton.REString rEString18 = st1920.automaton.REString.makeAlpha(rEString14);
		st1920.automaton.REString rEString19 = rEString12.makeZeroOrMore(rEString14);
		boolean boolean20 = st1920.automaton.RegexWrapper.matches("hi!", rEString19);
		boolean boolean21 = st1920.automaton.RegexWrapper.matches("hi!", rEString19);
		java.lang.Class<?> wildcardClass22 = rEString19.getClass();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass22);
	}

	@Test
	public void test26() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test26");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("[]");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString6 = rEString3.makeOneOrMore(rEString5);
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString11 = rEString8.makeOneOrMore(rEString10);
		st1920.automaton.REString rEString12 = rEString3.makeRange(rEString11);
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString17 = rEString14.makeOneOrMore(rEString16);
		st1920.automaton.REString rEString18 = rEString12.makeRange(rEString14);
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString23 = rEString20.makeOneOrMore(rEString22);
		st1920.automaton.REString rEString24 = st1920.automaton.REString.makeAlpha(rEString22);
		st1920.automaton.REString rEString25 = rEString14.makeAny(rEString22);
		st1920.automaton.REString rEString27 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString30 = rEString27.makeOneOrMore(rEString29);
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString35 = rEString32.makeClass(rEString34);
		st1920.automaton.REString rEString36 = rEString30.makeRepeatMoreThan(rEString34);
		st1920.automaton.REString rEString37 = rEString22.makeNothing(rEString30);
		st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString42 = rEString39.makeOneOrMore(rEString41);
		st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString47 = rEString44.makeOneOrMore(rEString46);
		st1920.automaton.REString rEString48 = rEString39.makeRange(rEString47);
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString53 = rEString50.makeOneOrMore(rEString52);
		st1920.automaton.REString rEString54 = rEString48.makeRange(rEString50);
		st1920.automaton.REString rEString55 = rEString22.makeOneOrMore(rEString50);
		st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString60 = rEString57.makeClass(rEString59);
		st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString67 = rEString64.makeOneOrMore(rEString66);
		st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString72 = rEString69.makeOneOrMore(rEString71);
		st1920.automaton.REString rEString73 = rEString64.makeRange(rEString72);
		st1920.automaton.REString rEString74 = rEString62.makeZeroOrMore(rEString73);
		st1920.automaton.REString rEString75 = rEString60.makeExcludeClass(rEString73);
		java.lang.String str76 = rEString60.getReString();
		st1920.automaton.REString rEString77 = rEString55.makeOneOrMore(rEString60);
		st1920.automaton.REString rEString78 = rEString1.makeNothing(rEString55);
		st1920.automaton.REString rEString80 = new st1920.automaton.REString("[]+{721,}");
		st1920.automaton.REString rEString83 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString85 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString86 = rEString83.makeClass(rEString85);
		st1920.automaton.REString rEString88 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString90 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString91 = rEString88.makeOneOrMore(rEString90);
		st1920.automaton.REString rEString92 = rEString86.makeExcludeClass(rEString91);
		boolean boolean93 = st1920.automaton.RegexWrapper.matches("hi!", rEString91);
		st1920.automaton.REString rEString94 = rEString80.makeZeroOrMore(rEString91);
		st1920.automaton.REString rEString95 = rEString55.makeExcludeClass(rEString91);
		st1920.automaton.REString rEString97 = new st1920.automaton.REString("+9");
		st1920.automaton.REString rEString98 = rEString55.makeAnyChar(rEString97);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString67);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString73);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString74);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString75);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str76 + "' != '" + "[]" + "'", str76.equals("[]"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString77);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString78);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString86);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString91);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString92);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString94);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString95);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString98);
	}

	@Test
	public void test27() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test27");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("[]");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString6 = rEString3.makeClass(rEString5);
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString11 = rEString8.makeOneOrMore(rEString10);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = rEString13.makeOneOrMore(rEString15);
		st1920.automaton.REString rEString17 = rEString8.makeRange(rEString16);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = rEString19.makeOneOrMore(rEString21);
		st1920.automaton.REString rEString23 = rEString17.makeRange(rEString19);
		st1920.automaton.REString rEString24 = rEString5.makeGroup(rEString23);
		rEString5.setReString("");
		st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString31 = rEString28.makeOneOrMore(rEString30);
		st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString36 = rEString33.makeOneOrMore(rEString35);
		st1920.automaton.REString rEString37 = rEString28.makeRange(rEString36);
		st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString42 = rEString39.makeOneOrMore(rEString41);
		st1920.automaton.REString rEString43 = rEString37.makeRange(rEString39);
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString48 = rEString45.makeClass(rEString47);
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString53 = rEString50.makeOneOrMore(rEString52);
		st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString58 = rEString55.makeOneOrMore(rEString57);
		st1920.automaton.REString rEString59 = rEString50.makeRange(rEString58);
		st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString64 = rEString61.makeOneOrMore(rEString63);
		st1920.automaton.REString rEString65 = rEString59.makeRange(rEString61);
		st1920.automaton.REString rEString66 = rEString47.makeGroup(rEString65);
		st1920.automaton.REString rEString67 = rEString43.makeZeroOrMore(rEString65);
		st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString72 = rEString69.makeClass(rEString71);
		st1920.automaton.REString rEString74 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString78 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString79 = rEString76.makeOneOrMore(rEString78);
		st1920.automaton.REString rEString81 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString83 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString84 = rEString81.makeOneOrMore(rEString83);
		st1920.automaton.REString rEString85 = rEString76.makeRange(rEString84);
		st1920.automaton.REString rEString86 = rEString74.makeZeroOrMore(rEString85);
		st1920.automaton.REString rEString87 = rEString72.makeExcludeClass(rEString85);
		st1920.automaton.REString rEString88 = rEString67.makeAny(rEString72);
		st1920.automaton.REString rEString91 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString93 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString94 = rEString91.makeClass(rEString93);
		boolean boolean95 = st1920.automaton.RegexWrapper.matches("+", rEString91);
		st1920.automaton.REString rEString96 = rEString88.makeRange(rEString91);
		st1920.automaton.REString rEString97 = rEString5.makeRepeatExact(rEString96);
		st1920.automaton.REString rEString98 = rEString1.makeRepeatMoreThan(rEString97);
		java.lang.String str99 = rEString1.getReString();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString67);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString79);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString84);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString85);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString86);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString87);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString88);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString94);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString96);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString97);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString98);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str99 + "' != '" + "[]" + "'", str99.equals("[]"));
	}

	@Test
	public void test28() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test28");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeOneOrMore(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeOneOrMore(rEString9);
		st1920.automaton.REString rEString11 = rEString2.makeRange(rEString10);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = rEString13.makeOneOrMore(rEString15);
		st1920.automaton.REString rEString17 = rEString11.makeRange(rEString13);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = rEString19.makeOneOrMore(rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.REString.makeAlpha(rEString21);
		st1920.automaton.REString rEString24 = rEString13.makeAny(rEString21);
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString29 = rEString26.makeOneOrMore(rEString28);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = rEString31.makeClass(rEString33);
		st1920.automaton.REString rEString35 = rEString29.makeRepeatMoreThan(rEString33);
		st1920.automaton.REString rEString36 = rEString21.makeNothing(rEString29);
		st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString41 = rEString38.makeOneOrMore(rEString40);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = rEString43.makeOneOrMore(rEString45);
		st1920.automaton.REString rEString47 = rEString38.makeRange(rEString46);
		st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString52 = rEString49.makeOneOrMore(rEString51);
		st1920.automaton.REString rEString53 = rEString47.makeRange(rEString49);
		st1920.automaton.REString rEString54 = rEString21.makeOneOrMore(rEString49);
		st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString60 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString61 = rEString58.makeOneOrMore(rEString60);
		st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString66 = rEString63.makeClass(rEString65);
		st1920.automaton.REString rEString67 = rEString61.makeRepeatMoreThan(rEString65);
		st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString72 = rEString69.makeClass(rEString71);
		st1920.automaton.REString rEString73 = st1920.automaton.REString.makeAlpha(rEString69);
		st1920.automaton.REString rEString74 = rEString67.makeZeroOrMore(rEString69);
		boolean boolean75 = st1920.automaton.RegexWrapper.matches("hi!", rEString74);
		boolean boolean76 = st1920.automaton.RegexWrapper.matches("hi!", rEString74);
		st1920.automaton.REString rEString77 = rEString49.makeZeroOrOne(rEString74);
		st1920.automaton.REString rEString79 = new st1920.automaton.REString("hi!");
		st1920.automaton.REString rEString81 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString83 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString84 = rEString81.makeOneOrMore(rEString83);
		st1920.automaton.REString rEString86 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString88 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString89 = rEString86.makeOneOrMore(rEString88);
		st1920.automaton.REString rEString90 = rEString81.makeRange(rEString89);
		st1920.automaton.REString rEString91 = rEString79.makeAnyChar(rEString81);
		st1920.automaton.REString rEString92 = rEString74.makeRepeatExact(rEString91);
		boolean boolean93 = st1920.automaton.RegexWrapper.matches("<968-958>", rEString74);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString67);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString73);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString74);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString77);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString84);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString89);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString90);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString91);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString92);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
	}

	@Test
	public void test29() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test29");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = rEString1.makeOneOrMore(rEString3);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = rEString6.makeOneOrMore(rEString8);
		st1920.automaton.REString rEString10 = rEString1.makeRange(rEString9);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = rEString13.makeClass(rEString15);
		boolean boolean17 = st1920.automaton.RegexWrapper.matches("+", rEString13);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = rEString19.makeOneOrMore(rEString21);
		st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = rEString24.makeOneOrMore(rEString26);
		st1920.automaton.REString rEString28 = rEString19.makeRange(rEString27);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = rEString30.makeOneOrMore(rEString32);
		st1920.automaton.REString rEString34 = rEString28.makeRange(rEString30);
		st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString39 = rEString36.makeOneOrMore(rEString38);
		st1920.automaton.REString rEString40 = st1920.automaton.REString.makeAlpha(rEString38);
		st1920.automaton.REString rEString41 = rEString30.makeAny(rEString38);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = rEString43.makeOneOrMore(rEString45);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = rEString48.makeClass(rEString50);
		st1920.automaton.REString rEString52 = rEString46.makeRepeatMoreThan(rEString50);
		st1920.automaton.REString rEString53 = rEString38.makeNothing(rEString46);
		st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString58 = rEString55.makeClass(rEString57);
		st1920.automaton.REString rEString60 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString63 = rEString60.makeOneOrMore(rEString62);
		st1920.automaton.REString rEString64 = rEString58.makeExcludeClass(rEString63);
		st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString69 = rEString66.makeOneOrMore(rEString68);
		st1920.automaton.REString rEString70 = rEString58.makeAny(rEString66);
		st1920.automaton.REString rEString71 = rEString38.makeOneOrMore(rEString58);
		st1920.automaton.REString rEString73 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString75 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString76 = rEString73.makeClass(rEString75);
		st1920.automaton.REString rEString78 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString80 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString81 = rEString78.makeOneOrMore(rEString80);
		st1920.automaton.REString rEString83 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString85 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString86 = rEString83.makeOneOrMore(rEString85);
		st1920.automaton.REString rEString87 = rEString78.makeRange(rEString86);
		st1920.automaton.REString rEString89 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString91 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString92 = rEString89.makeOneOrMore(rEString91);
		st1920.automaton.REString rEString93 = rEString87.makeRange(rEString89);
		st1920.automaton.REString rEString94 = rEString75.makeGroup(rEString93);
		st1920.automaton.REString rEString95 = rEString58.makeAny(rEString94);
		st1920.automaton.REString rEString96 = rEString13.makeZeroOrMore(rEString94);
		st1920.automaton.REString rEString97 = rEString1.makeRange(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString63);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString69);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString76);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString81);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString86);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString87);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString92);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString93);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString94);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString95);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString96);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString97);
	}

	@Test
	public void test30() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test30");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = rEString1.makeClass(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.REString.makeAlpha(rEString1);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeClass(rEString9);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = rEString12.makeOneOrMore(rEString14);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = rEString17.makeOneOrMore(rEString19);
		st1920.automaton.REString rEString21 = rEString12.makeRange(rEString20);
		st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = rEString23.makeOneOrMore(rEString25);
		st1920.automaton.REString rEString27 = rEString21.makeRange(rEString23);
		st1920.automaton.REString rEString28 = rEString9.makeGroup(rEString27);
		st1920.automaton.REString rEString29 = rEString5.makeExcludeClass(rEString28);
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("<512-61>");
		boolean boolean33 = st1920.automaton.RegexWrapper.matches("[]", rEString32);
		st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString38 = rEString35.makeClass(rEString37);
		st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString43 = rEString40.makeClass(rEString42);
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString48 = rEString45.makeOneOrMore(rEString47);
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString53 = rEString50.makeOneOrMore(rEString52);
		st1920.automaton.REString rEString54 = rEString45.makeRange(rEString53);
		st1920.automaton.REString rEString56 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString59 = rEString56.makeOneOrMore(rEString58);
		st1920.automaton.REString rEString60 = rEString54.makeRange(rEString56);
		st1920.automaton.REString rEString61 = rEString42.makeGroup(rEString60);
		st1920.automaton.REString rEString62 = rEString35.makeRepeatRange(rEString42);
		st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString67 = rEString64.makeClass(rEString66);
		st1920.automaton.REString rEString68 = st1920.automaton.REString.makeAlpha(rEString64);
		st1920.automaton.REString rEString69 = rEString35.makeClass(rEString64);
		st1920.automaton.REString rEString70 = rEString32.makeAnyChar(rEString35);
		st1920.automaton.REString rEString71 = rEString5.makeRepeatExact(rEString70);
		st1920.automaton.REString rEString73 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString75 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString76 = rEString73.makeClass(rEString75);
		st1920.automaton.REString rEString77 = st1920.automaton.REString.makeAlpha(rEString73);
		st1920.automaton.REString rEString79 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString81 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString82 = rEString79.makeOneOrMore(rEString81);
		st1920.automaton.REString rEString84 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString86 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString87 = rEString84.makeOneOrMore(rEString86);
		st1920.automaton.REString rEString88 = rEString79.makeRange(rEString87);
		java.lang.String str89 = rEString87.getReString();
		st1920.automaton.REString rEString91 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString93 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString94 = rEString91.makeClass(rEString93);
		st1920.automaton.REString rEString95 = st1920.automaton.REString.makeAlpha(rEString94);
		st1920.automaton.REString rEString96 = rEString87.makeExcludeClass(rEString94);
		st1920.automaton.REString rEString97 = rEString73.makeExclude(rEString87);
		st1920.automaton.REString rEString98 = st1920.automaton.REString.makeAlpha(rEString87);
		st1920.automaton.REString rEString99 = rEString71.makeNothing(rEString87);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString67);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString68);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString69);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString76);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString77);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString82);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString87);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString88);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str89 + "' != '" + "+" + "'", str89.equals("+"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString94);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString95);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString96);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString97);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString98);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString99);
	}

	@Test
	public void test31() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test31");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = rEString1.makeOneOrMore(rEString3);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = rEString6.makeOneOrMore(rEString8);
		st1920.automaton.REString rEString10 = rEString1.makeRange(rEString9);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = rEString12.makeOneOrMore(rEString14);
		st1920.automaton.REString rEString16 = rEString10.makeRange(rEString12);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = rEString18.makeOneOrMore(rEString20);
		st1920.automaton.REString rEString22 = st1920.automaton.REString.makeAlpha(rEString20);
		st1920.automaton.REString rEString23 = rEString12.makeAny(rEString20);
		st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString28 = rEString25.makeOneOrMore(rEString27);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = rEString30.makeClass(rEString32);
		st1920.automaton.REString rEString34 = rEString28.makeRepeatMoreThan(rEString32);
		st1920.automaton.REString rEString35 = rEString20.makeNothing(rEString28);
		st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = rEString37.makeOneOrMore(rEString39);
		st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = rEString42.makeOneOrMore(rEString44);
		st1920.automaton.REString rEString46 = rEString37.makeRange(rEString45);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = rEString48.makeOneOrMore(rEString50);
		st1920.automaton.REString rEString52 = rEString46.makeRange(rEString48);
		st1920.automaton.REString rEString53 = rEString20.makeOneOrMore(rEString48);
		st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString60 = rEString57.makeOneOrMore(rEString59);
		st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString65 = rEString62.makeClass(rEString64);
		st1920.automaton.REString rEString66 = rEString60.makeRepeatMoreThan(rEString64);
		st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString71 = rEString68.makeClass(rEString70);
		st1920.automaton.REString rEString72 = st1920.automaton.REString.makeAlpha(rEString68);
		st1920.automaton.REString rEString73 = rEString66.makeZeroOrMore(rEString68);
		boolean boolean74 = st1920.automaton.RegexWrapper.matches("hi!", rEString73);
		boolean boolean75 = st1920.automaton.RegexWrapper.matches("hi!", rEString73);
		st1920.automaton.REString rEString76 = rEString48.makeZeroOrOne(rEString73);
		st1920.automaton.REString rEString78 = new st1920.automaton.REString("hi!");
		st1920.automaton.REString rEString80 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString82 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString83 = rEString80.makeOneOrMore(rEString82);
		st1920.automaton.REString rEString85 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString87 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString88 = rEString85.makeOneOrMore(rEString87);
		st1920.automaton.REString rEString89 = rEString80.makeRange(rEString88);
		st1920.automaton.REString rEString90 = rEString78.makeAnyChar(rEString80);
		st1920.automaton.REString rEString91 = rEString73.makeRepeatExact(rEString90);
		st1920.automaton.REString rEString93 = new st1920.automaton.REString("<931-552>*");
		st1920.automaton.REString rEString94 = rEString73.makeOneOrMore(rEString93);
		java.lang.String str95 = rEString94.getReString();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString73);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString76);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString83);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString88);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString89);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString90);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString91);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString94);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str95 + "' != '" + "<931-552>*+" + "'", str95.equals("<931-552>*+"));
	}

	@Test
	public void test32() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test32");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeOneOrMore(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeClass(rEString9);
		st1920.automaton.REString rEString11 = rEString5.makeRepeatMoreThan(rEString9);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = rEString13.makeClass(rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.REString.makeAlpha(rEString13);
		st1920.automaton.REString rEString18 = rEString11.makeZeroOrMore(rEString13);
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString23 = rEString20.makeClass(rEString22);
		st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString30 = rEString27.makeOneOrMore(rEString29);
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString35 = rEString32.makeOneOrMore(rEString34);
		st1920.automaton.REString rEString36 = rEString27.makeRange(rEString35);
		st1920.automaton.REString rEString37 = rEString25.makeZeroOrMore(rEString36);
		st1920.automaton.REString rEString38 = rEString23.makeExcludeClass(rEString36);
		st1920.automaton.REString rEString39 = rEString13.makeRepeatMoreThan(rEString38);
		st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString44 = rEString41.makeOneOrMore(rEString43);
		st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString49 = rEString46.makeOneOrMore(rEString48);
		st1920.automaton.REString rEString50 = rEString41.makeRange(rEString49);
		st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString55 = rEString52.makeOneOrMore(rEString54);
		st1920.automaton.REString rEString56 = rEString50.makeRange(rEString52);
		st1920.automaton.REString rEString57 = st1920.automaton.REString.makeAlpha(rEString56);
		st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString62 = rEString59.makeOneOrMore(rEString61);
		st1920.automaton.REString rEString63 = rEString56.makeRepeatMoreThan(rEString61);
		st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString68 = rEString65.makeClass(rEString67);
		st1920.automaton.REString rEString69 = rEString39.makeConcatenation(rEString61, rEString68);
		boolean boolean70 = st1920.automaton.RegexWrapper.matches("+5", rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString63);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString68);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString69);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
	}

	@Test
	public void test33() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test33");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeClass(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString12 = rEString9.makeOneOrMore(rEString11);
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString17 = rEString14.makeOneOrMore(rEString16);
		st1920.automaton.REString rEString18 = rEString9.makeRange(rEString17);
		st1920.automaton.REString rEString19 = rEString7.makeZeroOrMore(rEString18);
		st1920.automaton.REString rEString20 = rEString5.makeExcludeClass(rEString18);
		st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString25 = rEString22.makeOneOrMore(rEString24);
		st1920.automaton.REString rEString27 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString30 = rEString27.makeOneOrMore(rEString29);
		st1920.automaton.REString rEString31 = rEString22.makeRange(rEString30);
		st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString36 = rEString33.makeOneOrMore(rEString35);
		st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString41 = rEString38.makeOneOrMore(rEString40);
		st1920.automaton.REString rEString42 = rEString33.makeRange(rEString41);
		st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString47 = rEString44.makeOneOrMore(rEString46);
		st1920.automaton.REString rEString48 = rEString42.makeRange(rEString44);
		st1920.automaton.REString rEString49 = rEString30.makeOneOrMore(rEString48);
		st1920.automaton.REString rEString50 = rEString5.makeGroup(rEString49);
		st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString55 = rEString52.makeClass(rEString54);
		st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString62 = rEString59.makeOneOrMore(rEString61);
		st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString67 = rEString64.makeOneOrMore(rEString66);
		st1920.automaton.REString rEString68 = rEString59.makeRange(rEString67);
		st1920.automaton.REString rEString69 = rEString57.makeZeroOrMore(rEString68);
		st1920.automaton.REString rEString70 = rEString55.makeExcludeClass(rEString68);
		st1920.automaton.REString rEString71 = rEString5.makeRepeatRange(rEString55);
		// The following exception was thrown during execution in test generation
		try {
			boolean boolean72 = st1920.automaton.RegexWrapper.matches("+", rEString55);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: expected ']' at position 2");
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString67);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString68);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString69);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
	}

	@Test
	public void test34() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test34");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeOneOrMore(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeOneOrMore(rEString9);
		st1920.automaton.REString rEString11 = rEString2.makeRange(rEString10);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = rEString13.makeOneOrMore(rEString15);
		st1920.automaton.REString rEString17 = rEString11.makeRange(rEString13);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = rEString19.makeOneOrMore(rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.REString.makeAlpha(rEString21);
		st1920.automaton.REString rEString24 = rEString13.makeAny(rEString21);
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString29 = rEString26.makeOneOrMore(rEString28);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = rEString31.makeClass(rEString33);
		st1920.automaton.REString rEString35 = rEString29.makeRepeatMoreThan(rEString33);
		st1920.automaton.REString rEString36 = rEString21.makeNothing(rEString29);
		st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString41 = rEString38.makeOneOrMore(rEString40);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = rEString43.makeOneOrMore(rEString45);
		st1920.automaton.REString rEString47 = rEString38.makeRange(rEString46);
		st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString52 = rEString49.makeOneOrMore(rEString51);
		st1920.automaton.REString rEString53 = rEString47.makeRange(rEString49);
		st1920.automaton.REString rEString54 = rEString21.makeOneOrMore(rEString49);
		boolean boolean55 = st1920.automaton.RegexWrapper.matches("", rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
	}

	@Test
	public void test35() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test35");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeClass(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString12 = rEString9.makeOneOrMore(rEString11);
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString17 = rEString14.makeOneOrMore(rEString16);
		st1920.automaton.REString rEString18 = rEString9.makeRange(rEString17);
		st1920.automaton.REString rEString19 = rEString7.makeZeroOrMore(rEString18);
		st1920.automaton.REString rEString20 = rEString5.makeExcludeClass(rEString18);
		java.lang.String str21 = rEString5.getReString();
		// The following exception was thrown during execution in test generation
		try {
			boolean boolean22 = st1920.automaton.RegexWrapper.matches("~", rEString5);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: expected ']' at position 2");
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]" + "'", str21.equals("[]"));
	}

	@Test
	public void test36() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test36");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = rEString1.makeClass(rEString3);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = rEString6.makeClass(rEString8);
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = rEString11.makeOneOrMore(rEString13);
		st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = rEString16.makeOneOrMore(rEString18);
		st1920.automaton.REString rEString20 = rEString11.makeRange(rEString19);
		st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString25 = rEString22.makeOneOrMore(rEString24);
		st1920.automaton.REString rEString26 = rEString20.makeRange(rEString22);
		st1920.automaton.REString rEString27 = rEString8.makeGroup(rEString26);
		st1920.automaton.REString rEString28 = rEString1.makeRepeatRange(rEString8);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = rEString30.makeClass(rEString32);
		st1920.automaton.REString rEString34 = st1920.automaton.REString.makeAlpha(rEString30);
		st1920.automaton.REString rEString35 = rEString1.makeClass(rEString30);
		st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = rEString37.makeClass(rEString39);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = rEString43.makeClass(rEString45);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = rEString48.makeOneOrMore(rEString50);
		st1920.automaton.REString rEString52 = rEString46.makeExcludeClass(rEString51);
		boolean boolean53 = st1920.automaton.RegexWrapper.matches("hi!", rEString51);
		st1920.automaton.REString rEString54 = rEString40.makeZeroOrMore(rEString51);
		st1920.automaton.REString rEString55 = rEString30.makeAny(rEString51);
		st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString60 = rEString57.makeClass(rEString59);
		st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString65 = rEString62.makeOneOrMore(rEString64);
		st1920.automaton.REString rEString66 = rEString60.makeExcludeClass(rEString65);
		st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString71 = rEString68.makeOneOrMore(rEString70);
		st1920.automaton.REString rEString72 = rEString60.makeAny(rEString68);
		st1920.automaton.REString rEString74 = new st1920.automaton.REString("hi!");
		st1920.automaton.REString rEString75 = rEString68.makeGroup(rEString74);
		st1920.automaton.REString rEString76 = st1920.automaton.REString.makeAlpha(rEString74);
		st1920.automaton.REString rEString78 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString80 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString81 = rEString78.makeOneOrMore(rEString80);
		st1920.automaton.REString rEString82 = rEString76.makeRepeatExact(rEString81);
		st1920.automaton.REString rEString83 = rEString30.makeZeroOrMore(rEString81);
		st1920.automaton.REString rEString85 = new st1920.automaton.REString("hi!");
		st1920.automaton.REString rEString86 = rEString83.makeZeroOrOne(rEString85);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString75);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString76);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString81);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString82);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString83);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString86);
	}

	@Test
	public void test37() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test37");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeOneOrMore(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeOneOrMore(rEString9);
		st1920.automaton.REString rEString11 = rEString2.makeRange(rEString10);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = rEString13.makeOneOrMore(rEString15);
		st1920.automaton.REString rEString17 = rEString11.makeRange(rEString13);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = rEString19.makeClass(rEString21);
		st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = rEString24.makeOneOrMore(rEString26);
		st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = rEString29.makeOneOrMore(rEString31);
		st1920.automaton.REString rEString33 = rEString24.makeRange(rEString32);
		st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString38 = rEString35.makeOneOrMore(rEString37);
		st1920.automaton.REString rEString39 = rEString33.makeRange(rEString35);
		st1920.automaton.REString rEString40 = rEString21.makeGroup(rEString39);
		st1920.automaton.REString rEString41 = rEString17.makeZeroOrMore(rEString39);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = rEString43.makeClass(rEString45);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString53 = rEString50.makeOneOrMore(rEString52);
		st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString58 = rEString55.makeOneOrMore(rEString57);
		st1920.automaton.REString rEString59 = rEString50.makeRange(rEString58);
		st1920.automaton.REString rEString60 = rEString48.makeZeroOrMore(rEString59);
		st1920.automaton.REString rEString61 = rEString46.makeExcludeClass(rEString59);
		st1920.automaton.REString rEString62 = rEString41.makeRepeatExact(rEString59);
		java.lang.String str63 = rEString41.getReString();
		st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString68 = rEString65.makeOneOrMore(rEString67);
		st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString72 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString73 = rEString70.makeOneOrMore(rEString72);
		st1920.automaton.REString rEString74 = rEString65.makeRange(rEString73);
		java.lang.String str75 = rEString73.getReString();
		st1920.automaton.REString rEString76 = rEString41.makeExcludeClass(rEString73);
		boolean boolean77 = st1920.automaton.RegexWrapper.matches("+@", rEString76);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
		// Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str63 + "' != '" + "<284-968>*" + "'", str63.equals("<284-968>*"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString68);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString73);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString74);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str75 + "' != '" + "+" + "'", str75.equals("+"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString76);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
	}

	@Test
	public void test38() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test38");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeClass(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeOneOrMore(rEString9);
		st1920.automaton.REString rEString11 = rEString5.makeExcludeClass(rEString10);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = rEString13.makeOneOrMore(rEString15);
		st1920.automaton.REString rEString17 = rEString5.makeAny(rEString13);
		boolean boolean18 = st1920.automaton.RegexWrapper.matches("+<694-938><327-451>", rEString13);
		st1920.automaton.REString rEString19 = null;
		// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString20 = rEString13.makeZeroOrOne(rEString19);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
	}

	@Test
	public void test39() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test39");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeOneOrMore(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeOneOrMore(rEString9);
		st1920.automaton.REString rEString11 = rEString2.makeRange(rEString10);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = rEString13.makeOneOrMore(rEString15);
		st1920.automaton.REString rEString17 = rEString11.makeRange(rEString13);
		st1920.automaton.REString rEString18 = st1920.automaton.REString.makeAlpha(rEString17);
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString23 = rEString20.makeOneOrMore(rEString22);
		st1920.automaton.REString rEString24 = rEString17.makeRepeatMoreThan(rEString22);
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString29 = rEString26.makeOneOrMore(rEString28);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = rEString31.makeOneOrMore(rEString33);
		st1920.automaton.REString rEString35 = rEString26.makeRange(rEString34);
		st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = rEString37.makeOneOrMore(rEString39);
		st1920.automaton.REString rEString41 = rEString35.makeRange(rEString37);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = rEString43.makeOneOrMore(rEString45);
		st1920.automaton.REString rEString47 = st1920.automaton.REString.makeAlpha(rEString45);
		st1920.automaton.REString rEString48 = rEString37.makeAny(rEString45);
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString53 = rEString50.makeOneOrMore(rEString52);
		st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString58 = rEString55.makeClass(rEString57);
		st1920.automaton.REString rEString59 = rEString53.makeRepeatMoreThan(rEString57);
		st1920.automaton.REString rEString60 = rEString45.makeNothing(rEString53);
		st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString65 = rEString62.makeClass(rEString64);
		st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString70 = rEString67.makeOneOrMore(rEString69);
		st1920.automaton.REString rEString71 = rEString65.makeExcludeClass(rEString70);
		st1920.automaton.REString rEString73 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString75 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString76 = rEString73.makeOneOrMore(rEString75);
		st1920.automaton.REString rEString77 = rEString65.makeAny(rEString73);
		st1920.automaton.REString rEString78 = rEString45.makeOneOrMore(rEString65);
		st1920.automaton.REString rEString80 = new st1920.automaton.REString("hi!");
		st1920.automaton.REString rEString81 = rEString17.makeConcatenation(rEString45, rEString80);
		boolean boolean82 = st1920.automaton.RegexWrapper.matches("+8", rEString81);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString76);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString77);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString78);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString81);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
	}

	@Test
	public void test40() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test40");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("[+]");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("<512-61>");
		boolean boolean5 = st1920.automaton.RegexWrapper.matches("[]", rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString12 = rEString9.makeOneOrMore(rEString11);
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString17 = rEString14.makeOneOrMore(rEString16);
		st1920.automaton.REString rEString18 = rEString9.makeRange(rEString17);
		st1920.automaton.REString rEString19 = rEString7.makeZeroOrMore(rEString18);
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString24 = rEString21.makeOneOrMore(rEString23);
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString29 = rEString26.makeOneOrMore(rEString28);
		st1920.automaton.REString rEString30 = rEString21.makeRange(rEString29);
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString35 = rEString32.makeOneOrMore(rEString34);
		st1920.automaton.REString rEString36 = rEString30.makeRange(rEString32);
		st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString41 = rEString38.makeClass(rEString40);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = rEString43.makeOneOrMore(rEString45);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = rEString48.makeOneOrMore(rEString50);
		st1920.automaton.REString rEString52 = rEString43.makeRange(rEString51);
		st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString56 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString57 = rEString54.makeOneOrMore(rEString56);
		st1920.automaton.REString rEString58 = rEString52.makeRange(rEString54);
		st1920.automaton.REString rEString59 = rEString40.makeGroup(rEString58);
		st1920.automaton.REString rEString60 = rEString36.makeZeroOrMore(rEString58);
		st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString65 = rEString62.makeClass(rEString64);
		st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString72 = rEString69.makeOneOrMore(rEString71);
		st1920.automaton.REString rEString74 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString77 = rEString74.makeOneOrMore(rEString76);
		st1920.automaton.REString rEString78 = rEString69.makeRange(rEString77);
		st1920.automaton.REString rEString79 = rEString67.makeZeroOrMore(rEString78);
		st1920.automaton.REString rEString80 = rEString65.makeExcludeClass(rEString78);
		st1920.automaton.REString rEString81 = rEString60.makeAny(rEString65);
		st1920.automaton.REString rEString82 = rEString19.makeZeroOrOne(rEString65);
		st1920.automaton.REString rEString83 = st1920.automaton.REString.makeAlpha(rEString65);
		st1920.automaton.REString rEString84 = rEString4.makeZeroOrMore(rEString83);
		st1920.automaton.REString rEString85 = rEString1.makeAnyChar(rEString83);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString77);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString78);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString79);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString80);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString81);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString82);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString83);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString84);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString85);
	}

	@Test
	public void test41() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test41");
		st1920.automaton.REString rEString1 = null;
		// The following exception was thrown during execution in test generation
		try {
			boolean boolean2 = st1920.automaton.RegexWrapper.matches("+t", rEString1);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
	}

	@Test
	public void test42() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test42");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = rEString1.makeOneOrMore(rEString3);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = rEString6.makeClass(rEString8);
		st1920.automaton.REString rEString10 = rEString4.makeRepeatMoreThan(rEString8);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = rEString12.makeClass(rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.REString.makeAlpha(rEString12);
		st1920.automaton.REString rEString17 = rEString10.makeZeroOrMore(rEString12);
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString23 = rEString20.makeOneOrMore(rEString22);
		st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString28 = rEString25.makeOneOrMore(rEString27);
		st1920.automaton.REString rEString29 = rEString20.makeRange(rEString28);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = rEString31.makeOneOrMore(rEString33);
		st1920.automaton.REString rEString35 = rEString29.makeRange(rEString31);
		st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = rEString37.makeOneOrMore(rEString39);
		st1920.automaton.REString rEString41 = st1920.automaton.REString.makeAlpha(rEString39);
		st1920.automaton.REString rEString42 = rEString31.makeAny(rEString39);
		st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString47 = rEString44.makeOneOrMore(rEString46);
		st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString52 = rEString49.makeClass(rEString51);
		st1920.automaton.REString rEString53 = rEString47.makeRepeatMoreThan(rEString51);
		st1920.automaton.REString rEString54 = rEString39.makeNothing(rEString47);
		st1920.automaton.REString rEString56 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString59 = rEString56.makeOneOrMore(rEString58);
		st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString64 = rEString61.makeOneOrMore(rEString63);
		st1920.automaton.REString rEString65 = rEString56.makeRange(rEString64);
		st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString70 = rEString67.makeOneOrMore(rEString69);
		st1920.automaton.REString rEString71 = rEString65.makeRange(rEString67);
		st1920.automaton.REString rEString72 = rEString39.makeOneOrMore(rEString67);
		st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString78 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString79 = rEString76.makeOneOrMore(rEString78);
		st1920.automaton.REString rEString81 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString83 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString84 = rEString81.makeClass(rEString83);
		st1920.automaton.REString rEString85 = rEString79.makeRepeatMoreThan(rEString83);
		st1920.automaton.REString rEString87 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString89 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString90 = rEString87.makeClass(rEString89);
		st1920.automaton.REString rEString91 = st1920.automaton.REString.makeAlpha(rEString87);
		st1920.automaton.REString rEString92 = rEString85.makeZeroOrMore(rEString87);
		boolean boolean93 = st1920.automaton.RegexWrapper.matches("hi!", rEString92);
		boolean boolean94 = st1920.automaton.RegexWrapper.matches("hi!", rEString92);
		st1920.automaton.REString rEString95 = rEString67.makeZeroOrOne(rEString92);
		boolean boolean96 = st1920.automaton.RegexWrapper.matches("<512-61>", rEString95);
		st1920.automaton.REString rEString97 = rEString10.makeExcludeClass(rEString95);
		st1920.automaton.REString rEString98 = st1920.automaton.REString.makeAlpha(rEString95);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString79);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString84);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString85);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString90);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString91);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString92);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString95);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString97);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString98);
	}

	@Test
	public void test43() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test43");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = rEString1.makeClass(rEString3);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = rEString6.makeOneOrMore(rEString8);
		st1920.automaton.REString rEString10 = rEString4.makeExcludeClass(rEString9);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = rEString12.makeOneOrMore(rEString14);
		st1920.automaton.REString rEString16 = rEString4.makeAny(rEString12);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("hi!");
		st1920.automaton.REString rEString19 = rEString12.makeGroup(rEString18);
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("hi!");
		st1920.automaton.REString rEString22 = rEString19.makeExclude(rEString21);
		st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = rEString24.makeClass(rEString26);
		st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = rEString29.makeClass(rEString31);
		st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString37 = rEString34.makeOneOrMore(rEString36);
		st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString42 = rEString39.makeOneOrMore(rEString41);
		st1920.automaton.REString rEString43 = rEString34.makeRange(rEString42);
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString48 = rEString45.makeOneOrMore(rEString47);
		st1920.automaton.REString rEString49 = rEString43.makeRange(rEString45);
		st1920.automaton.REString rEString50 = rEString31.makeGroup(rEString49);
		st1920.automaton.REString rEString51 = rEString24.makeRepeatRange(rEString31);
		st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString56 = rEString53.makeClass(rEString55);
		st1920.automaton.REString rEString57 = st1920.automaton.REString.makeAlpha(rEString53);
		st1920.automaton.REString rEString58 = rEString24.makeClass(rEString53);
		st1920.automaton.REString rEString60 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString63 = rEString60.makeClass(rEString62);
		st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString69 = rEString66.makeClass(rEString68);
		st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString73 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString74 = rEString71.makeOneOrMore(rEString73);
		st1920.automaton.REString rEString75 = rEString69.makeExcludeClass(rEString74);
		boolean boolean76 = st1920.automaton.RegexWrapper.matches("hi!", rEString74);
		st1920.automaton.REString rEString77 = rEString63.makeZeroOrMore(rEString74);
		st1920.automaton.REString rEString78 = rEString53.makeAny(rEString74);
		st1920.automaton.REString rEString79 = rEString19.makeZeroOrMore(rEString74);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString63);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString69);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString74);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString75);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString77);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString78);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString79);
	}

	@Test
	public void test44() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test44");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeClass(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeOneOrMore(rEString9);
		st1920.automaton.REString rEString11 = rEString5.makeExcludeClass(rEString10);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = rEString13.makeOneOrMore(rEString15);
		st1920.automaton.REString rEString17 = rEString5.makeAny(rEString13);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("hi!");
		st1920.automaton.REString rEString20 = rEString13.makeGroup(rEString19);
		st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString25 = rEString22.makeOneOrMore(rEString24);
		st1920.automaton.REString rEString26 = rEString13.makeExcludeClass(rEString22);
		st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString31 = rEString28.makeClass(rEString30);
		st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString36 = rEString33.makeOneOrMore(rEString35);
		st1920.automaton.REString rEString37 = rEString31.makeExcludeClass(rEString36);
		st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString42 = rEString39.makeOneOrMore(rEString41);
		st1920.automaton.REString rEString43 = rEString31.makeAny(rEString39);
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("hi!");
		st1920.automaton.REString rEString46 = rEString39.makeGroup(rEString45);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = rEString48.makeOneOrMore(rEString50);
		st1920.automaton.REString rEString52 = rEString39.makeExcludeClass(rEString48);
		st1920.automaton.REString rEString53 = rEString22.makeOneOrMore(rEString52);
		boolean boolean54 = st1920.automaton.RegexWrapper.matches("@", rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
	}

	@Test
	public void test45() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test45");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("+<849-689>");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString6 = rEString3.makeClass(rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.REString.makeAlpha(rEString3);
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString12 = rEString9.makeClass(rEString11);
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString17 = rEString14.makeOneOrMore(rEString16);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = rEString19.makeOneOrMore(rEString21);
		st1920.automaton.REString rEString23 = rEString14.makeRange(rEString22);
		st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString28 = rEString25.makeOneOrMore(rEString27);
		st1920.automaton.REString rEString29 = rEString23.makeRange(rEString25);
		st1920.automaton.REString rEString30 = rEString11.makeGroup(rEString29);
		st1920.automaton.REString rEString31 = rEString7.makeExcludeClass(rEString30);
		st1920.automaton.REString rEString34 = new st1920.automaton.REString("<512-61>");
		boolean boolean35 = st1920.automaton.RegexWrapper.matches("[]", rEString34);
		st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = rEString37.makeClass(rEString39);
		st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = rEString42.makeClass(rEString44);
		st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = rEString47.makeOneOrMore(rEString49);
		st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString55 = rEString52.makeOneOrMore(rEString54);
		st1920.automaton.REString rEString56 = rEString47.makeRange(rEString55);
		st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString60 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString61 = rEString58.makeOneOrMore(rEString60);
		st1920.automaton.REString rEString62 = rEString56.makeRange(rEString58);
		st1920.automaton.REString rEString63 = rEString44.makeGroup(rEString62);
		st1920.automaton.REString rEString64 = rEString37.makeRepeatRange(rEString44);
		st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString69 = rEString66.makeClass(rEString68);
		st1920.automaton.REString rEString70 = st1920.automaton.REString.makeAlpha(rEString66);
		st1920.automaton.REString rEString71 = rEString37.makeClass(rEString66);
		st1920.automaton.REString rEString72 = rEString34.makeAnyChar(rEString37);
		st1920.automaton.REString rEString73 = rEString7.makeRepeatExact(rEString72);
		st1920.automaton.REString rEString74 = rEString1.makeZeroOrOne(rEString72);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString63);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString69);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString73);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString74);
	}

	@Test
	public void test46() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test46");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("hi!");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = rEString4.makeClass(rEString6);
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString12 = rEString9.makeOneOrMore(rEString11);
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString17 = rEString14.makeOneOrMore(rEString16);
		st1920.automaton.REString rEString18 = rEString9.makeRange(rEString17);
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString23 = rEString20.makeOneOrMore(rEString22);
		st1920.automaton.REString rEString24 = rEString18.makeRange(rEString20);
		st1920.automaton.REString rEString25 = rEString6.makeGroup(rEString24);
		st1920.automaton.REString rEString26 = rEString2.makeOneOrMore(rEString24);
		boolean boolean27 = st1920.automaton.RegexWrapper.matches("+l", rEString2);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
	}

	@Test
	public void test47() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test47");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeClass(rEString4);
		boolean boolean6 = st1920.automaton.RegexWrapper.matches("+", rEString2);
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString11 = rEString8.makeOneOrMore(rEString10);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = rEString13.makeOneOrMore(rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.REString.makeAlpha(rEString15);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = rEString19.makeOneOrMore(rEString21);
		st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = rEString24.makeOneOrMore(rEString26);
		st1920.automaton.REString rEString28 = rEString19.makeRange(rEString27);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = rEString30.makeOneOrMore(rEString32);
		st1920.automaton.REString rEString34 = rEString28.makeRange(rEString30);
		st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString39 = rEString36.makeOneOrMore(rEString38);
		st1920.automaton.REString rEString40 = st1920.automaton.REString.makeAlpha(rEString38);
		st1920.automaton.REString rEString41 = rEString30.makeAny(rEString38);
		st1920.automaton.REString rEString42 = rEString17.makeRepeatExact(rEString38);
		st1920.automaton.REString rEString43 = rEString11.makeZeroOrOne(rEString17);
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString48 = rEString45.makeOneOrMore(rEString47);
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString53 = rEString50.makeOneOrMore(rEString52);
		st1920.automaton.REString rEString54 = st1920.automaton.REString.makeAlpha(rEString52);
		st1920.automaton.REString rEString56 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString59 = rEString56.makeOneOrMore(rEString58);
		st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString64 = rEString61.makeOneOrMore(rEString63);
		st1920.automaton.REString rEString65 = rEString56.makeRange(rEString64);
		st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString70 = rEString67.makeOneOrMore(rEString69);
		st1920.automaton.REString rEString71 = rEString65.makeRange(rEString67);
		st1920.automaton.REString rEString73 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString75 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString76 = rEString73.makeOneOrMore(rEString75);
		st1920.automaton.REString rEString77 = st1920.automaton.REString.makeAlpha(rEString75);
		st1920.automaton.REString rEString78 = rEString67.makeAny(rEString75);
		st1920.automaton.REString rEString79 = rEString54.makeRepeatExact(rEString75);
		st1920.automaton.REString rEString80 = rEString48.makeZeroOrOne(rEString54);
		st1920.automaton.REString rEString81 = rEString43.makeExcludeClass(rEString54);
		rEString54.setReString("<931-552>*+");
		st1920.automaton.REString rEString84 = rEString2.makeAnyChar(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString76);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString77);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString78);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString79);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString80);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString81);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString84);
	}

	@Test
	public void test48() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test48");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("<512-61>");
		boolean boolean3 = st1920.automaton.RegexWrapper.matches("[]", rEString2);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = rEString6.makeClass(rEString8);
		boolean boolean10 = st1920.automaton.RegexWrapper.matches("+", rEString6);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = rEString12.makeOneOrMore(rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.REString.makeAlpha(rEString14);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = rEString18.makeOneOrMore(rEString20);
		st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = rEString23.makeOneOrMore(rEString25);
		st1920.automaton.REString rEString27 = rEString18.makeRange(rEString26);
		st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = rEString29.makeOneOrMore(rEString31);
		st1920.automaton.REString rEString33 = rEString27.makeRange(rEString29);
		st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString38 = rEString35.makeOneOrMore(rEString37);
		st1920.automaton.REString rEString39 = st1920.automaton.REString.makeAlpha(rEString37);
		st1920.automaton.REString rEString40 = rEString29.makeAny(rEString37);
		st1920.automaton.REString rEString41 = rEString16.makeRepeatExact(rEString37);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = rEString43.makeClass(rEString45);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString53 = rEString50.makeOneOrMore(rEString52);
		st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString58 = rEString55.makeOneOrMore(rEString57);
		st1920.automaton.REString rEString59 = rEString50.makeRange(rEString58);
		st1920.automaton.REString rEString60 = rEString48.makeZeroOrMore(rEString59);
		st1920.automaton.REString rEString61 = rEString46.makeExcludeClass(rEString59);
		st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString66 = rEString63.makeOneOrMore(rEString65);
		st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString71 = rEString68.makeOneOrMore(rEString70);
		st1920.automaton.REString rEString72 = rEString63.makeRange(rEString71);
		st1920.automaton.REString rEString74 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString77 = rEString74.makeOneOrMore(rEString76);
		st1920.automaton.REString rEString79 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString81 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString82 = rEString79.makeOneOrMore(rEString81);
		st1920.automaton.REString rEString83 = rEString74.makeRange(rEString82);
		st1920.automaton.REString rEString85 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString87 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString88 = rEString85.makeOneOrMore(rEString87);
		st1920.automaton.REString rEString89 = rEString83.makeRange(rEString85);
		st1920.automaton.REString rEString90 = rEString71.makeOneOrMore(rEString89);
		st1920.automaton.REString rEString91 = rEString46.makeGroup(rEString90);
		st1920.automaton.REString rEString92 = rEString41.makeRepeatMoreThan(rEString46);
		st1920.automaton.REString rEString93 = rEString6.makeAnyChar(rEString92);
		st1920.automaton.REString rEString94 = rEString2.makeGroup(rEString93);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString77);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString82);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString83);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString88);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString89);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString90);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString91);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString92);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString93);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString94);
	}

	@Test
	public void test49() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test49");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeOneOrMore(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeOneOrMore(rEString9);
		st1920.automaton.REString rEString11 = rEString2.makeRange(rEString10);
		java.lang.String str12 = rEString10.getReString();
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString17 = rEString14.makeClass(rEString16);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = rEString19.makeOneOrMore(rEString21);
		st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = rEString24.makeOneOrMore(rEString26);
		st1920.automaton.REString rEString28 = rEString19.makeRange(rEString27);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = rEString30.makeOneOrMore(rEString32);
		st1920.automaton.REString rEString34 = rEString28.makeRange(rEString30);
		st1920.automaton.REString rEString35 = rEString16.makeGroup(rEString34);
		st1920.automaton.REString rEString36 = rEString10.makeRepeatMoreThan(rEString16);
		st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString41 = rEString38.makeOneOrMore(rEString40);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = rEString43.makeOneOrMore(rEString45);
		st1920.automaton.REString rEString47 = rEString38.makeRange(rEString46);
		st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString52 = rEString49.makeOneOrMore(rEString51);
		st1920.automaton.REString rEString53 = rEString47.makeRange(rEString49);
		st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString58 = rEString55.makeOneOrMore(rEString57);
		st1920.automaton.REString rEString59 = st1920.automaton.REString.makeAlpha(rEString57);
		st1920.automaton.REString rEString60 = rEString49.makeAny(rEString57);
		st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString65 = rEString62.makeOneOrMore(rEString64);
		st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString70 = rEString67.makeOneOrMore(rEString69);
		st1920.automaton.REString rEString71 = rEString62.makeRange(rEString70);
		java.lang.String str72 = rEString70.getReString();
		java.lang.String str73 = rEString70.getReString();
		st1920.automaton.REString rEString74 = rEString60.makeRepeatRange(rEString70);
		st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString78 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString79 = rEString76.makeClass(rEString78);
		st1920.automaton.REString rEString81 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString83 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString85 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString86 = rEString83.makeOneOrMore(rEString85);
		st1920.automaton.REString rEString88 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString90 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString91 = rEString88.makeOneOrMore(rEString90);
		st1920.automaton.REString rEString92 = rEString83.makeRange(rEString91);
		st1920.automaton.REString rEString93 = rEString81.makeZeroOrMore(rEString92);
		st1920.automaton.REString rEString94 = rEString79.makeExcludeClass(rEString92);
		st1920.automaton.REString rEString95 = rEString70.makeZeroOrOne(rEString79);
		st1920.automaton.REString rEString96 = rEString10.makeZeroOrOne(rEString70);
		boolean boolean97 = st1920.automaton.RegexWrapper.matches("<512-61>", rEString10);
		rEString10.setReString("<798-614>");
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str12 + "' != '" + "+" + "'", str12.equals("+"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str72 + "' != '" + "+" + "'", str72.equals("+"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str73 + "' != '" + "+" + "'", str73.equals("+"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString74);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString79);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString86);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString91);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString92);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString93);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString94);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString95);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString96);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
	}

	@Test
	public void test50() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test50");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = rEString1.makeClass(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.REString.makeAlpha(rEString1);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeClass(rEString9);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = rEString12.makeOneOrMore(rEString14);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = rEString17.makeOneOrMore(rEString19);
		st1920.automaton.REString rEString21 = rEString12.makeRange(rEString20);
		st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = rEString23.makeOneOrMore(rEString25);
		st1920.automaton.REString rEString27 = rEString21.makeRange(rEString23);
		st1920.automaton.REString rEString28 = rEString9.makeGroup(rEString27);
		st1920.automaton.REString rEString29 = rEString5.makeExcludeClass(rEString28);
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("<512-61>");
		boolean boolean33 = st1920.automaton.RegexWrapper.matches("[]", rEString32);
		st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString38 = rEString35.makeClass(rEString37);
		st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString43 = rEString40.makeClass(rEString42);
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString48 = rEString45.makeOneOrMore(rEString47);
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString53 = rEString50.makeOneOrMore(rEString52);
		st1920.automaton.REString rEString54 = rEString45.makeRange(rEString53);
		st1920.automaton.REString rEString56 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString59 = rEString56.makeOneOrMore(rEString58);
		st1920.automaton.REString rEString60 = rEString54.makeRange(rEString56);
		st1920.automaton.REString rEString61 = rEString42.makeGroup(rEString60);
		st1920.automaton.REString rEString62 = rEString35.makeRepeatRange(rEString42);
		st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString67 = rEString64.makeClass(rEString66);
		st1920.automaton.REString rEString68 = st1920.automaton.REString.makeAlpha(rEString64);
		st1920.automaton.REString rEString69 = rEString35.makeClass(rEString64);
		st1920.automaton.REString rEString70 = rEString32.makeAnyChar(rEString35);
		st1920.automaton.REString rEString71 = rEString5.makeRepeatExact(rEString70);
		java.lang.Class<?> wildcardClass72 = rEString70.getClass();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString67);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString68);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString69);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass72);
	}

	@Test
	public void test51() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test51");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeClass(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeOneOrMore(rEString9);
		st1920.automaton.REString rEString11 = rEString5.makeExcludeClass(rEString10);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = rEString13.makeOneOrMore(rEString15);
		st1920.automaton.REString rEString17 = rEString5.makeAny(rEString13);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("hi!");
		st1920.automaton.REString rEString20 = rEString13.makeGroup(rEString19);
		st1920.automaton.REString rEString22 = new st1920.automaton.REString("hi!");
		st1920.automaton.REString rEString23 = rEString20.makeExclude(rEString22);
		st1920.automaton.REString rEString25 = new st1920.automaton.REString("[]+{721,}");
		st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString31 = rEString28.makeClass(rEString30);
		st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString36 = rEString33.makeOneOrMore(rEString35);
		st1920.automaton.REString rEString37 = rEString31.makeExcludeClass(rEString36);
		boolean boolean38 = st1920.automaton.RegexWrapper.matches("hi!", rEString36);
		st1920.automaton.REString rEString39 = rEString25.makeZeroOrMore(rEString36);
		st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString44 = rEString41.makeOneOrMore(rEString43);
		st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString49 = rEString46.makeOneOrMore(rEString48);
		st1920.automaton.REString rEString50 = rEString41.makeRange(rEString49);
		st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString55 = rEString52.makeOneOrMore(rEString54);
		st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString60 = rEString57.makeOneOrMore(rEString59);
		st1920.automaton.REString rEString61 = rEString52.makeRange(rEString60);
		st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString66 = rEString63.makeOneOrMore(rEString65);
		st1920.automaton.REString rEString67 = rEString61.makeRange(rEString63);
		st1920.automaton.REString rEString68 = rEString50.makeClass(rEString63);
		st1920.automaton.REString rEString69 = rEString25.makeRepeatMoreThan(rEString63);
		st1920.automaton.REString rEString70 = rEString23.makeAny(rEString25);
		// The following exception was thrown during execution in test generation
		try {
			boolean boolean71 = st1920.automaton.RegexWrapper.matches("*", rEString70);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: expected ']' at position 10");
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString67);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString68);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString69);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
	}

	@Test
	public void test52() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test52");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeOneOrMore(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeOneOrMore(rEString9);
		st1920.automaton.REString rEString11 = rEString2.makeRange(rEString10);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = rEString13.makeOneOrMore(rEString15);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = rEString18.makeOneOrMore(rEString20);
		st1920.automaton.REString rEString22 = rEString13.makeRange(rEString21);
		st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = rEString24.makeOneOrMore(rEString26);
		st1920.automaton.REString rEString28 = rEString22.makeRange(rEString24);
		st1920.automaton.REString rEString29 = rEString11.makeClass(rEString24);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString36 = rEString33.makeOneOrMore(rEString35);
		st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString41 = rEString38.makeOneOrMore(rEString40);
		st1920.automaton.REString rEString42 = rEString33.makeRange(rEString41);
		st1920.automaton.REString rEString43 = rEString31.makeZeroOrMore(rEString42);
		st1920.automaton.REString rEString44 = rEString24.makeGroup(rEString31);
		boolean boolean45 = st1920.automaton.RegexWrapper.matches("<931-552>*", rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
	}

	@Test
	public void test53() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test53");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = rEString1.makeClass(rEString3);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeClass(rEString9);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = rEString12.makeOneOrMore(rEString14);
		st1920.automaton.REString rEString16 = rEString10.makeExcludeClass(rEString15);
		boolean boolean17 = st1920.automaton.RegexWrapper.matches("hi!", rEString15);
		st1920.automaton.REString rEString18 = rEString4.makeZeroOrMore(rEString15);
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString24 = rEString21.makeOneOrMore(rEString23);
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString29 = rEString26.makeOneOrMore(rEString28);
		st1920.automaton.REString rEString30 = rEString21.makeRange(rEString29);
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString35 = rEString32.makeOneOrMore(rEString34);
		st1920.automaton.REString rEString36 = rEString30.makeRange(rEString32);
		st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString41 = rEString38.makeOneOrMore(rEString40);
		st1920.automaton.REString rEString42 = st1920.automaton.REString.makeAlpha(rEString40);
		st1920.automaton.REString rEString43 = rEString32.makeAny(rEString40);
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString48 = rEString45.makeOneOrMore(rEString47);
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString53 = rEString50.makeClass(rEString52);
		st1920.automaton.REString rEString54 = rEString48.makeRepeatMoreThan(rEString52);
		st1920.automaton.REString rEString55 = rEString40.makeNothing(rEString48);
		st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString60 = rEString57.makeClass(rEString59);
		st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString65 = rEString62.makeOneOrMore(rEString64);
		st1920.automaton.REString rEString66 = rEString60.makeExcludeClass(rEString65);
		st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString71 = rEString68.makeOneOrMore(rEString70);
		st1920.automaton.REString rEString72 = rEString60.makeAny(rEString68);
		st1920.automaton.REString rEString73 = rEString40.makeOneOrMore(rEString60);
		st1920.automaton.REString rEString75 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString77 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString78 = rEString75.makeClass(rEString77);
		st1920.automaton.REString rEString80 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString82 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString83 = rEString80.makeOneOrMore(rEString82);
		st1920.automaton.REString rEString85 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString87 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString88 = rEString85.makeOneOrMore(rEString87);
		st1920.automaton.REString rEString89 = rEString80.makeRange(rEString88);
		st1920.automaton.REString rEString91 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString93 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString94 = rEString91.makeOneOrMore(rEString93);
		st1920.automaton.REString rEString95 = rEString89.makeRange(rEString91);
		st1920.automaton.REString rEString96 = rEString77.makeGroup(rEString95);
		st1920.automaton.REString rEString97 = rEString60.makeAny(rEString96);
		boolean boolean98 = st1920.automaton.RegexWrapper.matches("u?", rEString96);
		st1920.automaton.REString rEString99 = rEString15.makeZeroOrOne(rEString96);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString73);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString78);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString83);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString88);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString89);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString94);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString95);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString96);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString97);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString99);
	}

	@Test
	public void test54() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test54");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString6 = rEString3.makeClass(rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.REString.makeAlpha(rEString3);
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString12 = rEString9.makeClass(rEString11);
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString17 = rEString14.makeOneOrMore(rEString16);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = rEString19.makeOneOrMore(rEString21);
		st1920.automaton.REString rEString23 = rEString14.makeRange(rEString22);
		st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString28 = rEString25.makeOneOrMore(rEString27);
		st1920.automaton.REString rEString29 = rEString23.makeRange(rEString25);
		st1920.automaton.REString rEString30 = rEString11.makeGroup(rEString29);
		st1920.automaton.REString rEString31 = rEString7.makeExcludeClass(rEString30);
		boolean boolean32 = st1920.automaton.RegexWrapper.matches("[+]", rEString31);
		boolean boolean33 = st1920.automaton.RegexWrapper.matches("+", rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
	}

	@Test
	public void test55() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test55");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeClass(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeOneOrMore(rEString9);
		st1920.automaton.REString rEString11 = rEString5.makeExcludeClass(rEString10);
		rEString11.setReString("");
		boolean boolean14 = st1920.automaton.RegexWrapper.matches("+5", rEString11);
		st1920.automaton.REString rEString16 = new st1920.automaton.REString("[]");
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = rEString18.makeOneOrMore(rEString20);
		st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = rEString23.makeOneOrMore(rEString25);
		st1920.automaton.REString rEString27 = rEString18.makeRange(rEString26);
		st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = rEString29.makeOneOrMore(rEString31);
		st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString37 = rEString34.makeOneOrMore(rEString36);
		st1920.automaton.REString rEString38 = rEString29.makeRange(rEString37);
		st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString43 = rEString40.makeOneOrMore(rEString42);
		st1920.automaton.REString rEString44 = rEString38.makeRange(rEString40);
		st1920.automaton.REString rEString45 = rEString27.makeClass(rEString40);
		st1920.automaton.REString rEString46 = rEString16.makeOneOrMore(rEString45);
		java.lang.String str47 = rEString46.getReString();
		st1920.automaton.REString rEString48 = st1920.automaton.REString.makeAlpha(rEString46);
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("+<931-383>");
		st1920.automaton.REString rEString51 = st1920.automaton.REString.makeAlpha(rEString50);
		st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString56 = rEString53.makeOneOrMore(rEString55);
		st1920.automaton.REString rEString57 = rEString50.makeAnyChar(rEString55);
		st1920.automaton.REString rEString58 = rEString48.makeClass(rEString55);
		st1920.automaton.REString rEString59 = rEString11.makeOneOrMore(rEString58);
		rEString11.setReString("+5");
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str47 + "' != '" + "[]+" + "'", str47.equals("[]+"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
	}

	@Test
	public void test56() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test56");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString6 = rEString3.makeClass(rEString5);
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString11 = rEString8.makeOneOrMore(rEString10);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = rEString13.makeOneOrMore(rEString15);
		st1920.automaton.REString rEString17 = rEString8.makeRange(rEString16);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = rEString19.makeOneOrMore(rEString21);
		st1920.automaton.REString rEString23 = rEString17.makeRange(rEString19);
		st1920.automaton.REString rEString24 = rEString5.makeGroup(rEString23);
		boolean boolean25 = st1920.automaton.RegexWrapper.matches("hi!", rEString24);
		st1920.automaton.REString rEString27 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString30 = rEString27.makeClass(rEString29);
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString35 = rEString32.makeOneOrMore(rEString34);
		st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = rEString37.makeOneOrMore(rEString39);
		st1920.automaton.REString rEString41 = rEString32.makeRange(rEString40);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = rEString43.makeOneOrMore(rEString45);
		st1920.automaton.REString rEString47 = rEString41.makeRange(rEString43);
		st1920.automaton.REString rEString48 = rEString29.makeGroup(rEString47);
		st1920.automaton.REString rEString49 = rEString24.makeGroup(rEString47);
		st1920.automaton.REString rEString51 = new st1920.automaton.REString("hi!");
		st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString56 = rEString53.makeClass(rEString55);
		st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString60 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString61 = rEString58.makeOneOrMore(rEString60);
		st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString66 = rEString63.makeOneOrMore(rEString65);
		st1920.automaton.REString rEString67 = rEString58.makeRange(rEString66);
		st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString72 = rEString69.makeOneOrMore(rEString71);
		st1920.automaton.REString rEString73 = rEString67.makeRange(rEString69);
		st1920.automaton.REString rEString74 = rEString55.makeGroup(rEString73);
		st1920.automaton.REString rEString75 = rEString51.makeOneOrMore(rEString73);
		st1920.automaton.REString rEString76 = rEString47.makeZeroOrOne(rEString75);
		boolean boolean77 = st1920.automaton.RegexWrapper.matches("+<694-938><327-451>", rEString76);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString67);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString73);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString74);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString75);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString76);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
	}

	@Test
	public void test57() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test57");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = rEString1.makeOneOrMore(rEString3);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = rEString6.makeOneOrMore(rEString8);
		st1920.automaton.REString rEString10 = rEString1.makeRange(rEString9);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = rEString12.makeOneOrMore(rEString14);
		st1920.automaton.REString rEString16 = rEString10.makeRange(rEString12);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = rEString18.makeOneOrMore(rEString20);
		st1920.automaton.REString rEString22 = st1920.automaton.REString.makeAlpha(rEString20);
		st1920.automaton.REString rEString23 = rEString12.makeAny(rEString20);
		st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString28 = rEString25.makeOneOrMore(rEString27);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = rEString30.makeClass(rEString32);
		st1920.automaton.REString rEString34 = rEString28.makeRepeatMoreThan(rEString32);
		st1920.automaton.REString rEString35 = rEString20.makeNothing(rEString28);
		st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = rEString37.makeOneOrMore(rEString39);
		st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = rEString42.makeOneOrMore(rEString44);
		st1920.automaton.REString rEString46 = rEString37.makeRange(rEString45);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = rEString48.makeOneOrMore(rEString50);
		st1920.automaton.REString rEString52 = rEString46.makeRange(rEString48);
		st1920.automaton.REString rEString53 = rEString20.makeOneOrMore(rEString48);
		st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString60 = rEString57.makeOneOrMore(rEString59);
		st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString65 = rEString62.makeClass(rEString64);
		st1920.automaton.REString rEString66 = rEString60.makeRepeatMoreThan(rEString64);
		st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString71 = rEString68.makeClass(rEString70);
		st1920.automaton.REString rEString72 = st1920.automaton.REString.makeAlpha(rEString68);
		st1920.automaton.REString rEString73 = rEString66.makeZeroOrMore(rEString68);
		boolean boolean74 = st1920.automaton.RegexWrapper.matches("hi!", rEString73);
		boolean boolean75 = st1920.automaton.RegexWrapper.matches("hi!", rEString73);
		st1920.automaton.REString rEString76 = rEString48.makeZeroOrOne(rEString73);
		st1920.automaton.REString rEString78 = new st1920.automaton.REString("hi!");
		st1920.automaton.REString rEString80 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString82 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString83 = rEString80.makeOneOrMore(rEString82);
		st1920.automaton.REString rEString85 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString87 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString88 = rEString85.makeOneOrMore(rEString87);
		st1920.automaton.REString rEString89 = rEString80.makeRange(rEString88);
		st1920.automaton.REString rEString90 = rEString78.makeAnyChar(rEString80);
		st1920.automaton.REString rEString91 = rEString73.makeRepeatExact(rEString90);
		st1920.automaton.REString rEString92 = null;
		// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString93 = rEString90.makeRange(rEString92);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString73);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString76);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString83);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString88);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString89);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString90);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString91);
	}

	@Test
	public void test58() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test58");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("+9");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = rEString4.makeClass(rEString6);
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString12 = rEString9.makeOneOrMore(rEString11);
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString17 = rEString14.makeOneOrMore(rEString16);
		st1920.automaton.REString rEString18 = rEString9.makeRange(rEString17);
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString23 = rEString20.makeOneOrMore(rEString22);
		st1920.automaton.REString rEString24 = rEString18.makeRange(rEString20);
		st1920.automaton.REString rEString25 = rEString6.makeGroup(rEString24);
		boolean boolean26 = st1920.automaton.RegexWrapper.matches("hi!", rEString25);
		st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString31 = rEString28.makeClass(rEString30);
		st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString36 = rEString33.makeOneOrMore(rEString35);
		st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString41 = rEString38.makeOneOrMore(rEString40);
		st1920.automaton.REString rEString42 = rEString33.makeRange(rEString41);
		st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString47 = rEString44.makeOneOrMore(rEString46);
		st1920.automaton.REString rEString48 = rEString42.makeRange(rEString44);
		st1920.automaton.REString rEString49 = rEString30.makeGroup(rEString48);
		st1920.automaton.REString rEString50 = rEString25.makeGroup(rEString48);
		st1920.automaton.REString rEString52 = new st1920.automaton.REString("hi!");
		st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString56 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString57 = rEString54.makeClass(rEString56);
		st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString62 = rEString59.makeOneOrMore(rEString61);
		st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString67 = rEString64.makeOneOrMore(rEString66);
		st1920.automaton.REString rEString68 = rEString59.makeRange(rEString67);
		st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString72 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString73 = rEString70.makeOneOrMore(rEString72);
		st1920.automaton.REString rEString74 = rEString68.makeRange(rEString70);
		st1920.automaton.REString rEString75 = rEString56.makeGroup(rEString74);
		st1920.automaton.REString rEString76 = rEString52.makeOneOrMore(rEString74);
		st1920.automaton.REString rEString77 = rEString48.makeZeroOrOne(rEString76);
		st1920.automaton.REString rEString78 = rEString1.makeAnyChar(rEString77);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString67);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString68);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString73);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString74);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString75);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString76);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString77);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString78);
	}

	@Test
	public void test59() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test59");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeClass(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeClass(rEString9);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = rEString12.makeOneOrMore(rEString14);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = rEString17.makeOneOrMore(rEString19);
		st1920.automaton.REString rEString21 = rEString12.makeRange(rEString20);
		st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = rEString23.makeOneOrMore(rEString25);
		st1920.automaton.REString rEString27 = rEString21.makeRange(rEString23);
		st1920.automaton.REString rEString28 = rEString9.makeGroup(rEString27);
		st1920.automaton.REString rEString29 = rEString2.makeRepeatRange(rEString9);
		boolean boolean30 = st1920.automaton.RegexWrapper.matches("+l", rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
	}

	@Test
	public void test60() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test60");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = rEString1.makeClass(rEString3);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = rEString6.makeOneOrMore(rEString8);
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = rEString11.makeOneOrMore(rEString13);
		st1920.automaton.REString rEString15 = rEString6.makeRange(rEString14);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = rEString17.makeOneOrMore(rEString19);
		st1920.automaton.REString rEString21 = rEString15.makeRange(rEString17);
		st1920.automaton.REString rEString22 = rEString3.makeGroup(rEString21);
		rEString3.setReString("");
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString29 = rEString26.makeOneOrMore(rEString28);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = rEString31.makeOneOrMore(rEString33);
		st1920.automaton.REString rEString35 = rEString26.makeRange(rEString34);
		st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = rEString37.makeOneOrMore(rEString39);
		st1920.automaton.REString rEString41 = rEString35.makeRange(rEString37);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = rEString43.makeClass(rEString45);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = rEString48.makeOneOrMore(rEString50);
		st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString56 = rEString53.makeOneOrMore(rEString55);
		st1920.automaton.REString rEString57 = rEString48.makeRange(rEString56);
		st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString62 = rEString59.makeOneOrMore(rEString61);
		st1920.automaton.REString rEString63 = rEString57.makeRange(rEString59);
		st1920.automaton.REString rEString64 = rEString45.makeGroup(rEString63);
		st1920.automaton.REString rEString65 = rEString41.makeZeroOrMore(rEString63);
		st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString70 = rEString67.makeClass(rEString69);
		st1920.automaton.REString rEString72 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString74 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString77 = rEString74.makeOneOrMore(rEString76);
		st1920.automaton.REString rEString79 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString81 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString82 = rEString79.makeOneOrMore(rEString81);
		st1920.automaton.REString rEString83 = rEString74.makeRange(rEString82);
		st1920.automaton.REString rEString84 = rEString72.makeZeroOrMore(rEString83);
		st1920.automaton.REString rEString85 = rEString70.makeExcludeClass(rEString83);
		st1920.automaton.REString rEString86 = rEString65.makeAny(rEString70);
		st1920.automaton.REString rEString89 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString91 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString92 = rEString89.makeClass(rEString91);
		boolean boolean93 = st1920.automaton.RegexWrapper.matches("+", rEString89);
		st1920.automaton.REString rEString94 = rEString86.makeRange(rEString89);
		st1920.automaton.REString rEString95 = rEString3.makeRepeatExact(rEString94);
		st1920.automaton.REString rEString96 = st1920.automaton.REString.makeAlpha(rEString94);
		st1920.automaton.REString rEString97 = st1920.automaton.REString.makeAlpha(rEString96);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString63);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString77);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString82);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString83);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString84);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString85);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString86);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString92);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString94);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString95);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString96);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString97);
	}

	@Test
	public void test61() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test61");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = rEString1.makeClass(rEString3);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = rEString6.makeClass(rEString8);
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = rEString11.makeOneOrMore(rEString13);
		st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = rEString16.makeOneOrMore(rEString18);
		st1920.automaton.REString rEString20 = rEString11.makeRange(rEString19);
		st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString25 = rEString22.makeOneOrMore(rEString24);
		st1920.automaton.REString rEString26 = rEString20.makeRange(rEString22);
		st1920.automaton.REString rEString27 = rEString8.makeGroup(rEString26);
		st1920.automaton.REString rEString28 = rEString1.makeRepeatRange(rEString8);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = rEString30.makeClass(rEString32);
		st1920.automaton.REString rEString34 = st1920.automaton.REString.makeAlpha(rEString30);
		st1920.automaton.REString rEString35 = rEString1.makeClass(rEString30);
		st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = rEString37.makeClass(rEString39);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = rEString43.makeClass(rEString45);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = rEString48.makeOneOrMore(rEString50);
		st1920.automaton.REString rEString52 = rEString46.makeExcludeClass(rEString51);
		boolean boolean53 = st1920.automaton.RegexWrapper.matches("hi!", rEString51);
		st1920.automaton.REString rEString54 = rEString40.makeZeroOrMore(rEString51);
		st1920.automaton.REString rEString55 = rEString30.makeAny(rEString51);
		java.lang.String str56 = rEString55.getReString();
		java.lang.String str57 = rEString55.getReString();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str56 + "' != '" + "+@" + "'", str56.equals("+@"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str57 + "' != '" + "+@" + "'", str57.equals("+@"));
	}

	@Test
	public void test62() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test62");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeOneOrMore(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeOneOrMore(rEString9);
		st1920.automaton.REString rEString11 = rEString2.makeRange(rEString10);
		java.lang.String str12 = rEString10.getReString();
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString17 = rEString14.makeClass(rEString16);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = rEString19.makeOneOrMore(rEString21);
		st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = rEString24.makeOneOrMore(rEString26);
		st1920.automaton.REString rEString28 = rEString19.makeRange(rEString27);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = rEString30.makeOneOrMore(rEString32);
		st1920.automaton.REString rEString34 = rEString28.makeRange(rEString30);
		st1920.automaton.REString rEString35 = rEString16.makeGroup(rEString34);
		st1920.automaton.REString rEString36 = rEString10.makeRepeatMoreThan(rEString16);
		st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString41 = rEString38.makeOneOrMore(rEString40);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = rEString43.makeClass(rEString45);
		st1920.automaton.REString rEString47 = rEString41.makeRepeatMoreThan(rEString45);
		st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString52 = rEString49.makeClass(rEString51);
		st1920.automaton.REString rEString53 = st1920.automaton.REString.makeAlpha(rEString49);
		st1920.automaton.REString rEString54 = rEString47.makeZeroOrMore(rEString49);
		st1920.automaton.REString rEString55 = rEString16.makeOneOrMore(rEString54);
		boolean boolean56 = st1920.automaton.RegexWrapper.matches("[]", rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str12 + "' != '" + "+" + "'", str12.equals("+"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
	}

	@Test
	public void test63() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test63");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeClass(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeOneOrMore(rEString9);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = rEString12.makeOneOrMore(rEString14);
		st1920.automaton.REString rEString16 = rEString7.makeRange(rEString15);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = rEString18.makeOneOrMore(rEString20);
		st1920.automaton.REString rEString22 = rEString16.makeRange(rEString18);
		st1920.automaton.REString rEString23 = rEString4.makeGroup(rEString22);
		st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString28 = rEString25.makeOneOrMore(rEString27);
		st1920.automaton.REString rEString29 = st1920.automaton.REString.makeAlpha(rEString27);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = rEString31.makeOneOrMore(rEString33);
		st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString39 = rEString36.makeOneOrMore(rEString38);
		st1920.automaton.REString rEString40 = rEString31.makeRange(rEString39);
		st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = rEString42.makeOneOrMore(rEString44);
		st1920.automaton.REString rEString46 = rEString40.makeRange(rEString42);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = rEString48.makeOneOrMore(rEString50);
		st1920.automaton.REString rEString52 = st1920.automaton.REString.makeAlpha(rEString50);
		st1920.automaton.REString rEString53 = rEString42.makeAny(rEString50);
		st1920.automaton.REString rEString54 = rEString29.makeRepeatExact(rEString50);
		st1920.automaton.REString rEString55 = rEString23.makeExcludeClass(rEString29);
		st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString60 = rEString57.makeClass(rEString59);
		st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString65 = rEString62.makeOneOrMore(rEString64);
		st1920.automaton.REString rEString66 = rEString60.makeExcludeClass(rEString65);
		st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString71 = rEString68.makeClass(rEString70);
		st1920.automaton.REString rEString73 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString75 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString76 = rEString73.makeOneOrMore(rEString75);
		st1920.automaton.REString rEString77 = rEString71.makeExcludeClass(rEString76);
		st1920.automaton.REString rEString79 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString81 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString82 = rEString79.makeOneOrMore(rEString81);
		st1920.automaton.REString rEString83 = rEString71.makeAny(rEString79);
		st1920.automaton.REString rEString85 = new st1920.automaton.REString("hi!");
		st1920.automaton.REString rEString86 = rEString79.makeGroup(rEString85);
		st1920.automaton.REString rEString88 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString90 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString91 = rEString88.makeOneOrMore(rEString90);
		st1920.automaton.REString rEString92 = rEString79.makeExcludeClass(rEString88);
		st1920.automaton.REString rEString93 = rEString65.makeRange(rEString92);
		st1920.automaton.REString rEString94 = rEString55.makeClass(rEString93);
		boolean boolean95 = st1920.automaton.RegexWrapper.matches("()", rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString76);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString77);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString82);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString83);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString86);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString91);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString92);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString93);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString94);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
	}

	@Test
	public void test64() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test64");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("[]+{721,}");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = rEString4.makeClass(rEString6);
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString12 = rEString9.makeOneOrMore(rEString11);
		st1920.automaton.REString rEString13 = rEString7.makeExcludeClass(rEString12);
		boolean boolean14 = st1920.automaton.RegexWrapper.matches("hi!", rEString12);
		st1920.automaton.REString rEString15 = rEString1.makeZeroOrMore(rEString12);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = rEString17.makeClass(rEString19);
		st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString25 = rEString22.makeOneOrMore(rEString24);
		st1920.automaton.REString rEString26 = rEString20.makeExcludeClass(rEString25);
		st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString31 = rEString28.makeClass(rEString30);
		st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString36 = rEString33.makeOneOrMore(rEString35);
		st1920.automaton.REString rEString37 = rEString31.makeExcludeClass(rEString36);
		st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString42 = rEString39.makeOneOrMore(rEString41);
		st1920.automaton.REString rEString43 = rEString31.makeAny(rEString39);
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("hi!");
		st1920.automaton.REString rEString46 = rEString39.makeGroup(rEString45);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = rEString48.makeOneOrMore(rEString50);
		st1920.automaton.REString rEString52 = rEString39.makeExcludeClass(rEString48);
		st1920.automaton.REString rEString53 = rEString25.makeRange(rEString52);
		st1920.automaton.REString rEString54 = st1920.automaton.REString.makeAlpha(rEString52);
		st1920.automaton.REString rEString56 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString59 = rEString56.makeClass(rEString58);
		st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString64 = rEString61.makeOneOrMore(rEString63);
		st1920.automaton.REString rEString65 = rEString59.makeExcludeClass(rEString64);
		st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString70 = rEString67.makeOneOrMore(rEString69);
		st1920.automaton.REString rEString71 = rEString59.makeAny(rEString67);
		st1920.automaton.REString rEString73 = new st1920.automaton.REString("hi!");
		st1920.automaton.REString rEString74 = rEString67.makeGroup(rEString73);
		st1920.automaton.REString rEString75 = st1920.automaton.REString.makeAlpha(rEString73);
		st1920.automaton.REString rEString76 = rEString12.makeConcatenation(rEString52, rEString73);
		st1920.automaton.REString rEString77 = null;
		// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString78 = rEString52.makeAnyChar(rEString77);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString74);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString75);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString76);
	}

	@Test
	public void test65() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test65");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("[]");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString6 = rEString3.makeOneOrMore(rEString5);
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString11 = rEString8.makeOneOrMore(rEString10);
		st1920.automaton.REString rEString12 = rEString3.makeRange(rEString11);
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString17 = rEString14.makeOneOrMore(rEString16);
		st1920.automaton.REString rEString18 = rEString12.makeRange(rEString14);
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString23 = rEString20.makeOneOrMore(rEString22);
		st1920.automaton.REString rEString24 = st1920.automaton.REString.makeAlpha(rEString22);
		st1920.automaton.REString rEString25 = rEString14.makeAny(rEString22);
		st1920.automaton.REString rEString27 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString30 = rEString27.makeOneOrMore(rEString29);
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString35 = rEString32.makeClass(rEString34);
		st1920.automaton.REString rEString36 = rEString30.makeRepeatMoreThan(rEString34);
		st1920.automaton.REString rEString37 = rEString22.makeNothing(rEString30);
		st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString42 = rEString39.makeOneOrMore(rEString41);
		st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString47 = rEString44.makeOneOrMore(rEString46);
		st1920.automaton.REString rEString48 = rEString39.makeRange(rEString47);
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString53 = rEString50.makeOneOrMore(rEString52);
		st1920.automaton.REString rEString54 = rEString48.makeRange(rEString50);
		st1920.automaton.REString rEString55 = rEString22.makeOneOrMore(rEString50);
		st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString60 = rEString57.makeClass(rEString59);
		st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString67 = rEString64.makeOneOrMore(rEString66);
		st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString72 = rEString69.makeOneOrMore(rEString71);
		st1920.automaton.REString rEString73 = rEString64.makeRange(rEString72);
		st1920.automaton.REString rEString74 = rEString62.makeZeroOrMore(rEString73);
		st1920.automaton.REString rEString75 = rEString60.makeExcludeClass(rEString73);
		java.lang.String str76 = rEString60.getReString();
		st1920.automaton.REString rEString77 = rEString55.makeOneOrMore(rEString60);
		st1920.automaton.REString rEString78 = rEString1.makeNothing(rEString55);
		st1920.automaton.REString rEString80 = new st1920.automaton.REString("[]+{721,}");
		st1920.automaton.REString rEString83 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString85 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString86 = rEString83.makeClass(rEString85);
		st1920.automaton.REString rEString88 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString90 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString91 = rEString88.makeOneOrMore(rEString90);
		st1920.automaton.REString rEString92 = rEString86.makeExcludeClass(rEString91);
		boolean boolean93 = st1920.automaton.RegexWrapper.matches("hi!", rEString91);
		st1920.automaton.REString rEString94 = rEString80.makeZeroOrMore(rEString91);
		st1920.automaton.REString rEString95 = rEString55.makeExcludeClass(rEString91);
		st1920.automaton.REString rEString96 = null;
		// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString97 = rEString91.makeExcludeClass(rEString96);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString67);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString73);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString74);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString75);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str76 + "' != '" + "[]" + "'", str76.equals("[]"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString77);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString78);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString86);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString91);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString92);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString94);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString95);
	}

	@Test
	public void test66() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test66");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("hi!");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString6 = rEString3.makeClass(rEString5);
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString11 = rEString8.makeOneOrMore(rEString10);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = rEString13.makeOneOrMore(rEString15);
		st1920.automaton.REString rEString17 = rEString8.makeRange(rEString16);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = rEString19.makeOneOrMore(rEString21);
		st1920.automaton.REString rEString23 = rEString17.makeRange(rEString19);
		st1920.automaton.REString rEString24 = rEString5.makeGroup(rEString23);
		st1920.automaton.REString rEString25 = rEString1.makeOneOrMore(rEString23);
		st1920.automaton.REString rEString27 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString30 = rEString27.makeClass(rEString29);
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString35 = rEString32.makeClass(rEString34);
		st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = rEString37.makeOneOrMore(rEString39);
		st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = rEString42.makeOneOrMore(rEString44);
		st1920.automaton.REString rEString46 = rEString37.makeRange(rEString45);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = rEString48.makeOneOrMore(rEString50);
		st1920.automaton.REString rEString52 = rEString46.makeRange(rEString48);
		st1920.automaton.REString rEString53 = rEString34.makeGroup(rEString52);
		st1920.automaton.REString rEString54 = rEString27.makeRepeatRange(rEString34);
		st1920.automaton.REString rEString56 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString59 = rEString56.makeClass(rEString58);
		st1920.automaton.REString rEString60 = st1920.automaton.REString.makeAlpha(rEString56);
		st1920.automaton.REString rEString61 = rEString27.makeClass(rEString56);
		st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString66 = rEString63.makeClass(rEString65);
		st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString72 = rEString69.makeClass(rEString71);
		st1920.automaton.REString rEString74 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString77 = rEString74.makeOneOrMore(rEString76);
		st1920.automaton.REString rEString78 = rEString72.makeExcludeClass(rEString77);
		boolean boolean79 = st1920.automaton.RegexWrapper.matches("hi!", rEString77);
		st1920.automaton.REString rEString80 = rEString66.makeZeroOrMore(rEString77);
		st1920.automaton.REString rEString81 = rEString56.makeAny(rEString77);
		st1920.automaton.REString rEString83 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString84 = rEString81.makeExclude(rEString83);
		rEString81.setReString("~[^[]]");
		st1920.automaton.REString rEString87 = st1920.automaton.REString.makeAlpha(rEString81);
		st1920.automaton.REString rEString88 = rEString1.makeClass(rEString81);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString77);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString78);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString80);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString81);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString84);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString87);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString88);
	}

	@Test
	public void test67() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test67");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeOneOrMore(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeOneOrMore(rEString9);
		st1920.automaton.REString rEString11 = rEString2.makeRange(rEString10);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = rEString13.makeOneOrMore(rEString15);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = rEString18.makeOneOrMore(rEString20);
		st1920.automaton.REString rEString22 = rEString13.makeRange(rEString21);
		st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = rEString24.makeOneOrMore(rEString26);
		st1920.automaton.REString rEString28 = rEString22.makeRange(rEString24);
		st1920.automaton.REString rEString29 = rEString11.makeClass(rEString24);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString36 = rEString33.makeOneOrMore(rEString35);
		st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString41 = rEString38.makeOneOrMore(rEString40);
		st1920.automaton.REString rEString42 = rEString33.makeRange(rEString41);
		st1920.automaton.REString rEString43 = rEString31.makeZeroOrMore(rEString42);
		st1920.automaton.REString rEString44 = rEString24.makeGroup(rEString31);
		st1920.automaton.REString rEString46 = new st1920.automaton.REString("<512-61>");
		java.lang.String str47 = rEString46.getReString();
		st1920.automaton.REString rEString48 = rEString31.makeZeroOrMore(rEString46);
		boolean boolean49 = st1920.automaton.RegexWrapper.matches("+", rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str47 + "' != '" + "<512-61>" + "'", str47.equals("<512-61>"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
	}

	@Test
	public void test68() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test68");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = rEString1.makeClass(rEString3);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = rEString6.makeClass(rEString8);
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = rEString11.makeOneOrMore(rEString13);
		st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = rEString16.makeOneOrMore(rEString18);
		st1920.automaton.REString rEString20 = rEString11.makeRange(rEString19);
		st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString25 = rEString22.makeOneOrMore(rEString24);
		st1920.automaton.REString rEString26 = rEString20.makeRange(rEString22);
		st1920.automaton.REString rEString27 = rEString8.makeGroup(rEString26);
		st1920.automaton.REString rEString28 = rEString1.makeRepeatRange(rEString8);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = rEString30.makeClass(rEString32);
		st1920.automaton.REString rEString34 = st1920.automaton.REString.makeAlpha(rEString30);
		st1920.automaton.REString rEString35 = rEString1.makeClass(rEString30);
		st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = rEString37.makeClass(rEString39);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = rEString43.makeClass(rEString45);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = rEString48.makeOneOrMore(rEString50);
		st1920.automaton.REString rEString52 = rEString46.makeExcludeClass(rEString51);
		boolean boolean53 = st1920.automaton.RegexWrapper.matches("hi!", rEString51);
		st1920.automaton.REString rEString54 = rEString40.makeZeroOrMore(rEString51);
		st1920.automaton.REString rEString55 = rEString30.makeAny(rEString51);
		rEString30.setReString("*");
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
	}

	@Test
	public void test69() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test69");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("+9");
		boolean boolean3 = st1920.automaton.RegexWrapper.matches("()", rEString2);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
	}

	@Test
	public void test70() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test70");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("+@");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = rEString1.makeAny(rEString3);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = rEString6.makeOneOrMore(rEString8);
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = rEString11.makeOneOrMore(rEString13);
		st1920.automaton.REString rEString15 = rEString6.makeRange(rEString14);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = rEString17.makeOneOrMore(rEString19);
		st1920.automaton.REString rEString21 = rEString15.makeRange(rEString17);
		st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = rEString23.makeClass(rEString25);
		st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString31 = rEString28.makeOneOrMore(rEString30);
		st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString36 = rEString33.makeOneOrMore(rEString35);
		st1920.automaton.REString rEString37 = rEString28.makeRange(rEString36);
		st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString42 = rEString39.makeOneOrMore(rEString41);
		st1920.automaton.REString rEString43 = rEString37.makeRange(rEString39);
		st1920.automaton.REString rEString44 = rEString25.makeGroup(rEString43);
		st1920.automaton.REString rEString45 = rEString21.makeZeroOrMore(rEString43);
		st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = rEString47.makeClass(rEString49);
		st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString56 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString57 = rEString54.makeOneOrMore(rEString56);
		st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString62 = rEString59.makeOneOrMore(rEString61);
		st1920.automaton.REString rEString63 = rEString54.makeRange(rEString62);
		st1920.automaton.REString rEString64 = rEString52.makeZeroOrMore(rEString63);
		st1920.automaton.REString rEString65 = rEString50.makeExcludeClass(rEString63);
		st1920.automaton.REString rEString66 = rEString45.makeAny(rEString50);
		st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString72 = rEString69.makeClass(rEString71);
		boolean boolean73 = st1920.automaton.RegexWrapper.matches("+", rEString69);
		st1920.automaton.REString rEString74 = rEString66.makeRange(rEString69);
		st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString78 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString79 = rEString76.makeOneOrMore(rEString78);
		st1920.automaton.REString rEString81 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString83 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString84 = rEString81.makeOneOrMore(rEString83);
		st1920.automaton.REString rEString85 = rEString76.makeRange(rEString84);
		java.lang.String str86 = rEString84.getReString();
		st1920.automaton.REString rEString88 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString90 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString91 = rEString88.makeClass(rEString90);
		st1920.automaton.REString rEString92 = st1920.automaton.REString.makeAlpha(rEString91);
		st1920.automaton.REString rEString93 = rEString84.makeExcludeClass(rEString91);
		st1920.automaton.REString rEString94 = st1920.automaton.REString.makeAlpha(rEString84);
		st1920.automaton.REString rEString95 = rEString66.makeZeroOrMore(rEString94);
		st1920.automaton.REString rEString96 = rEString3.makeExclude(rEString94);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString63);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString74);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString79);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString84);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString85);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str86 + "' != '" + "+" + "'", str86.equals("+"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString91);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString92);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString93);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString94);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString95);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString96);
	}

	@Test
	public void test71() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test71");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeOneOrMore(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeOneOrMore(rEString9);
		st1920.automaton.REString rEString11 = rEString2.makeRange(rEString10);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = rEString13.makeOneOrMore(rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.REString.makeAlpha(rEString15);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = rEString19.makeOneOrMore(rEString21);
		st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = rEString24.makeOneOrMore(rEString26);
		st1920.automaton.REString rEString28 = rEString19.makeRange(rEString27);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = rEString30.makeOneOrMore(rEString32);
		st1920.automaton.REString rEString34 = rEString28.makeRange(rEString30);
		st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString39 = rEString36.makeOneOrMore(rEString38);
		st1920.automaton.REString rEString40 = st1920.automaton.REString.makeAlpha(rEString38);
		st1920.automaton.REString rEString41 = rEString30.makeAny(rEString38);
		st1920.automaton.REString rEString42 = rEString17.makeRepeatExact(rEString38);
		st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString47 = rEString44.makeClass(rEString46);
		st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString54 = rEString51.makeOneOrMore(rEString53);
		st1920.automaton.REString rEString56 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString59 = rEString56.makeOneOrMore(rEString58);
		st1920.automaton.REString rEString60 = rEString51.makeRange(rEString59);
		st1920.automaton.REString rEString61 = rEString49.makeZeroOrMore(rEString60);
		st1920.automaton.REString rEString62 = rEString47.makeExcludeClass(rEString60);
		st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString67 = rEString64.makeOneOrMore(rEString66);
		st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString72 = rEString69.makeOneOrMore(rEString71);
		st1920.automaton.REString rEString73 = rEString64.makeRange(rEString72);
		st1920.automaton.REString rEString75 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString77 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString78 = rEString75.makeOneOrMore(rEString77);
		st1920.automaton.REString rEString80 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString82 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString83 = rEString80.makeOneOrMore(rEString82);
		st1920.automaton.REString rEString84 = rEString75.makeRange(rEString83);
		st1920.automaton.REString rEString86 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString88 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString89 = rEString86.makeOneOrMore(rEString88);
		st1920.automaton.REString rEString90 = rEString84.makeRange(rEString86);
		st1920.automaton.REString rEString91 = rEString72.makeOneOrMore(rEString90);
		st1920.automaton.REString rEString92 = rEString47.makeGroup(rEString91);
		st1920.automaton.REString rEString93 = rEString42.makeRepeatMoreThan(rEString47);
		st1920.automaton.REString rEString94 = rEString2.makeGroup(rEString47);
		rEString47.setReString("");
		boolean boolean97 = st1920.automaton.RegexWrapper.matches("+9", rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString67);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString73);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString78);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString83);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString84);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString89);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString90);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString91);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString92);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString93);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString94);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
	}

	@Test
	public void test72() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test72");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = rEString1.makeOneOrMore(rEString3);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = rEString6.makeOneOrMore(rEString8);
		st1920.automaton.REString rEString10 = rEString1.makeRange(rEString9);
		java.lang.String str11 = rEString9.getReString();
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = rEString13.makeOneOrMore(rEString15);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = rEString18.makeClass(rEString20);
		st1920.automaton.REString rEString22 = rEString16.makeRepeatMoreThan(rEString20);
		st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = rEString24.makeClass(rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.REString.makeAlpha(rEString24);
		st1920.automaton.REString rEString29 = rEString22.makeZeroOrMore(rEString24);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = rEString31.makeOneOrMore(rEString33);
		st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString39 = rEString36.makeOneOrMore(rEString38);
		st1920.automaton.REString rEString40 = rEString31.makeRange(rEString39);
		st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = rEString42.makeOneOrMore(rEString44);
		st1920.automaton.REString rEString46 = rEString40.makeRange(rEString42);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = rEString48.makeOneOrMore(rEString50);
		st1920.automaton.REString rEString52 = st1920.automaton.REString.makeAlpha(rEString50);
		st1920.automaton.REString rEString53 = rEString42.makeAny(rEString50);
		st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString58 = rEString55.makeOneOrMore(rEString57);
		st1920.automaton.REString rEString60 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString63 = rEString60.makeOneOrMore(rEString62);
		st1920.automaton.REString rEString64 = rEString55.makeRange(rEString63);
		java.lang.String str65 = rEString63.getReString();
		java.lang.String str66 = rEString63.getReString();
		st1920.automaton.REString rEString67 = rEString53.makeRepeatRange(rEString63);
		st1920.automaton.REString rEString68 = rEString24.makeZeroOrMore(rEString63);
		st1920.automaton.REString rEString69 = rEString9.makeClass(rEString63);
		java.lang.String str70 = rEString9.getReString();
		st1920.automaton.REString rEString73 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString75 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString76 = rEString73.makeOneOrMore(rEString75);
		st1920.automaton.REString rEString78 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString80 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString81 = rEString78.makeClass(rEString80);
		st1920.automaton.REString rEString82 = rEString76.makeRepeatMoreThan(rEString80);
		st1920.automaton.REString rEString84 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString86 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString87 = rEString84.makeClass(rEString86);
		st1920.automaton.REString rEString88 = st1920.automaton.REString.makeAlpha(rEString84);
		st1920.automaton.REString rEString89 = rEString82.makeZeroOrMore(rEString84);
		boolean boolean90 = st1920.automaton.RegexWrapper.matches("<512-61>", rEString84);
		st1920.automaton.REString rEString91 = rEString9.makeRepeatMoreThan(rEString84);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str11 + "' != '" + "+" + "'", str11.equals("+"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString63);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str65 + "' != '" + "+" + "'", str65.equals("+"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str66 + "' != '" + "+" + "'", str66.equals("+"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString67);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString68);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString69);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str70 + "' != '" + "+" + "'", str70.equals("+"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString76);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString81);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString82);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString87);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString88);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString89);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString91);
	}

	@Test
	public void test73() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test73");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeOneOrMore(rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.REString.makeAlpha(rEString4);
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString11 = rEString8.makeOneOrMore(rEString10);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = rEString13.makeOneOrMore(rEString15);
		st1920.automaton.REString rEString17 = rEString8.makeRange(rEString16);
		java.lang.String str18 = rEString16.getReString();
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString23 = rEString20.makeClass(rEString22);
		st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString28 = rEString25.makeOneOrMore(rEString27);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = rEString30.makeOneOrMore(rEString32);
		st1920.automaton.REString rEString34 = rEString25.makeRange(rEString33);
		st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString39 = rEString36.makeOneOrMore(rEString38);
		st1920.automaton.REString rEString40 = rEString34.makeRange(rEString36);
		st1920.automaton.REString rEString41 = rEString22.makeGroup(rEString40);
		st1920.automaton.REString rEString42 = rEString16.makeRepeatMoreThan(rEString22);
		st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString47 = rEString44.makeOneOrMore(rEString46);
		st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString52 = rEString49.makeClass(rEString51);
		st1920.automaton.REString rEString53 = rEString47.makeRepeatMoreThan(rEString51);
		st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString58 = rEString55.makeClass(rEString57);
		st1920.automaton.REString rEString59 = st1920.automaton.REString.makeAlpha(rEString55);
		st1920.automaton.REString rEString60 = rEString53.makeZeroOrMore(rEString55);
		st1920.automaton.REString rEString61 = rEString22.makeOneOrMore(rEString60);
		java.lang.String str62 = rEString60.getReString();
		st1920.automaton.REString rEString63 = rEString6.makeAny(rEString60);
		boolean boolean64 = st1920.automaton.RegexWrapper.matches("([])", rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str18 + "' != '" + "+" + "'", str18.equals("+"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str62 + "' != '" + "*" + "'", str62.equals("*"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString63);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
	}

	@Test
	public void test74() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test74");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeOneOrMore(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeOneOrMore(rEString9);
		st1920.automaton.REString rEString11 = rEString2.makeRange(rEString10);
		java.lang.String str12 = rEString10.getReString();
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString17 = rEString14.makeClass(rEString16);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = rEString19.makeOneOrMore(rEString21);
		st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = rEString24.makeOneOrMore(rEString26);
		st1920.automaton.REString rEString28 = rEString19.makeRange(rEString27);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = rEString30.makeOneOrMore(rEString32);
		st1920.automaton.REString rEString34 = rEString28.makeRange(rEString30);
		st1920.automaton.REString rEString35 = rEString16.makeGroup(rEString34);
		st1920.automaton.REString rEString36 = rEString10.makeRepeatMoreThan(rEString16);
		st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString41 = rEString38.makeOneOrMore(rEString40);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = rEString43.makeOneOrMore(rEString45);
		st1920.automaton.REString rEString47 = rEString38.makeRange(rEString46);
		st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString52 = rEString49.makeOneOrMore(rEString51);
		st1920.automaton.REString rEString53 = rEString47.makeRange(rEString49);
		st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString58 = rEString55.makeOneOrMore(rEString57);
		st1920.automaton.REString rEString59 = st1920.automaton.REString.makeAlpha(rEString57);
		st1920.automaton.REString rEString60 = rEString49.makeAny(rEString57);
		st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString65 = rEString62.makeOneOrMore(rEString64);
		st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString70 = rEString67.makeOneOrMore(rEString69);
		st1920.automaton.REString rEString71 = rEString62.makeRange(rEString70);
		java.lang.String str72 = rEString70.getReString();
		java.lang.String str73 = rEString70.getReString();
		st1920.automaton.REString rEString74 = rEString60.makeRepeatRange(rEString70);
		st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString78 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString79 = rEString76.makeClass(rEString78);
		st1920.automaton.REString rEString81 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString83 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString85 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString86 = rEString83.makeOneOrMore(rEString85);
		st1920.automaton.REString rEString88 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString90 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString91 = rEString88.makeOneOrMore(rEString90);
		st1920.automaton.REString rEString92 = rEString83.makeRange(rEString91);
		st1920.automaton.REString rEString93 = rEString81.makeZeroOrMore(rEString92);
		st1920.automaton.REString rEString94 = rEString79.makeExcludeClass(rEString92);
		st1920.automaton.REString rEString95 = rEString70.makeZeroOrOne(rEString79);
		st1920.automaton.REString rEString96 = rEString10.makeZeroOrOne(rEString70);
		boolean boolean97 = st1920.automaton.RegexWrapper.matches("+", rEString70);
		rEString70.setReString("{357}");
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str12 + "' != '" + "+" + "'", str12.equals("+"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str72 + "' != '" + "+" + "'", str72.equals("+"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str73 + "' != '" + "+" + "'", str73.equals("+"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString74);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString79);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString86);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString91);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString92);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString93);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString94);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString95);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString96);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
	}

	@Test
	public void test75() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test75");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = rEString1.makeClass(rEString3);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = rEString6.makeClass(rEString8);
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = rEString11.makeOneOrMore(rEString13);
		st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = rEString16.makeOneOrMore(rEString18);
		st1920.automaton.REString rEString20 = rEString11.makeRange(rEString19);
		st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString25 = rEString22.makeOneOrMore(rEString24);
		st1920.automaton.REString rEString26 = rEString20.makeRange(rEString22);
		st1920.automaton.REString rEString27 = rEString8.makeGroup(rEString26);
		st1920.automaton.REString rEString28 = rEString1.makeRepeatRange(rEString8);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = rEString30.makeClass(rEString32);
		st1920.automaton.REString rEString34 = st1920.automaton.REString.makeAlpha(rEString30);
		st1920.automaton.REString rEString35 = rEString1.makeClass(rEString30);
		st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = rEString37.makeClass(rEString39);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = rEString43.makeClass(rEString45);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = rEString48.makeOneOrMore(rEString50);
		st1920.automaton.REString rEString52 = rEString46.makeExcludeClass(rEString51);
		boolean boolean53 = st1920.automaton.RegexWrapper.matches("hi!", rEString51);
		st1920.automaton.REString rEString54 = rEString40.makeZeroOrMore(rEString51);
		st1920.automaton.REString rEString55 = rEString30.makeAny(rEString51);
		java.lang.String str56 = rEString51.getReString();
		st1920.automaton.REString rEString58 = new st1920.automaton.REString("[]+{721,}");
		st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString64 = rEString61.makeClass(rEString63);
		st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString69 = rEString66.makeOneOrMore(rEString68);
		st1920.automaton.REString rEString70 = rEString64.makeExcludeClass(rEString69);
		boolean boolean71 = st1920.automaton.RegexWrapper.matches("hi!", rEString69);
		st1920.automaton.REString rEString72 = rEString58.makeZeroOrMore(rEString69);
		rEString72.setReString("[]+{721,}");
		st1920.automaton.REString rEString75 = rEString51.makeExcludeClass(rEString72);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str56 + "' != '" + "+" + "'", str56.equals("+"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString69);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString75);
	}

	@Test
	public void test76() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test76");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("hi!");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = rEString4.makeOneOrMore(rEString6);
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString12 = rEString9.makeOneOrMore(rEString11);
		st1920.automaton.REString rEString13 = rEString4.makeRange(rEString12);
		st1920.automaton.REString rEString14 = rEString2.makeAnyChar(rEString4);
		boolean boolean15 = st1920.automaton.RegexWrapper.matches("[]+{721,}", rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
	}

	@Test
	public void test77() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test77");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = rEString1.makeClass(rEString3);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = rEString6.makeOneOrMore(rEString8);
		st1920.automaton.REString rEString10 = rEString4.makeExcludeClass(rEString9);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = rEString12.makeOneOrMore(rEString14);
		st1920.automaton.REString rEString16 = rEString4.makeAny(rEString12);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = rEString19.makeClass(rEString21);
		st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = rEString24.makeOneOrMore(rEString26);
		st1920.automaton.REString rEString28 = rEString22.makeExcludeClass(rEString27);
		boolean boolean29 = st1920.automaton.RegexWrapper.matches("hi!", rEString27);
		st1920.automaton.REString rEString30 = rEString12.makeOneOrMore(rEString27);
		java.lang.String str31 = rEString12.getReString();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
	}

	@Test
	public void test78() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test78");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeClass(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeOneOrMore(rEString9);
		st1920.automaton.REString rEString11 = rEString5.makeExcludeClass(rEString10);
		rEString11.setReString("");
		boolean boolean14 = st1920.automaton.RegexWrapper.matches("+5", rEString11);
		st1920.automaton.REString rEString16 = new st1920.automaton.REString("[]");
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = rEString18.makeOneOrMore(rEString20);
		st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = rEString23.makeOneOrMore(rEString25);
		st1920.automaton.REString rEString27 = rEString18.makeRange(rEString26);
		st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = rEString29.makeOneOrMore(rEString31);
		st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString37 = rEString34.makeOneOrMore(rEString36);
		st1920.automaton.REString rEString38 = rEString29.makeRange(rEString37);
		st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString43 = rEString40.makeOneOrMore(rEString42);
		st1920.automaton.REString rEString44 = rEString38.makeRange(rEString40);
		st1920.automaton.REString rEString45 = rEString27.makeClass(rEString40);
		st1920.automaton.REString rEString46 = rEString16.makeOneOrMore(rEString45);
		java.lang.String str47 = rEString46.getReString();
		st1920.automaton.REString rEString48 = st1920.automaton.REString.makeAlpha(rEString46);
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("+<931-383>");
		st1920.automaton.REString rEString51 = st1920.automaton.REString.makeAlpha(rEString50);
		st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString56 = rEString53.makeOneOrMore(rEString55);
		st1920.automaton.REString rEString57 = rEString50.makeAnyChar(rEString55);
		st1920.automaton.REString rEString58 = rEString48.makeClass(rEString55);
		st1920.automaton.REString rEString59 = rEString11.makeOneOrMore(rEString58);
		java.lang.Class<?> wildcardClass60 = rEString59.getClass();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str47 + "' != '" + "[]+" + "'", str47.equals("[]+"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass60);
	}

	@Test
	public void test79() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test79");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeClass(rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.REString.makeAlpha(rEString2);
		st1920.automaton.REString rEString7 = st1920.automaton.REString.makeAlpha(rEString2);
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString12 = rEString9.makeOneOrMore(rEString11);
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString17 = rEString14.makeOneOrMore(rEString16);
		st1920.automaton.REString rEString18 = rEString9.makeRange(rEString17);
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString23 = rEString20.makeOneOrMore(rEString22);
		st1920.automaton.REString rEString24 = rEString18.makeRange(rEString20);
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString29 = rEString26.makeClass(rEString28);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = rEString31.makeOneOrMore(rEString33);
		st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString39 = rEString36.makeOneOrMore(rEString38);
		st1920.automaton.REString rEString40 = rEString31.makeRange(rEString39);
		st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = rEString42.makeOneOrMore(rEString44);
		st1920.automaton.REString rEString46 = rEString40.makeRange(rEString42);
		st1920.automaton.REString rEString47 = rEString28.makeGroup(rEString46);
		st1920.automaton.REString rEString48 = rEString24.makeZeroOrMore(rEString46);
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString53 = rEString50.makeClass(rEString52);
		st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString60 = rEString57.makeOneOrMore(rEString59);
		st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString65 = rEString62.makeOneOrMore(rEString64);
		st1920.automaton.REString rEString66 = rEString57.makeRange(rEString65);
		st1920.automaton.REString rEString67 = rEString55.makeZeroOrMore(rEString66);
		st1920.automaton.REString rEString68 = rEString53.makeExcludeClass(rEString66);
		st1920.automaton.REString rEString69 = rEString48.makeAny(rEString53);
		st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString73 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString74 = rEString71.makeClass(rEString73);
		st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString78 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString79 = rEString76.makeOneOrMore(rEString78);
		st1920.automaton.REString rEString81 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString83 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString84 = rEString81.makeOneOrMore(rEString83);
		st1920.automaton.REString rEString85 = rEString76.makeRange(rEString84);
		st1920.automaton.REString rEString87 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString89 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString90 = rEString87.makeOneOrMore(rEString89);
		st1920.automaton.REString rEString91 = rEString85.makeRange(rEString87);
		st1920.automaton.REString rEString92 = rEString73.makeGroup(rEString91);
		rEString73.setReString("");
		st1920.automaton.REString rEString95 = rEString69.makeExclude(rEString73);
		st1920.automaton.REString rEString96 = rEString7.makeExclude(rEString73);
		boolean boolean97 = st1920.automaton.RegexWrapper.matches("<942-789>", rEString73);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString67);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString68);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString69);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString74);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString79);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString84);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString85);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString90);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString91);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString92);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString95);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString96);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
	}

	@Test
	public void test80() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test80");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = rEString1.makeClass(rEString3);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = rEString6.makeOneOrMore(rEString8);
		st1920.automaton.REString rEString10 = rEString4.makeExcludeClass(rEString9);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = rEString12.makeOneOrMore(rEString14);
		st1920.automaton.REString rEString16 = rEString4.makeAny(rEString12);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = rEString19.makeClass(rEString21);
		st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = rEString24.makeOneOrMore(rEString26);
		st1920.automaton.REString rEString28 = rEString22.makeExcludeClass(rEString27);
		boolean boolean29 = st1920.automaton.RegexWrapper.matches("hi!", rEString27);
		st1920.automaton.REString rEString30 = rEString12.makeOneOrMore(rEString27);
		java.lang.Class<?> wildcardClass31 = rEString12.getClass();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass31);
	}

	@Test
	public void test81() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test81");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = rEString1.makeClass(rEString3);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = rEString6.makeOneOrMore(rEString8);
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = rEString11.makeOneOrMore(rEString13);
		st1920.automaton.REString rEString15 = rEString6.makeRange(rEString14);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = rEString17.makeOneOrMore(rEString19);
		st1920.automaton.REString rEString21 = rEString15.makeRange(rEString17);
		st1920.automaton.REString rEString22 = rEString3.makeGroup(rEString21);
		rEString3.setReString("");
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString29 = rEString26.makeOneOrMore(rEString28);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = rEString31.makeOneOrMore(rEString33);
		st1920.automaton.REString rEString35 = rEString26.makeRange(rEString34);
		st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = rEString37.makeOneOrMore(rEString39);
		st1920.automaton.REString rEString41 = rEString35.makeRange(rEString37);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = rEString43.makeClass(rEString45);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = rEString48.makeOneOrMore(rEString50);
		st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString56 = rEString53.makeOneOrMore(rEString55);
		st1920.automaton.REString rEString57 = rEString48.makeRange(rEString56);
		st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString61 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString62 = rEString59.makeOneOrMore(rEString61);
		st1920.automaton.REString rEString63 = rEString57.makeRange(rEString59);
		st1920.automaton.REString rEString64 = rEString45.makeGroup(rEString63);
		st1920.automaton.REString rEString65 = rEString41.makeZeroOrMore(rEString63);
		st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString70 = rEString67.makeClass(rEString69);
		st1920.automaton.REString rEString72 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString74 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString77 = rEString74.makeOneOrMore(rEString76);
		st1920.automaton.REString rEString79 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString81 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString82 = rEString79.makeOneOrMore(rEString81);
		st1920.automaton.REString rEString83 = rEString74.makeRange(rEString82);
		st1920.automaton.REString rEString84 = rEString72.makeZeroOrMore(rEString83);
		st1920.automaton.REString rEString85 = rEString70.makeExcludeClass(rEString83);
		st1920.automaton.REString rEString86 = rEString65.makeAny(rEString70);
		st1920.automaton.REString rEString89 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString91 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString92 = rEString89.makeClass(rEString91);
		boolean boolean93 = st1920.automaton.RegexWrapper.matches("+", rEString89);
		st1920.automaton.REString rEString94 = rEString86.makeRange(rEString89);
		st1920.automaton.REString rEString95 = rEString3.makeRepeatExact(rEString94);
		rEString3.setReString("[]+{721,}");
		java.lang.Class<?> wildcardClass98 = rEString3.getClass();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString63);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString77);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString82);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString83);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString84);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString85);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString86);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString92);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString94);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString95);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass98);
	}

	@Test
	public void test82() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test82");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString6 = rEString3.makeOneOrMore(rEString5);
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString11 = rEString8.makeOneOrMore(rEString10);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = rEString13.makeClass(rEString15);
		st1920.automaton.REString rEString17 = rEString11.makeRepeatMoreThan(rEString15);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = rEString19.makeClass(rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.REString.makeAlpha(rEString19);
		st1920.automaton.REString rEString24 = rEString17.makeZeroOrMore(rEString19);
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString29 = rEString26.makeClass(rEString28);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString36 = rEString33.makeOneOrMore(rEString35);
		st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString41 = rEString38.makeOneOrMore(rEString40);
		st1920.automaton.REString rEString42 = rEString33.makeRange(rEString41);
		st1920.automaton.REString rEString43 = rEString31.makeZeroOrMore(rEString42);
		st1920.automaton.REString rEString44 = rEString29.makeExcludeClass(rEString42);
		st1920.automaton.REString rEString45 = rEString19.makeRepeatMoreThan(rEString44);
		st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = rEString47.makeOneOrMore(rEString49);
		st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString55 = rEString52.makeOneOrMore(rEString54);
		st1920.automaton.REString rEString56 = rEString47.makeRange(rEString55);
		st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString60 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString61 = rEString58.makeOneOrMore(rEString60);
		st1920.automaton.REString rEString62 = rEString56.makeRange(rEString58);
		st1920.automaton.REString rEString63 = st1920.automaton.REString.makeAlpha(rEString62);
		st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString68 = rEString65.makeOneOrMore(rEString67);
		st1920.automaton.REString rEString69 = rEString62.makeRepeatMoreThan(rEString67);
		st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString73 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString74 = rEString71.makeClass(rEString73);
		st1920.automaton.REString rEString75 = rEString45.makeConcatenation(rEString67, rEString74);
		st1920.automaton.REString rEString76 = rEString3.makeGroup(rEString45);
		boolean boolean77 = st1920.automaton.RegexWrapper.matches("#", rEString76);
		st1920.automaton.REString rEString78 = st1920.automaton.REString.makeAlpha(rEString76);
		boolean boolean79 = st1920.automaton.RegexWrapper.matches("", rEString76);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString63);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString68);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString69);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString74);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString75);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString76);
		// Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString78);
		// Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
	}

	@Test
	public void test83() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test83");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString6 = rEString3.makeOneOrMore(rEString5);
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString11 = rEString8.makeClass(rEString10);
		st1920.automaton.REString rEString12 = rEString6.makeRepeatMoreThan(rEString10);
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString17 = rEString14.makeClass(rEString16);
		st1920.automaton.REString rEString18 = st1920.automaton.REString.makeAlpha(rEString14);
		st1920.automaton.REString rEString19 = rEString12.makeZeroOrMore(rEString14);
		boolean boolean20 = st1920.automaton.RegexWrapper.matches("hi!", rEString19);
		boolean boolean21 = st1920.automaton.RegexWrapper.matches("hi!", rEString19);
		st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = rEString23.makeClass(rEString25);
		st1920.automaton.REString rEString27 = st1920.automaton.REString.makeAlpha(rEString23);
		st1920.automaton.REString rEString28 = rEString19.makeNothing(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
	}

	@Test
	public void test84() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test84");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeOneOrMore(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeOneOrMore(rEString9);
		st1920.automaton.REString rEString11 = rEString2.makeRange(rEString10);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = rEString13.makeOneOrMore(rEString15);
		st1920.automaton.REString rEString17 = rEString11.makeRange(rEString13);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = rEString19.makeClass(rEString21);
		st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = rEString24.makeOneOrMore(rEString26);
		st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = rEString29.makeOneOrMore(rEString31);
		st1920.automaton.REString rEString33 = rEString24.makeRange(rEString32);
		st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString38 = rEString35.makeOneOrMore(rEString37);
		st1920.automaton.REString rEString39 = rEString33.makeRange(rEString35);
		st1920.automaton.REString rEString40 = rEString21.makeGroup(rEString39);
		st1920.automaton.REString rEString41 = rEString17.makeZeroOrMore(rEString39);
		boolean boolean42 = st1920.automaton.RegexWrapper.matches("{357}", rEString39);
		st1920.automaton.REString rEString44 = new st1920.automaton.REString("[]");
		st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString49 = rEString46.makeOneOrMore(rEString48);
		st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString54 = rEString51.makeOneOrMore(rEString53);
		st1920.automaton.REString rEString55 = rEString46.makeRange(rEString54);
		st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString59 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString60 = rEString57.makeOneOrMore(rEString59);
		st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString65 = rEString62.makeOneOrMore(rEString64);
		st1920.automaton.REString rEString66 = rEString57.makeRange(rEString65);
		st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString70 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString71 = rEString68.makeOneOrMore(rEString70);
		st1920.automaton.REString rEString72 = rEString66.makeRange(rEString68);
		st1920.automaton.REString rEString73 = rEString55.makeClass(rEString68);
		st1920.automaton.REString rEString74 = rEString44.makeOneOrMore(rEString73);
		st1920.automaton.REString rEString75 = rEString39.makeRepeatMoreThan(rEString74);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString73);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString74);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString75);
	}

	@Test
	public void test85() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test85");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeOneOrMore(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeOneOrMore(rEString9);
		st1920.automaton.REString rEString11 = rEString2.makeRange(rEString10);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = rEString13.makeOneOrMore(rEString15);
		st1920.automaton.REString rEString17 = rEString11.makeRange(rEString13);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = rEString19.makeClass(rEString21);
		st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = rEString24.makeOneOrMore(rEString26);
		st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = rEString29.makeOneOrMore(rEString31);
		st1920.automaton.REString rEString33 = rEString24.makeRange(rEString32);
		st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString38 = rEString35.makeOneOrMore(rEString37);
		st1920.automaton.REString rEString39 = rEString33.makeRange(rEString35);
		st1920.automaton.REString rEString40 = rEString21.makeGroup(rEString39);
		st1920.automaton.REString rEString41 = rEString17.makeZeroOrMore(rEString39);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = rEString43.makeClass(rEString45);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString52 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString53 = rEString50.makeOneOrMore(rEString52);
		st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString58 = rEString55.makeOneOrMore(rEString57);
		st1920.automaton.REString rEString59 = rEString50.makeRange(rEString58);
		st1920.automaton.REString rEString60 = rEString48.makeZeroOrMore(rEString59);
		st1920.automaton.REString rEString61 = rEString46.makeExcludeClass(rEString59);
		st1920.automaton.REString rEString62 = rEString41.makeAny(rEString46);
		st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString68 = rEString65.makeClass(rEString67);
		boolean boolean69 = st1920.automaton.RegexWrapper.matches("+", rEString65);
		st1920.automaton.REString rEString70 = rEString62.makeRange(rEString65);
		boolean boolean71 = st1920.automaton.RegexWrapper.matches("<968-958>", rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString68);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
	}

	@Test
	public void test86() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test86");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeClass(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeOneOrMore(rEString9);
		st1920.automaton.REString rEString11 = rEString5.makeExcludeClass(rEString10);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = rEString13.makeOneOrMore(rEString15);
		st1920.automaton.REString rEString17 = rEString5.makeAny(rEString13);
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString23 = rEString20.makeClass(rEString22);
		st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString28 = rEString25.makeOneOrMore(rEString27);
		st1920.automaton.REString rEString29 = rEString23.makeExcludeClass(rEString28);
		boolean boolean30 = st1920.automaton.RegexWrapper.matches("hi!", rEString28);
		st1920.automaton.REString rEString31 = rEString13.makeOneOrMore(rEString28);
		boolean boolean32 = st1920.automaton.RegexWrapper.matches("+5", rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
	}

	@Test
	public void test87() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test87");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString6 = rEString3.makeOneOrMore(rEString5);
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString11 = rEString8.makeClass(rEString10);
		st1920.automaton.REString rEString12 = rEString6.makeRepeatMoreThan(rEString10);
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString17 = rEString14.makeClass(rEString16);
		st1920.automaton.REString rEString18 = st1920.automaton.REString.makeAlpha(rEString14);
		st1920.automaton.REString rEString19 = rEString12.makeZeroOrMore(rEString14);
		st1920.automaton.REString rEString20 = st1920.automaton.REString.makeAlpha(rEString19);
		st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString25 = rEString22.makeOneOrMore(rEString24);
		st1920.automaton.REString rEString27 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString30 = rEString27.makeOneOrMore(rEString29);
		st1920.automaton.REString rEString31 = rEString22.makeRange(rEString30);
		st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString36 = rEString33.makeOneOrMore(rEString35);
		st1920.automaton.REString rEString37 = rEString31.makeRange(rEString33);
		st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString42 = rEString39.makeOneOrMore(rEString41);
		st1920.automaton.REString rEString43 = st1920.automaton.REString.makeAlpha(rEString41);
		st1920.automaton.REString rEString44 = rEString33.makeAny(rEString41);
		st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString49 = rEString46.makeOneOrMore(rEString48);
		st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString54 = rEString51.makeClass(rEString53);
		st1920.automaton.REString rEString55 = rEString49.makeRepeatMoreThan(rEString53);
		st1920.automaton.REString rEString56 = rEString41.makeNothing(rEString49);
		st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString60 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString61 = rEString58.makeOneOrMore(rEString60);
		st1920.automaton.REString rEString63 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString66 = rEString63.makeOneOrMore(rEString65);
		st1920.automaton.REString rEString67 = rEString58.makeRange(rEString66);
		st1920.automaton.REString rEString69 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString71 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString72 = rEString69.makeOneOrMore(rEString71);
		st1920.automaton.REString rEString73 = rEString67.makeRange(rEString69);
		st1920.automaton.REString rEString74 = rEString41.makeOneOrMore(rEString69);
		st1920.automaton.REString rEString76 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString78 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString79 = rEString76.makeClass(rEString78);
		st1920.automaton.REString rEString81 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString83 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString85 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString86 = rEString83.makeOneOrMore(rEString85);
		st1920.automaton.REString rEString88 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString90 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString91 = rEString88.makeOneOrMore(rEString90);
		st1920.automaton.REString rEString92 = rEString83.makeRange(rEString91);
		st1920.automaton.REString rEString93 = rEString81.makeZeroOrMore(rEString92);
		st1920.automaton.REString rEString94 = rEString79.makeExcludeClass(rEString92);
		java.lang.String str95 = rEString79.getReString();
		st1920.automaton.REString rEString96 = rEString74.makeOneOrMore(rEString79);
		st1920.automaton.REString rEString97 = rEString20.makeExclude(rEString96);
		boolean boolean98 = st1920.automaton.RegexWrapper.matches("+8", rEString20);
		boolean boolean99 = st1920.automaton.RegexWrapper.matches("+<931-383>", rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString67);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString73);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString74);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString79);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString86);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString91);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString92);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString93);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString94);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str95 + "' != '" + "[]" + "'", str95.equals("[]"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString96);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString97);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
	}

	@Test
	public void test88() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test88");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = rEString1.makeOneOrMore(rEString3);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = rEString6.makeOneOrMore(rEString8);
		st1920.automaton.REString rEString10 = rEString1.makeRange(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.REString.makeAlpha(rEString1);
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("<512-61>");
		boolean boolean15 = st1920.automaton.RegexWrapper.matches("[]", rEString14);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = rEString19.makeOneOrMore(rEString21);
		st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = rEString24.makeOneOrMore(rEString26);
		st1920.automaton.REString rEString28 = rEString19.makeRange(rEString27);
		st1920.automaton.REString rEString29 = rEString17.makeZeroOrMore(rEString28);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = rEString31.makeOneOrMore(rEString33);
		st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString39 = rEString36.makeOneOrMore(rEString38);
		st1920.automaton.REString rEString40 = rEString31.makeRange(rEString39);
		st1920.automaton.REString rEString42 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = rEString42.makeOneOrMore(rEString44);
		st1920.automaton.REString rEString46 = rEString40.makeRange(rEString42);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = rEString48.makeClass(rEString50);
		st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString56 = rEString53.makeOneOrMore(rEString55);
		st1920.automaton.REString rEString58 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString60 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString61 = rEString58.makeOneOrMore(rEString60);
		st1920.automaton.REString rEString62 = rEString53.makeRange(rEString61);
		st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString67 = rEString64.makeOneOrMore(rEString66);
		st1920.automaton.REString rEString68 = rEString62.makeRange(rEString64);
		st1920.automaton.REString rEString69 = rEString50.makeGroup(rEString68);
		st1920.automaton.REString rEString70 = rEString46.makeZeroOrMore(rEString68);
		st1920.automaton.REString rEString72 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString74 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString75 = rEString72.makeClass(rEString74);
		st1920.automaton.REString rEString77 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString79 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString81 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString82 = rEString79.makeOneOrMore(rEString81);
		st1920.automaton.REString rEString84 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString86 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString87 = rEString84.makeOneOrMore(rEString86);
		st1920.automaton.REString rEString88 = rEString79.makeRange(rEString87);
		st1920.automaton.REString rEString89 = rEString77.makeZeroOrMore(rEString88);
		st1920.automaton.REString rEString90 = rEString75.makeExcludeClass(rEString88);
		st1920.automaton.REString rEString91 = rEString70.makeAny(rEString75);
		st1920.automaton.REString rEString92 = rEString29.makeZeroOrOne(rEString75);
		st1920.automaton.REString rEString93 = st1920.automaton.REString.makeAlpha(rEString75);
		st1920.automaton.REString rEString94 = rEString14.makeZeroOrMore(rEString93);
		st1920.automaton.REString rEString95 = rEString1.makeRange(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString67);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString68);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString69);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString75);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString82);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString87);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString88);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString89);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString90);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString91);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString92);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString93);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString94);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString95);
	}

	@Test
	public void test89() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test89");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = rEString2.makeOneOrMore(rEString4);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeOneOrMore(rEString9);
		st1920.automaton.REString rEString11 = rEString2.makeRange(rEString10);
		java.lang.String str12 = rEString10.getReString();
		boolean boolean13 = st1920.automaton.RegexWrapper.matches("[^]", rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str12 + "' != '" + "+" + "'", str12.equals("+"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
	}

	@Test
	public void test90() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test90");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = rEString1.makeClass(rEString3);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = rEString6.makeOneOrMore(rEString8);
		st1920.automaton.REString rEString10 = rEString4.makeExcludeClass(rEString9);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = rEString12.makeOneOrMore(rEString14);
		st1920.automaton.REString rEString16 = rEString4.makeAny(rEString12);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = rEString19.makeClass(rEString21);
		st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = rEString24.makeOneOrMore(rEString26);
		st1920.automaton.REString rEString28 = rEString22.makeExcludeClass(rEString27);
		boolean boolean29 = st1920.automaton.RegexWrapper.matches("hi!", rEString27);
		st1920.automaton.REString rEString30 = rEString12.makeOneOrMore(rEString27);
		st1920.automaton.REString rEString31 = st1920.automaton.REString.makeAlpha(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
	}

	@Test
	public void test91() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest2.test91");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = rEString1.makeOneOrMore(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.REString.makeAlpha(rEString3);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = rEString7.makeOneOrMore(rEString9);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = rEString12.makeOneOrMore(rEString14);
		st1920.automaton.REString rEString16 = rEString7.makeRange(rEString15);
		java.lang.String str17 = rEString15.getReString();
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = rEString19.makeClass(rEString21);
		st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = rEString24.makeOneOrMore(rEString26);
		st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = rEString29.makeOneOrMore(rEString31);
		st1920.automaton.REString rEString33 = rEString24.makeRange(rEString32);
		st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString38 = rEString35.makeOneOrMore(rEString37);
		st1920.automaton.REString rEString39 = rEString33.makeRange(rEString35);
		st1920.automaton.REString rEString40 = rEString21.makeGroup(rEString39);
		st1920.automaton.REString rEString41 = rEString15.makeRepeatMoreThan(rEString21);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = rEString43.makeOneOrMore(rEString45);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = rEString48.makeClass(rEString50);
		st1920.automaton.REString rEString52 = rEString46.makeRepeatMoreThan(rEString50);
		st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString56 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString57 = rEString54.makeClass(rEString56);
		st1920.automaton.REString rEString58 = st1920.automaton.REString.makeAlpha(rEString54);
		st1920.automaton.REString rEString59 = rEString52.makeZeroOrMore(rEString54);
		st1920.automaton.REString rEString60 = rEString21.makeOneOrMore(rEString59);
		java.lang.String str61 = rEString59.getReString();
		st1920.automaton.REString rEString62 = rEString5.makeAny(rEString59);
		st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString68 = rEString65.makeClass(rEString67);
		boolean boolean69 = st1920.automaton.RegexWrapper.matches("+", rEString65);
		st1920.automaton.REString rEString70 = rEString62.makeOneOrMore(rEString65);
		st1920.automaton.REString rEString72 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString74 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString75 = rEString72.makeOneOrMore(rEString74);
		rEString74.setReString("+");
		st1920.automaton.REString rEString78 = rEString65.makeNothing(rEString74);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str17 + "' != '" + "+" + "'", str17.equals("+"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str61 + "' != '" + "*" + "'", str61.equals("*"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString68);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString75);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString78);
	}
}
