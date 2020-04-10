package algos.reloaded;

/**
 * Josephus problem is about a theoretical problem in which, you have to find
 * that one position in which you will be last person surviving.
 * 
 * Rules are : 1) Everyone will sit in circle. 2) Each person will kill the
 * person sitting next to him/her on the left side (clockwise)
 * 
 * @author Harvinder
 *
 */
public class JosephusProblem {

	public int findLastStandingMan(int participants) {

		if (participants == 1) {
			return 1;
		}

		if (isEven(participants)) {
			return (2 * findLastStandingMan(participants / 2)) - 1;
		} else {
			return (2 * findLastStandingMan(participants / 2)) + 1;
		}

	}

	private boolean isEven(int number) {
		return (number % 2) == 0;
	}

}
