
public class Test {
	public static void main(String[] args) {
		HoaDonCaPhe hd = new HoaDonCaPhe("Trung Nguyên", 100000, 1.5);
		HoaDonCaPhe hd2 = new HoaDonCaPhe("Trung Nguyên", 100000, 5.5);
		System.out.println("Tổng tiền : "+ hd.tinhTongTien());
		System.out.println("Tổng tiền : "+ hd2.tinhTongTien());
		System.out.println("Kiểm tra khổi lượng > 2kg : " + hd.kiemTraKhoiLuongLonHon(2));
		System.out.println("Kiểm tra khổi lượng > 1kg : " + hd.kiemTraKhoiLuongLonHon(1));
		
		System.out.println("Kiểm tra tổng tiền > 500K : " + hd2.kiemTraTongTienLonHon500K());
		System.out.println("Giảm giá hóa đơn : " + hd.giamGia(10));
		System.out.println("Giảm giá hóa đơn : " + hd2.giamGia(10));
		
		System.out.println("Giá tổng tiền sau khi giảm giá : " + hd.giaSauKhiGiam(10));
		System.out.println("Giá tổng tiền sau khi giảm giá : " + hd2.giaSauKhiGiam(10));
	}
}
