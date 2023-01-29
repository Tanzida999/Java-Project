import javax.swing.*;

/**
 * Created by User on 1/19/2023.
 */
public class GameFrame extends JFrame {
    GameFrame(){
       this.add(new GamePanelImpl());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
