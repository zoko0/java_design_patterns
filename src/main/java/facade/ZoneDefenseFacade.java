package facade;


import java.util.List;

public class ZoneDefenseFacade {

    private final List<Player> players;

    public ZoneDefenseFacade() {
        this.players = List.of(
                new MarkerCupPlayer(),
                new SecondLinePlayer(),
                new Deep()
        );
    }

    public void startDefense() {
        executeAction(players, Player.Action.HIGH_FIVE, Player.Action.SETUP_POSITION);
    }

    public void coverZone() {
        executeAction(players, Player.Action.COVER_ZONE, Player.Action.ADJUST_POSITION);
    }

    private void executeAction(List<Player> players, Player.Action... actions) {
        for (Player player : players) {
            player.action(actions);
        }
    }

}
