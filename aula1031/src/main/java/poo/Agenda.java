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

    public boolean removePessoa(String nome, String sobreNome){//
        int totalPessoas = this.contatos.size();
        int pos = 0;
        int aux = 0;
        while(pos != totalPessoas){
            Pessoa pessoa = this.contatos.get(pos);
            if((pessoa.getNome()==nome) && (pessoa.getSobreNome()==sobreNome)){
                this.contatos.remove(pos);
                aux = aux + 1;
            }
            pos = pos + 1;
        }
        if (aux>0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean addTelefone(String rotulo, String numero, int pIndex) {
        if(this.contatos.size()<pIndex){
            return false;
        }else{
            Pessoa pessoa = this.contatos.get(pIndex);
            pessoa.addTelefone(rotulo,numero);
            return true;
        }
    }

    public boolean addEmail(String rotulo, String email, int pIndex){
        if(this.contatos.size()<pIndex){
            return false;
        }else{
            Pessoa pessoa = this.contatos.get(pIndex);
            pessoa.addEmail(rotulo,email);
            return true;
        }
    }

    public boolean removeTelefone(String rotulo, int pIndex){
        if(this.contatos.size()<pIndex){
            return false;
        }else{
            Pessoa pessoa = this.contatos.get(pIndex);
            pessoa.removeTelefone(rotulo);
            return true;
        }
    }

    public boolean removeEmail(String rotulo, int pIndex){
        if(this.contatos.size()<pIndex){
            return false;
        }else{
            Pessoa pessoa = this.contatos.get(pIndex);
            pessoa.removeEmail(rotulo);
            return true;
        }
    }

    public boolean updateTelefone(String rotulo, String numero, int pIndex) {
        if (this.contatos.size() < pIndex) {
            return false;
        } else {
            Pessoa pessoa = this.contatos.get(pIndex);
            pessoa.updateTelefone(rotulo, numero);
            return true;
        }
    }

    public boolean updateEmail(String rotulo, String email, int pIndex){
        if(this.contatos.size()<pIndex){
            return false;
        }else{
            Pessoa pessoa = this.contatos.get(pIndex);
            pessoa.updateEmail(rotulo,email);
            return true;
        }
    }
}

