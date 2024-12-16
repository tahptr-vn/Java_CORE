import java.util.Scanner;

public class LoopDoWhile {
	public static void main(String[] args) {
		/*
		 * while/for sẽ kiểm tra đầu tiên còn dowhile sẽ kiểm tra sau
		 * vòng lặp while/for sẽ không được thực thi nếu điều kiện không thõa mãn còn dowhile sẽ thực thi ít nhất 1 lần 
		 * Syntax:
		 * do {
		 * 		Statement(s)
		 * }
		 * while (Condition);
		 */
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhập vào n > 0 :");
			n = sc.nextInt();
		} while (n <= 0);
	}
}
