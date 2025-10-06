package WithStrategyPattern;

import WithStrategyPattern.Strategy.EVDriveStrategy;
import WithStrategyPattern.Strategy.NormalDriveStrategy;
import WithStrategyPattern.Strategy.SportDriveStrategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vehicle drive modes: with strategy pattern");
        Vehicle vehicle;

        // Off-road vehicle - sports drive mode
        vehicle = new OffRoadVehicle(new SportDriveStrategy());
        vehicle.drive();

        // Sports vehicle - sports drive mode
        vehicle = new SportVehicle(new SportDriveStrategy());
        vehicle.drive();

        // Passenger vehicle - normal drive mode
        vehicle = new Passengervehicle(new NormalDriveStrategy());
        vehicle.drive();

        // Goods vehicle - normal drive mode
        vehicle = new GoodsVehicle(new NormalDriveStrategy());
        vehicle.drive();

        // Hybrid vehicle - EV drive mode
        vehicle = new HybridVehicle(new EVDriveStrategy());
        vehicle.drive();
    }
}
