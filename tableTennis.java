/*Table Tennis
 *Author: Julius Martinez
 *Email: 2158590@slu.edu.ph
 *
 *
 *
 *
 */
import java.util.Scanner;

public class tableTennis {
	public static void main(String[] args) {
		double n, k, j;
		Scanner inp = new Scanner (System.in);
		n = inp.nextDouble();
		k = inp.nextDouble();
		long[] a = new long[(int)n];
		long countw = 0, ans = 0;
		for(long i = 0; i < n; i++) {
			a[(int)i] = inp.nextLong();
		}
		for(long i = 0; i < n - 1; i++) {
			if(a[(int)i] > a[(int)(i + 1)]) {
				a[(int)(i + 1)] = a[(int)i];
				ans = a[(int)i];
				countw++;
			}
			if(countw == k) {
				break;
			}
			if(a[(int)i] < a[(int)(i + 1)]) {
				ans = a[(int)(i + 1)];
				countw = 0;
				countw++;
			}
			if(countw == k) {
				break;
			}
		}
		System.out.println("Output: " + ans);
	}


}