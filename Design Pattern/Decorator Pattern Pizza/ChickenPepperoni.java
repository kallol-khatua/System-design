public class ChickenPepperoni extends ToppingDecorator {

    public ChickenPepperoni(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return this.pizza.getCost() + 50.0;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + " + Chicken pepperoni";
    }
}
