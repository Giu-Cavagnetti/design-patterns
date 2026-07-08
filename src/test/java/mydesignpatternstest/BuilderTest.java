package mydesignpatternstest;

import mydesignpatterns.creazionali.builder.ConcreteBuilder1;
import mydesignpatterns.creazionali.builder.Director;
import mydesignpatterns.creazionali.builder.ProductIF;

public class BuilderTest {
    public static void main(String[] args) {

        ConcreteBuilder1 builder = new ConcreteBuilder1();
        Director director = new Director(builder);

        director.build();
        ProductIF product = builder.getProduct();

        System.out.println(product);
    }
}