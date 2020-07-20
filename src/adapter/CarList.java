package adapter;

import java.util.ArrayList;
import java.util.List;

public class CarList {

    List<Car> cars;

    public CarList(){
        cars = new ArrayList<>();
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public Car getCars(int id){
        return cars.get(id);
    }

    public int count(){
        return cars.size();
    }
}
