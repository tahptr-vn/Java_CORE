
public class Main {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		System.out.println(mm.timMin(2, 3));
		System.out.println(mm.timMin(2.0, 1));
		System.out.println(mm.tinhTong(3,4));
		double a[] = new double[] {1,2,3,4,5};
		System.out.println(mm.tinhTong(a));
	}
}
