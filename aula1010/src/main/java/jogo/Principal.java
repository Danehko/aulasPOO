package jogo;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
    private JTextField textField1;
    private JTextField textField2;

    public void troca(JLabel Labelxx,JLabel Jogador){
        if(Jogador.getText().equals("Jogador 01")){
            Labelxx.setText("X");
            Jogador.setText("Jogador 02");
        }
        else{
            Labelxx.setText("O");
            Jogador.setText("Jogador 01");
        }
    }
    public Principal() {
        Label00.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                troca(Label00, Jogador);
            }
        });
        Label01.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                troca(Label01, Jogador);
            }
        });
        Label02.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                troca(Label02, Jogador);
            }
        });
        Label10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                troca(Label10, Jogador);
            }
        });
        Label11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                troca(Label11, Jogador);
            }
        });
        Label12.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                troca(Label12, Jogador);
            }
        });
        Label20.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                troca(Label20, Jogador);
            }
        });
        Label21.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                troca(Label21, Jogador);
            }
        });
        Label22.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                troca(Label22, Jogador);
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
