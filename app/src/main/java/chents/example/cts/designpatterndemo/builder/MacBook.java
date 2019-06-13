package chents.example.cts.designpatterndemo.builder;

public class MacBook extends Computer {



    @Override
    public String toString() {
        return "MacBook{" +
                "board='" + board + '\'' +
                ", display='" + mDisplay + '\'' +
                ", os='" + mOs + '\'' +
                '}';
    }

    @Override
    public void setmOS() {

        mOs ="os";

    }

    @Override
    public void setBoard(String board) {

        this.board = board;
    }

    @Override
    public void setmDisplay(String display) {
        this.mDisplay = display;
    }

    public static class MacBookBuilder  {

         Computer macBook = new MacBook();


        public MacBookBuilder buildBoard(String board) {


            macBook.setBoard(board);
            return this;
        }


        public MacBookBuilder buildDisplay(String display) {

            macBook.setmDisplay(display);
            return this;
        }


        public Computer create() {
            return macBook;
        }
    }

}
