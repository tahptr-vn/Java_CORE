
public class Main {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(5, 3, 2001);
		TacGia tg1 = new TacGia("Phát", ngay1);
		Sach book1 = new Sach("Lập trình C", 5000, 2001, tg1);
		
		Ngay ngay2 = new Ngay(5, 3, 2001);
		TacGia tg2 = new TacGia("Bợm", ngay2);
		Sach book2 = new Sach("Lập trình Java", 10000, 2001, tg2);
		
		Ngay ngay3 = new Ngay(5, 3, 2001);
		TacGia tg3 = new TacGia("Tin", ngay3);
		Sach book3 = new Sach("Lập trình Mạng", 15000, 2003, tg3);
		book1.inTenSach();
		book2.inTenSach();
		book3.inTenSach();
		
		System.out.println("So sánh năm xuất bản sách 1 và 3 : " + book1.kiemTraCungNamXuatBan(book3));
		System.out.println("So sánh năm xuất bản sách 1 và 2 : " + book1.kiemTraCungNamXuatBan(book2));
		
		System.out.println("Sách 1 giảm giá 10%: " + book1.giaSauKhiGiam(10));
		System.out.println("Sách 2 giảm giá 20%: " + book2.giaSauKhiGiam(20));
		System.out.println("Sách 3 giảm giá 50%: " + book3.giaSauKhiGiam(50));
	}
}
