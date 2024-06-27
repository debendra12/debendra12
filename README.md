import javax.swing.*;
import java.awt.*;

public class DottedLinesExample extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set the stroke to dotted
        float[] dashPattern = {5.0f}; // Adjust this value to change the length of dashes
        BasicStroke stroke = new BasicStroke(1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER,
                                             10.0f, dashPattern, 0.0f);
        g2d.setStroke(stroke);

        // Draw the first dotted line
        g2d.drawLine(50, 50, 250, 50);

        // Draw the second dotted line with a gap
        g2d.drawLine(50, 100, 250, 100);

        // Draw the third dotted line with a gap
        g2d.drawLine(50, 150, 250, 150);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Dotted Lines Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new DottedLinesExample());
            frame.setSize(300, 200);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
