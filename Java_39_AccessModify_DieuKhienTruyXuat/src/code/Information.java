package code;

public class Information {
	private int a; // có thể truy xuất trong lớp hiện tại
	int  b; // có thể truy xuất bên trong gói của nó hiên tại là gói code
	protected int c; // khi lớp con kế thừa từ lớp cha có thể truy xuất, nếu nằm ngoài gói thì không thể truy xuất
	public int d; // ở đâu cũng có thể gọi để truy xuất
	
	public void method() {
		this.a = 1;
		this.b = 2;
		this.c = 3;
		this.d = 4;
	}
}
