package poo;
import java.util.Scanner;
import java.util.Random;

public class Matricula {

    public void verificarmatricula(long matricula) {
        long[] vet = new long[10];
        int pos = 0;
        long DV = 0;
        long divisor = 1000000000;
        while (pos != 10) {
            vet[pos] = matricula / divisor;
            matricula = matricula % divisor;
            divisor = divisor / 10;
            if (pos < 9) {
                DV = DV + (vet[pos] * (10 - pos));
            }
            pos = pos + 1;
        }
        DV = DV * 10;
        DV = DV % 11;
        if (DV == vet[9]) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public void criaMatricula(){
        long[] vet = new long[10];
        Random x = new Random();
        int cont = 0;
        long DV = 0;

        vet[0] = 1;
        vet[1] = (x.nextInt(7) + 2);
        vet[2] = (x.nextInt(2) + 1);
        vet[5] = x.nextInt(10);
        vet[6] = x.nextInt(10);
        vet[7] = x.nextInt(10);
        vet[8] = x.nextInt(10);

        while (cont != 10) {
            if (cont < 9) {
                DV = DV + (vet[cont] * (10 - cont));
            }
            cont = cont + 1;
        }
        DV = DV * 10;
        vet[9] = DV % 11;
        String result = Long.toString(vet[0]) + Long.toString(vet[1]) + Long.toString(vet[2]) + Long.toString(vet[3]) + Long.toString(vet[4]) + Long.toString(vet[5]) + Long.toString(vet[6]) + Long.toString(vet[7]) + Long.toString(vet[8]) + Long.toString(vet[9]);
        if (result.length() == 10) {
            System.out.println(result);
            verificarmatricula(Long.parseLong( result ));
        }
    }
}
