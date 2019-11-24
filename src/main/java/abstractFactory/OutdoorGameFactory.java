package abstractFactory;

public class OutdoorGameFactory implements UltimateGameFactory {
    @Override
    public UltimateGame createGame() {
        return new OutdoorUltimateGame();
    }
}
