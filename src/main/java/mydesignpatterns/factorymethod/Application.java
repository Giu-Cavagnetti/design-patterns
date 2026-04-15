package mydesignpatterns.factorymethod;

/**
 * Creator astratto del pattern Factory Method.
 * Definisce il metodo factory per la creazione dei documenti
 * e contiene la logica dell'applicazione che usa il prodotto
 * senza conoscerne la classe concreta.
 */

public abstract class Application {

    protected abstract Document createDocument();

    public void newDocument(){
        Document doc = createDocument();
        doc.open();
    }
}
