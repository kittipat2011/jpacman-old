package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

/**
 * Test class for the Board.
 */
public class BoardTest {
    private static final int WIDTH = 1;
    private static final int HEIGHT = 1;


    private final Square[][] grid = {
        { mock(Square.class) },
    };
    private final Board board = new Board(grid);

    /**
     * Verifies the board has the correct width.
     */
    @Test
    void verifyWidth() {
        assertThat(board.getWidth()).isEqualTo(WIDTH);
    }

    /**
     * Verifies the board has the correct height.
     */
    @Test
    void verifyHeight() {
        assertThat(board.getHeight()).isEqualTo(HEIGHT);
    }

    /**
     * Verify that squares at key positions are properly set.
     * @param x location of grid in x axis
     * @param y location of grid in y axis
     */
    @ParameterizedTest
    @CsvSource({
        "0, 0"
    })
    void testSquareAt(int x, int y) {
        assertThat(board.squareAt(x, y)).isEqualTo(grid[x][y]);
    }
}
