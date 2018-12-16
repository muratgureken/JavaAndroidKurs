package murat.base.ornek2;

public class Parametre {
	public Parametre() {
		// TODO Auto-generated constructor stub
		String ad="Murat";
		String soyad="Gureken";
		String adsoyad = AdSoyadYaz(ad,soyad);
		System.out.println(adsoyad);
	}

	private String AdSoyadYaz(String ad, String soyad) {
		// TODO Auto-generated method stub
		return ad+" "+soyad;
	}
}
