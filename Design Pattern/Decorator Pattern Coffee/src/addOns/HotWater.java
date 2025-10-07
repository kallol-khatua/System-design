package addOns;

import coffee.BaseCoffee;

public class HotWater extends AddOnsDecorator{

    public HotWater(BaseCoffee baseCoffee) {
        super(baseCoffee);
    }

    @Override
    public float cost() {
        return this.baseCoffee.cost() + 5;
    }

    @Override
    public String description() {
        return this.baseCoffee.description() + " + Hot Water";
    }
}
