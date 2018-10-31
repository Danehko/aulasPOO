package poo;

/**
 * @autor Daniel Cabral Correa
 */

import java.util.HashMap;

public class Telefone {

    private final String telRegexr = "[1-9][0-9][9][0-9]{8}|[1-9][0-9]{9}";
    private HashMap <String,String> dados = new HashMap<>();

    public boolean add(String rotulo, String numero){
        if((this.dados.containsKey(rotulo)==true)||(!(rotulo.matches(telRegexr)))){
                return false;
        }
        else{
            this.dados.put(rotulo,numero);
            return true;
        }
    }

    public boolean remove(String rotulo){
        if((this.dados.containsKey(rotulo)==true)&&(rotulo.matches(telRegexr))){
            this.dados.remove(rotulo);
            return true;
        }
        else{
            return false;
        }
    }

    public HashMap<String, String> getDados() {
        return dados;
    }

    public boolean update(String rotulo, String numero){
        if((this.dados.containsKey(rotulo)==true)&&(rotulo.matches(telRegexr))){
            this.dados.replace(rotulo,numero);
            return true;
        }
        else{
            return false;
        }
    }
}