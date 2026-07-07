package mydesignpatterns.comportamentali.observer.pushModel;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> observers;

    protected int state;

    void attach(Observer o){
        if(observers == null)
            observers = new ArrayList<>();

        observers.add(o);
    }

    void detach(Observer o){
        observers.remove(o);
    }

    void notifyObservers(){
        for(Observer o : observers)
            o.update(state);
    }
}
