import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {
    CanvasPanel canvasPanel = new CanvasPanel();

    Main() {
        add(canvasPanel);
    }

    public static void main(String[] args) {
        Main frame = new Main();

        frame.setTitle("Chessboard");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    class CanvasPanel extends JPanel {


        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            int dw = getWidth() / 8;
            int dh = getHeight() / 8;

            for (int i = 0; i < 8; ++i) {
                for (int j = 0; j < 8; ++j) {
                    Color c;
                    if (i % 2 == 0) {
                        c = j % 2 == 0 ? Color.BLACK: Color.WHITE;
                    } else {
                        c = j % 2 == 0 ? Color.WHITE: Color.BLACK;
                    }
                    g.setColor(c);
                    g.fillRect(dw * j, dh * i, dw, dh);
                }
            }
        }

    }

}
