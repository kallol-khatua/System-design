package ShippingStrategy;

public class StandardShipping implements ShippingStrategyInterface{
    @Override
    public double calculateCost(double weight) {
        return weight * 150;
    }
}
