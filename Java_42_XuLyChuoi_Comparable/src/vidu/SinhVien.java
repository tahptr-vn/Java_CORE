package vidu;

public class SinhVien implements Comparable<SinhVien>{
	private int maSinhVien;
	private String hoVaTen;
	private String tenLop;
	private double diemTrungBinh;

	public int getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	public SinhVien(int maSinhVien, String hoVaTen, String tenLop, double diemTrungBinh) {
		super();
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.tenLop = tenLop;
		this.diemTrungBinh = diemTrungBinh;
	}

	public String getTen() {
		//   Tran Van Tien Phat
		String s = this.hoVaTen.trim(); // xóa dấu cách 2 đầu
		if(s.indexOf(" ") >=0) { // kiểm tra xem chuỗi có dấu khoảng trắng không
			int vt = s.lastIndexOf(" "); // lấy vị trí của dấu khoảng trắng cuối cùng
			return s.substring(vt + 1); // lấy vị trí của khoảng trắng cuối cùng + 1 ra vị trí muốn cắt
		} else {
			return s; // nếu không tìm thấy khoảng trắng thì lấy luôn chuỗi đó
		}
	}
	
	@Override
	public int compareTo(SinhVien o) {
		// < 0 
		// = 0
		// > 0
		String tenThis = this.getTen();
		String tenO = o.getTen();
		
		return tenThis.compareTo(tenO);
	}

}
