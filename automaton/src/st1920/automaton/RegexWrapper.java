package st1920.automaton;

public class RegexWrapper {
	public static boolean matches(String m, REString re) {
		return RegExpMatcher.matches(m, re.getReString());
	}
}
