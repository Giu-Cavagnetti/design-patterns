package mydesignpatterns.factorymethod;

/**
 * Interfaccia del prodotto del pattern Factory Method.
 * Rappresenta un documento generico gestito dall'applicazione.
 * Definisce le operazioni comuni che ogni documento concreto deve implementare.
 */

public interface Document {
    void open();
    void close();
    String getTitle();
}
