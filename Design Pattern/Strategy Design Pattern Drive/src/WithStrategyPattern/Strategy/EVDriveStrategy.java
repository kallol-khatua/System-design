package WithStrategyPattern.Strategy;

public class EVDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Drive strategy: Electric");
    }
}
