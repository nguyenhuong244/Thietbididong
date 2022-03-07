package Lab1;
import java.util.Scanner;
public class Lab1Bai4 {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập a: ");
		float a = nhap.nextFloat();
		System.out.print("Nhập b: ");
		float b = nhap.nextFloat();
		System.out.print("Nhập c: ");
		float c = nhap.nextFloat();
		float Delta = b * b - 4 * a * c;
		System.out.println("Căn delta: " + Math.sqrt(Delta));
	}
}
