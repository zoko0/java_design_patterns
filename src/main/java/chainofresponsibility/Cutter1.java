package chainofresponsibility;

public class Cutter1 extends AbstractPlayer {

    @Override
    void passDisk() {
        gotDisk();
        super.passDisk();
    }

    @Override
    protected void gotDisk() {
        System.out.println("Cutter1 got disk");
    }
}
