package mydesignpatternstest;

import mydesignpatterns.creazionali.singleton.Singleton;

public class SingletonTest {

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);

        //s1 e s2 sono la stessa istanza
    }
}
