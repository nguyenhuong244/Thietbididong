package Lab4;
import java.util.Scanner;
public class SanPham {
	private String tenSP;
	private double donGia;
	private double giamGia;
	
//--------------10% giá sản phẩm-----------------
	private double getThueNhapKhau()
	{
		return donGia * 0.1;
	}
//-----------------------------------------------
	 public void nhap()
	{
		Scanner bp = new Scanner (System.in);
		System.out.print("Nhập tên SP: ");
		tenSP = bp.nextLine();
		System.out.print("Nhập đơn giá: ");
		donGia = bp.nextDouble();
		System.out.print("Nhập giảm giá: ");
		giamGia = bp.nextDouble();
	}
//-----------------------------------------------	
	 public void xuat()
	{
		System.out.println("Tên Sản Phẩm: " + tenSP);
		System.out.println("Gía Sản Phẩm: " + String.valueOf(donGia));
		System.out.println("Giảm giá: " + String.valueOf(giamGia));
		System.out.println("Thuế nhập khẩu: " + String.valueOf(getThueNhapKhau()));
	}
}
