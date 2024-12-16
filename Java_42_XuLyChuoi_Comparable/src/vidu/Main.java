package vidu;

public class Main {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(100, "Trần Văn Tiến Phát", "Lớp 1", 9);
		SinhVien sv2 = new SinhVien(100, "Lê Thị Trà My", "Lớp 2", 8);
		SinhVien sv3 = new SinhVien(100, "Anh", "Lớp 2", 8);
		System.out.println(sv1.compareTo(sv2));
		System.out.println(sv1.compareTo(sv3));
	}
}
