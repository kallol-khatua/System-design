import ShippingStrategy.ExpressShipping;
import ShippingStrategy.SameDayDelivery;
import ShippingStrategy.ShippingStrategyInterface;
import ShippingStrategy.StandardShipping;

public class Main {
    public static void main(String[] args) {
        ShippingStrategyInterface shippingStrategy;
        ShippingCalculator shippingCalculator;

        shippingStrategy = new ExpressShipping();
        shippingCalculator = new ShippingCalculator(shippingStrategy);
        System.out.println("express shipping cost " + shippingCalculator.calculateShippingCost(2.6));

        shippingStrategy = new SameDayDelivery();
        shippingCalculator = new ShippingCalculator(shippingStrategy);
        System.out.println("same day shipping cost " + shippingCalculator.calculateShippingCost(2.6));

        shippingStrategy = new StandardShipping();
        shippingCalculator = new ShippingCalculator(shippingStrategy);
        System.out.println("standard shipping cost " + shippingCalculator.calculateShippingCost(2.6));
    }
}
