package jogo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Principal {
    private JPanel painelPrincipal;
    private JLabel Label00;
    private JLabel Label01;
    private JLabel Label02;
    private JLabel Label10;
    private JLabel Label20;
    private JLabel Label11;
    private JLabel Label12;
    private JLabel Label21;
    private JLabel Label22;
    private JLabel Jogador;
    private JButton iniciarButton;
    private JTextField jogadorTF1;
    private JTextField jogadorTF2;
    private JRadioButton humanoRadioButton;
    private JRadioButton computadorRadioButton;
    private JRadioButton humanoRadioButton1;
    private JRadioButton computadorRadioButton1;
    private JButton recomeçarButton;
    private int iniciar = 0;
    private int jogadas = 0;
    private String j1;
    private String j2;


    public void troca(JLabel Labelxx,JLabel Jogador){
        if(Jogador.getText().equals(this.j1)) {
            if (Labelxx.getText().equals("--")){
                Labelxx.setText("X");
                Jogador.setText(this.j2);
                this.jogadas = this.jogadas + 1;
            }
        }
        else{
            if (Labelxx.getText().equals("--")) {
                Labelxx.setText("O");
                Jogador.setText(this.j1);
                this.jogadas = this.jogadas + 1;
            }
        }
    }

    public void limpar(){
        Label00.setText("--");
        Label01.setText("--");
        Label02.setText("--");
        Label10.setText("--");
        Label11.setText("--");
        Label12.setText("--");
        Label20.setText("--");
        Label21.setText("--");
        Label22.setText("--");
        this.iniciar=0;
    }

    public void inicio(){
        this.jogadas=0;
        this.iniciar=1;
        Jogador jogador1 = new Jogador(1,this.j1);
        Jogador jogador2 = new Jogador(2, this.j2);
        JogoDaVelha jogo = new JogoDaVelha();
    }

    public void nome(){
        if(jogadorTF1.getText().equals("")){
            this.j1="jogador1";
        }
        else{
            this.j1=jogadorTF1.getText();
        }

        if(jogadorTF2.getText().equals("")){
            this.j2="jogador2";
        }
        else{
            this.j2=jogadorTF2.getText();
        }
    }


    public Principal() {
        Label00.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(iniciar==1) {
                    troca(Label00, Jogador);
                }
            }
        });
        Label01.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(iniciar==1) {
                    troca(Label01, Jogador);
                }
            }
        });
        Label02.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(iniciar==1) {
                    troca(Label02, Jogador);
                }
            }
        });
        Label10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(iniciar==1) {
                    troca(Label10, Jogador);
                }
            }
        });
        Label11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(iniciar==1) {
                    troca(Label11, Jogador);
                }
            }
        });
        Label12.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(iniciar==1) {
                    troca(Label12, Jogador);
                }
            }
        });
        Label20.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(iniciar==1) {
                    troca(Label20, Jogador);
                }
            }
        });
        Label21.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(iniciar==1) {
                    troca(Label21, Jogador);
                }
            }
        });
        Label22.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(iniciar==1) {
                    troca(Label22, Jogador);
                }
            }
        });
        iniciarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpar();
                nome();
                inicio();
                Random r = new Random();
                int i=r.nextInt(2)+1;
                System.out.println(i);
                if(i==1){
                    Jogador.setText("Turno do jogador " + j1);
                }
                else{
                    Jogador.setText("Turno do jogador " + j2);
                }

            }
        });
        recomeçarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpar();
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Jogo da velha");
        frame.setContentPane(new Principal().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        frame.setVisible(true);
    }
}
