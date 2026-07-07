package mydesignpatterns.comportamentali.observer.pullModel;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> observers;
    protected int state;

    void attach(Observer o) {
        if(observers == null)
            observers = new ArrayList<>();
        observers.add(o);
    }

    void detach(Observer observer) {
        observers.remove(observer);
    }

    void notifyObservers() {
        for(Observer o : observers)
            o.update();
    }
}
