package mydesignpatterns.observer.pushModel;

public class ConcreteSubject extends Subject{

    int getState(){
        return state;
    }

    void setState(int i){
        state = i;
        notifyObservers();
    }
}
