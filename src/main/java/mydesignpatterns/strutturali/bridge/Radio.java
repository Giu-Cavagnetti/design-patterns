package mydesignpatterns.strutturali.bridge;

public class Radio implements Device{

    @Override
    public void turnOn() {
        System.out.println("Radio accesa");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio spenta");
    }
}
