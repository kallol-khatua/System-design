package WithoutStrategyPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vehicle drive modes");
        Vehicle vehicle;

        // Off-road vehicle - sports drive mode
        vehicle = new OffRoadVehicle();
        vehicle.drive();

        // Sports vehicle - sports drive mode
        vehicle = new SportsVehicle();
        vehicle.drive();

        // Passenger vehicle - normal drive mode
        vehicle = new PassengerVehicle();
        vehicle.drive();

        // Passenger vehicle - normal drive mode
        vehicle = new GoodsVehicle();
        vehicle.drive();
    }
}
