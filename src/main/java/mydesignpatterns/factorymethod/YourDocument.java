package mydesignpatterns.factorymethod;

public class YourDocument implements Document{

    @Override
    public void open() {
        System.out.println("Ho aperto un YourDocument");
    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return "";
    }
}
