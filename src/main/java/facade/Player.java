package facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Player {

    private static final Logger LOGGER = LoggerFactory.getLogger(Player.class);

    public void highFiveTeammate() {
        LOGGER.info("{} high five", name());
    }

    public void coverYourZone() {
        LOGGER.info("{} covers zone", name());
    }

    public void adjustPosition() {
        LOGGER.info("{} adjusts zone", name());
    }


    private void action(Action action) {
        switch (action) {
            case HIGH_FIVE:
                highFiveTeammate();
                break;
            case COVER_ZONE:
                coverYourZone();
                break;
            case ADJUST_POSITION:
                adjustPosition();
                break;
            case SETUP_POSITION:
                setupPosition();
                break;
            default:
                LOGGER.info("Undefined action");
                break;
        }
    }



    public void action(Action... actions) {
        for (Action action : actions) {
            action(action);
        }
    }

    public abstract String name();

    public abstract void setupPosition();


    static enum Action {
        HIGH_FIVE, COVER_ZONE, ADJUST_POSITION, SETUP_POSITION
    }
}
