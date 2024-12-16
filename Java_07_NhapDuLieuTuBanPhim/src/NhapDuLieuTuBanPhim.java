import java.util.Scanner;

public class NhapDuLieuTuBanPhim {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // System.in là nhập dữ liệu từ bàn phím
		
		System.out.println("Nhập vào họ và tên:");
		String hoVaTen = sc.nextLine();
		System.out.println("Nhập mã sinh viên:");
		long maSinhVien = sc.nextLong();
		System.out.println("Nhập vào điểm thi:");
		float diemThi = sc.nextFloat();
		
		System.out.println("----------------------");
		System.out.println("Họ và tên:" + hoVaTen);
		System.out.println("Mã sinh viên: " + maSinhVien);
		System.out.println("Điểm thi: " + diemThi);
	}
}
