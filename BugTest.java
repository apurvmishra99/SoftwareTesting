import st1920.automaton.*;

//import static org.junit.Assert.assertTrue;
//
//import org.junit.*;

public class BugTest {

	
	public static void test1() {
		try {
			boolean bool = RegExpMatcher.matches("1", "");
			System.out.println(bool);
		}
		catch (java.lang.IllegalStateException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		test1();
	}
}