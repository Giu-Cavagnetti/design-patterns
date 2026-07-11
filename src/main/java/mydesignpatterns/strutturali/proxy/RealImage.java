package mydesignpatterns.strutturali.proxy;

public class RealImage implements Image {

    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Caricamento pesante di " + filename);
    }

    @Override
    public void display() {
        System.out.println("Visualizzazione di " + filename);
    }
}