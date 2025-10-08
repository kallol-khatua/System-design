package factory;

import AbstractProducts.Chair;
import AbstractProducts.Sofa;
import AbstractProducts.Table;
import ConcreteProducts.VictorianChair;
import ConcreteProducts.VictorianSofa;
import ConcreteProducts.VictorianTable;

public class VictorianFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public Table createtable() {
        return new VictorianTable();
    }
}
