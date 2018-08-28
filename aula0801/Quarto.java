import java.util.Scanner;
import java.util.Random;
public class Quarto{
	
	public static void main (String[] args){
		int a, b, resultado; 
		int limiteinf=1; 
		int limitesup=100;
		resultado = 0;
		Scanner teclado = new Scanner(System.in);
		
		Random r = new Random();
		a = r.nextInt(100) + 1;
		while (resultado != 1){
			System.out.println("Tente adivinhar um número de " + limiteinf + " a " + limitesup);
			b = teclado.nextInt();
			if (a==b){
				resultado = 1;
				System.out.println("Parabéns !!!");				
			}
			else if((b>a) && (b<limitesup)){
				System.out.println("Errou !!!");
				limitesup = b;			
			}
			else if((b<a) && (b>limiteinf)){
				System.out.println("Errou !!!");
				limiteinf = b;			
			}
			else {
				System.out.println("Errou !!!");		
			}
		}	
	}
}
