package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
