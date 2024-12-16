
public abstract class Hinh {
	protected ToaDo toado;

	public Hinh(ToaDo toado) {
		super();
		this.toado = toado;
	}

	public ToaDo getToado() {
		return toado;
	}

	public void setToado(ToaDo toado) {
		this.toado = toado;
	}
	
	public abstract double tinhDienTich();
	
	public double tinhChuVi() {
		return 10;
	}
}
