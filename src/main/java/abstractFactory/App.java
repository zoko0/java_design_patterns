package abstractFactory;

public class App {
    public static void main(String[] args) {
        var factory = new IndoorGameFactory();
        var indoorGame = factory.createGame();
        int playersCount = indoorGame.getNumberOfPlayer();
        System.out.println(playersCount);
    }
}
