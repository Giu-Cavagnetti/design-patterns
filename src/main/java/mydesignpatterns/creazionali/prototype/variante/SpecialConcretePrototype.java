package mydesignpatterns.creazionali.prototype.variante;

import mydesignpatterns.creazionali.prototype.GoF.ElementoMutabile;

import java.util.ArrayList;
import java.util.List;

public class SpecialConcretePrototype extends ConcretePrototype {

    int j;
    List<ElementoMutabile> lista;

    @Override
    public SpecialConcretePrototype clone() {

        SpecialConcretePrototype copia = (SpecialConcretePrototype) super.clone();

        copia.lista = new ArrayList<>();

        for (ElementoMutabile e : this.lista)
            copia.lista.add(new ElementoMutabile(e));

        return copia;
    }
}