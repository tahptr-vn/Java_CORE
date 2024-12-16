
public class TacGia {
	private String ten;
	private Ngay ngaySinh;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public Ngay getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Ngay ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public TacGia(String ten, Ngay ngaySinh) {
		super();
		this.ten = ten;
		this.ngaySinh = ngaySinh;
	}
	
	
}
