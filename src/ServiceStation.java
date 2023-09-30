public class ServiceStation {
    public void check(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            Car car = (Car) vehicle;

        } else if (vehicle instanceof Bicycle) {
            Bicycle bicycle = (Bicycle) vehicle;
        } else if (vehicle instanceof Truck) {
            Truck Truck = (Truck) vehicle;

        }
    }
}