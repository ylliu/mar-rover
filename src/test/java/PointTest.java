import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {
    @Test
    public void should_move_up() {
        assertEquals(new Point(0, 1), new Point(0, 0).move(Direction.NORTH));
    }

    @Test
    public void should_move_down() {
        assertEquals(new Point(0, -1), new Point(0, 0).move(Direction.SOUTH));
    }

    @Test
    public void should_move_left() {
        assertEquals(new Point(-1, 0), new Point(0, 0).move(Direction.WEST));
    }


    @Test
    public void should_move_right() {
        assertEquals(new Point(1, 0), new Point(0, 0).move(Direction.EAST));
    }
}
