package facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MarkerCupPlayer extends Player {

    private static final Logger LOGGER = LoggerFactory.getLogger(Player.class);

    @Override
    public String name() {
        return "Marker in Cup";
    }

    @Override
    public void setupPosition() {
        LOGGER.info("{} runs to handler with disk.", name());
    }
}
