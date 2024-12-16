
public class Main {
	public static void main(String[] args) {
		NgayChieu ngay1 = new NgayChieu(15, 05, 2022);
		NgayChieu ngay2 = new NgayChieu(31, 01, 2025);
		NgayChieu ngay3 = new NgayChieu(16, 02, 2030);
		
		HangSanXuat hangSanXuat1 = new HangSanXuat("Hãng A", "Việt Nam");
		HangSanXuat hangSanXuat2 = new HangSanXuat("Hãng B", "Mỹ");
		HangSanXuat hangSanXuat3 = new HangSanXuat("Hãng C", "Nhật Bản");
		
		BoPhim boPhim1 = new BoPhim("Bố Già", 2020, hangSanXuat1, 65000, ngay1);
		BoPhim boPhim2 = new BoPhim("Running Man", 2010, hangSanXuat2, 100000, ngay2);
		BoPhim boPhim3 = new BoPhim("Anh Trai Say Hi", 2024, hangSanXuat3, 115000, ngay3);
		
		System.out.println("So sánh giá vé bộ phim 1 rẻ hơn bộ phim 2 :" + boPhim1.kiemTraGiaVeReHon(boPhim2));
		System.out.println("So sánh giá vé bộ phim 3 rẻ hơn bộ phim 2 :" + boPhim3.kiemTraGiaVeReHon(boPhim2));

		System.out.println("Tên hãng sản xuất của bộ phim 3 :" +  boPhim3.layTenHangSanXuat());
		System.out.println("Tên hãng sản xuất của bộ phim 2 :" +  boPhim2.layTenHangSanXuat());
		System.out.println("Tên hãng sản xuất của bộ phim 1 :" +  boPhim1.layTenHangSanXuat());
		
		System.out.println("Bộ phim 1 giảm 10% : " + boPhim1.giaSauKhuyenMai(10));
		System.out.println("Bộ phim 2 giảm 20% : " + boPhim2.giaSauKhuyenMai(20));
		System.out.println("Bộ phim 3 giảm 50% : " + boPhim3.giaSauKhuyenMai(50));
	}
}
