package Tekin;

public class IfSchleife {

	public static void main(String[] args) {
		IfSchleife.wiederholen(5);
	}

	public static void wiederholen(int anzahl) {
		if (anzahl > 0) {
			anzahl--;
			System.out.println("Hinweg" + anzahl);
			IfSchleife.wiederholen(anzahl);
			System.out.println("Rückweg" + anzahl);
		} else {
			System.out.println("Ich bin der Wendepunkt :)" + anzahl);
			
		}
	}
}