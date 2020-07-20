package wrapper;

import java.util.ArrayList;
import java.util.List;

public class CarList {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>(); //интф List с содержимым типа Car, и реализацией ArrayList

        /*cars.add(new Car("Red", "bmv"));
        cars.add(new Car("Black", "vaz"));*/
        cars.add(new Car()
                .setColor("Red")
                .setModel("bmv")
        ); //цепочка вызовов
        cars.add(new Car()
                .setColor("Black")
                .setModel("vaz")
        );

        //print(cars.get(1));
        for (Car car : cars) {
            print(car);
        }

        //когда из Car удаляется объект, в wrapperCars он остается - это 2 независимых списка
        List<Car> wrapperCars = new ArrayList<>();
        for (Car car: cars){
            wrapperCars.add(new CarWrapper(car)); //обернули объекты Car
        }

        for (Car car : wrapperCars) {
            print(car);
        }

    }

    //метод принимает класс обертку WrapperCar, т.к. последний наследник Car
    public static void print(Car car) {
        System.out.println(car.getModel() + ", " + car.getColor());
    }
}
