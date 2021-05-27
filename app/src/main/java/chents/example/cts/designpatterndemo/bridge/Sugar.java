package chents.example.cts.designpatterndemo.bridge;

public class Sugar implements CoffeeStuff{
    @Override
    public String addSomething() {
        return "加糖";
    }
}
