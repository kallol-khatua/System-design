package addOns;

import coffee.BaseCoffee;

public abstract class AddOnsDecorator implements BaseCoffee {
    BaseCoffee baseCoffee;

    public AddOnsDecorator(BaseCoffee baseCoffee) {
        this.baseCoffee = baseCoffee;
    }
}
