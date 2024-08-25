class Main {
    public static void main(String[] args) {
        CarFactory sedanFactory = new SedanCarFactory();
        Car sedan = sedanFactory.createCar();
        sedan.assemble();

        CarFactory suvFactory = new SuvCarFactory();
        Car suv = suvFactory.createCar();
        suv.assemble();
    }
}
