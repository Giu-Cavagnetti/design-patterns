package mydesignpatterns.creazionali.builder;

public class ConcreteProduct implements ProductIF {

    private String partA;
    private String partB;

    @Override
    public void setPartA(String partA) {
        this.partA = partA;
    }

    @Override
    public void setPartB(String partB) {
        this.partB = partB;
    }

    @Override
    public String toString() {
        return "ConcreteProduct{" +
                "partA='" + partA + '\'' +
                ", partB='" + partB + '\'' +
                '}';
    }
}