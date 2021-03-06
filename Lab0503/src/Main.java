import sun.invoke.empty.Empty;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
    private JPanel panel;

    public Main() throws HeadlessException {
        setTitle("First GUI App");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.addMouseMotionListener(new  MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                setTitle(e.getX() + ", " + e.getY());

            }
        });

        add(panel, BorderLayout.CENTER);
    }


    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}