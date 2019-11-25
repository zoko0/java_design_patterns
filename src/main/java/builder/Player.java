package builder;

final class Player {
        private final String name;
        private final String position;
        private final int height;

    private Player(PlayerBuilder builder) {
        this.name = builder.name;
        this.position = builder.position;
        this.height = builder.height;
    }


    public static class PlayerBuilder {
        private final String name;
        private String position;
        private int height;

        public PlayerBuilder(String name) {
            this.name = name;
        }

        public PlayerBuilder withPosition(String position) {
            this.position = position;
            return this;
        }

        public PlayerBuilder withHeight(int height) {
            this.height = height;
            return this;
        }

        public Player build() {
            return new Player(this);
        }
    }

    }
