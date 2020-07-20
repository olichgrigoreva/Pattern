package adapter;

public class VehicleAdapter implements VehicleList {
    public final CarList carList;

    public VehicleAdapter(CarList carList) {
        this.carList = carList;
    }

    @Override
    public Car getVehicle(int id) {
        return carList.getCars(id);
    }

    @Override
    public void addVehicle(Car car) {
        carList.addCar(car);
    }

    @Override
    public int size() {
        return carList.count();
    }
}
