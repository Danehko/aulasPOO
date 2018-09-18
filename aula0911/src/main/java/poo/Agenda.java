package poo;

/**
 * @autor Daniel Cabral Correa
 */

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
            p.addTelefone(r,n);
            this.contatos.add(pIndex,p);
            return true;
        }
    }

    public boolean addEmail(String r, String e, int pIndex){
        if(this.contatos.size()<pIndex){
            return false;
        }else{
            Pessoa p = this.contatos.get(pIndex);
            this.contatos.remove(p);
            p.addEmail(r,e);
            this.contatos.add(pIndex,p);
            return true;
        }
    }

    public boolean removeTelefone(String r, int pIndex){
        if(this.contatos.size()<pIndex){
            return false;
        }else{
            Pessoa p = this.contatos.get(pIndex);
            this.contatos.remove(p);
            p.removeTelefone(r);
            this.contatos.add(pIndex,p);
            return true;
        }
    }

    public boolean removeEmail(String r, int pIndex){
        if(this.contatos.size()<pIndex){
            return false;
        }else{
            Pessoa p = this.contatos.get(pIndex);
            this.contatos.remove(p);
            p.removeEmail(r);
            this.contatos.add(pIndex,p);
            return true;
        }
    }

    public boolean updateTelefone(String r, String n, int pIndex){
        if(this.contatos.size()<pIndex){
            return false;
        }else{
            Pessoa p = this.contatos.get(pIndex);
            this.contatos.remove(p);
            p.updateTelefone(r,n);
            this.contatos.add(pIndex,p);
            return true;
    }

    public boolean updateEmail(String r, String n, int pIndex){
        if(this.contatos.size()<pIndex){
            return false;
        }else{
            Pessoa p = this.contatos.get(pIndex);
            p.updateEmail(r,n);
            this.contatos.add(pIndex,p);
            return true;
        }
    }

    /*public String toString(){
        String n;
        return n;
    }*/
}

