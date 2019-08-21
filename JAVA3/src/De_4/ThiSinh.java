package De_4;

import java.util.Scanner;

public class ThiSinh {
	public String hoTen,diaChi,uuTien;
	public int soBaoDanh;
	public ThiSinh() {
	}
	
	public void nhap() {
		Scanner ten = new Scanner(System.in);
		Scanner diachi = new Scanner(System.in);
		Scanner uutien = new Scanner(System.in);
		Scanner sbd = new Scanner(System.in);

		System.out.print(" So bao danh: ");
		this.soBaoDanh = sbd.nextInt();
		System.out.print(" Ten: ");
		this.hoTen = ten.nextLine();
		System.out.print(" Dia chi: ");
		this.diaChi = diachi.nextLine();
		System.out.print(" Uu tien: ");
		this.uuTien = uutien.nextLine();
		
	}
	
}
