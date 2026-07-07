package mydesignpatterns.strutturali.decorator;

//delego il comportamento all'oggetto contenuto, lo sto wrappando
public class LatteDecorator extends BevandaDecorator{

    public LatteDecorator(Bevanda bevanda) {
        super(bevanda);
    }

    @Override
    public String descrizione() {
        return super.descrizione() + ", latte";
    }

    @Override
    public double costo() {
        return super.costo() + 0.30;
    }

}
