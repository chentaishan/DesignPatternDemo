package chents.example.cts.designpatterndemo.instance.oberser;


import java.util.Observable;

/**
 * 被观察者 对象  ---产生事件
 */
public class Cuihua extends Observable {


    private String task;

    public String getTask() {
        return task;
    }



    public void createEvent(String task) {
        this. task = task;
        setChanged();
        notifyObservers();
    }
}
