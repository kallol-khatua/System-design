package ShippingStrategy;

public class ExpressShipping implements ShippingStrategyInterface{
    @Override
    public double calculateCost(double weight) {
        return weight * 250;
    }
}
