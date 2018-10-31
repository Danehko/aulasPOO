package poo;

/**
 * @autor Daniel Cabral Correa
 */

import java.util.HashMap;

public class Email {
    private final String emailRegexr ="^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
    private HashMap<String,String> dados = new HashMap<>();

    public boolean add(String rotulo, String email){
        if((this.dados.containsKey(rotulo)==true)||(!(rotulo.matches(emailRegexr)))){
            return false;
        }
        else{
            this.dados.put(rotulo,email);
            return true;
        }
    }

    public boolean remove(String rotulo){
        if((this.dados.containsKey(rotulo)==true)&&(rotulo.matches(emailRegexr))){
            this.dados.remove(rotulo);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean update(String rotulo, String email){
        if((this.dados.containsKey(rotulo)==true)&&(rotulo.matches(emailRegexr))){
            this.dados.replace(rotulo,email);
            return true;
        }
        else{
            return false;
        }
    }


    public HashMap<String, String> getDados() {
        return dados;
    }

/*public String toString(){
        String n;
        return n;
    }*/
}