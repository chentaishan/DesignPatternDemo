package chents.example.cts.designpatterndemo.builder;

public class MacBook extends Computer {




    @Override
    public void setmOS() {
        mOs = "mac OS 10.1";
    }

    @Override
    public String toString() {
        return "MacBook{" +
                "board='" + board + '\'' +
                ", display='" + mDisplay + '\'' +
                ", os='" + mOs + '\'' +
                '}';
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


        public MacBookBuilder buildOS() {
            macBook.setmOS();
            return this;
        }


        public Computer create() {
            return macBook;
        }
    }

}
