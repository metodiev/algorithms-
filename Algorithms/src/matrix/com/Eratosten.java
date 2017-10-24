package matrix.com;

public class Eratosten {

	public static final int n = 20;
	private static int sieve [] = new int [300000];
	public static void main(String[] args) {
		 int i = 0 ;
		 for ( i = 0; i < n; i++) {
			 sieve[i] = 0;
			
		}
		 eratosten(n);
	}
	
	public static void eratosten(int n) {
		int j,i = 2;
		while (i <= n) {
			if (sieve[i] == 0) {
				System.out.println(i);
				j=i*i;
				while (j <= n) {
					sieve[j] = 1;
					j +=i;
				}
			}
			i++;
		}
	}

}
