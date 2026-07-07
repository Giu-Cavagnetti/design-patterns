package mydesignpatterns.strutturali.adapter.objectAdapter;

public class Adapter implements Target{

    private Adaptee adaptee;

    public Adapter (Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
