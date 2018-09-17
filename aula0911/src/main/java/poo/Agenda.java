package poo;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Pessoa> contatos = new ArrayList<Pessoa> ();

    public void addPessoa(Pessoa p){
        this.contatos.add(p);
    }

    public boolean removePessoa(String n, String s){
        Pessoa delete = new Pessoa(n,s);
        if(this.contatos.contains(delete)==true){
            this.contatos.remove(delete);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean addTelefone(String r, String n, int pIndex) {
        if(this.contatos.size()<pIndex){
            return false;
        }else{
            Pessoa p = this.contatos.get(pIndex);
            this.contatos.remove(p);

            this.contatos.add(pIndex, addTelefone(r,n));
            return true;
        }
    }

    public boolean addEmail(String r, String n, int pIndex){

        return false;
    }

    public boolean removeTelefone(String r, int pIndex){

        return false;
    }

    public boolean removeEmail(String r, int pIndex){

        return false;
    }

    public boolean updateTelefone(String r, String n, int pIndex){

        return false;
    }

    public boolean updateEmail(String r, String n, int pIndex){
        r
        return false;
    }

    public String toString(){
        String n;
        return n;
    }
}