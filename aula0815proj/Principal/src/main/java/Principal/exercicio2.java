package Principal;
public class exercicio2 {
    public static void losango(int aux) {
        int cont = 0;
        String ast  = "*", esp  = " ";        String saida;
        int media = aux/2, resto = aux%2;
        int zero = 0;
        if(aux==1){
            System.out.println("*");
        }else{
            while(cont != aux){
                saida="";
                if(cont>media){
                    zero = cont - media;
                } else{
                    if(resto !=0) {
                        zero = media - cont;
                    }else{
                        zero = media - cont - 1;
                        if(cont==media){
                            zero = 0;
                        }
                    }
                }
                int cont2 = zero;
                while(cont2 != 0) {
                    saida = saida + esp;
                    cont2 = cont2 - 1;
                }
                saida = saida + ast;
                int auxi = 0;
                if(resto!=0) {
                    auxi = 2*media;
                }else{
                    auxi = 2*(media-1);
                }
                if((cont == 0) || (cont == (aux-1))) {
                    auxi=auxi-(2*zero);
                }else{
                    auxi=(auxi-1)-(2*zero);
                }
                while(auxi != 0) {
                    saida = saida + esp;
                    auxi = auxi - 1;
                }
                if((cont == 0) || (cont == (aux-1))) {
                    saida = saida;
                }else{
                    saida= saida + ast;
                }
                System.out.println(saida);
                cont = cont + 1;
            }
        }
    }
}

