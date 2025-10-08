package ConcreteProducts;

import AbstractProducts.Chair;

public class VictorianChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Sit on victorian chair");
    }
}
