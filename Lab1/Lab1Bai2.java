package Lab1;
import java.util.Scanner;
public class Lab1Bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chiều dài HCN: ");
		Double dai = scanner.nextDouble();
		System.out.print("Nhập chiều rộng HCN: ");
		Double rong = scanner.nextDouble();	
		Double CV = (dai + rong) * 2;
		Double DT = (dai * rong);
		System.out.println("Chu vi HCN: " + CV);
		System.out.println("Dien tich HCN: " + DT);
		System.out.print("Cạnh nhỏ nhất là :" + Math.min(dai, rong));
	}
}
