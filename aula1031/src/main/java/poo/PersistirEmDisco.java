package poo;

import java.io.*;

public class PersistirEmDisco {
    private Agenda agenda;

    public void lerDoDisco(){
        File arquivo = new File("agenda.dat");

        try(FileInputStream fin = new FileInputStream(arquivo);
            ObjectInputStream oin = new ObjectInputStream(fin)) {

            // Lendo os objetos de um arquivo
            //this.agenda = (Pessoa[]) oin.readObject();***
            // Uma forma de diferente do for para percorrer vetores
            for (Pessoa p : this.agenda) {
                }
            } catch (Exception ex) {
            System.err.println("erro: " + ex.toString());
            }
}

    public void salvarEmDisco(){
        File arquivo = new File("agenda.dat");
        try (FileOutputStream fout = new FileOutputStream(arquivo);
        ObjectOutputStream oos = new ObjectOutputStream(fout)){
            // gravando o vetor 'agenda' no arquivo chamado 'agenda.dat'
            oos.writeObject(this.agenda);

            oos.flush(); // limpando dados em buffer
            oos.close(); // fechando fluxo de saida
            fout.close(); // fechando arquivo

            } catch (Exception ex) {
            System.err.println("erro: " + ex.toString());
            }
        }
}
