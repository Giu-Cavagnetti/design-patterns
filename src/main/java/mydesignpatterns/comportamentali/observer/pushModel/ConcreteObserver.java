package mydesignpatterns.comportamentali.observer.pushModel;

public class ConcreteObserver implements Observer {

    private int state;

    @Override
    public void update(int newState) {
        state = newState;
        System.out.println("Nuovo stato ricevuto: " + state);
    }
}