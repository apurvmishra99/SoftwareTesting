import st1920.automaton;
import org.junit.Test;
import static org.junit.Assert;

public class Task4 {



	@Test
	public void TestmatchUnix() {
		REString reString = new REString("$");
		assert(REGEXWrapper.matches("\n", reString));
	}

	@Test
	public void TestmatchMacOS() {
		REString reString = new REString("$");
		
        assert(REGEXWrapper.matches("\r", reString));
	}

	@Test
	public void testMatchWindows() {
		REString reString = new REString("$");
        assert(REGEXWrapper.matches("\r\n", reString));
	}

	public void testMatchDollar() {
		REString reString = new REString("$");
		
        assert(REGEXWrapper.matches("$", reString));
	}

	public void testMatchOr() {
		REString reString = new REString("*");
		
        assert(REGEXWrapper.matches("$", reString));
	}

	public void testMatchDollar() {
		REString reString = new REString("$");
		
        assert(REGEXWrapper.matches("$", reString));
	}

    // TODO: Add tests for ., #, <n-m>

}