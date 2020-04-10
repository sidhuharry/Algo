package algos.reloaded;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class JosephusProblemTest {

	private static JosephusProblem theProblem;

	@BeforeClass
	public static void setup() {
		theProblem = new JosephusProblem();
	}

	@Test
	public void testWithEvenParticipants() {
		Assert.assertEquals(17, theProblem.findLastStandingMan(20));
	}

}
