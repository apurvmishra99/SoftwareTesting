package st1920.automaton;

import java.util.Random;

public class MatchString {

	private String string;

	public MatchString(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public MatchString makeAlpha() {
		Random random = new Random();
		final String alpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		return new MatchString(Character.toString(alpha.charAt(random.nextInt(alpha.length()))));
	}

	public MatchString makenNum() {
		Random random = new Random();
		final String nums = "1234567890";
		return new MatchString(Character.toString(nums.charAt(random.nextInt(nums.length()))));
	}

	public MatchString makeConcatenation(MatchString p, MatchString r) {
		return new MatchString(p.getString() + r.getString());
	}
	
//	public void generateRandomAlphanumericString() {
//	    int leftLimit = 48; // numeral '0'
//	    int rightLimit = 122; // letter 'z'
//	    int targetStringLength = 10;
//	    Random random = new Random();
//	 
//	    String generatedString = random.ints(leftLimit, rightLimit + 1)
//	      .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
//	      .limit(targetStringLength)
//	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
//	      .toString();
//	 
//	    System.out.println(generatedString);
//	}
}
