package code;

public class ViDu {
	private Information info;
	
	public void method() {
//		this.info.a => private không truy xuất được từ class khác
		this.info.b = 3; // default có thể truy xuất được từ class khác
		this.info.c = 3; // protected có thể truy xuất được từ class khác
		this.info.d = 3; // public có thể truy xuất được từ class khác
	}
}
