package lk.swlc.snakegame;

import lk.swlc.snakegame.model.Snake;
import org.junit.Test;

import javax.swing.*;

import static lk.swlc.snakegame.model.BoardOptions.DOTS_NUMBER_PER_DIMENSION;
import static org.junit.Assert.*;

public class SnakeTest {

    Snake snake= new Snake(new ImageIcon("images.png").getImage(),
            16, (int) Math.pow(DOTS_NUMBER_PER_DIMENSION, 2),  600/2);

    @Test
    public void TestgetSize() {
         assertEquals(3,snake.getSize());
    }

    @Test
    public void TestgetSnakeDotImage() {
         assertEquals(new ImageIcon("images.png").getImage(),snake.getSnakeDotImage());
    }
    @Test
    public void TestisMovingLeft() {
         assertEquals(true,snake.isMovingLeft());
    }
    @Test
    public void TestisMovingUp() {
         assertEquals(true,snake.isMovingUp());
    }
    @Test
    public void TestisMovingRight() {
         assertEquals(true,snake.isMovingRight());
    }
    @Test
    public void TestisMovingDown() {
         assertEquals(true,snake.isMovingDown());
    }



}
