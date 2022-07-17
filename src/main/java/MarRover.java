import java.util.ArrayList;
import java.util.List;

public class MarRover {
    private int y;
    private int x;
    private Direction direction;
    private List<Command> commands = new ArrayList<>();

    public MarRover(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Direction direction() {
        return this.direction;
    }

    public int x() {
        return this.x;
    }

    public int y() {
        return this.y;
    }

    public void receiveCommands(List<Command> commands) {
        this.commands = commands;
    }

    public List<Command> commands() {
        return this.commands;
    }

    public void moveForward() {
        if (this.direction == Direction.E) {
            this.x++;
        }
        if (this.direction == Direction.N) {
            this.y++;
        }
        if (this.direction == Direction.W) {
            this.x--;
        }
        if (this.direction == Direction.S) {
            this.y--;
        }
    }

    public void moveBack() {
        if (this.direction == Direction.E) {
            this.x--;
        }
        if (this.direction == Direction.N) {
            this.y--;
        }
        if (this.direction == Direction.W) {
            this.x++;
        }
        if (this.direction == Direction.S) {
            this.y++;
        }
    }

    public void move() {
        for (Command command : commands) {
            if (command == Command.F) {
                moveForward();
            }
            if (command == Command.B) {
                moveBack();
            }
        }
    }
}
