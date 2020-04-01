package st1920.automaton;

import java.util.Random;

public class REString {

	private String reString;

	public REString(String reString) {
		this.reString = reString;
	}

	public String getReString() {
		return reString;
	}

	public void setReString(String reString) {
		this.reString = reString;
	}

	public static REString makeAlpha(REString re) {
		Random random = new Random();
		final String alphaNum = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		return new REString(re.getReString() + Character.toString(alphaNum.charAt(random.nextInt(alphaNum.length()))));
	}

	public REString makeRange(REString re) {
		Random random = new Random();
		return new REString(re.getReString() + String.format("<%d-%d>", random.nextInt(1000), random.nextInt(1000)));
	}

	public REString makeRepeatRange(REString re) {
		Random random = new Random();
		return new REString(re.getReString() + String.format("{%d,%d}", random.nextInt(1000), random.nextInt(1000)));
	}

	public REString makeRepeatMoreThan(REString re) {
		Random random = new Random();
		return new REString(re.getReString() + String.format("{%d,}", random.nextInt(1000)));
	}

	public REString makeRepeatExact(REString re) {
		Random random = new Random();
		return new REString(re.getReString() + String.format("{%d}", random.nextInt(1000)));
	}

	public REString makeConcatenation(REString re1, REString re2) {
		return new REString(re1.getReString() + re2.getReString());
	}

	public REString makeZeroOrMore(REString re) {
		return new REString(re.getReString() + "*");
	}

	public REString makeOneOrMore(REString re) {
		return new REString(re.getReString() + "+");
	}

	public REString makeZeroOrOne(REString re) {
		return new REString(re.getReString() + "?");
	}

	public REString makeExclude(REString re) {
		return new REString("~" + re.getReString());
	}

	public REString makeClass(REString re) {
		return new REString("[" + re.getReString() + "]");
	}

	public REString makeExcludeClass(REString re) {
		return new REString("[^" + re.getReString() + "]");
	}

	public REString makeAnyChar(REString re) {
		return new REString(re.getReString() + ".");
	}

	public REString makeNothing(REString re) {
		return new REString(re.getReString() + "#");
	}

	public REString makeAny(REString re) {
		return new REString(re.getReString() + "@");
	}

	public REString makeGroup(REString re) {
		return new REString("(" + re.getReString() + ")");
	}

}
