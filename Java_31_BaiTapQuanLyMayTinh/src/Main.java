
public class Main {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(15,8,2025);
		Ngay ngay2 = new Ngay(1,3,2025);
		Ngay ngay3 = new Ngay(6,9,2025);
		
		QuocGia quocGia1 = new QuocGia("VN", "Việt Nam");
		QuocGia quocGia2 = new QuocGia("USA", "Hoa Kỳ");
		QuocGia quocGia3 = new QuocGia("JP", "Nhật Bản");
		
		HangSanXuat hsx1 = new HangSanXuat("VNLaptop", quocGia1);
		HangSanXuat hsx2 = new HangSanXuat("Macbook", quocGia2);
		HangSanXuat hsx3 = new HangSanXuat("Dell", quocGia3);
		
		MayTinh mt1 = new MayTinh(hsx1, ngay1, 1500, 12);
		MayTinh mt2 = new MayTinh(hsx2, ngay1, 2000, 24);
		MayTinh mt3 = new MayTinh(hsx3, ngay1, 1000, 12);
		
		System.out.println("So sánh giá MT1 < MT2 : " + mt1.kiemTraGiaThapHon(mt2));
		System.out.println("So sánh giá MT2 < MT3 : " + mt2.kiemTraGiaThapHon(mt3));
		
		System.out.println("Tên quốc gia MT1 : " + mt1.layTenQuocGia());
		System.out.println("Tên quốc gia MT2 : " + mt2.layTenQuocGia());
		System.out.println("Tên quốc gia MT3 : " + mt3.layTenQuocGia());
	}
}
