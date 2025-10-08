package ConcreteProducts;

import AbstractProducts.Chair;

public class ModernChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Sit on modern chair");
    }
}
