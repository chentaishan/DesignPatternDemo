package chents.example.cts.designpatterndemo.builder;

public abstract class Computer {
    protected String mBoard;
    protected String mDisplay;
    protected String mOS;


    public void setmBoard(String mBoard) {
        this.mBoard = mBoard;
    }


    public void setmDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }


    public abstract void setmOS();

    @Override
    public String toString() {
        return "Computer{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOS='" + mOS + '\'' +
                '}';
    }
}
