package matrix.com;

public class EratostenFaster {

	private final static int n = 500;
	private static int primes[] = new int[10000];
	static int pN = 0;

	public static void main(String[] args) {
		findPrimes(n);
	}

	public static void findPrimes(int n) {
		int i = 2;
		while (i < n) {
			if (isPrime(i)) {
				primes[pN] = i;
				pN++;
				System.out.println(i);
			}
			i++;
		}
	}

	private static boolean isPrime(int n) {
		
		int i = 0;
		while (i < pN && primes[i] * primes[i] <= n) {
			if (n % primes[i] == 0) {
				i++;
				return true;
			}
				
		}
		return false;
	}

}
