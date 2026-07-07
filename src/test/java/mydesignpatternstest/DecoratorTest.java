package mydesignpatternstest;

import mydesignpatterns.strutturali.decorator.Bevanda;
import mydesignpatterns.strutturali.decorator.Caffe;
import mydesignpatterns.strutturali.decorator.CioccolatoDecorator;
import mydesignpatterns.strutturali.decorator.LatteDecorator;

public class DecoratorTest {
    public static void main(String[] args) {

        Bevanda bevanda = new Caffe();
        bevanda = new LatteDecorator(bevanda);
        bevanda = new CioccolatoDecorator(bevanda);

        System.out.println(bevanda.descrizione());
        System.out.println("Costo: " + bevanda.costo() + "€");
    }
}
