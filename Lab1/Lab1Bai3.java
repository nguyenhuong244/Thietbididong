package Lab1;
import java.util.Scanner;
public class Lab1Bai3 {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập cạnh: ");
		float canh = nhap.nextFloat();
		System.out.println("Thể tích khối lập phương: " + (Math.pow(canh, 3)));
		//System.out.println("Thể tích khối lập phương: " + canh*canh*canh);
	}
}
