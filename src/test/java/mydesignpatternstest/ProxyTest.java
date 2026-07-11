package mydesignpatternstest;

import mydesignpatterns.strutturali.proxy.Image;
import mydesignpatterns.strutturali.proxy.ProxyImage;

public class ProxyTest {

    public static void main(String[] args) {

        Image image = new ProxyImage("vacanza.jpg");

        System.out.println("Proxy creato");

        System.out.println("\nPrima visualizzazione:");
        image.display();

        System.out.println("\nSeconda visualizzazione:");
        image.display();
    }
}
