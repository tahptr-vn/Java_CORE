import java.util.Scanner;

public class ToanTu3Ngoi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào giá trị cần kiểm tra số chẵn : ");
		int a = sc.nextInt();
		
		String ketQua = a%2==0 ? a+" là số chẵn" : a+" không phải là số chẵn"; // Toán tử 3 ngôi
		System.out.println(ketQua);
	}
}
