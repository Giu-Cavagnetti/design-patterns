package mydesignpatterns.strutturali.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

    private static final Map<String, TreeType> types = new HashMap<>();

    public static TreeType getTreeType(String species, String color, String texture) {
        String key =
                        species + "-" +
                        color + "-" +
                        texture;

        TreeType type = types.get(key);

        if (type == null) {
            type = new TreeType(species, color, texture);
            types.put(key, type);
        }

        return type;
    }
}
