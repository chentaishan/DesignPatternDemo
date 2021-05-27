package chents.example.cts.designpatterndemo.bridge;

public class Ordinary implements CoffeeStuff{
    @Override
    public String addSomething() {
        return "原味";
    }
}
