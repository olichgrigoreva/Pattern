package adapter;

public class Car {
    private String color;
    private String model;

    /*public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }*/

    public Car setColor(String color) {
        this.color = color;
        return this;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public String getColor(){
        return color;
    }

    public String getModel(){
        return model;
    }
}
