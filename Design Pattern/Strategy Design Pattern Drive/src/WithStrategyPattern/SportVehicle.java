package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;

public class SportVehicle extends Vehicle{
    public SportVehicle(DriveStrategy driveStrategy){
        super(driveStrategy);
    }
}
