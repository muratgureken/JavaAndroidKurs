package murat.base.scanner;

import java.util.Scanner;

public class KonsolOkuma {
	int sayi;
	private Scanner scan;

	public KonsolOkuma() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in); /*input dosyadan alinacaksa System.in input oluyor.*/
		System.out.println("Bir sayi giriniz");
		sayi = scan.nextInt();
		System.out.println("sayi="+sayi);
		
		System.out.println("isim giriniz");
		String isim = scan.next();
		System.out.println("isim="+isim);
		scan.close();
	}
}
