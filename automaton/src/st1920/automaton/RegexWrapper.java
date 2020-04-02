package st1920.automaton;

public class RegexWrapper {
	public static boolean matches(MatchString m, REString re) {
		return RegExpMatcher.matches(m.getString(), re.getReString());
	}
}
