package burger;

public interface Builder {

    Builder setBun(String bun);

    Builder setPatty(String patty);

    Builder setCheese(String cheese);

    Builder setSauce(String sauce);

    Builder setVegetables(String vegetables);

    Burger build();
}