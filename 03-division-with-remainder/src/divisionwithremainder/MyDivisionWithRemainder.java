package divisionwithremainder;

public class MyDivisionWithRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DWR.01 Adott n darab toj�s, amit 20 f�r�helyes toj�s tart�ba kell elpakolni. 
		//		 Mennyi tart�t lesz telepakolva, �s az utols� toj�start�ba h�ny �res hely lesz?		

		// DWR.02 Kezd� �rt�kek
		int tojasokSzama=73;
		int tartoMeret=20;

		// DWR.03 Tele pakolt toj�srt�k sz�m�nak meghat�roz�sa
		int telePakoltTojasTartokSzam=tojasokSzama/tartoMeret;

		// DWR.04 Meghat�rozzuk h�ny toj�s maradt m�g ki. Ezeket az utols� tart�ba rakjuk.
		//int kimaradtTojasokSzama=tojasokSzama-szuksegesTojasTartoSzam*tartoMeret;		
		int kimaradtTojasokSzama=tojasokSzama%tartoMeret;

		// DWR.05 Meghat�rozzuk ez alapj�n, hogy az utols� tart�ba h�ny �res hely lesz.
		int utolsobaUresHely=tartoMeret-kimaradtTojasokSzama;

		// DWR.06 Ki�rjuk az eredm�nyeket
		System.out.println("Tele pakolt toj�start�k sz�ma: "+telePakoltTojasTartokSzam+" db.");
		System.out.println("Utols� toj�start�ban l�v� toj�sok sz�ma: "+kimaradtTojasokSzama+" db.");
		System.out.print("Utols� toj�start�ban �res helyek sz�ma: "+utolsobaUresHely+" db.");
	}

}
