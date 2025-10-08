package ConcreteProducts;

import AbstractProducts.Table;

public class ModernTable implements Table {
    @Override
    public void use() {
        System.out.println("Use on modern table");
    }
}
