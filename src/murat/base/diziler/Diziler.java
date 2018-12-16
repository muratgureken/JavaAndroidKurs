package murat.base.diziler;

public class Diziler {
	public Diziler() {
		diziIslem();
		diziTersSiralama();
		diziString();
		diziCokBoyutlu();
		diziCokBoyutlu2();
	}

	private void diziCokBoyutlu2() {
		// TODO Auto-generated method stub
		String [][] isimler = new String[2][];
		isimler[0] = new String[3];
		isimler[0][0] = "Murat";
		isimler[0][1] = "Emel";
		isimler[0][2] = "Zeytin";
	}

	private void diziCokBoyutlu() {
		// TODO Auto-generated method stub
		String [][] isimler = new String[2][3];
		isimler[0][0] = "Murat";
		isimler[0][1] = "Emel";
		isimler[1][0] = "Zeytin";
		isimler[1][1] = "Nina";

		for(int i=0;i<isimler.length;i++)
		{
			for(int j=0;j<isimler[i].length;j++)
			{
				System.out.print(isimler[i][j]+" ");
			}
			System.out.print("\n");
		}
	}

	private void diziString() {
		// TODO Auto-generated method stub
		String[] isimler = {null,null};
		isimler[0] = "Murat";
		isimler[1] = "Gureken";
	}

	private void diziTersSiralama() {
		// TODO Auto-generated method stub
		int[] dizi2 = {1,2,3,4,5,6,7,8,9,10,11};
		int[] dizi3 = new int[11];
		int eleman;
		
		for (int i=0;i<dizi2.length;i++) 
		{
			
			dizi3[dizi2.length-1-i] = dizi2[i];
		}
		
		for(int i=0;i<(dizi2.length)/2;i++)
		{
			eleman = dizi2[i];
			dizi2[i] = dizi2[dizi2.length-1-i];
			dizi2[dizi2.length-1-i] = eleman;
		}
				
		System.out.println("dizi3");
		for(int i=0;i<dizi3.length;i++)
		{
			System.out.println(dizi3[i]);
		}
		
		System.out.println("dizi2");
		for(int i=0;i<dizi2.length;i++)
		{
			System.out.println(dizi2[i]);
		}
	}

	private void diziIslem() {
		int[] dizi = new int[5];
		
		dizi[0] = 4;
		for (int i=0;i<dizi.length;i++) 
		{
			dizi[i] = i+2;
		}
		
		for(int i=0;i<dizi.length;i++)
		{
			System.out.println(dizi[i]);
		}
	}
}
