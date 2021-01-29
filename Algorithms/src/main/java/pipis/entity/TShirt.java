package pipis.entity;

import pipis.enums.Color;
import pipis.enums.Fabric;
import pipis.enums.Size;

public class TShirt {

    private Color color;
    private Fabric fabric;
    private Size size;
    private String name;

    public TShirt() {
    }

    public TShirt(Color color, Fabric fabric, Size size, String name) {
        this.color = color;
        this.fabric = fabric;
        this.size = size;
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "T-Shirt with name: " + name + " size " + size + ", is made out of " + fabric + " colored " + color + ".";
    }

}

