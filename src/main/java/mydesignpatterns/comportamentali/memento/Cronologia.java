package mydesignpatterns.comportamentali.memento;

import java.util.Stack;

public class Cronologia {

    private final Stack<EditorMemento> stati = new Stack<>();

    public void salva(EditorMemento memento) {
        stati.push(memento);
    }

    public EditorMemento recuperaUltimoStato() {
        if (stati.isEmpty())
            return null;

        return stati.pop();
    }
}