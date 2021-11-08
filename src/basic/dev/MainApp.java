package basic.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Nhap thong tin sinh vien
		System.out.println("Nhap ten sinh vien : ");
		String nameSv = sc.nextLine();
		System.out.println("Nhap ma sinh vien : ");
		String maSv = sc.nextLine();
		System.out.println("Nhap CMND sinh vien : ");
		String soCmnd = sc.nextLine();
		System.out.println("Nhap ten lop : ");
		String tenLop = sc.nextLine();
		System.out.println("Nhap ten truong : ");
		String tenTruong = sc.nextLine();
		System.out.println("Diem TB : ");
		float diemTb = Float.parseFloat(sc.nextLine());
		
		
//		In thong tin sinh vien
		
		System.out.println("Thong tin sinh vien :");
		System.out.println("Ten : " + nameSv );
		System.out.println("MaSV : " + maSv);
		System.out.println("CMDN : " + soCmnd);
		System.out.println("Ten lop : "+ tenLop);
		System.out.println("Ten Truong : "+ tenTruong);
		System.out.println("Diem TB : "+ diemTb);
		System.out.println("..................................");
//		Thong tin cong nhan
		
		System.out.println("Nhap ten cong nhan : ");
		String nameCongNhan = sc.nextLine();
		System.out.println("Nhap dia chi cong nhan : ");
		String diaChi = sc.nextLine();
		System.out.println("Nhap SDT : ");
		String soDT = sc.nextLine();
		System.out.println("He so luon : ");
		float heSoLuong = Float.parseFloat(sc.nextLine());
		
//		In thong tin cong nhan
		
		System.out.println("Thong tin cong nhan:");
		System.out.println("Ten : " + nameCongNhan );
		System.out.println("SDT : " + soDT);
		System.out.println("Dia Chi : " + diaChi);
		System.out.println("He so luong : "+ heSoLuong);
		System.out.println("..................................");
		
//		Thong tin chiec xe
		
		System.out.println("Nhap ten xe : ");
		String nameXe = sc.nextLine();
		System.out.println("Nhap Hang xa : ");
		String hangXe = sc.nextLine();
		System.out.println("Gia xe : ");
		String giaXe = sc.nextLine();
		System.out.println("Mau son: ");
		String mauSon = sc.nextLine();
		
//		In thong tin xe
		
		System.out.println("Thong tin Xe :");
		System.out.println("Ten : " + nameXe );
		System.out.println("Hang : " + hangXe);
		System.out.println("Gia xe : " + giaXe);
		System.out.println("Mau Son : "+ mauSon);
		sc.close();
	}
}
