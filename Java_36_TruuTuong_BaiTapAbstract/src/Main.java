
public class Main {
	public static void main(String[] args) {
		HangSanXuat h1 = new HangSanXuat("Hãng 1", "Việt Nam");
		HangSanXuat h2 = new HangSanXuat("Hãng 2", "USA");
		HangSanXuat h3 = new HangSanXuat("Hãng 3", "Nhật Bản");
		
		PhuongTienDiChuyen p1 = new MayBay("Xăng", h1);
		PhuongTienDiChuyen p2 = new XeOTo(h2, "Xăng");
		PhuongTienDiChuyen p3 = new XeDap(h3);
		MayBay p4 = new MayBay("Xăng", h2);
		
		System.out.println("Láy hãng sản xuất: ");
		System.out.println("p1: " + p1.layTenHangSanXuat());
		
		System.out.println("Bắt đầu:");
		p2.batDau();
		
		System.out.println("Lấy vận tốc: ");
		System.out.println("p1 : " + p1.layVanToc());
		System.out.println("p2 : " + p2.layVanToc());
		System.out.println("p3 : " + p3.layVanToc());
		
		// Nếu muốn sử dụng phương thức riêng thì phải khởi tạo đối tượng riêng của nó
		System.out.println("Cất cánh :");
		p4.catCanh();
	}
}
