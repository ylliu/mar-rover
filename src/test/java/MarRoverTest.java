import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarRoverTest {
    @Test
    public void mar_rover_should_initial_with_position_and_direction() {
        MarRover marRover = new MarRover(5, 6, Direction.W);
        assertEquals(Direction.W, marRover.direction());
        assertEquals(5, marRover.x());
        assertEquals(6, marRover.y());
    }

    @Test
    public void mar_rover_should_receives_a_character_array_of_commands() {
        MarRover marRover = new MarRover(5, 6, Direction.W);
        marRover.receiveCommands(List.of(Command.L, Command.R, Command.F, Command.B));
        assertEquals(List.of(Command.L, Command.R, Command.F, Command.B), marRover.commands());
    }

    @Test
    public void should_move_the_mar_rover_forward_when_facing_east() {
        MarRover marRover = new MarRover(5, 6, Direction.E);
        marRover.moveForward();
        assertEquals(6, marRover.x());
        assertEquals(6, marRover.y());
    }

    @Test
    public void should_move_the_mar_rover_forward_when_facing_north() {
        MarRover marRover = new MarRover(5, 6, Direction.N);
        marRover.moveForward();
        assertEquals(5, marRover.x());
        assertEquals(7, marRover.y());
    }

    @Test
    public void should_move_the_mar_rover_forward_when_facing_west() {
        MarRover marRover = new MarRover(5, 6, Direction.W);
        marRover.moveForward();
        assertEquals(4, marRover.x());
        assertEquals(6, marRover.y());
    }


    @Test
    public void should_move_the_mar_rover_forward_when_facing_south() {
        MarRover marRover = new MarRover(5, 6, Direction.S);
        marRover.moveForward();
        assertEquals(5, marRover.x());
        assertEquals(5, marRover.y());
    }

    @Test
    public void should_move_the_mar_rover_back_when_facing_east() {
        MarRover marRover = new MarRover(5, 6, Direction.E);
        marRover.moveBack();
        assertEquals(4, marRover.x());
        assertEquals(6, marRover.y());
    }

    @Test
    public void should_move_the_mar_rover_back_when_facing_north() {
        MarRover marRover = new MarRover(5, 6, Direction.N);
        marRover.moveBack();
        assertEquals(5, marRover.x());
        assertEquals(5, marRover.y());
    }

    @Test
    public void should_move_the_mar_rover_back_when_facing_west() {
        MarRover marRover = new MarRover(5, 6, Direction.W);
        marRover.moveBack();
        assertEquals(6, marRover.x());
        assertEquals(6, marRover.y());
    }

    @Test
    public void should_move_the_mar_rover_back_when_facing_south() {
        MarRover marRover = new MarRover(5, 6, Direction.S);
        marRover.moveBack();
        assertEquals(5, marRover.x());
        assertEquals(7, marRover.y());
    }

    @Test
    public void should_move_the_mar_rover_with_f_b_commands() {
        MarRover marRover = new MarRover(5, 6, Direction.N);
        marRover.receiveCommands(List.of(Command.F, Command.B, Command.B));
        marRover.move();
        assertEquals(5, marRover.x());
        assertEquals(5, marRover.y());
    }
}
