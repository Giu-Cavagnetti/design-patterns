package mydesignpatternstest;
import mydesignpatterns.factorymethod.*;

/**
 * Classe di test del pattern Factory Method.
 * Application usa un Document senza conoscerne
 * la classe concreta.
 * La sottoclasse MyApplication ridefinisce
 * createDocument() e crea il documento corretto.
 * Il pattern serve a delegare la creazione
 * degli oggetti alle sottoclassi.
 */

public class FactoryMethodTest {
    public static class Main {
        public static void main(String[] args) {
            Application app1 = new MyApplication();
            Application app2 = new YourApplication();

            System.out.println("=== Test MyApplication ===");
            app1.newDocument();

            System.out.println("\n=== Test YourApplication ===");
            app2.newDocument();
        }
    }
}
