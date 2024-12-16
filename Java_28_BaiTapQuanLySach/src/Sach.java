
public class Sach {
	private String tenSach;
	private double giaBan;
	private int namXuatBan;
	private TacGia tacGia;

	public Sach(String sach, double giaBan, int namXuatBan, TacGia tacGia) {
		super();
		this.tenSach = sach;
		this.giaBan = giaBan;
		this.namXuatBan = namXuatBan;
		this.tacGia = tacGia;
	}

	public String getSach() {
		return tenSach;
	}

	public void setSach(String sach) {
		this.tenSach = sach;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

	public int getNamXuatBan() {
		return namXuatBan;
	}

	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}

	public TacGia getTacGia() {
		return tacGia;
	}

	public void setTacGia(TacGia tacGia) {
		this.tacGia = tacGia;
	}

	public void inTenSach() {
		System.out.println(this.tenSach);
	}

	public boolean kiemTraCungNamXuatBan(Sach sach) {
		return this.namXuatBan == sach.namXuatBan;
	}

	public double giaSauKhiGiam(double x) {
		return this.giaBan - (this.giaBan * (x / 100));
	}

	@Override
	public String toString() {
		return this.tenSach + ", " + this.giaBan + ", " + this.namXuatBan + ", " + this.tacGia;
	}
}
