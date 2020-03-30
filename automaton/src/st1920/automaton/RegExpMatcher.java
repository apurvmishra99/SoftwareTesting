package st1920.automaton;

import java.util.Random;

/**
 * Utility class to provide a simple interface to the package.
 */
public class RegExpMatcher {
	/**
	 * Tells whether the string <code>m</code> matches the regular expression
	 * <code>re</code>.
	 * 
	 * @param m  string to be matched
	 * @param re regular expression
	 */
	public static boolean matches(String m, String re) {
		RegExp regExp = new RegExp(re);
		Automaton a = regExp.toAutomaton();
		return a.run(m);
	}

	public static String makeAlpha() {
		Random random = new Random();
		final String alphaNum = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		return Character.toString(alphaNum.charAt(random.nextInt(alphaNum.length())));
	}

	public static String makeSpecial() {
		Random random = new Random();
		final String specialChars = "|!@#$%^&*+?";
		return Character.toString(specialChars.charAt(random.nextInt(specialChars.length())));
	}

	public static String makeRange() {
		Random random = new Random();
		return String.format("<%d-%d>", random.nextInt(100), random.nextInt(100));
	}

	public static String makeRepeatRange() {
		Random random = new Random();
		return String.format("{%d,%d}", random.nextInt(100), random.nextInt(100));
	}

	public static String makeRepeatMoreThan() {
		Random random = new Random();
		return String.format("{%d,}", random.nextInt(100));
	}

	public static String makeRepeatExact() {
		Random random = new Random();
		return String.format("{%d}", random.nextInt(100));
	}

	public static String makeConcatenation(String l, String r) {
		return l + r;
	}
}
