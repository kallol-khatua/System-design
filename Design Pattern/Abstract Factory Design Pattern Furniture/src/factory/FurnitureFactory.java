package factory;

import AbstractProducts.Chair;
import AbstractProducts.Sofa;
import AbstractProducts.Table;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    Table createtable();
}
