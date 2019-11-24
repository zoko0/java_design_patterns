package abstractFactory;

public class IndoorGameFactory implements UltimateGameFactory {
    @Override
    public UltimateGame createGame() {
        return new IndoorUltimateGame();
    }
}
