package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ClothingItem item = new Shirt(ClothingSize.S, 55, 13);
        // Arrays não redimensionáveis
        String[] colors = new String[3];
        colors[0] = "Red";
        colors[1] = "Green";
        colors[2] = "Blue";

        // Listas são redimensionáveis
        List<String> details = new ArrayList<>();
        details.add("tie");
        details.add("short");
        details.add("belly");

        System.out.println(details.get(2));
        // Maps são valores com chave
        Map<String, ClothingItem> items = new HashMap<>();
        items.put("shirt", new Shirt(ClothingSize.S, 12, 1));

        var anItem = items.get("shirt");
    }
}
