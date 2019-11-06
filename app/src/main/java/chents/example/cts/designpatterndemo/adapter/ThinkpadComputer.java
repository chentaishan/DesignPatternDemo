package chents.example.cts.designpatterndemo.adapter;

public class ThinkpadComputer implements IComputer {
    @Override
    public String readSd(SDcard sDcard) {
        return sDcard.readCard();
    }
}
