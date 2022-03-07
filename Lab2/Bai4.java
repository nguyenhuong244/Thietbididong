package Lab2;
import java.util.Scanner;
public class Bai4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lc;
		do {
			System.out.println("1: Giải phương trình bậc nhất");
			System.out.println("2: Giải phương trình bậc 2");
			System.out.println("3: Tính tiền điện");
			System.out.println("4: Kết thúc");
			System.out.print("Nhập lựa chọn của bạn: ");
			lc = scanner.nextInt();
			switch (lc) {
			case 1:
				giaiPTB1();
				break;
			case 2:
				giaiPTB2();
				break;
			case 3:
				TienDien();
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Vui lòng chọn từ 1 đến 4!");
				break;
			}
		}while(lc!=4);

	}
	private static void giaiPTB1() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Hệ số a: ");
		double a = scanner.nextDouble();
		System.out.print("Hệ số b: ");
		double b = scanner.nextDouble();
		
		double x = 0;
		if (a==0) {
			if (b==0) {
				System.out.println("Phương trình vô số nghiệm.");
			}
			else {
				System.out.println("Phương trình vô nghiệm.");
			}
		}
		else {
			x = -b/a;
			System.out.println("Phương trình có nghiệm là: "+ x);
		}
	}
	private static void giaiPTB2() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Hệ số a: ");
		double a = scanner.nextDouble();
		System.out.print("Hệ số b: ");
		double b = scanner.nextDouble();
		System.out.print("Hệ số c: ");
		double c = scanner.nextDouble();
		
		double X1 = 0;	
		double X2 = 0;
		double Delta = b * b - 4 * a * c;
		
		if(a==0) {
			if (b==0) {
                System.out.println("Phương trình vô nghiệm.");
            } else {
                System.out.println("Phương trình có một nghiệm: " + "x = " + (-c / b));
            }
		} 
		else {
			if(Delta < 0) {
				System.out.println("Phương trình vô nghiệm.");
			} 
			else if(Delta==0){
				X1 = (-b / (2 * a));
	            System.out.println("Phương trình có nghiệm kép: " + "X1 = X2 = " + X1);
			} 
			else {
				X1 = ((-b + Math.sqrt(Delta)) / (2*a));
	            X2 = ((-b - Math.sqrt(Delta)) / (2*a));
	            System.out.println("Phương trình có 2 nghiệm là: " + "X1 = " + X1 + " và X2 = " + X2);
			}
		}
	}
	private static void TienDien() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số điện sử dụng của tháng: ");
		double soDien = scanner.nextDouble();
		double tien;
		if (soDien<50) {
			tien= soDien*1000;
			System.out.println("Số tiền điện đã sử dụng là: "+ tien);
		}
		else {
			tien = 50*1000 +(soDien-50)*1200;
			System.out.println("Số tiền điện đã sử dụng là: "+ tien);
		}
	}

}
