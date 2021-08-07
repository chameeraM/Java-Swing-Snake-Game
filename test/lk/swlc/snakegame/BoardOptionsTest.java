package lk.swlc.snakegame;

import lk.swlc.snakegame.model.BoardOptions;
import org.junit.Test;

import static lk.swlc.snakegame.model.BoardOptions.*;
import static org.junit.Assert.*;

public class BoardOptionsTest {
    BoardOptions boardOptions = new BoardOptions(DOT_SIZE,
            DOTS_NUMBER_PER_DIMENSION,
            SNAKE_DOT_IMAGE_LOCATION,
            APPLE_IMAGE_LOCATION,
            BACKGROUND_IMAGE_LOCATION);

    @Test
    public void TestgetDotSize() {
        assertEquals(16, boardOptions.getDotSize());
    }

    @Test
    public void TestgetWindowSizePerDimension() {
        assertEquals(boardOptions.getDotSize() * DOTS_NUMBER_PER_DIMENSION, boardOptions.getWindowSizePerDimension());
    }

    @Test
    public void TestgetAllDotsNumber() {
        assertEquals((int) Math.pow(DOTS_NUMBER_PER_DIMENSION, 2), boardOptions.getAllDotsNumber());
    }

    @Test
    public void TestgetSnakeDotImageLocation() {
        assertEquals(SNAKE_DOT_IMAGE_LOCATION, boardOptions.getSnakeDotImageLocation());
    }

    @Test
    public void TestgetAppleImageLocation() {
        assertEquals(APPLE_IMAGE_LOCATION, boardOptions.getAppleImageLocation());
    }

    @Test
    public void TestgetBackgroundImageLocation() {
        assertEquals(BACKGROUND_IMAGE_LOCATION, boardOptions.getBackgroundImageLocation());
    }


}
