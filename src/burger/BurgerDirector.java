package burger;

public class BurgerDirector {

    public Burger buildClassicBurger(Builder builder) {

        return builder
                .setBun(" Bun")
                .setPatty("Beef")
                .setCheese("Cheddar")
                .setSauce("Ketchup")
                .setVegetables("Lettuce and tomato")
                .build();
    }
    public Burger buildVegetarianBurger(Builder builder) {
        return builder
                .setBun("Unusual Bun")
                .setPatty("Plant based beef")
                .setCheese("Mozzarella")
                .setSauce("Ranch")
                .setVegetables("Lettuce and tomato")
                .build();
    }
}