package poo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal {
    private JRadioButton humano1RadioButton;
    private JRadioButton humano2RadioButton;
    private JRadioButton computador1RadioButton;
    private JRadioButton computador2RadioButton;
    private JButton jogar1Button;
    private JButton jogar2Button;
    private JButton startButton;
    private JLabel pos1;
    private JLabel pos2;
    private JLabel pos3;
    private JLabel pos4;
    private JLabel pos5;
    private JLabel pos6;
    private JLabel pos7;
    private JLabel pos8;
    private JLabel pos9;
    private JLabel resultado;
    private JPanel painelPrincipal;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton x5Button;
    private JButton x4Button;
    private JButton x1Button;
    private JButton x2Button;
    private JButton x3Button;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private int iniciado = 0;
    private int jogadas = 0;

    public void setInicio(){
        pos1.setText("");
        pos2.setText("");
        pos3.setText("");
        pos4.setText("");
        pos5.setText("");
        pos6.setText("");
        pos7.setText("");
        pos8.setText("");
        pos9.setText("");

    }

    public void iniciado(){
        this.iniciado = 1;
        System.out.println(this.iniciado);
    };

    public void iniciarjogo(){
        this.jogadas=0;
    }

    public void compara(){
        if(this.iniciado == 1 && (this.jogadas%2)==0){
            jogar1Button.setEnabled(true);
            jogar2Button.setEnabled(false);
        }
        else if(this.iniciado == 1 && (this.jogadas%2)!=0){
            jogar1Button.setEnabled(false);
            jogar2Button.setEnabled(true);
        }
        else{
            jogar1Button.setEnabled(false);
            jogar2Button.setEnabled(false);
        }
    }


    public Principal() {
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setInicio();
                iniciado();
                iniciarjogo();
                compara();
                if(humano1RadioButton.isSelected()){
                    Jogador j1= new Jogador(1,"Humano");
                }
                else{
                    Jogador j1= new Jogador(1,"Computador");
                }
                if(humano2RadioButton.isSelected()){
                    Jogador j2= new Jogador(1,"Humano");
                }
                else{
                    Jogador j2= new Jogador(1,"Computador");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Principal");
        frame.setContentPane(new Principal().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        // para centralizar o Jframe na tela
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}

