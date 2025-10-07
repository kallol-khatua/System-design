public class ExtraCheese extends ToppingDecorator {

    public ExtraCheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return this.pizza.getCost() + 35.0;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + " + Extra Cheese";
    }

}
