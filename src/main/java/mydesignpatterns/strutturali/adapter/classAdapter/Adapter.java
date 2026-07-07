package mydesignpatterns.strutturali.adapter.classAdapter;

import mydesignpatterns.strutturali.adapter.objectAdapter.Adaptee;
import mydesignpatterns.strutturali.adapter.objectAdapter.Target;

//Differenza fondamentale con l'Object adapter, qui il metodo viene chiamata direttamente perchè la classe
//è ereditata e non ce bisogno dell'oggetto interno incapsulato
//Unico problema l'ereditarieta multipla che non esiste in java
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        specificRequest();
    }
}
