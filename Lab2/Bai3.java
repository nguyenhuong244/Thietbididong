package Lab2;
import java.util.Scanner;
public class Bai3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số điện sử dụng của tháng: ");
		double soDien = scanner.nextDouble();
		double tien;
		if (soDien<50) {
			tien= soDien*1000;
			System.out.print("Số tiền điện đã sử dụng là: "+ tien);
		}
		else {
			tien = 50*1000 +(soDien-50)*1200;
			System.out.print("Số tiền điện đã sử dụng là: "+ tien);
		}
	}

}
