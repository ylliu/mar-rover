import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DirectionTest {
    @Test
    public void should_return_backward_direction() {
        assertEquals(Direction.SOUTH, Direction.NORTH.getBackwardDirection());
        assertEquals(Direction.WEST, Direction.EAST.getBackwardDirection());
        assertEquals(Direction.EAST, Direction.WEST.getBackwardDirection());
        assertEquals(Direction.NORTH, Direction.SOUTH.getBackwardDirection());
    }
}
