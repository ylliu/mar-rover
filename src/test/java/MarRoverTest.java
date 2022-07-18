import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarRoverTest {
    @Test
    public void mar_rover_should_initial_with_position_and_direction() {
        MarRover marRover = new MarRover(new Point(5, 6), Direction.WEST);
        assertEquals(Direction.WEST, marRover.direction());
        assertEquals(new Point(5, 6), marRover.point());
    }

    @Test
    public void mar_rover_should_receives_a_character_array_of_commands() {
        MarRover marRover = new MarRover(new Point(5, 6), Direction.WEST);
        marRover.receiveCommands(List.of(Command.L, Command.R, Command.F, Command.B));
        assertEquals(List.of(Command.L, Command.R, Command.F, Command.B), marRover.commands());
    }

    @Test
    public void should_move_the_mar_rover_forward_when_facing_east() {
        MarRover marRover = new MarRover(new Point(5, 6), Direction.EAST);
        marRover.moveForward();
        assertEquals(new Point(6, 6), marRover.point());
    }

    @Test
    public void should_move_the_mar_rover_forward_when_facing_north() {
        MarRover marRover = new MarRover(new Point(5, 6), Direction.NORTH);
        marRover.moveForward();
        assertEquals(new Point(5, 7), marRover.point());
    }

    @Test
    public void should_move_the_mar_rover_forward_when_facing_west() {
        MarRover marRover = new MarRover(new Point(5, 6), Direction.WEST);
        marRover.moveForward();
        assertEquals(new Point(4, 6), marRover.point());

    }


    @Test
    public void should_move_the_mar_rover_forward_when_facing_south() {
        MarRover marRover = new MarRover(new Point(5, 6), Direction.SOUTH);
        marRover.moveForward();
        assertEquals(new Point(5, 5), marRover.point());
    }

    @Test
    public void should_move_the_mar_rover_back_when_facing_east() {
        MarRover marRover = new MarRover(new Point(5, 6), Direction.EAST);
        marRover.moveBack();
        assertEquals(new Point(4, 6), marRover.point());
    }

    @Test
    public void should_move_the_mar_rover_back_when_facing_north() {
        MarRover marRover = new MarRover(new Point(5, 6), Direction.NORTH);
        marRover.moveBack();
        assertEquals(new Point(5, 5), marRover.point());
    }

    @Test
    public void should_move_the_mar_rover_back_when_facing_west() {
        MarRover marRover = new MarRover(new Point(5, 6), Direction.WEST);
        marRover.moveBack();
        assertEquals(new Point(6, 6), marRover.point());
    }

    @Test
    public void should_move_the_mar_rover_back_when_facing_south() {
        MarRover marRover = new MarRover(new Point(5, 6), Direction.SOUTH);
        marRover.moveBack();
        assertEquals(new Point(5, 7), marRover.point());
    }


    @Test
    public void should_move_the_mar_rover_with_f_b_commands() {
        MarRover marRover = new MarRover(new Point(5, 6), Direction.NORTH);
        marRover.receiveCommands(List.of(Command.F, Command.B, Command.B));
        marRover.move();
        assertEquals(new Point(5, 5), marRover.point());
    }

    @Test
    public void should_turn_the_mar_rover_left_when_facing_east() {
        MarRover marRover = new MarRover(new Point(5, 6), Direction.EAST);
        marRover.turnLeft();
        assertEquals(Direction.NORTH, marRover.direction());
    }

    @Test
    public void should_turn_the_mar_rover_left_when_facing_north() {
        MarRover marRover = new MarRover(new Point(5, 6), Direction.NORTH);
        marRover.turnLeft();
        assertEquals(Direction.WEST, marRover.direction());
    }

    @Test
    public void should_turn_the_mar_rover_left_when_facing_west() {
        MarRover marRover = new MarRover(new Point(5, 6), Direction.WEST);
        marRover.turnLeft();
        assertEquals(Direction.SOUTH, marRover.direction());
    }

    @Test
    public void should_turn_the_mar_rover_left_when_facing_south() {
        MarRover marRover = new MarRover(new Point(5, 6), Direction.SOUTH);
        marRover.turnLeft();
        assertEquals(Direction.EAST, marRover.direction());
    }

    @Test
    public void should_turn_the_mar_rover_right_when_facing_east() {
        MarRover marRover = new MarRover(new Point(5, 6), Direction.EAST);
        marRover.turnRight();
        assertEquals(Direction.SOUTH, marRover.direction());
    }

    @Test
    public void should_turn_the_mar_rover_right_when_facing_north() {
        MarRover marRover = new MarRover(new Point(5, 6), Direction.NORTH);
        marRover.turnRight();
        assertEquals(Direction.EAST, marRover.direction());
    }

    @Test
    public void should_turn_the_mar_rover_right_when_facing_west() {
        MarRover marRover = new MarRover(new Point(5, 6), Direction.WEST);
        marRover.turnRight();
        assertEquals(Direction.NORTH, marRover.direction());
    }

    @Test
    public void should_turn_the_mar_rover_right_when_facing_south() {
        MarRover marRover = new MarRover(new Point(5, 6), Direction.SOUTH);
        marRover.turnRight();
        assertEquals(Direction.WEST, marRover.direction());
    }

    @Test
    public void should_move_the_mar_rover_with_f_b_l_r_commands() {
        MarRover marRover = new MarRover(new Point(5, 6), Direction.NORTH);
        marRover.receiveCommands(List.of(Command.F, Command.B, Command.L, Command.F, Command.R, Command.B));
        marRover.move();
        assertEquals(new Point(4, 5), marRover.point());
    }

}
