package divisionwithremainder;

public class MyDivisionWithRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DWR.01 Adott n darab tojás, amit 20 férõhelyes tojás tartóba kell elpakolni. 
		//		 Mennyi tartót lesz telepakolva, és az utolsó tojástartóba hány üres hely lesz?		

		// DWR.02 Kezdõ értékek
		int tojasokSzama=73;
		int tartoMeret=20;

		// DWR.03 Tele pakolt tojásrtók számának meghatározása
		int telePakoltTojasTartokSzam=tojasokSzama/tartoMeret;

		// DWR.04 Meghatározzuk hány tojás maradt még ki. Ezeket az utolsó tartóba rakjuk.
		//int kimaradtTojasokSzama=tojasokSzama-szuksegesTojasTartoSzam*tartoMeret;		
		int kimaradtTojasokSzama=tojasokSzama%tartoMeret;

		// DWR.05 Meghatározzuk ez alapján, hogy az utolsó tartóba hány üres hely lesz.
		int utolsobaUresHely=tartoMeret-kimaradtTojasokSzama;

		// DWR.06 Kiírjuk az eredményeket
		System.out.println("Tele pakolt tojástartók száma: "+telePakoltTojasTartokSzam+" db.");
		System.out.println("Utolsó tojástartóban lévõ tojások száma: "+kimaradtTojasokSzama+" db.");
		System.out.print("Utolsó tojástartóban üres helyek száma: "+utolsobaUresHely+" db.");
	}

}
