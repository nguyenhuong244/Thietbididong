package Lab2;
import java.util.Scanner;
public class Bai2 {

	public static void main(String[] args) {
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
		} else {
			if(Delta < 0) {
				System.out.print("Phương trình vô nghiệm.");
			} else if(Delta==0){
				X1 = (-b / (2 * a));
	            System.out.println("Phương trình có nghiệm kép: " + "X1 = X2 = " + X1);
			} else {
				X1 = ((-b + Math.sqrt(Delta)) / (2*a));
	            X2 = ((-b - Math.sqrt(Delta)) / (2*a));
	            System.out.println("Phương trình có 2 nghiệm là: " + "X1 = " + X1 + " và X2 = " + X2);
			}
		}
		
			
	}

}
