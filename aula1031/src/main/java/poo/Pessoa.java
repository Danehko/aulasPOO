package poo;

/**
 * @autor Daniel Cabral Correa
 */

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String sobreNome;
    private LocalDate dataNasc;
    private Telefone telefones;
    private Email emails;

    public Pessoa(String nome, String sobreNome, Telefone telefone, Email email, LocalDate data){
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.dataNasc = data;
        this.telefones = telefone;
        this.emails = email;
    }

    public Pessoa(String nome, String sobreNome, LocalDate data){
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.dataNasc = data;
        this.telefones = new Telefone();
        this.emails = new Email();
    }

    public boolean addTelefone(String rotulo, String nome){
        if(this.telefones.add(rotulo,nome)==true){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean addEmail(String rotulo, String nome){
        if(this.emails.add(rotulo, nome)==true){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean removeTelefone(String rotulo){
        if(this.telefones.remove(rotulo)==true){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean removeEmail(String rotulo){
        if(this.emails.remove(rotulo)==true){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean updateTelefone(String rotulo, String nome){
        if(this.telefones.update(rotulo,nome)==true){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean updateEmail(String rotulo, String nome){
        if(this.emails.update(rotulo, nome)==true){
            return true;
        }
        else{
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public Telefone getTelefones() {
        return telefones;
    }

    public Email getEmails() {
        return emails;
    }
/*public String toString(){
        String n;
        return n;
    }*/
}