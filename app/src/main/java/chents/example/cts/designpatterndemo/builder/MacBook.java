package chents.example.cts.designpatterndemo.builder;

public class MacBook extends Computer {

    String board;
    String display;
    String os;



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


        String broad;
        String display;
        String os;


        @Override
        public Builder buildOs(String os) {
            this.os = os;
            return null;
        }

        @Override
        public Builder buildDisplay(String display) {

            this.display = display;
            return this;
        }

        @Override
        public Builder buildBroad(String broad) {
            this.broad = broad;
            return null;
        }

        @Override
        public Computer build() {
            return new MacBook(broad,display,os);
        }




    }

}
