package chents.example.cts.designpatterndemo.builder;

public class Director {
    Builder builder=null;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(String board, String diaplay){

        builder.buildBoard(board);
        builder.buildDisplay(diaplay);
        builder.buildOS();
    }
}
