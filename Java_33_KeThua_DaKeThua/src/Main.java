
public class Main {
	public static void main(String[] args) {
		NguoIVietNam vn = new NguoIVietNam("Phát", 2001);
		NguoiMy my = new NguoiMy("Ryan", 2001);
		NguoiNhatBan jp = new NguoiNhatBan("Kyo", 2001);
		
		vn.xinChao();
		my.xinChao();
		jp.xinChao();
		HocSinh hs = new HocSinh("A", 2002);
		hs.xinChao();
	}
}
