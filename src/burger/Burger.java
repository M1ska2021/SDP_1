package burger;

public class Burger {

    private final String bun;
    private final String patty;
    private final String cheese;
    private final String sauce;
    private final String vegetables;

    public Burger(
            String bun,
            String patty,
            String cheese,
            String sauce,
            String vegetables) {

        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;
        this.sauce = sauce;
        this.vegetables = vegetables;
    }

    @Override
    public String toString() {
        return "Burger {" +
                "\n  Bun: " + bun +
                "\n  Patty: " + patty +
                "\n  Cheese: " + cheese +
                "\n  Sauce: " + sauce +
                "\n  Vegetables: " + vegetables +
                "\n}";
    }
}