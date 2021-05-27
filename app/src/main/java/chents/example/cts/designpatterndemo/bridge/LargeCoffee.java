package chents.example.cts.designpatterndemo.bridge;

import android.util.Log;

public class LargeCoffee extends Coffee {


    public LargeCoffee(CoffeeStuff coffeeStuff) {
        super(coffeeStuff);
    }

    @Override
    public void makeCoffee() {
        Log.d(TAG, "makeCoffee: ");
    }

    private static final String TAG = "LargeCoffee";
}
