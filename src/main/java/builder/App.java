package builder;

public class App {
    public static void main(String[] args) {
        var player = new Player.PlayerBuilder("Bartek").withHeight(180).withPosition("handler").build();
    }
}
