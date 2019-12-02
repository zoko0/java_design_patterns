package facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecondLinePlayer extends Player {

    private static final Logger LOGGER = LoggerFactory.getLogger(Player.class);

    @Override
    public String name() {
        return "Second line def player";
    }

    @Override
    public void setupPosition() {
        LOGGER.info("{} runs to to second line.", name());
    }
}
