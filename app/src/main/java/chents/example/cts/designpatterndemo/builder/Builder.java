package chents.example.cts.designpatterndemo.builder;

import android.os.Build;

public abstract class Builder {

    public abstract Builder buildOs(String os);
    public abstract Builder buildDisplay(String display);
    public abstract Builder buildBroad(String broad);

    public abstract Computer build();
}
