package mydesignpatterns.strutturali.facade;

public class AudioSystem {

    public void accendi() {
        System.out.println("Impianto audio acceso");
    }

    public void setVolume(int volume) {
        System.out.println("Volume impostato a " + volume);
    }

    public void spegni() {
        System.out.println("Impianto audio spento");
    }
}