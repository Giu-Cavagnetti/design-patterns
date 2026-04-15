package mydesignpatterns.factorymethod;

public class YourApplication extends Application{

    @Override
    protected Document createDocument() {
        return new YourDocument();
    }
}
