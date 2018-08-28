import java.util.Scanner;

public class Quinto{
	
	public static void main (String[] args){
		long[] vet = new long[10];
		int a = 0;
		long DV = 0;
		long r = 1000000000;
		long s;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com a matricula: ");
		s = teclado.nextLong();
		while(a!=10){
			vet[a] = s / r;
			s = s % r;
			r = r / 10;
			if (a<9){
				DV = DV + (vet[a] * (10-a));
			}
			a = a + 1;	
		}
		DV = DV * 10;
		DV = DV % 11;
		if (DV == vet[9]){
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
}
