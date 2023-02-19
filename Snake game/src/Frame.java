import javax.swing.*;

public class Frame extends JFrame {
    Frame() {
        this.add(new panel());
        this.setTitle("SnakeGame");
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
    }
}
