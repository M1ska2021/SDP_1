package burger;

public class ClassicBurgerBuilder implements Builder {

    private String bun;
    private String patty;
    private String cheese;
    private String sauce;
    private String vegetables;

    @Override
    public Builder setBun(String bun) {
        this.bun = bun;
        return this;
    }
    @Override
    public Builder setPatty(String patty) {
        this.patty = patty;
        return this;
    }
    @Override
    public Builder setCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }
    @Override
    public Builder setSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }
    @Override
    public Builder setVegetables(String vegetables) {
        this.vegetables = vegetables;
        return this;
    }
    @Override
    public Burger build() {
        if (bun == null || patty == null) {
            throw new IllegalStateException(
                    "Bun and patty are required"
            );
        }
        return new Burger(
                bun,
                patty,
                cheese,
                sauce,
                vegetables
        );
    }
}