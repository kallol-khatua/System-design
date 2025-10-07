package addOns;

import coffee.BaseCoffee;

public class ChocolateSyrup extends AddOnsDecorator{
    public ChocolateSyrup(BaseCoffee baseCoffee) {
        super(baseCoffee);
    }

    @Override
    public float cost() {
        return this.baseCoffee.cost() + 20;
    }

    @Override
    public String description() {
        return this.baseCoffee.description() + " + Chocolate Syrup";
    }
}
