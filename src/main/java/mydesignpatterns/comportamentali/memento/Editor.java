package mydesignpatterns.comportamentali.memento;

//Originator
public class Editor {

    private String testo = "";

    public void scrivi(String nuovoTesto) {
        testo += nuovoTesto;
    }

    public void mostraTesto() {
        System.out.println(testo);
    }

    public EditorMemento salva() {
        return new EditorMemento(testo);
    }

    public void ripristina(EditorMemento memento) {
        this.testo = memento.getTestoSalvato();
    }
}