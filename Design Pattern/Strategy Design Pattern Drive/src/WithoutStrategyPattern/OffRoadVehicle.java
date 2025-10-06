package WithoutStrategyPattern;

public class OffRoadVehicle extends Vehicle{

    @Override
    public void drive() {
        // sport drive feature same in sport vehicle and off rode vehicle
        System.out.println("Drive strategy: sport");
    }
}
