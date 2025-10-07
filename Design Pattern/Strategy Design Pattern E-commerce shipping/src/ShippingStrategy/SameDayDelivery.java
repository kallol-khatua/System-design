package ShippingStrategy;

public class SameDayDelivery implements ShippingStrategyInterface{
    @Override
    public double calculateCost(double weight) {
        return weight * 350;
    }
}
