package mydesignpatterns.strutturali.decorator;

public abstract class BevandaDecorator implements Bevanda{

    protected Bevanda bevanda;

    public BevandaDecorator(Bevanda bevanda) {
        this.bevanda = bevanda;
    }

    @Override
    public String descrizione() {
        return bevanda.descrizione();
    }

    @Override
    public double costo() {
        return bevanda.costo();
    }
}
