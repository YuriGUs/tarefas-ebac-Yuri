public class SuvCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new SuvCar();
    }
}
