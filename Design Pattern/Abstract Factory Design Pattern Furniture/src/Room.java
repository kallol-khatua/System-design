import AbstractProducts.Chair;
import AbstractProducts.Sofa;
import AbstractProducts.Table;
import factory.FurnitureFactory;
import factory.VictorianFurnitureFactory;

public class Room {
    public static void main(String[] args) {
        FurnitureFactory factory = new VictorianFurnitureFactory();

        Chair chair = factory.createChair();
        chair.sit();

        Sofa sofa = factory.createSofa();
        sofa.lie();

        Table table = factory.createtable();
        table.use();
    }
}
