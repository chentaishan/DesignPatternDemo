package chents.example.cts.designpatterndemo.builder;

/**
 * Created by chen on 19-6-13.
 */

public class Window extends Computer {


    @Override
    public void setmOS() {
        mOs="window 10";
    }

    @Override
    public void setBoard(String board) {
        this.board = board;
    }

    @Override
    public void setmDisplay(String display) {

        this.mDisplay = display;
    }

    @Override
    public String toString() {
        return "Window{" +
                "board='" + board + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOs='" + mOs + '\'' +
                '}';
    }

    public static class Builder{

      Computer windowOS =   new Window();

      public Builder setBoard(String board){

          windowOS.setBoard(board);

          return this;
      }

        public Builder setDisplay(String display){

            windowOS.setmDisplay(display);

            return this;
        }


        public Computer build(){

            return windowOS;
        }
    }
}
