package mydesignpatterns.strutturali.decorator;

public class CioccolatoDecorator extends BevandaDecorator {

    public CioccolatoDecorator(Bevanda bevanda) {
        super(bevanda);
    }

    @Override
    public String descrizione() {
        return super.descrizione() + ", cioccolato";
    }

    @Override
    public double costo() {
        return super.costo() + 0.50;
    }
}
