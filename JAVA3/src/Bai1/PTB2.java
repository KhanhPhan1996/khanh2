package Bai1;

import java.util.Scanner;

public class PTB2 {
	public static int a;
	public static int b;
	public static int c;

	public static void main(String[] args) {
		Nhap();
		Nghiem();
	}
	
	public static void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Nhap cac he so :");
		System.out.print("a = ");
		a = sc.nextInt();
		System.out.print("b = ");
		b = sc.nextInt();
		System.out.print("c = ");
		c = sc.nextInt();
		System.out.println(" Phuong trinh bat 2 co dang " + a + "x*x " + b + "x " + c + "= 0" );
		
	}
	
	public static void Nghiem() {
		if (a == 0 && b == 0) System.out.println(" Phuong trinh vo ngiem");
		else if (a == 0 && b != 0) { 
			float X = (-c) / b;

			System.out.println(" Phuong trinh co 1 nghiem : " + X);
		}
		else if (a != 0 && b !=0 ) {
			float delta = b*b - 4*a*c;
			if(delta > 0) {
			float x1 = (float) (((-b + Math.sqrt(delta)))/(2*a));
			System.out.println(" Nghiem thu 1 : " + x1);
			float x2 = (float) (((-b - Math.sqrt(delta)))/(2*a));
			System.out.println(" Nghiem thu 2 : " + x2);
			}	else if (delta == 0) {
				float x = (-b)/(2*a);
				System.out.println(" Phuong trinh co 1 nghiem kep : " + x);

			} else {
				System.out.println(" Phuong trinh vo nghiem");
			}
			
		}
		
	}
}

	
