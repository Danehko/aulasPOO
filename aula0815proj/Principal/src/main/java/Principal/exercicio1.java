package Principal;

public class exercicio1 {

    public static void quadrado(int aux) {
        int cont = 0;
        String est  = "*" ,tra  = "-" ,pipe = "|",esp  = " ", saida;
        if(aux==1){
            System.out.println("*");
        }else{
            while(cont != aux){
                if(cont == 0 || cont == (aux-1)){
                    saida = est;
                    if(aux > 2 ) {
                        int cont2 = 2;
                        while (cont2 != aux) {
                            saida = saida + tra;
                            cont2 = cont2 + 1;
                        }
                    }
                    saida = saida + est;
                } else {
                    saida = pipe;
                    int cont2 = 2;
                    while(cont2 != aux){
                        saida = saida + esp;
                        cont2 = cont2 + 1;
                    }
                    saida = saida + pipe;
                }
                System.out.println(saida);
                cont = cont + 1;
            }
        }
    }
}