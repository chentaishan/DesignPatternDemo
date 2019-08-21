package chents.example.cts.designpatterndemo.proxy;

public class ProxyObj implements IUpateListener {

    RealObj  realObj;
    public ProxyObj( RealObj  realObj) {
        this.realObj = realObj;
    }

    @Override
    public void updateItem() {

        realObj.updateItem();
    }
}
