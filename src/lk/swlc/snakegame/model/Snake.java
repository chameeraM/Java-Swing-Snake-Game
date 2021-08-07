package lk.swlc.snakegame.model;

import java.awt.*;

public class Snake {

    private final Image snakeDotImage;
    private final int dotSize;
    private int size;
    private final int[] xs;
    private final int[] ys;

    private Directions directions;

    public Snake(Image snakeDotImage,
                 final int dotSize,
                 final int maxSize,
                 final int startX) {

        this.snakeDotImage = snakeDotImage;
        this.dotSize = dotSize;
        size = 3;

        xs = new int[maxSize];
        ys = new int[xs.length];
        initCoords(startX);

        directions = Directions.RIGHT;
    }

    private void initCoords(int startX) {
        for (int dotIndex = 0; dotIndex < getSize(); dotIndex++) {
            xs[dotIndex] = startX - dotIndex * dotSize;
            ys[dotIndex] = startX;
        }
    }

    public Image getSnakeDotImage() {
        return snakeDotImage;
    }

    public int getSize() {
        return size;
    }

    public void incSize() {
        size++;
    }

    public int getX(int index) {
        return xs[index];
    }

    public int getY(int index) {
        return ys[index];
    }

    public void setX(int index, int value) {
        xs[index] = value;
    }

    public void setY(int index, int value) {
        ys[index] = value;
    }

    //Move Snake
    public void move() {
        moveTail();
        moveHead();
    }

    //Move Snake Tail
    private void moveTail() {
        for (int i = getSize(); i > 0; i--) {
            setX(i, getX(i - 1));
            setY(i, getY(i - 1));
        }
    }

    //Move Snake Head
    private void moveHead() {
        if (isMovingLeft()) {
            xs[0] -= dotSize;
        } else if (isMovingRight()) {
            xs[0] += dotSize;
        } else if (isMovingUp()) {
            ys[0] -= dotSize;
        } else if (isMovingDown()) {
            ys[0] += dotSize;
        }
    }

    public void setMovingDirection(Directions direction) {
        directions = direction;
    }

    //get Direction To LEFT
    public boolean isMovingLeft() {
        return directions == Directions.LEFT;
    }

    //get Direction To UP
    public boolean isMovingUp() {
        return directions == Directions.UP;
    }

    //get Direction To RIGHT
    public boolean isMovingRight() {
        return directions == Directions.RIGHT;
    }

    //get Direction To DOWN
    public boolean isMovingDown() {
        return directions == Directions.DOWN;
    }

    public int getMaxDotsNumber() {
        return xs.length;
    }
}
