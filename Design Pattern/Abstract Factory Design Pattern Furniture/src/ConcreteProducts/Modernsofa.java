package ConcreteProducts;

import AbstractProducts.Sofa;

public class Modernsofa implements Sofa {
    @Override
    public void lie() {
        System.out.println("Lie on modern sofa");
    }
}
