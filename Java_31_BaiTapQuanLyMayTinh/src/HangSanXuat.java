
public class HangSanXuat {
	private String tenHangSanXuat;
	private QuocGia quocGia;

	public String getTenHangSanXuat() {
		return tenHangSanXuat;
	}

	public void setTenHangSanXuat(String tenHangSanXuat) {
		this.tenHangSanXuat = tenHangSanXuat;
	}

	public QuocGia getQuocGia() {
		return quocGia;
	}

	public void setQuocGia(QuocGia quocGia) {
		this.quocGia = quocGia;
	}

	public HangSanXuat(String tenHangSanXuat, QuocGia quocGia) {
		super();
		this.tenHangSanXuat = tenHangSanXuat;
		this.quocGia = quocGia;
	}

}
