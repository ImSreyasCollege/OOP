import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class shapes extends JPanel{

    public static void main(String[] args) {
        JFrame frame = new JFrame("Drawing Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);

        shapes app = new shapes();
        frame.add(app);
    }

    public void paint(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLUE);
        g.drawLine(100, 50, 400, 50);

        g.setColor(Color.RED); 
        g.fillRect(100, 100, 300, 100);

        g.setColor(Color.GREEN); 
        g.fillOval(100, 250, 100, 100);
    }
}

