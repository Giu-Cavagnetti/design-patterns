package mydesignpatterns.mediator;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.text.MessageFormat;

public class MediatorConcreto implements Mediator {

    private final JTextField nome;
    private final JTextField cognome;
    private final JButton save;

    public MediatorConcreto(JTextField nome, JTextField cognome, JButton save) {
        this.nome = nome;
        this.cognome = cognome;
        this.save = save;

        collegaEventi();
        save.setEnabled(false);
    }

    private void collegaEventi() {
        nome.getDocument().addDocumentListener(creaDocumentListener(nome));
        cognome.getDocument().addDocumentListener(creaDocumentListener(cognome));

        save.addActionListener(e -> widgetCambiato(save));
    }

    private DocumentListener creaDocumentListener(JComponent widget) {
        return new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                widgetCambiato(widget);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                widgetCambiato(widget);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                widgetCambiato(widget);
            }
        };
    }

    @Override
    public void widgetCambiato(JComponent widget) {
        if (widget == nome || widget == cognome) {
            save.setEnabled(controlloEntrambi());
        } else if (widget == save) {
            String msg = MessageFormat.format(
                    "Nome: {0}\nCognome: {1}",
                    nome.getText(),
                    cognome.getText()
            );

            JOptionPane.showMessageDialog(null, msg);
        } else {
            throw new IllegalArgumentException("Widget non gestito dal mediator");
        }
    }

    private boolean controlloEntrambi() {
        return !nome.getText().isBlank() && !cognome.getText().isBlank();
    }
}