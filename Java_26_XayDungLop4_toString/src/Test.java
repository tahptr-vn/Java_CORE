
public class Test {
	public static void main(String[] args) {
		MyDate md1 = new MyDate(15, 5, 2025);
		MyDate md2 = new MyDate(11, 1, 2024);
		MyDate md3 = new MyDate(12, 1, 2024);
		
		//2 cách dùng cách nào cũng được
		System.out.println(md1.toString());
		System.out.println(md2);
		System.out.println(md3);
	}
}
