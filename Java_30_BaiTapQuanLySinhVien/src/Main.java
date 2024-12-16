
public class Main {
	public static void main(String[] args) {
		NgaySinh ngay1 = new NgaySinh(5, 3, 2001);
		NgaySinh ngay2 = new NgaySinh(7, 3, 2001);
		NgaySinh ngay3 = new NgaySinh(7, 3, 2001);
		
		Lop lop1 = new Lop("DH01", "Khoa kinh tế");
		Lop lop2 = new Lop("DH02", "Khoa CNTT");
		Lop lop3 = new Lop("DH03", "Khoa du lịch");
		
		SinhVien sv1 = new SinhVien("0001", "Trần Văn Tiến Phát", ngay1, 9.5, lop2);
		SinhVien sv2 = new SinhVien("0002", "Lê Thị Trà My", ngay2, 8.5, lop1);
		SinhVien sv3 = new SinhVien("0003", "Trần Văn A", ngay3, 3.5, lop3);
		
		System.out.println(sv1.layTenKhoa());
		System.out.println(sv2.layTenKhoa());
		System.out.println(sv3.layTenKhoa());
		
		System.out.println("Kiểm tra sinh viên 1 đạt ĐTB >=5 :" + sv1.kiemTraThiDat());
		System.out.println("Kiểm tra sinh viên 2 đạt ĐTB >=5 :" + sv2.kiemTraThiDat());
		System.out.println("Kiểm tra sinh viên 3 đạt ĐTB >=5 :" + sv3.kiemTraThiDat());
		
		System.out.println("Kiểm tra ngày sinh của sv1 và sv3 " + sv1.kiemTraCungNgaySinh(sv2));
		System.out.println("Kiểm tra ngày sinh của sv2 và sv3 " + sv2.kiemTraCungNgaySinh(sv3));
	}
}
