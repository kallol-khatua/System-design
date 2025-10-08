package ConcreteProducts;

import AbstractProducts.Sofa;

public class VictorianSofa implements Sofa {
    @Override
    public void lie() {
        System.out.println("Lie on victorian sofa");
    }
}
