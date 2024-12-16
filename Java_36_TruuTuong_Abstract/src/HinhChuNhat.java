
public class HinhChuNhat extends Hinh {
	private double chieuRong;
	private double chieuCao;

	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}

	public double getChieuCao() {
		return chieuCao;
	}

	public void setChieuCao(double chieuCao) {
		this.chieuCao = chieuCao;
	}

	public HinhChuNhat(ToaDo toado, double chieuRong, double chieuCao) {
		super(toado);
		this.chieuRong = chieuRong;
		this.chieuCao = chieuCao;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return this.chieuCao*this.chieuRong;
	}

}
