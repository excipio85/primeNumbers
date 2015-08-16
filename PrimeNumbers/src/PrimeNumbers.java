
public class PrimeNumbers {

    // keinen positiven Divisor
    public static void main(String[] args){

		int limit = 10000;
		int counter = 0;
		boolean primzahl;
		for(int zahl = 2; zahl <= limit; zahl++){
			primzahl = true;
			for(int zaehler = 2; zaehler <= zahl / 2 ; zaehler++){
				if(zahl % zaehler == 0){
					// primzahl gefunden
					primzahl = false;
					break;
				}
			}
			if(primzahl){
				counter++;
				System.out.println(zahl +"");
			}
		}
		System.out.println("Primzahlen: " + counter);
		System.out.println("test for github");

    }

}
