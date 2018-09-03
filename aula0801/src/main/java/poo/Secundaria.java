package poo;
import java.util.Scanner;
import java.util.Random;

public class Secundaria {

    public void Soma(){
        Scanner teclado=null;
        teclado = new Scanner(System.in);
        System.out.print("Entre com um número: ");
        int a = teclado.nextInt();
        System.out.print("Entre com um número: ");
        int b = teclado.nextInt();
        int resultado = a + b;
        System.out.println("A soma do "+ a + " + " + b + " = " + resultado);
    }


}
