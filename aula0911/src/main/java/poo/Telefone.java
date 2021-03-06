package poo;

/**
 * @autor Daniel Cabral Correa
 */

import java.util.HashMap;

public class Telefone {

    private final String telRegexr = "[1-9][0-9][9][0-9]{8}|[1-9][0-9]{9}";
    private HashMap <String,String> dados = new HashMap<>();

    public boolean add(String r, String n){
        if((this.dados.containsKey(r)==true)||(!(r.matches(telRegexr)))){
                return false;
        }
        else{
            this.dados.put(r,n);
            return true;
        }
    }

    public boolean remove(String r){
        if((this.dados.containsKey(r)==true)&&(r.matches(telRegexr))){
            this.dados.remove(r);
            return true;
        }
        else{
            return false;
        }
    }

    public HashMap<String, String> getDados() {

        return dados;
    }

    public boolean update(String r, String n){
        if((this.dados.containsKey(r)==true)&&(r.matches(telRegexr))){
            this.dados.replace(r,n);
            return true;
        }
        else{
            return false;
        }
    }

    /*public void toString(){
        dados.forEach((chave,valor)->{
        System.out.println(valor);
        });
    }*/
}