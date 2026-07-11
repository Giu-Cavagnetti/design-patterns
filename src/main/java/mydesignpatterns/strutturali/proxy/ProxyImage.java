package mydesignpatterns.strutturali.proxy;

public class ProxyImage implements Image {

    private final String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
        //Non viene ancora caricata
    }

    @Override
    public void display() {
        //Se chiedo di visualizzarla allora la creo reale e chiamo il metodo "Pesante"

        if (realImage == null)
            realImage = new RealImage(filename);

        realImage.display();
    }
}