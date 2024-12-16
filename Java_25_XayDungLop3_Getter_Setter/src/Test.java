
public class Test {
	public static void main(String[] args) {
		MyDate date = new MyDate(31, 2, 2024);
		System.out.println("Day = " + date.getDay());
		date.setDay(35);
		System.out.println("Day = " + date.getDay());
		date.setDay(30);
		System.out.println("Day = " + date.getDay());
		
		System.out.println("Month = " + date.getMonth());
		date.setMonth(13);
		System.out.println("Month = " + date.getMonth());
		date.setMonth(4);
		System.out.println("Month = " + date.getMonth());
	}
}
