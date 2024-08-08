package clientcode;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TotemView {

    private JFrame frame;
    private JPanel panel;

    public TotemView(String title) {

        frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(new JScrollPane(panel));

        frame.setVisible(true);
    }

    public void clearPanel() {
        panel.removeAll();
        panel.revalidate();
        panel.repaint();
    }

    public void addFlights(List<String> flights) {

        for (String flight : flights) {
            JLabel flightLabel = new JLabel(flight);
            flightLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

            panel.add(flightLabel);
        }

        panel.revalidate();
        panel.repaint();
    }
}
