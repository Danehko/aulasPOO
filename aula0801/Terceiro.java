import java.util.Scanner;
import java.util.Random;
public class Terceiro{
	
	public static void main (String[] args){
		int a, b, resultado;
		resultado = 0;
		Scanner teclado = new Scanner(System.in);
		
		Random r = new Random();
		a = r.nextInt(10);
		while (resultado != 1){
			System.out.println("Tente adivinhar um número de 0 a 9");
			b = teclado.nextInt();
			if (a==b){
				resultado = 1;
				System.out.println("Parabéns !!!");			
			}
			else {
				System.out.println("Errou !!!");			
			}
		}	
	}
}
