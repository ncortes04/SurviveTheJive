import java.util.Scanner;

import javax.swing.JFrame;

public class Main {
    static GameState state = new GameState();
    static Scenario currScenario = state.gameArray.get(0);
    static KeyInputHandler keyH = new KeyInputHandler();
    public static void main(String[] args) throws Exception{
        // JFrame window = new JFrame();
        // window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // window.setResizable(false);
        // window.setTitle("Oregon Trail");
        GamePanel gamePanel = new GamePanel();
        gamePanel.run();
        // window.add(gamePanel);
        // window.pack();

        // window.setLocationRelativeTo(null);
        // window.setVisible(true);

    }
    
    
    
    
}

