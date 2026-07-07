package mydesignpatterns.creazionali.abstractFactory;

public class Application {

    private final Button button;
    private final ScrollBar scrollBar;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.scrollBar = factory.createScrollBar();
    }
}