package mydesignpatterns.comportamentali.memento;

public class EditorMemento {

    private final String testo;

    public EditorMemento(String testo) {
        this.testo = testo;
    }

    public String getTestoSalvato() {
        return testo;
    }
}