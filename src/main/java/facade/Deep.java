package facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Deep extends Player {

    private static final Logger LOGGER = LoggerFactory.getLogger(Player.class);

    @Override
    public String name() {
        return "Deep";
    }

    @Override
    public void setupPosition() {
        LOGGER.info("{} stays defending for long shots.", name());
    }
}
