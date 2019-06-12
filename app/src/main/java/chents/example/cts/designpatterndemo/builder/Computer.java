package chents.example.cts.designpatterndemo.builder;

public abstract class Computer {

    protected String board;
    protected String mDisplay;
    protected String mOs;

    public abstract void setmOS();


    public void setBoard(String board) {
        this.board = board;
    }

    public void setmDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }

    public void setmOs(String mOs) {
        this.mOs = mOs;
    }



}
