package adapter;

public interface VehicleList {
    Car getVehicle(int id);
    void addVehicle(Car car);
    int size();
}
