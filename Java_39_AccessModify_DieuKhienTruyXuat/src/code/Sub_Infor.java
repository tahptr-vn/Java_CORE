package code;

public class Sub_Infor extends Information{

	public void method() {
//		super.a => private không thể truy xuất được từ lớp con
		super.b = 3; // default có thể truy xuất được vì nó chung 1 gói nếu khác gói sẽ không được
		super.c = 3; // protected có thể truy xuất được từ lớp con
		super.d = 3; // public có thể truy xuất được từ lớp con
	}
}
