package mydesignpatterns.factorymethod;

/**
 * Prodotto concreto del pattern Factory Method.
 * Implementa l'interfaccia Document e rappresenta
 * uno specifico tipo di documento creato dall'applicazione concreta.
 */

public class MyDocument implements Document{

    @Override
    public void open() {
        System.out.println("Ho aperto un MyDocument");

    }

    @Override
    public void close() {
    }

    @Override
    public String getTitle() {
        return "";
    }
}
