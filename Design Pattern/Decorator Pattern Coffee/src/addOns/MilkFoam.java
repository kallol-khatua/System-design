package addOns;

import coffee.BaseCoffee;

public class MilkFoam extends AddOnsDecorator{

    public MilkFoam(BaseCoffee baseCoffee) {
        super(baseCoffee);
    }

    @Override
    public float cost() {
        return this.baseCoffee.cost() + 10;
    }

    @Override
    public String description() {
        return this.baseCoffee.description() + " + Milk Foam";
    }
}
