public class Jalapeno extends ToppingDecorator {

    public Jalapeno(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return this.pizza.getCost() + 35.00;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + ", jalapeno";
    }
}
