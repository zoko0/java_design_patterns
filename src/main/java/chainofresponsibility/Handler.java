package chainofresponsibility;

public class Handler extends AbstractPlayer {

    @Override
    void passDisk() {
        gotDisk();
        super.passDisk();
    }

    @Override
    protected void gotDisk() {
        System.out.println("Handler got disk");
    }
}
