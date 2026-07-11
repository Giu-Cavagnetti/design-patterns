package mydesignpatterns.strutturali.facade;

public class BluRayPlayer {

    public void accendi() {
        System.out.println("Lettore BluRay acceso");
    }

    public void play(String film) {
        System.out.println("Riproduzione di: " + film);
    }

    public void stop() {
        System.out.println("Riproduzione interrotta");
    }

    public void spegni() {
        System.out.println("Lettore BluRay spento");
    }
}