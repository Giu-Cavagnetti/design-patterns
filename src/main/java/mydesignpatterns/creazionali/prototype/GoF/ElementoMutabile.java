package mydesignpatterns.creazionali.prototype.GoF;

public class ElementoMutabile {

    private int valore;

    public ElementoMutabile(int valore){
        this.valore = valore;
    }

    public ElementoMutabile(ElementoMutabile elementoMutabile){
        this.valore = elementoMutabile.valore;
    }
}
