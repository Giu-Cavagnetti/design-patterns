package mydesignpatterns.creazionali.prototype.GoF;

import java.util.ArrayList;
import java.util.List;

public class ConcretePrototype1 implements Prototype {

    private int campo1;
    private int campo2;
    private List<ElementoMutabile> lista;


    public ConcretePrototype1(int campo1, int campo2, List<ElementoMutabile> lista) {
    this.campo1 = campo1;
    this.campo2 = campo2;
    this.lista = lista;
    }

    private ConcretePrototype1(ConcretePrototype1 concretePrototype1){
        this.campo1 = concretePrototype1.campo1;
        this.campo2 = concretePrototype1.campo2;

        this.lista = new ArrayList<>();

        for(ElementoMutabile elementoMutabile : concretePrototype1.lista){
            this.lista.add(new ElementoMutabile(elementoMutabile));
        }
    }

    @Override
    public ConcretePrototype1 clone() {
        return new ConcretePrototype1(this);
    }
}