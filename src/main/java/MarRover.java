import java.util.ArrayList;
import java.util.List;

public class MarRover {
    private Point point;
    private Direction direction;
    private List<Command> commands = new ArrayList<>();

    public MarRover(Point point, Direction direction) {
        this.point = point;
        this.direction = direction;
    }

    public Direction direction() {
        return this.direction;
    }

    public void receiveCommands(List<Command> commands) {
        this.commands = commands;
    }

    public List<Command> commands() {
        return this.commands;
    }

    public void move() {
        for (Command command : commands) {
            switch (command) {
                case F -> moveForward();
                case B -> moveBack();
                case R -> turnRight();
                case L -> turnLeft();
            }
        }
    }

    public void moveForward() {
        this.point = this.point.move(this.direction);
    }

    public void moveBack() {
        this.point = this.point.move(this.direction.getBackwardDirection());
    }

    public void turnLeft() {
        direction = direction.changeDirection(-1);
    }

    public void turnRight() {
        direction = direction.changeDirection(1);
    }

    public Point point() {
        return this.point;
    }
}
