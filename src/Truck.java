public class Truck extends Vehicle {
    @Override
    public void check() {
        updateTyre();
        checkEngine();
    }
}