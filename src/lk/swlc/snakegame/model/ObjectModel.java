package lk.swlc.snakegame.model;

import java.awt.*;
import java.io.Serializable;

/**
 * DOG Object encapsulation Class
 * getter/setter/tostring
 */

public final class ObjectModel implements Serializable {
    private Image image;
    private int x;
    private int y;

    public ObjectModel(Image image) {
        this.image = image;
        x = 0;
        y = 0;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "DogObjectModel{" +
                "image=" + image +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
