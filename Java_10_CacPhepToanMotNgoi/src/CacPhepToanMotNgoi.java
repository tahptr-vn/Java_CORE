
public class CacPhepToanMotNgoi {
	public static void main(String[] args) {
		int a = 5;
		boolean b = false;
		System.out.println("- => giá trị:" + (-a));
		System.out.println("+ => giá trị:" + (+a));
		System.out.println("! => giá trị:" + (!b));
		System.out.println("----------------------");
		System.out.println("a = " + a);
		System.out.println("++a = " + (++a)); // cộng giá trị trước rồi xuất ra giá trị đã cộng => 6
		System.out.println("a++ = " + (a++)); // xuất ra giá trị trước rồi mới cộng vào biến => 6
		
		System.out.println("a = " + a); // xuất ra giá trị đã được cộng từ a++ => 7
		System.out.println("--a = " + (--a)); // trừ giá trị trước rồi xuất ra giá trị đã trừ => 6
		System.out.println("a-- = " + (a--)); // xuất ra giá trị trước rồi mới trừ vào biến => 6
		System.out.println("a = " + a); // xuất ra giá trị đã được cộng từ a-- => 5
	}
}
