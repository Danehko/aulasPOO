package poo;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String sobreNome;
    private LocalDate dataNasc;
    public Telefone telefones;
    public Email emails;

    public Pessoa(String n, String s, Telefone t, Email e, LocalDate d){
        this.nome = n;
        this.sobreNome = s;
        this.dataNasc = d;
        this.telefones = t;
        this.emails = e;
    }
    public Pessoa(String n, String s, LocalDate d){
        this.nome = n;
        this.sobreNome = s;
        this.dataNasc = d;
    }

    public boolean addTelefone(String r, String n){
        if(telefones.add(r,n)==true){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean addEmail(String r, String n){
        if(emails.add(r,n)==true){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean removeTelefone(String r){
        if(telefones.remove(r,n)==true){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean removeEmail(String r){
        if(emails.remove(r,n)==true){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean updateTelefone(String r, String n){
        if(telefones.update(r,n)==true){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean updateEmail(String r, String n){
        if(emails.update(r,n)==true){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        String n;
        return n;
    }
}