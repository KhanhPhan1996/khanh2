package De_4;

import java.util.Scanner;

public class InfoThiSinh {
	public static KhoiA khoiA = null;
	public static KhoiA[] listA = null;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean flag = true;
		do {
			System.out.println("=====MENU=====");
			System.out.println("1. Nhap thong tin cac thi sinh du thi");
			System.out.println("2. Hien thi thong tin 1 thi sinh");
			System.out.println("3. Tim kiem theo so bao danh");
			System.out.println("4. Ket thuc chuong trinh");
			
			System.out.print(" Nhap lua chon cua ban : ");
			int n = sc.nextInt();
			
			switch (n) {
			case 1:
				System.out.println("1. Nhap thong tin cac thi sinh du thi");
				NhapThongTin();
				break;
			case 2:
				System.out.println("2. Hien thi thong tin 1 thi sinh");
				HienThi();
				break;
			case 3:
				System.out.println("3. Tim kiem theo so bao danh");
				break;
			case 4:
				System.out.println("4. Ket thuc chuong trinh");
				flag = false;
				break;
			
			}
			
		} while (flag == true);
	}
	
	public static void NhapThongTin() {
		Scanner mc = new Scanner(System.in);

		Scanner sc1 = new Scanner(System.in);
		Scanner khoithi = new Scanner(System.in);
		while (true) {
			
			System.out.print(" Nhap khoi thi : ");
			String kt = khoithi.nextLine();
			if(kt.equals("A")) {
				System.out.println("=== Khoi A ===");
				System.out.print(" Nhap so thi sinh : ");
				int sA = sc1.nextInt();
				listA = new KhoiA[sA];
				for (int i = 0; i < sA; i++) {
					System.out.println(" Nhap thong tin thi sinh thu " + (i+1) +" la : ");
					khoiA = new KhoiA("Toan", "Ly", "Hoa");
					khoiA.nhap();
					listA[i] = khoiA;
				}
			} 
			if(kt.equals("B")) {
				System.out.println("=== Khoi B ===");
				System.out.print(" Nhap so thi sinh : ");
				int sA = sc1.nextInt();
				listA = new KhoiA[sA];
				for (int i = 0; i < sA; i++) {
					System.out.println(" Nhap thong tin thi sinh thu " + (i+1) +" la : ");
					khoiA = new KhoiA("Toan", "Sinh", "Hoa");
					khoiA.nhap();
					listA[i] = khoiA;
				}
			}
			if(kt.equals("C")) {
				System.out.println("=== Khoi C ===");
				System.out.print(" Nhap so thi sinh : ");
				int sA = sc1.nextInt();
				listA = new KhoiA[sA];
				for (int i = 0; i < sA; i++) {
					System.out.println(" Nhap thong tin thi sinh thu " + (i+1) +" la : ");
					khoiA = new KhoiA("Van", "Su", "Dia");
					khoiA.nhap();
					listA[i] = khoiA;
				}
			}
			
			System.out.print(" Nhap them (Y/N) : ");
			String m = mc.nextLine();
			if(m.equals("N")) {
				break;
				
			}
			
		}
			
	}
	public static void HienThi() {
		System.out.println(listA.length);
	}
}
