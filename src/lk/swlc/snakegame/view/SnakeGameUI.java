package lk.swlc.snakegame.view;

import lk.swlc.snakegame.model.BoardOptions;
import lk.swlc.snakegame.panel.BoardPanel;

import javax.swing.*;
import java.awt.*;

public class SnakeGameUI extends JFrame {

    //    Open Game

    public SnakeGameUI(final BoardOptions boardOptions) {
        super("Snake-Game");

        getContentPane().add(new BoardPanel(boardOptions));
        pack();

        setWindow();
    }

    /**
     * Open Windows Settings
     */
    private void setWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationInCenter();
        setVisible(true);
    }

    /**
     * Manage Windows Center on Screen
     */
    private void setLocationInCenter() {
        setLocationRelativeTo(null);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(
                screenSize.width / 2 - this.getSize().width / 2,
                screenSize.height / 2 - this.getSize().height / 2);
    }
}
