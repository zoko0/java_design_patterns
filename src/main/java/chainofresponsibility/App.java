package chainofresponsibility;

public class App {
    public static void main(String[] args) {
        AbstractPlayer playerChain = getChainOfPlayers();
        playerChain.passDisk();
    }

    private static AbstractPlayer getChainOfPlayers() {
        AbstractPlayer handler = new Handler();
        AbstractPlayer cutter1 = new Cutter1();
        AbstractPlayer cutter2 = new Cutter2();

        handler.setNextPlayer(cutter1);
        cutter1.setNextPlayer(cutter2);

        return handler;
    }
}
