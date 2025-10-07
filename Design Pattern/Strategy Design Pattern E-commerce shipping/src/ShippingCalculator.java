import ShippingStrategy.ShippingStrategyInterface;

public class ShippingCalculator {
    private final ShippingStrategyInterface shippingStrategy;

    public ShippingCalculator(ShippingStrategyInterface shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public double calculateShippingCost(double weight) {
        return shippingStrategy.calculateCost(weight);
    }
}
