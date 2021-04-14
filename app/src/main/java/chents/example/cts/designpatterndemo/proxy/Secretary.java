package chents.example.cts.designpatterndemo.proxy;

/**
 * 秘书
 */
public class Secretary implements ITask {

    Boss  realObj;
    public Secretary( Boss  realObj) {
        this.realObj = realObj;
    }

    @Override
    public void dispatchTask() {

    }
}
