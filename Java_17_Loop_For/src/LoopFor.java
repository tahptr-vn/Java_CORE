
public class LoopFor {
	public static void main(String[] args) {
		/*	Syntax:
		 *  for(initialization : loopContinuationTest : increment) {
		 *  	Statements
		 *  }
		 */
		// Tăng dần
		for (int i = 0; i < 10; i++) {
			System.out.println("Lần lặp thứ " + i);
		}
		
		// Giảm dần
		for (int i = 10; i > 0; i--) {
			System.out.println("Lần lặp thứ " + i);
		}
	}
}
