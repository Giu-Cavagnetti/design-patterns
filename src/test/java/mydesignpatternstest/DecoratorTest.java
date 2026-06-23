package mydesignpatternstest;

import mydesignpatterns.decorator.Bevanda;
import mydesignpatterns.decorator.Caffe;
import mydesignpatterns.decorator.CioccolatoDecorator;
import mydesignpatterns.decorator.LatteDecorator;

public class DecoratorTest {
    public static void main(String[] args) {

        Bevanda bevanda = new Caffe();
        bevanda = new LatteDecorator(bevanda);
        bevanda = new CioccolatoDecorator(bevanda);

        System.out.println(bevanda.descrizione());
        System.out.println("Costo: " + bevanda.costo() + "€");
    }
}
