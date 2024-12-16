import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MangArray {
	public static void main(String[] args) {
		// khai bao cách nào cũng được
		double[] mang1;
		double mang2[];
		double []mang3;
		
		mang1 = new double[10]; // kiểu dữ liệu nào thì khởi tạo new mảng theo kiểu dữ liệu đó
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mang1.length; i++) {
			System.out.println("Nhập vào phần tử thứ " + i + " :");
			mang1[i] = sc.nextDouble();
		}
		double tong = 0;
		for (int i = 0; i < mang1.length; i++) {
			tong += mang1[i];
		}
		System.out.println("Tổng các phần tử trong mảng : " + tong);
		
		// Khởi tạo bằng cách gán phần tử vào mảng
		mang2 = new double[] {1,2,3,4,5};
		
		System.out.println("Mảng 2: ");
		for (int i = 0; i < mang2.length; i++) {
			System.out.println(mang2[i]);
		}
	}
}
