package coffee;

public class Espresso implements BaseCoffee{
    @Override
    public float cost() {
        return 100.00f;
    }

    @Override
    public String description() {
        return "Espresso";
    }
}
