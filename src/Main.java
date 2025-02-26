
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		

		Random rand = new Random();
		
		// Genera un numero casuale tra 1 e 100
		// Il numero indicato tra parentesi è escluso, per questo aumentiamo +1
		int n1 = rand.nextInt(100) + 1;
		System.out.println("Numero casuale intero: " + n1);

		double n2 = rand.nextDouble() * 100;
		System.out.println("Numero casuale double: " + n2);
		
		// Genera un numero casuale tra 1 e 1000000
		long n3 = rand.nextLong() % 1000000 + 1;
        System.out.println("Numero casuale long: " + n3);
        
        // Genera un numero casuale tra 1 e 1000000000000000000 (1 quadrillion)
        long n4 = rand.nextLong() * (long) Math.pow(10, 18) + 1;
        System.out.println("Numero casuale long: " + n4);
		
	}

}
