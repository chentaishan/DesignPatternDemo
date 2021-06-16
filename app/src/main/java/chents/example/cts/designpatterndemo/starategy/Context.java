package chents.example.cts.designpatterndemo.starategy;

public class Context {

    Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void exec(int a,int b){
        this.strategy.exec(a,b);
    }
}
