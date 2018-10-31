package poo;

/**
 * @autor Daniel Cabral Correa
 */

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Pessoa> contatos = new ArrayList<Pessoa> ();

    public void addPessoa(Pessoa pessoa){
        this.contatos.add(pessoa);
    }

    public boolean removePessoa(String nome, String sobreNome){
        Pessoa delete = new Pessoa(nome,sobreNome);
        if(this.contatos.contains(delete)==true){
            this.contatos.remove(delete);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean addTelefone(String rotulo, String nome, int pIndex) {
        if(this.contatos.size()<pIndex){
            return false;
        }else{
            Pessoa pessoa = this.contatos.get(pIndex);
            this.contatos.remove(pessoa);
            pessoa.addTelefone(rotulo,nome);
            this.contatos.add(pIndex,pessoa);
            return true;
        }
    }

    public boolean addEmail(String rotulo, String email, int pIndex){
        if(this.contatos.size()<pIndex){
            return false;
        }else{
            Pessoa pessoa = this.contatos.get(pIndex);
            this.contatos.remove(pessoa);
            pessoa.addEmail(rotulo,email);
            this.contatos.add(pIndex,pessoa);
            return true;
        }
    }

    public boolean removeTelefone(String rotulo, int pIndex){
        if(this.contatos.size()<pIndex){
            return false;
        }else{
            Pessoa pessoa = this.contatos.get(pIndex);
            this.contatos.remove(pessoa);
            pessoa.removeTelefone(rotulo);
            this.contatos.add(pIndex,pessoa);
            return true;
        }
    }

    public boolean removeEmail(String rotulo, int pIndex){
        if(this.contatos.size()<pIndex){
            return false;
        }else{
            Pessoa pessoa = this.contatos.get(pIndex);
            this.contatos.remove(pessoa);
            pessoa.removeEmail(rotulo);
            this.contatos.add(pIndex,pessoa);
            return true;
        }
    }

    public boolean updateTelefone(String rotulo, String nome, int pIndex) {
        if (this.contatos.size() < pIndex) {
            return false;
        } else {
            Pessoa p = this.contatos.get(pIndex);
            this.contatos.remove(p);
            p.updateTelefone(r, n);
            this.contatos.add(pIndex, p);
            return true;
        }
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

