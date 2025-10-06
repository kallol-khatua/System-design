package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;

public class Passengervehicle extends Vehicle{
    public Passengervehicle(DriveStrategy driveStrategy){
        super(driveStrategy);
    }
}
