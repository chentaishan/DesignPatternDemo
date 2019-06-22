package chents.example.cts.designpatterndemo.builder;

public class MacBook extends Computer {

    String board;
    String display;
    String os;
    public MacBook() {
        this(new MacBookBuilder());
    }

    public MacBook(MacBookBuilder macBookBuilder) {

        board = macBookBuilder.board;
        display = macBookBuilder.display;
        os = macBookBuilder.os;

    }

    public MacBook(String board, String display, String os) {
        this.board = board;
        this.display = display;
        this.os = os;
    }

    @Override
    public String toString() {
        return "MacBook{" +
                "board='" + board + '\'' +
                ", display='" + display + '\'' +
                ", os='" + os + '\'' +
                '}';
    }

    @Override
    public void setmOS() {
        mOS = "mac OS 10.1";
    }

    public static class MacBookBuilder extends Builder {

        //        private MacBook macBook = new MacBook();
        String board;
        String display;
        String os;

        @Override
        public Builder buildBoard(String board) {

            this.board = board;
            return this;
        }

        @Override
        public Builder buildDisplay(String display) {

            this.display = display;
            return this;
        }

        @Override
        public Builder buildOS() {
           this.os = "华为";
            return this;
        }

        @Override
        public Computer create() {
            return new MacBook(board,display,os);
        }
    }

}
