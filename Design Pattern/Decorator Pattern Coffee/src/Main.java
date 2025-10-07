import addOns.ChocolateSyrup;
import addOns.HotWater;
import addOns.MilkFoam;
import addOns.SteamedMilk;
import coffee.BaseCoffee;
import coffee.Espresso;

public class Main {
    public static void main(String[] args) {
        // Espresso
        BaseCoffee espresso = new Espresso();
        System.out.println(espresso.description());
        System.out.println(espresso.cost());

        // Americano -> Espresso + Hot water.
        BaseCoffee americano = new HotWater(espresso);
        System.out.println(americano.description());
        System.out.println(americano.cost());

        // Cappuccino → Espresso + Steamed Milk + Milk Foam.
        BaseCoffee cappuccino = new MilkFoam(new SteamedMilk(espresso));
        System.out.println(cappuccino.description());
        System.out.println(cappuccino.cost());

        // Mocha → Espresso + Steamed Milk + Chocolate Syrup.
        BaseCoffee mocha = new ChocolateSyrup(new SteamedMilk(espresso));
        System.out.println(mocha.description());
        System.out.println(mocha.cost());
    }
}
