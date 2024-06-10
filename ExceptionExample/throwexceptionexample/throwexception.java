package throwexceptionexample;
import java.lang.Exception;
public class throwexception {
	private int score;

	public int getScore() {
		return score;
	}

	public void setScore(int score1)throws ArithmeticException,ArrayIndexOutOfBoundsException {
		try {
			if(score1%2 == 0) {
				throw new Exception();
			}
			else {
				this.score = score1;
			}
		}catch(Exception r) {
			System.out.println("Even numbers are not Acceptable, We Want Odd numbers only!");
		}
	}
}
