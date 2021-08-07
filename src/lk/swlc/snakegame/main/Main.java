package lk.swlc.snakegame.main;

import lk.swlc.snakegame.model.BoardOptions;
import lk.swlc.snakegame.view.SnakeGameUI;


import static lk.swlc.snakegame.model.BoardOptions.*;

public class Main {

    public static void main(String[] args) {


        new SnakeGameUI(new BoardOptions(DOT_SIZE,
                DOTS_NUMBER_PER_DIMENSION,
                SNAKE_DOT_IMAGE_LOCATION,
                APPLE_IMAGE_LOCATION,
                BACKGROUND_IMAGE_LOCATION));
    }
}
