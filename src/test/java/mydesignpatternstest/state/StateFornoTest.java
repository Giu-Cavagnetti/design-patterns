package mydesignpatternstest.state;

import mydesignpatterns.comportamentali.state.forno.Forno;
import mydesignpatterns.comportamentali.state.forno.FornoIF;
import mydesignpatterns.comportamentali.state.forno.Luce;
import mydesignpatterns.comportamentali.state.forno.LuceIF;
import mydesignpatterns.comportamentali.state.forno.Tubo;

import java.util.Scanner;

public class StateFornoTest {

    private static class Lettore implements Runnable {

        private final FornoIF forno;
        private final Scanner scanner;

        public Lettore(FornoIF forno) {
            this.forno = forno;
            this.scanner = new Scanner(System.in);
        }

        @Override
        public void run() {
            while (true) {
                if (!scanner.hasNext()) {
                    System.exit(-1);
                }

                char c = scanner.next().charAt(0);

                if (c == 'a' || c == 'A') {
                    forno.apri();
                } else if (c == 'c' || c == 'C') {
                    forno.chiudi();
                } else if (c == 's' || c == 'S') {
                    forno.start();
                } else {
                    System.out.println("Comando non valido. Usa:");
                    System.out.println("a = apri");
                    System.out.println("c = chiudi");
                    System.out.println("s = start");
                }
            }
        }
    }

    public static void main(String[] args) {
        LuceIF luce = new Luce();
        Tubo tubo = new Tubo();
        FornoIF forno = new Forno(luce, tubo);

        System.out.println("Comandi disponibili:");
        System.out.println("a = apri porta");
        System.out.println("c = chiudi porta");
        System.out.println("s = start cottura");

        Thread lettore = new Thread(new Lettore(forno));
        lettore.start();
    }
}