package chainofresponsibility;

public abstract class AbstractPlayer {

    private AbstractPlayer nextAbstractPlayer; //next element in chain

    void setNextPlayer(AbstractPlayer abstractPlayer) {
        nextAbstractPlayer = abstractPlayer;
    }

    void passDisk() {
        if (nextAbstractPlayer != null) {
            System.out.println("Passed disk to " + nextAbstractPlayer);
            nextAbstractPlayer.passDisk();
        }
        else System.out.println("Score point in endzone");
    }

    abstract protected void gotDisk();

}
