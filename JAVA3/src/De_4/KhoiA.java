package De_4;

import java.util.Scanner;

public class KhoiA extends ThiSinh{
	public String mon1, mon2, mon3;

	public KhoiA(String mon1, String mon2, String mon3) {
		this.mon1 = mon1;
		this.mon2 = mon2;
		this.mon3 = mon3;
	}
	
	@Override
	public void nhap() {
		super.nhap();
		System.out.println(" Mon 1: " + mon1);
		System.out.println(" Mon 2: " + mon2);
		System.out.println(" Mon 3: " + mon3);
		System.out.println("=====================");
	}
	
}
