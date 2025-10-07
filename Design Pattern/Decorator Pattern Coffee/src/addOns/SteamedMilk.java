package addOns;

import coffee.BaseCoffee;

public class SteamedMilk extends AddOnsDecorator{

    public SteamedMilk(BaseCoffee baseCoffee) {
        super(baseCoffee);
    }

    @Override
    public float cost() {
        return this.baseCoffee.cost() + 20;
    }

    @Override
    public String description() {
        return this.baseCoffee.description() + " + Steamed Milk";
    }
}
