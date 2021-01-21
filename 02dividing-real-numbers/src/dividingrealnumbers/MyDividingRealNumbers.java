package dividingrealnumbers;

public class MyDividingRealNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DR.01 Osztás valós számmal
		// Feladat: Írjon programot az ax+b=0 elsõfokú egyenlet megoldására a valós számok halmazán.
		
		// DR.02 Kezdõ értékek
		float a=4;
		float b=6;		
		
		// DR.03 Az egyenlet megoldása x=-b/a
		float x=-b/a;
		System.out.print("Az "+a+"x+"+b+"=0 egynelt megoldása:"+x);		
		
		// DR.04 Milyen esetben nincs megoldása az egyenletnek? 
		// Milyen esetben van végtelen sok megoldása az egyenletnek?
		// Ilyenkor mi lesz a program futásának eredménye?		
	}

}
