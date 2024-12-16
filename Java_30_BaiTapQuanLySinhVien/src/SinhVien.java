
public class SinhVien {
	private String mssv;
	private String hoVaTen;
	private NgaySinh ngaySinh;
	private double diemTrungBinh;
	private Lop lop;
	public String getMssv() {
		return mssv;
	}
	public void setMssv(String mssv) {
		this.mssv = mssv;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public NgaySinh getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(NgaySinh ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}
	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	public Lop getLop() {
		return lop;
	}
	public void setLop(Lop lop) {
		this.lop = lop;
	}
	public SinhVien(String mssv, String hoVaTen, NgaySinh ngaySinh, double diemTrungBinh, Lop lop) {
		super();
		this.mssv = mssv;
		this.hoVaTen = hoVaTen;
		this.ngaySinh = ngaySinh;
		this.diemTrungBinh = diemTrungBinh;
		this.lop = lop;
	}
	
	public String layTenKhoa() {
		return this.lop.getTenKhoa();
	}
	
	public boolean kiemTraThiDat() {
		return this.diemTrungBinh >= 5;
	}
	
	public boolean kiemTraCungNgaySinh(SinhVien sv) {
		return this.ngaySinh.equals(sv.ngaySinh);
	}
}
