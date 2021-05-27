package chents.example.cts.designpatterndemo.bridge;

public abstract class Coffee {
    protected CoffeeStuff coffeeStuff;

    public Coffee(CoffeeStuff coffeeStuff) {
        this.coffeeStuff = coffeeStuff;
    }

    public abstract void makeCoffee();
}
