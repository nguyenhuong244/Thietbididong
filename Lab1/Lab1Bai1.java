package Lab1;

import java.util.Scanner;

public class Lab1Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập họ và tên: ");
		String hoTen = scanner.nextLine();
		System.out.print("Điểm TB: ");
		double diemTB = scanner.nextDouble();
		System.out.print(hoTen+" ");
		System.out.print(diemTB);
		System.out.print(" Điểm.");
	}

}
