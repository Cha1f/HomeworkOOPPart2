public class Main {
    public static void main(String[] args) {
        Transport car = new Car("car1", 4);
        Transport car2 = new Car("car2", 4);

        Transport truck = new Truck("truck1", 6);
        Transport truck2 = new Truck("truck2", 8);

        Transport bicycle = new Bicycle("bicycle1", 2);
        Transport bicycle2 = new Bicycle("bicycle2", 2);

        Transport[] transports = {car, car2, truck, truck2, bicycle, bicycle2};
        for (Transport transport : transports) {
            System.out.println(transport.getModelName());
            transport.service();
            System.out.println();
        }
    }
}