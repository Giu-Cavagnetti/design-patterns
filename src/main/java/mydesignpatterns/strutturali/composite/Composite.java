package mydesignpatterns.strutturali.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

    private List<Component> children = new ArrayList<>();

    public Composite(){}

    @Override
    public void operation() {
        for(Component c : children){
            c.operation();
        }
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
        //evito volontariamente il controllo sull'esistenza
    }

    @Override
    public Component getChild(int i) {
        return children.get(i);
        //come sopra
    }
}
