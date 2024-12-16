import java.sql.Array;
import java.util.Arrays;

public class ViDu {
	public static void main(String[] args) {
		// khởi tạo mảng
		int[] mang1 = {1,2,3};
		
//		int mang1[] = new int[3];
//		mang1[0] = 1;
//		mang1[1] = 2;
//		mang1[2] = 3;
		
//		int mang1[] = new int[] {1,2,3};
		
		// Copy mảng
		int[] mang1_a = mang1;
		mang1_a[0] = 100;
		
		System.out.println("Mảng 1 : " +Arrays.toString(mang1)); // Mảng 1 bị thay đổi theo
		System.out.println("Mảng 1_a : " +Arrays.toString(mang1_a));
		
		// Copy mảng cách 2 - dùng hàm clone
		int[] mang1_b = mang1.clone();
		mang1_b[0] = 50;
		System.out.println("Mảng 1 : " +Arrays.toString(mang1)); // Thay đổi mảng 1_b không làm thay đổi mảng 1
		System.out.println("Mảng 1_b : " +Arrays.toString(mang1_b));
		
		// Copy mảng cách 3 - dùng hàm System.arraycopy
		int mang1_c[] = new int[mang1.length];
		System.arraycopy(mang1, 0, mang1_c, 0, mang1.length);
		mang1_c[0] = 90;
		System.out.println("Mảng 1 : " +Arrays.toString(mang1));
		System.out.println("Mảng 1_c : " + Arrays.toString(mang1_c)); // Thay đổi mảng 1_c không làm thay đổi mảng 1
	
		String m1[] = {"My","Phát"};
		
		String m2[] = m1;
		m2[0] = "Tiến";
		System.out.println(Arrays.toString(m1));
		System.out.println(Arrays.toString(m2));
		
		
		String m3[] = m1.clone();
		m3[0] = "Tin";
		System.out.println(Arrays.toString(m1));
		System.out.println(Arrays.toString(m3));
		
		String m4[] = new String[m1.length];
		System.arraycopy(m1, 0, m4, 0, m1.length);
		m4[0] = "Bợm";
		System.out.println(Arrays.toString(m1));
		System.out.println(Arrays.toString(m4));
	}
}
