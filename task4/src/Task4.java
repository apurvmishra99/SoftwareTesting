import st1920.automaton;
import org.junit.Test;
import static org.junit.Assert;

public class Task4 {



	@Test
	public void TestmatchUnix() {
		REString reString = new REString("$");
		MatchString mString = new MatchString("\n");
		assert(RegexWrapper.matches(mString, reString));
	}

	@Test
	public void TestmatchMacOS() {
		REString reString = new REString("$");
		MatchString mString = new MatchString("\r");
        assert(RegexWrapper.matches(mString, reString));
	}

	@Test
	public void testMatchWindows() {
		REString reString = new REString("$");
		MatchString mString = new MatchString("\r\n");
        assert(RegexWrapper.matches(mString, reString));
	}

	public void testMatchDollar() {
		REString reString = new REString("$");
		MatchString mString = new MatchString("$");
        assert(RegexWrapper.matches(mString, reString));
	}

	public void testMatchOr() {
		REString reString = new REString("*");
		MatchString mString = new MatchString("$");
        assert(RegexWrapper.matches(mString, reString));
	}

    // TODO: Add tests for ., #, <n-m>


