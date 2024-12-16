
public class Main {
	public static void main(String[] args) {
		System.out.println("Class Con người");
		ConNguoi cn = new ConNguoi("Trần Văn Tiến Phát", 2001);
		cn.an();
		cn.ngu();
		cn.uong();
		System.out.println("Class Học sinh");
		HocSinh hs = new HocSinh("Lê Thị Trà My", 2001, "22KETOAN", "UEH");
		hs.an();
		hs.ngu();
		hs.uong();
		hs.lamBaiTap();
	}
}
