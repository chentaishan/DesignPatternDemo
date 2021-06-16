package chents.example.cts.designpatterndemo.starategy;

public class Context {

    Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void dosomething(){
        this.strategy.dosomething();
    }
}
