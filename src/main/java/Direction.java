public enum Direction {
    NORTH(0),
    EAST(1),
    SOUTH(2),
    WEST(3);

    private int value;

    Direction(int newValue) {
        value = newValue;
    }

    public Direction changeDirection(int directionStep) {
        int directions = Direction.values().length;
        int index = (directions + this.getValue() + directionStep) % directions;
        return Direction.values()[index];
    }

    public Direction getBackwardDirection() {
        return values()[(this.getValue() + 2) % 4];
    }

    public int getValue() {
        return value;
    }
}
