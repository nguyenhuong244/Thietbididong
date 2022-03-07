package Lab4;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
				// câu 2 : bên sản phẩm
				//khai báo tạo 2 đối tượng
//				SanPham sp1 = new SanPham();
//				SanPham sp2 = new SanPham();
//				sp1.nhap();
//		    	sp2.nhap();		
//				sp1.xuat();
//				sp2.xuat();
				
//------------------------------------------------------------------------		
				// câu 3 : bên hàng hóa ( tạo cứng )
//				HangHoa hh1 = new HangHoa("hh1", 4000);
//				HangHoa hh2 = new HangHoa("hh2", 4000, 0.1);
				
				//----------- nhập-----------------
				HangHoa hh1 = new HangHoa();
				HangHoa hh2 = new HangHoa();
				
				Scanner bp = new Scanner(System.in);
				System.out.println("------------------------------");
				System.out.print("SP1: Tên: ");
				String tenHang= bp.nextLine();
				hh1.setTenHH(tenHang);
				
				System.out.print("SP1: Giá: ");
				hh1.setDonGia( bp.nextDouble() );
				
				System.out.print("SP1: giảm Giá: ");
				hh1.setGiamGia( bp.nextDouble() );
				
				System.out.println("------------------------------");
				String s = bp.nextLine();
				System.out.print("SP2: Tên: ");
				hh2.setTenHH(bp.nextLine());
				
				System.out.print("SP2: Giá: ");
				hh2.setDonGia( bp.nextDouble() );
				
				System.out.print("SP2: giảm Giá: ");
				hh2.setGiamGia( bp.nextDouble() );
				
////				 Xuất thông tin 
				System.out.println("=============");
				System.out.println("Tên sản phẩm 1: " + hh1.getTenHH());
				System.out.println("Giá sản phẩm 1: " + hh1.getDonGia() );
				System.out.println("Giảm giá: " + hh1.getGiamGia());
				System.out.println("Thuế nhập khẩu:" + hh1.getDonGia()*0.1 );
				System.out.println("=============");
				System.out.println("Tên sản phẩm 2: " + hh2.getTenHH());
				System.out.println("Giá sản phẩm 2: " + hh2.getDonGia());
				System.out.println("Giảm giá: " + hh2.getGiamGia());
				System.out.println("Thuế nhập khẩu:" + hh2.getDonGia()*0.1 );

	}

}
