package poo;

/**
 * @autor Daniel Cabral Correa
 */

import java.util.HashMap;

public class Email {
    private final String emailRegexr ="^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
    private HashMap<String,String> dados = new HashMap<>();

    public boolean add(String r, String e){
        if((this.dados.containsKey(r)==true)||(!(r.matches(emailRegexr)))){
            return false;
        }
        else{
            this.dados.put(r,e);
            return true;
        }
    }

    public boolean remove(String r){
        if((this.dados.containsKey(r)==true)&&(r.matches(emailRegexr))){
            this.dados.remove(r);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean update(String r, String e){
        if((this.dados.containsKey(r)==true)&&(r.matches(emailRegexr))){
            this.dados.replace(r,e);
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