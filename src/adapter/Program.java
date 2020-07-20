package adapter;

public class Program {
    public static void main(String[] args) {
        CarList cars = new CarList();

        cars.addCar(new Car()
                .setColor("Red")
                .setModel("bmv")
        );

        cars.addCar(new Car()
                .setColor("Black")
                .setModel("vaz")
        );
        VehicleList vehicleList = new VehicleAdapter(cars);

        DataBase.save(vehicleList); //нужен адаптер, котрый будер реализовывать VehicleList, а на входе принимать CarList
    }
}
