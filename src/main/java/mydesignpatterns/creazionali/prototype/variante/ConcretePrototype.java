package mydesignpatterns.creazionali.prototype.variante;

public class ConcretePrototype implements Cloneable{

    int i;

    @Override
    public ConcretePrototype clone(){
        try{
            return (ConcretePrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
