package Principal;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o tamanho do quadrado: ");
        String aux = teclado.nextLine();
        int aux1 = Integer.parseInt(aux);
        exercicio1 exe1;
        exe1 = new exercicio1();
        exercicio1.quadrado(aux1);

        System.out.println("Insira a altura do losango: ");
        aux = teclado.nextLine();
        aux1 = Integer.parseInt(aux);
        exercicio2 exe2;
        exe2 = new exercicio2();
        exercicio2.losango(aux1);
    }
}
