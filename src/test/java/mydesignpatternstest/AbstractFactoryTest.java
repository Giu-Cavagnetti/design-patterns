package mydesignpatternstest;

import mydesignpatterns.creazionali.abstractFactory.Application;
import mydesignpatterns.creazionali.abstractFactory.Button;
import mydesignpatterns.creazionali.abstractFactory.GUIFactory;
import mydesignpatterns.creazionali.abstractFactory.MacFactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {

        GUIFactory factory = new MacFactory();

        Application app = new Application(factory);
        Button button = factory.createButton();

        System.out.println(button.getClass());
        //MacButton
    }
}
