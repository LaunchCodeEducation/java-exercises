package gtrgrt;

import java.util.*;

public class HuxleyCode {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		System.out.println(oi(n1, n2, n3));
	}
	
	public static int oi (int n1, int n2, int n3) {
		int resultado = 0;
		if (n1 >= n3) {
			resultado = n1 - n3 + (n1 * n2);
		} else {
			resultado = oi(n1 * n2, n2, n3 - n1);
		}
		
		return resultado;
	}
}
