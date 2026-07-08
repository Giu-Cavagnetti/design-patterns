package mydesignpatterns.strutturali.flyweight;
//oggetto flyweight
public class TreeType {

    private final String species;
    private final String color;
    private final String texture;

    public TreeType(
            String species,
            String color,
            String texture) {

        this.species = species;
        this.color = color;
        this.texture = texture;
    }

    public void draw(int x, int y) {
        System.out.println(species +
                        " disegnato in " +
                        x + ", " + y
        );
    }
}
