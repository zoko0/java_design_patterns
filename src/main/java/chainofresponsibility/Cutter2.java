package chainofresponsibility;

public class Cutter2 extends AbstractPlayer {

    @Override
    void passDisk() {
        gotDisk();
        super.passDisk();
    }

    @Override
    protected void gotDisk() {
        System.out.println("Cutter2 got disk");
    }
}
