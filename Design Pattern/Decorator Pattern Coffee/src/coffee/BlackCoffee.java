package coffee;

public class BlackCoffee implements BaseCoffee {
    @Override
    public float cost() {
        return 90.00f;
    }

    @Override
    public String description() {
        return "Black Coffee";
    }
}
