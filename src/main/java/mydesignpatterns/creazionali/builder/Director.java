package mydesignpatterns.creazionali.builder;

public class Director {

    private BuilderIF builder;

    public Director(BuilderIF builder) {
        this.builder = builder;
    }

    public void changeBuilder(BuilderIF builder) {
        this.builder = builder;
    }

    public void build() {
        builder.buildPartA();
        builder.buildPartB();
    }

    /*
    public void buildBasicCar() {
        builder.buildEngine();
        builder.buildWheels();
    }

    public void buildCompleteCar() {
        builder.buildEngine();
        builder.buildWheels();
        builder.buildInterior();
    }
     */
}