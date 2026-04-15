package mydesignpatterns.factorymethod;

/**
 * Creator concreto del pattern Factory Method.
 * Specializza Application decidendo quale documento concreto creare.
 */

public class MyApplication extends Application{

    @Override
    protected Document createDocument() {
        return new MyDocument();
    }
}
