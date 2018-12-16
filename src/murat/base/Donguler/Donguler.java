package murat.base.Donguler;

public class Donguler {
	private boolean durum=true;
	public int count;
	
	public Donguler() {
		// TODO Auto-generated constructor stub
		dongu();
		islem();
	}

	private void islem() {
		// TODO Auto-generated method stub
		int sayi=10;
		System.out.println(sayi++);
		sayi++;
		System.out.println(++sayi);
		sayi--;
		System.out.println(--sayi);
		System.out.println(sayi--);
	}

	private void dongu() {
		// TODO Auto-generated method stub
		for(int i=3;i>=0;i--)
		{
			System.out.println(i);
		}
		
		while(durum)
		{
			System.out.println(count++);
			if(count==4)
			{
				durum=false;
			}
		}
		
		do
		{
			System.out.println("Murat");
		}while(false);
	}
	
}
