package chents.example.cts.designpatterndemo.builder;

public   class MacBookBuilder extends Builder {

    private MacBook macBook = new MacBook();

    @Override
    public void buildBoard(String board) {
        macBook.setmBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        macBook.setmDisplay(display);
    }

    @Override
    public void buildOS() {
        macBook.setmOS();
    }

    @Override
    public Computer create() {
        return macBook;
    }
}
