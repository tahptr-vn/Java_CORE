
public class HinhTron extends Hinh {
	private double r;

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public HinhTron(ToaDo toado, double r) {
		super(toado);
		this.r = r;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return Math.pow(this.r, 2)*Math.PI;
	}

}
