
public class Break_Continue_Return {
	// break Unlabel
//	public static void main(String[] args) {
//		int out, in = 0;
//		for (out = 0; out < 10; out++) {
//			for (in = 0; in < 20; in++) {
//				if (in > 10)
//					break;
//			}
//			System.out.println("bên trong vòng lặp out: out = " + out + ", in = " + in);
//		}
//		System.out.println("bên ngoài vòng lặp out: out = " + out + ", in = " + in); 
//	}

	// break Label
//	public static void main(String[] args) {
//		int out, in = 0;
//		outer: for (out = 0; out < 10; out++) {
//			for (in = 0; in < 20; in++) {
//				if (in > 10)
//					break outer;
//			}
//			System.out.println("bên trong vòng lặp out: out = " + out + ", in = " + in);
//		}
//		System.out.println("bên ngoài vòng lặp out: out = " + out + ", in = " + in); 
//	}

	// continue unlabel
//	public static void main(String[] args) {
//		int max = 100;
//		for (int i = 0; i < max; i++) {
//			if(i<50)
//				continue;
//			System.out.println(i);
//		}
//	}

	// continue label
//	public static void main(String[] args) {
//		outer: for (int i = 2; i < 10; i++) {
//			System.out.println("Bảng cửu chương " + i);
//			for (int j = 1; j <= 10; j++) {
//				if(j>5)
//					continue outer;
//				System.out.println(i + " * " + j + " = " + (i*j));
//			}
//			System.out.println("---------------------");
//		}
//	}
	
	// return
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			System.out.println("Bảng cửu chương " + i);
			for (int j = 1; j <= 10; j++) {
				if(j>5)
					return; // khi j= 6 thì nó sẽ ngưng luôn chương trình không làm gì bên dưới nữa
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			System.out.println("---------------------");
		}
		System.out.println("Kết thúc");
	}
}
