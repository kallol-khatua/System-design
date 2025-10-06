package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;

public class HybridVehicle extends Vehicle {
    public HybridVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
