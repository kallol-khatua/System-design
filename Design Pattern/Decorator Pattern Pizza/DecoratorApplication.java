import java.util.function.Consumer;

public class DecoratorApplication {
    public static void main(String[] args) {
        Consumer<Pizza> showDetail = p -> {
            System.out.println("Description -> " + p.getDescription());
            System.out.println("Cost -> " + p.getCost());
            System.out.println();
        };

        // Farmhouse pizza
        Pizza farmhousePizza = new Farmhouse();
        showDetail.accept(farmhousePizza);

        Pizza farmhousePizzaWithExtraCheese = new ExtraCheese(farmhousePizza);
        showDetail.accept(farmhousePizzaWithExtraCheese);

        Pizza farmhousePizzaWithExtraCheeseAndJalapeno = new Jalapeno(farmhousePizzaWithExtraCheese);
        showDetail.accept(farmhousePizzaWithExtraCheeseAndJalapeno);

        // Margherita pizza
        Pizza margheritaPizza = new Margherita();
        showDetail.accept(margheritaPizza);

        Pizza margheritaPizzaWithChickenPepperoni = new ChickenPepperoni(margheritaPizza);
        showDetail.accept(margheritaPizzaWithChickenPepperoni);

        Pizza margheritaPizzaWithChickenPepperoniAndJalapeno = new Jalapeno(margheritaPizzaWithChickenPepperoni);
        showDetail.accept(margheritaPizzaWithChickenPepperoniAndJalapeno);
    }
}
