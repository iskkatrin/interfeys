public class Car extends Vehicle {
    @Override
    public void check() {
        updateTyre();
        checkEngine();
    }
}