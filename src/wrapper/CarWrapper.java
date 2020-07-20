package wrapper;

/**
 * обертка от машины
 */
public class CarWrapper extends Car {
    Car original;

    public CarWrapper(Car car) {
        //super(car.getColor(), car.getModel());
        original = car;
    }

    @Override
    public String getColor() {
        //return "Цвет машины: " + super.getColor();
        return "Цвет машины: " + original.getColor();
    }

    @Override
    public String getModel() {
        //return "Модель машины: " + super.getModel();
        return "Модель машины: " + original.getModel();
    }
}
