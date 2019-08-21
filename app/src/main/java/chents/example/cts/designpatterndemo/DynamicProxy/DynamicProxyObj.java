package chents.example.cts.designpatterndemo.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyObj implements InvocationHandler {

    Object object;
    public DynamicProxyObj(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        final Object invoke = method.invoke(object, args);
        return invoke;
    }
}
