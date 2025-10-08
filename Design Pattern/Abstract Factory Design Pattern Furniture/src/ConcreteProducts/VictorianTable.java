package ConcreteProducts;

import AbstractProducts.Table;

public class VictorianTable implements Table {
    @Override
    public void use() {
        System.out.println("Use on victorian table");
    }
}
