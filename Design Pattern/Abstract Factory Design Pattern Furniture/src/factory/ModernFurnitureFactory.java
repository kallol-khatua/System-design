package factory;

import AbstractProducts.Chair;
import AbstractProducts.Sofa;
import AbstractProducts.Table;
import ConcreteProducts.ModernChair;
import ConcreteProducts.ModernTable;
import ConcreteProducts.Modernsofa;

public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new Modernsofa();
    }

    @Override
    public Table createtable() {
        return new ModernTable();
    }
}
