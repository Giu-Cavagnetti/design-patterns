package mydesignpatterns.strutturali.composite;

public class Leaf implements Component{

    //unica operazione supportata
    @Override
    public void operation() {
    }

    @Override
    public void add(Component c) {
        throw new UnsupportedOperationException("Operazione non supportata");
    }

    @Override
    public void remove(Component c) {
        throw new UnsupportedOperationException("Operazione non supportata");
    }

    @Override
    public Component getChild(int i) {
        throw new UnsupportedOperationException("Operazione non supportata");
    }
}
