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
