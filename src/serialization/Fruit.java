package serialization;

import java.io.Serializable;

public class Fruit implements Serializable {

    long serialVersionUID = 1L;

    transient String name; //не участвует в сериализации
    String color;

    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


}
