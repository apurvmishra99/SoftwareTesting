package st1920.automaton;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Task_3_1 {

    public static boolean debug = false;


    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>", "{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("|", "{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }


    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{34,}", "{87,39}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("", "{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{34,}", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{34,}" + "'", str2.equals("{34,}"));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a", "{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a{34,}" + "'", str2.equals("a{34,}"));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        st1920.automaton.RegExpMatcher regExpMatcher0 = new st1920.automaton.RegExpMatcher();
        java.lang.Class<?> wildcardClass1 = regExpMatcher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{4}", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{4}" + "'", str2.equals("{4}"));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a", "{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a{4}" + "'", str2.equals("a{4}"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a", "|");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a|" + "'", str2.equals("a|"));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a{34,}", "a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a{34,}a{34,}" + "'", str2.equals("a{34,}a{34,}"));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<85-5>", "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<85-5>a" + "'", str2.equals("<85-5>a"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a|", "<85-5>a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a|", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a|" + "'", str2.equals("a|"));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{34,}", "<85-5>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>", "a{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{34,}", "a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{34,}a{34,}a{34,}" + "'", str2.equals("{34,}a{34,}a{34,}"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<85-5>", "a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<85-5>a{34,}a{34,}" + "'", str2.equals("<85-5>a{34,}a{34,}"));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a{34,}", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{87,39}", "<85-5>a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{34,}a{34,}a{34,}", "a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{34,}a{34,}a{34,}a{34,}" + "'", str2.equals("{34,}a{34,}a{34,}a{34,}"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("|", "a|");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "|a|" + "'", str2.equals("|a|"));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{34,}a{34,}a{34,}a{34,}", "a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!", "a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!a{34,}" + "'", str2.equals("hi!a{34,}"));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("", "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a" + "'", str2.equals("a"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<85-5>a{34,}a{34,}", "<85-5>a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}" + "'", str2.equals("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}"));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{34,}a{34,}a{34,}a{34,}", "a|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("", "{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>a{34,}a{34,}", "|a|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{87,39}", "{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}", "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a" + "'", str2.equals("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a"));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!a{34,}", "hi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("", "<85-5>a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<85-5>a" + "'", str2.equals("<85-5>a"));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}", "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>", "|");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("|a|", "{34,}a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a{34,}a{34,}", "hi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a{34,}a{34,}hi!a{34,}" + "'", str2.equals("a{34,}a{34,}hi!a{34,}"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!", "<85-5>a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!<85-5>a" + "'", str2.equals("hi!<85-5>a"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a|", "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}" + "'", str2.equals("a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{34,}a{34,}a{34,}", "|a|");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{34,}a{34,}a{34,}|a|" + "'", str2.equals("{34,}a{34,}a{34,}|a|"));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!", "{87,39}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!{87,39}" + "'", str2.equals("hi!{87,39}"));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{87,39}", "a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{87,39}a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}" + "'", str2.equals("{87,39}a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}"));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a|", "hi!{87,39}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a|hi!{87,39}" + "'", str2.equals("a|hi!{87,39}"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a{4}", "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a" + "'", str2.equals("a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a"));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{4}", "{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{34,}a{34,}a{34,}a{34,}", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{34,}a{34,}a{34,}a{34,}" + "'", str2.equals("{34,}a{34,}a{34,}a{34,}"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{34,}a{34,}a{34,}|a|", "|");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!a{34,}", "hi!{87,39}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<85-5>", "<85-5>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<85-5><85-5>" + "'", str2.equals("<85-5><85-5>"));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a|hi!{87,39}", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}", "a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a" + "'", str2.equals("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("", "|a|");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "|a|" + "'", str2.equals("|a|"));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{87,39}", "a{34,}a{34,}hi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!{87,39}", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!{87,39}" + "'", str2.equals("hi!{87,39}"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a{34,}", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a{34,}" + "'", str2.equals("a{34,}"));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a|", "a{34,}a{34,}hi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a", "a|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("", "a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a{34,}" + "'", str2.equals("a{34,}"));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<85-5>a", "a{34,}a{34,}hi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<85-5>aa{34,}a{34,}hi!a{34,}" + "'", str2.equals("<85-5>aa{34,}a{34,}hi!a{34,}"));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{4}", "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{4}", "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a" + "'", str2.equals("{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!{87,39}", "a{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!{87,39}a{4}" + "'", str2.equals("hi!{87,39}a{4}"));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<85-5>aa{34,}a{34,}hi!a{34,}", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<85-5>aa{34,}a{34,}hi!a{34,}" + "'", str2.equals("<85-5>aa{34,}a{34,}hi!a{34,}"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a", "a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa{34,}" + "'", str2.equals("aa{34,}"));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{34,}", "hi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a", "a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a", "hi!{87,39}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}" + "'", str2.equals("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{34,}a{34,}a{34,}", "{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>", "hi!<85-5>a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a|hi!{87,39}", "<85-5>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a|hi!{87,39}<85-5>" + "'", str2.equals("a|hi!{87,39}<85-5>"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}", "{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}" + "'", str2.equals("a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a|hi!{87,39}<85-5>", "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a", "a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a|hi!{87,39}<85-5>", "{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a|hi!{87,39}<85-5>{4}" + "'", str2.equals("a|hi!{87,39}<85-5>{4}"));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("|", "<85-5>aa{34,}a{34,}hi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<85-5>a", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<85-5>a" + "'", str2.equals("<85-5>a"));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{34,}", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a", "a|hi!{87,39}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a{4}", "a|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}", "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}" + "'", str2.equals("a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a", "aa{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!<85-5>a", "hi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!<85-5>ahi!a{34,}" + "'", str2.equals("hi!<85-5>ahi!a{34,}"));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a", "a{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!a{34,}", "a|hi!{87,39}<85-5>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a{4}", "a|hi!{87,39}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a", "<85-5>aa{34,}a{34,}hi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>aa{34,}a{34,}hi!a{34,}" + "'", str2.equals("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>aa{34,}a{34,}hi!a{34,}"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("|", "{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a|", "{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{34,}", "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}" + "'", str2.equals("{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}"));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{87,39}a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}", "{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a", "<85-5>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>" + "'", str2.equals("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<85-5><85-5>", "a|hi!{87,39}<85-5>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<85-5><85-5>a|hi!{87,39}<85-5>" + "'", str2.equals("<85-5><85-5>a|hi!{87,39}<85-5>"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>", "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5><85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a" + "'", str2.equals("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5><85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{34,}a{34,}a{34,}a{34,}", "|a|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}", "|");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!a{34,}", "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a", "a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}" + "'", str2.equals("aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{34,}a{34,}a{34,}a{34,}", "|a|");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{34,}a{34,}a{34,}a{34,}|a|" + "'", str2.equals("{34,}a{34,}a{34,}a{34,}|a|"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a{4}", "a{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!{87,39}a{4}", "{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!{87,39}a{4}{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a" + "'", str2.equals("hi!{87,39}a{4}{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a"));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("|", "a{34,}a{34,}hi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "|a{34,}a{34,}hi!a{34,}" + "'", str2.equals("|a{34,}a{34,}hi!a{34,}"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>aa{34,}a{34,}hi!a{34,}", "hi!<85-5>ahi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{34,}a{34,}a{34,}", "hi!{87,39}a{4}{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a|hi!{87,39}", "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a", "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a" + "'", str2.equals("{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a"));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!<85-5>ahi!a{34,}", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!<85-5>ahi!a{34,}" + "'", str2.equals("hi!<85-5>ahi!a{34,}"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("", "a|hi!{87,39}<85-5>{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a", "{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}" + "'", str2.equals("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a", "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("", "a|");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a|" + "'", str2.equals("a|"));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!", "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>aa{34,}a{34,}hi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a", "<85-5>aa{34,}a{34,}hi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("|a{34,}a{34,}hi!a{34,}", "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{34,}a{34,}a{34,}a{34,}|a|", "{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}" + "'", str2.equals("{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}"));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}", "{34,}a{34,}a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}", "hi!{87,39}a{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!{87,39}a{4}" + "'", str2.equals("{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!{87,39}a{4}"));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{34,}a{34,}a{34,}", "{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}", "<85-5>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>" + "'", str2.equals("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>"));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{87,39}a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}", "a|");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{87,39}a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a|" + "'", str2.equals("{87,39}a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a|"));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!<85-5>a", "a|");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!<85-5>aa|" + "'", str2.equals("hi!<85-5>aa|"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>", "{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a" + "'", str2.equals("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a"));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<85-5><85-5>a|hi!{87,39}<85-5>", "|a{34,}a{34,}hi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<85-5><85-5>a|hi!{87,39}<85-5>|a{34,}a{34,}hi!a{34,}" + "'", str2.equals("<85-5><85-5>a|hi!{87,39}<85-5>|a{34,}a{34,}hi!a{34,}"));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!" + "'", str2.equals("{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!"));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!<85-5>ahi!a{34,}", "hi!<85-5>aa|");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!<85-5>ahi!a{34,}hi!<85-5>aa|" + "'", str2.equals("hi!<85-5>ahi!a{34,}hi!<85-5>aa|"));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!", "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a" + "'", str2.equals("{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a"));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a{34,}a{34,}hi!a{34,}", "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>" + "'", str2.equals("a{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>"));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a|hi!{87,39}", "<85-5>aa{34,}a{34,}hi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a{34,}a{34,}hi!a{34,}", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>aa{34,}a{34,}hi!a{34,}", "a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a|", "a{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("", "{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}" + "'", str2.equals("{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}"));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}", "a{34,}a{34,}hi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a", "hi!{87,39}a{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}a{4}" + "'", str2.equals("{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}a{4}"));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a", "|");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("|", "<85-5>a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "|<85-5>a" + "'", str2.equals("|<85-5>a"));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{87,39}a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a|", "{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{87,39}a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a|{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}" + "'", str2.equals("{87,39}a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a|{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}"));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a", "{87,39}a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a|{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a", "<85-5>a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("|a{34,}a{34,}hi!a{34,}", "{87,39}a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "|a{34,}a{34,}hi!a{34,}{87,39}a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}" + "'", str2.equals("|a{34,}a{34,}hi!a{34,}{87,39}a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}"));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>", "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5><85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>" + "'", str2.equals("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5><85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>"));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("", "|");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}", "hi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}hi!a{34,}" + "'", str2.equals("aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}hi!a{34,}"));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("", "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5><85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{87,39}a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a|{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}", "hi!{87,39}a{4}{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a", "{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!{87,39}a{4}{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a", "a{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a", "a{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}aa{4}" + "'", str2.equals("{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}aa{4}"));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("", "|<85-5>a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "|<85-5>a" + "'", str2.equals("|<85-5>a"));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a", "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}", "aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}hi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{34,}a{34,}a{34,}a{34,}", "<85-5><85-5>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a{34,}", "{34,}a{34,}a{34,}|a|");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a{34,}{34,}a{34,}a{34,}|a|" + "'", str2.equals("a{34,}{34,}a{34,}a{34,}|a|"));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{34,}a{34,}a{34,}a{34,}", "<85-5>a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a{4}", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}", "{87,39}a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a|{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!<85-5>a", "<85-5><85-5>a|hi!{87,39}<85-5>|a{34,}a{34,}hi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}", "a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a", "{34,}a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("|a|", "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "|a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a" + "'", str2.equals("|a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a"));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>", "{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a", "<85-5><85-5>a|hi!{87,39}<85-5>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5><85-5>a|hi!{87,39}<85-5>" + "'", str2.equals("{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5><85-5>a|hi!{87,39}<85-5>"));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{34,}a{34,}a{34,}a{34,}|a|", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{34,}a{34,}a{34,}a{34,}|a|hi!" + "'", str2.equals("{34,}a{34,}a{34,}a{34,}|a|hi!"));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!{87,39}", "{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!{87,39}{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}" + "'", str2.equals("hi!{87,39}{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}"));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5><85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a", "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<85-5>aa{34,}a{34,}hi!a{34,}", "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<85-5>aa{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>" + "'", str2.equals("<85-5>aa{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>"));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}", "a{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}a{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>" + "'", str2.equals("a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}a{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>"));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a{34,}a{34,}", "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a" + "'", str2.equals("a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a"));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a|hi!{87,39}<85-5>", "a{34,}a{34,}hi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a|hi!{87,39}<85-5>a{34,}a{34,}hi!a{34,}" + "'", str2.equals("a|hi!{87,39}<85-5>a{34,}a{34,}hi!a{34,}"));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}", "<85-5>aa{34,}a{34,}hi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>", "<85-5><85-5>a|hi!{87,39}<85-5>|a{34,}a{34,}hi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a|hi!{87,39}", "<85-5><85-5>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a|hi!{87,39}", "{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}aa{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}a{4}", "|a{34,}a{34,}hi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}a{4}|a{34,}a{34,}hi!a{34,}" + "'", str2.equals("{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}a{4}|a{34,}a{34,}hi!a{34,}"));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a", "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>aa{34,}a{34,}hi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}", "a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!", "<85-5>a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!<85-5>ahi!a{34,}hi!<85-5>aa|", "{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!<85-5>ahi!a{34,}hi!<85-5>aa|{34,}" + "'", str2.equals("hi!<85-5>ahi!a{34,}hi!<85-5>aa|{34,}"));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a", "{34,}a{34,}a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}a{34,}a{34,}a{34,}" + "'", str2.equals("{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}a{34,}a{34,}a{34,}"));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("", "a{34,}{34,}a{34,}a{34,}|a|");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a{34,}{34,}a{34,}a{34,}|a|" + "'", str2.equals("a{34,}{34,}a{34,}a{34,}|a|"));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}", "|");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{34,}a{34,}a{34,}a{34,}|a|", "a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}a{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{34,}a{34,}a{34,}a{34,}|a|a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}a{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>" + "'", str2.equals("{34,}a{34,}a{34,}a{34,}|a|a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}a{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>"));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}", "<85-5><85-5>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>aa{34,}a{34,}hi!a{34,}", "{34,}a{34,}a{34,}a{34,}|a|hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}", "a{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}a{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>" + "'", str2.equals("{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}a{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>"));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}aa{4}", "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{34,}a{34,}a{34,}a{34,}", "aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}hi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}aa{4}", "a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}aa{4}a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a" + "'", str2.equals("{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}aa{4}a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a"));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}", "{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}a{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>", "hi!<85-5>a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<85-5>", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<85-5>" + "'", str2.equals("<85-5>"));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a", "<85-5>aa{34,}a{34,}hi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a|hi!{87,39}<85-5>a{34,}a{34,}hi!a{34,}", "a|hi!{87,39}<85-5>{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{87,39}a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a|", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!{87,39}{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}", "a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!{87,39}{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}a{34,}" + "'", str2.equals("hi!{87,39}{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}a{34,}"));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("aa{34,}", "{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!{87,39}a{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("", "aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}", "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>aa{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>", "a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!{87,39}{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}", "a|hi!{87,39}<85-5>a{34,}a{34,}hi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!{87,39}{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}a|hi!{87,39}<85-5>a{34,}a{34,}hi!a{34,}" + "'", str2.equals("hi!{87,39}{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}a|hi!{87,39}<85-5>a{34,}a{34,}hi!a{34,}"));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{87,39}", "<85-5><85-5>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{87,39}<85-5><85-5>" + "'", str2.equals("{87,39}<85-5><85-5>"));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = st1920.automaton.RegExpMatcher.matches("|<85-5>a", "hi!<85-5>aa|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}", "a{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}", "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!{87,39}a{4}", "<85-5><85-5>a|hi!{87,39}<85-5>|a{34,}a{34,}hi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}", "{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = st1920.automaton.RegExpMatcher.matches("aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}", "{34,}a{34,}a{34,}a{34,}|a|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<85-5><85-5>a|hi!{87,39}<85-5>|a{34,}a{34,}hi!a{34,}", "<85-5>aa{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<85-5><85-5>a|hi!{87,39}<85-5>|a{34,}a{34,}hi!a{34,}<85-5>aa{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>" + "'", str2.equals("<85-5><85-5>a|hi!{87,39}<85-5>|a{34,}a{34,}hi!a{34,}<85-5>aa{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>"));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!<85-5>ahi!a{34,}hi!<85-5>aa|", "hi!<85-5>aa|");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!<85-5>ahi!a{34,}hi!<85-5>aa|hi!<85-5>aa|" + "'", str2.equals("hi!<85-5>ahi!a{34,}hi!<85-5>aa|hi!<85-5>aa|"));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a", "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}aa" + "'", str2.equals("a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}aa"));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!", "hi!{87,39}{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!hi!{87,39}{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}a{34,}" + "'", str2.equals("{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!hi!{87,39}{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}a{34,}"));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("", "<85-5><85-5>a|hi!{87,39}<85-5>|a{34,}a{34,}hi!a{34,}<85-5>aa{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<85-5><85-5>a|hi!{87,39}<85-5>|a{34,}a{34,}hi!a{34,}<85-5>aa{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>" + "'", str2.equals("<85-5><85-5>a|hi!{87,39}<85-5>|a{34,}a{34,}hi!a{34,}<85-5>aa{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>"));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}", "|");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}|" + "'", str2.equals("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}|"));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("|a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a", "{34,}a{34,}a{34,}a{34,}|a|hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "|a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}a{34,}a{34,}a{34,}|a|hi!" + "'", str2.equals("|a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}a{34,}a{34,}a{34,}|a|hi!"));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{34,}", "{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>", "hi!{87,39}{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a", "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5><85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<85-5>a", "a|hi!{87,39}<85-5>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<85-5>aa|hi!{87,39}<85-5>" + "'", str2.equals("<85-5>aa|hi!{87,39}<85-5>"));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a{34,}a{34,}hi!a{34,}", "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a{34,}a{34,}hi!a{34,}a" + "'", str2.equals("a{34,}a{34,}hi!a{34,}a"));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}", "aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<85-5><85-5>a|hi!{87,39}<85-5>|a{34,}a{34,}hi!a{34,}<85-5>aa{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<85-5><85-5>a|hi!{87,39}<85-5>|a{34,}a{34,}hi!a{34,}<85-5>aa{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>" + "'", str2.equals("<85-5><85-5>a|hi!{87,39}<85-5>|a{34,}a{34,}hi!a{34,}<85-5>aa{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>"));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a", "{87,39}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<85-5><85-5>a|hi!{87,39}<85-5>|a{34,}a{34,}hi!a{34,}<85-5>aa{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>", "a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<85-5><85-5>a|hi!{87,39}<85-5>|a{34,}a{34,}hi!a{34,}<85-5>aa{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}" + "'", str2.equals("<85-5><85-5>a|hi!{87,39}<85-5>|a{34,}a{34,}hi!a{34,}<85-5>aa{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}"));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!{87,39}a{4}", "{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}a{34,}a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!{87,39}a{4}{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}a{34,}a{34,}a{34,}" + "'", str2.equals("{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!{87,39}a{4}{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}a{34,}a{34,}a{34,}"));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}", "{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}", "a|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("", "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!<85-5>ahi!a{34,}", "<85-5>a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!<85-5>ahi!a{34,}<85-5>a{34,}a{34,}" + "'", str2.equals("hi!<85-5>ahi!a{34,}<85-5>a{34,}a{34,}"));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a|hi!{87,39}", "{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a|hi!{87,39}{4}" + "'", str2.equals("a|hi!{87,39}{4}"));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!{87,39}a{4}", "<85-5><85-5>a|hi!{87,39}<85-5>|a{34,}a{34,}hi!a{34,}<85-5>aa{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!{87,39}a{4}<85-5><85-5>a|hi!{87,39}<85-5>|a{34,}a{34,}hi!a{34,}<85-5>aa{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}" + "'", str2.equals("{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!{87,39}a{4}<85-5><85-5>a|hi!{87,39}<85-5>|a{34,}a{34,}hi!a{34,}<85-5>aa{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}"));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}|", "<85-5>aa{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!<85-5>ahi!a{34,}", "aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!<85-5>ahi!a{34,}aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}" + "'", str2.equals("hi!<85-5>ahi!a{34,}aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}"));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a", "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}", "aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}" + "'", str2.equals("a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}"));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<85-5>a{34,}a{34,}", "a|hi!{87,39}{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<85-5>a{34,}a{34,}a|hi!{87,39}{4}" + "'", str2.equals("<85-5>a{34,}a{34,}a|hi!{87,39}{4}"));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}", "aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}" + "'", str2.equals("aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}"));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a|hi!{87,39}<85-5>{4}", "{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}aa{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a|hi!{87,39}<85-5>{4}{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}aa{4}" + "'", str2.equals("a|hi!{87,39}<85-5>{4}{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}aa{4}"));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("aa{34,}", "a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa{34,}a{34,}" + "'", str2.equals("aa{34,}a{34,}"));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}aa", "{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}", "{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}a{34,}a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}a{34,}a{34,}a{34,}" + "'", str2.equals("{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}a{34,}a{34,}a{34,}"));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a{34,}", "<85-5>aa{34,}a{34,}hi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a", "<85-5>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5><85-5>", "{34,}a{34,}a{34,}a{34,}|a|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!<85-5>ahi!a{34,}", "{34,}a{34,}a{34,}a{34,}|a|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>", "aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}" + "'", str2.equals("a{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}"));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}hi!a{34,}", "hi!{87,39}{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}hi!a{34,}hi!{87,39}{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}" + "'", str2.equals("aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}hi!a{34,}hi!{87,39}{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}"));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!{87,39}a{4}", "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!{87,39}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}" + "'", str2.equals("{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!{87,39}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}"));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>aa|hi!{87,39}<85-5>", "a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}a{34,}a{34,}a{34,}", "hi!<85-5>ahi!a{34,}<85-5>a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a|hi!{87,39}", "aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a|hi!{87,39}aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}" + "'", str2.equals("a|hi!{87,39}aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}"));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a{34,}", "hi!{87,39}{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a{34,}hi!{87,39}{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}" + "'", str2.equals("a{34,}hi!{87,39}{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}"));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}aa{4}", "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>aa{34,}a{34,}hi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>aa{34,}a{34,}hi!a{34,}", "<85-5>aa{34,}a{34,}hi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a{4}", "{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}a{4}|a{34,}a{34,}hi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a|hi!{87,39}<85-5>a{34,}a{34,}hi!a{34,}", "{87,39}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = st1920.automaton.RegExpMatcher.matches("|a{34,}a{34,}hi!a{34,}{87,39}a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}", "hi!<85-5>ahi!a{34,}hi!<85-5>aa|hi!<85-5>aa|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5><85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a", "|a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}a{34,}a{34,}a{34,}|a|hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{87,39}a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a|", "|a{34,}a{34,}hi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}", "{34,}a{34,}a{34,}a{34,}|a|a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}a{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("|a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}a{34,}a{34,}a{34,}|a|hi!", "a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "|a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}a{34,}a{34,}a{34,}|a|hi!a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}" + "'", str2.equals("|a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}a{34,}a{34,}a{34,}|a|hi!a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}"));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}", "{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}" + "'", str2.equals("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}"));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("|a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}a{34,}a{34,}a{34,}|a|hi!", "|a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<85-5><85-5>", "{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!{87,39}a{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<85-5><85-5>{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!{87,39}a{4}" + "'", str2.equals("<85-5><85-5>{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!{87,39}a{4}"));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("|a|", "a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}a{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "|a|a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}a{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>" + "'", str2.equals("|a|a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}a{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>"));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<85-5>aa|hi!{87,39}<85-5>", "{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<85-5>aa|hi!{87,39}<85-5>{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}" + "'", str2.equals("<85-5>aa|hi!{87,39}<85-5>{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}"));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{34,}", "hi!{87,39}a{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{34,}hi!{87,39}a{4}" + "'", str2.equals("{34,}hi!{87,39}a{4}"));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!{87,39}a{4}", "|<85-5>a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!", "|a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}a{34,}a{34,}a{34,}|a|hi!a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!|a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}a{34,}a{34,}a{34,}|a|hi!a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}" + "'", str2.equals("hi!|a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}a{34,}a{34,}a{34,}|a|hi!a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}"));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5><85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a", "a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5><85-5>a{34,}a{34,}<85-5>a{34,}a{34,}aa{34,}" + "'", str2.equals("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5><85-5>a{34,}a{34,}<85-5>a{34,}a{34,}aa{34,}"));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!<85-5>ahi!a{34,}hi!<85-5>aa|hi!<85-5>aa|", "<85-5>aa|hi!{87,39}<85-5>{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!<85-5>ahi!a{34,}hi!<85-5>aa|hi!<85-5>aa|<85-5>aa|hi!{87,39}<85-5>{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}" + "'", str2.equals("hi!<85-5>ahi!a{34,}hi!<85-5>aa|hi!<85-5>aa|<85-5>aa|hi!{87,39}<85-5>{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}"));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a{34,}a{34,}hi!a{34,}a", "{87,39}a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a{34,}a{34,}hi!a{34,}a{87,39}a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}" + "'", str2.equals("a{34,}a{34,}hi!a{34,}a{87,39}a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}"));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5><85-5>a{34,}a{34,}<85-5>a{34,}a{34,}aa{34,}", "|a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}a{34,}a{34,}a{34,}|a|hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a|hi!{87,39}<85-5>{4}{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}aa{4}", "{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a|hi!{87,39}<85-5>{4}", "{34,}a{34,}a{34,}a{34,}|a|a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}a{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a|hi!{87,39}<85-5>{4}{34,}a{34,}a{34,}a{34,}|a|a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}a{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>" + "'", str2.equals("a|hi!{87,39}<85-5>{4}{34,}a{34,}a{34,}a{34,}|a|a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}a{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>"));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!<85-5>ahi!a{34,}", "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!<85-5>ahi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}" + "'", str2.equals("hi!<85-5>ahi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}"));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}", "{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!{87,39}a{4}<85-5><85-5>a|hi!{87,39}<85-5>|a{34,}a{34,}hi!a{34,}<85-5>aa{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!{87,39}a{4}<85-5><85-5>a|hi!{87,39}<85-5>|a{34,}a{34,}hi!a{34,}<85-5>aa{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}" + "'", str2.equals("a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!{87,39}a{4}<85-5><85-5>a|hi!{87,39}<85-5>|a{34,}a{34,}hi!a{34,}<85-5>aa{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}"));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5><85-5>a|hi!{87,39}<85-5>", "<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("|", "a{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "|a{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}" + "'", str2.equals("|a{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}"));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("|a{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}", "{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "|a{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a" + "'", str2.equals("|a{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>aa|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}{4}{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{4}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a"));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!{87,39}a{4}<85-5><85-5>a|hi!{87,39}<85-5>|a{34,}a{34,}hi!a{34,}<85-5>aa{34,}a{34,}hi!a{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}<85-5>a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}", "a|hi!{87,39}<85-5>{4}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<85-5>aa|hi!{87,39}<85-5>{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}", "{87,39}a|<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!hi!{87,39}{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}a{34,}", "{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}a{34,}a{34,}a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!hi!{87,39}{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}a{34,}{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}a{34,}a{34,}a{34,}" + "'", str2.equals("{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!hi!{87,39}{34,}a{34,}a{34,}a{34,}|a|{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}a{34,}{34,}<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}ahi!{87,39}hi!<85-5>a{34,}a{34,}<85-5>a{34,}a{34,}a{34,}a{34,}a{34,}a{34,}"));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("", "a|hi!{87,39}<85-5>a{34,}a{34,}hi!a{34,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!{87,39}", "hi!<85-5>ahi!a{34,}hi!<85-5>aa|hi!<85-5>aa|");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!{87,39}hi!<85-5>ahi!a{34,}hi!<85-5>aa|hi!<85-5>aa|" + "'", str2.equals("hi!{87,39}hi!<85-5>ahi!a{34,}hi!<85-5>aa|hi!<85-5>aa|"));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!<85-5>a", "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!<85-5>aa" + "'", str2.equals("hi!<85-5>aa"));
    }
}
