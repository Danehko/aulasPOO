package poo;
import java.util.Random;
import java.util.Scanner;

public class Encontrar {
    private int limitesup;
    private int limiteinf;

    public void zeroADez() {
        this.limiteinf=0;
        this.limitesup=9;
        Scanner teclado = new Scanner(System.in);
        Random r = new Random();
        int meta = r.nextInt(10);
        int estado = 0;
        while (estado != 1) {
            System.out.println("Tente adivinhar um número de "+ limiteinf + " a " + limitesup);
            int chute = teclado.nextInt();
            if (chute==meta) {
                estado = 1;
                System.out.println("Parabéns !!!");
            }
            else {
                System.out.println("Errou !!!");
            }
        }
    }

    public void zeroACem() {
        Scanner teclado = new Scanner(System.in);
        Random r = new Random();

        this.limiteinf= 1;
        this.limitesup= 100;
        int estado = 0;
        int meta = r.nextInt(100) + 1;
        while (estado != 1){
            System.out.println("Tente adivinhar um número de " + this.limiteinf + " a " + this.limitesup);
            int chute = teclado.nextInt();
            if (chute==meta){
                estado = 1;
                System.out.println("Parabéns !!!");
            }
            else if((chute<meta) && (chute>this.limiteinf)){
                System.out.println("Errou !!!");
                this.limiteinf = chute;
            }
            else if((chute>meta) && (chute<this.limitesup)){
                System.out.println("Errou !!!");
                this.limitesup = chute;
            }
            else {
                System.out.println("Errou !!!");
            }
        }
    }
}
