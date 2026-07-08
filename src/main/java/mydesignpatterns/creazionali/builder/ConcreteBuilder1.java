package mydesignpatterns.creazionali.builder;

public class ConcreteBuilder1 implements BuilderIF {

    private ProductIF product;

    public ConcreteBuilder1() {
        reset();
    }

    @Override
    public void buildPartA() {
        product.setPartA("Parte A costruita dal Builder 1");
    }

    @Override
    public void buildPartB() {
        product.setPartB("Parte B costruita dal Builder 1");
    }

    public ProductIF getProduct() {
        ProductIF result = product;

        reset();

        return result;
    }

    private void reset() {
        product = new ConcreteProduct();
    }

    /*
    buildEngine();
    buildWheels();
    buildInterior();
    buildGPS();
     */
}