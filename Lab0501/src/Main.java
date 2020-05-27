import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main() throws HeadlessException {
        setTitle("First GUI App");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setBackground(Color.RED);
        add(panel, BorderLayout.CENTER);

        JPanel toolbar = new JPanel();
        toolbar.setBackground(Color.DARK_GRAY);
        toolbar.setLayout(new FlowLayout());

        JButton redButton = new JButton("Red");

        JButton greenButton = new JButton("Green");

        JButton blueButton = new JButton("Blue");
        toolbar.add(redButton);
        toolbar.add(greenButton);
        toolbar.add(blueButton);

        add(toolbar, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
