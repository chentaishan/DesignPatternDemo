package chents.example.cts.designpatterndemo.bridge;

import android.util.Log;

public class SmallCoffee extends Coffee{

    public SmallCoffee(CoffeeStuff coffeeStuff) {
        super(coffeeStuff);
    }

    @Override
    public void makeCoffee() {
        Log.d(TAG, "makeCoffee: ");
    }

    private static final String TAG = "SmallCoffee";
}
