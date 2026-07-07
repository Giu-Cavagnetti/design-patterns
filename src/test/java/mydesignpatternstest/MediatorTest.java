package mydesignpatternstest;

import mydesignpatterns.comportamentali.mediator.MediatorConcreto;

import javax.swing.*;
import java.awt.*;

public class MediatorTest {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Form");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new FlowLayout());

            JTextField nomeTextField = new JTextField(20);
            JTextField cognomeTextField = new JTextField(20);

            JButton salvaButton = new JButton("Salva");
            salvaButton.setEnabled(false);

            frame.add(new JLabel("Nome:"));
            frame.add(nomeTextField);

            frame.add(new JLabel("Cognome:"));
            frame.add(cognomeTextField);

            frame.add(salvaButton);

            new MediatorConcreto(nomeTextField, cognomeTextField, salvaButton);

            frame.pack();
            frame.setVisible(true);
        });
    }
}