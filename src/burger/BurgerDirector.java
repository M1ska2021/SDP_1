package burger;

public class BurgerDirector {

    public Burger buildClassicBurger(Builder builder) {

        return builder
                .setBun("Sesame bun")
                .setPatty("Beef")
                .setCheese("Cheddar")
                .setSauce("Ketchup")
                .setVegetables("Lettuce and tomato")
                .build();
    }
    public Burger buildVegetarianBurger(Builder builder) {
        return builder
                .setBun("Whole wheat bun")
                .setPatty("Veggie")
                .setCheese("Mozzarella")
                .setSauce("Garlic sauce")
                .setVegetables("Lettuce, tomato and cucumber")
                .build();
    }
}