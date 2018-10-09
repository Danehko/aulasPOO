package poo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Principal {
    private JPanel painelPrincipal;
    private JLabel nomeLabel;
    private JTextField nomeTF;
    private JButton confirmarButton;
    private JLabel resultadoLabel;
    private JRadioButton femininoRadioButton;
    private JRadioButton masculinoRadioButton;

    public void logica(){
        String mensagem = nomeTF.getText();
        if(femininoRadioButton.isSelected())
            resultadoLabel.setText("Bom dia Senhora " + mensagem);
        else
            resultadoLabel.setText("Bom dia Senhor " + mensagem);
        nomeTF.setText("");
        femininoRadioButton.setSelected(true);
    }

    public Principal() {
        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logica();
            }
        });
        nomeTF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logica();
            }
        });
        nomeTF.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                String aux = nomeTF.getText();
                if(aux.length() > 0){
                    confirmarButton.setEnabled(true);
                }else{
                    confirmarButton.setEnabled(false);
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
