package abstractFactory;

public class BeachGameFactory implements UltimateGameFactory {
    @Override
    public UltimateGame createGame() {
        return new BeachUltimateGame();
    }
}
