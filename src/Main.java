package burger;

public class Main {

    public static void main(String[] args) {

        BurgerDirector director = new BurgerDirector();

        Burger classicBurger =
                director.buildClassicBurger(
                        new ClassicBurgerBuilder()
                );

        Burger vegetarianBurger =
                director.buildVegetarianBurger(
                        new VegetarianBurgerBuilder()
                );
        System.out.println("--- CLASSIC BURGER ---");
        System.out.println(classicBurger);

        System.out.println();

        System.out.println("--- VEGETARIAN BURGER ---");
        System.out.println(vegetarianBurger);
    }
}