package mydesignpatterns.creazionali.abstractFactory;

public class WinFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new WinScrollBar();
    }
}
