import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class RadioButtonDemo extends JFrame implements ActionListener {
    private JRadioButton birdButton, catButton, dogButton, rabbitButton, pigButton;
    private JLabel imageLabel;
    private ButtonGroup group;

    public RadioButtonDemo() {
        // Create the frame
        setTitle("Radio Button Demo");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create radio buttons
        birdButton = new JRadioButton("Bird");
        catButton = new JRadioButton("Cat");
        dogButton = new JRadioButton("Dog");
        rabbitButton = new JRadioButton("Rabbit");
        pigButton = new JRadioButton("Pig");

        // Add action listeners
        birdButton.addActionListener(this);
        catButton.addActionListener(this);
        dogButton.addActionListener(this);
        rabbitButton.addActionListener(this);
        pigButton.addActionListener(this);

        // Group the radio buttons
        group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
        group.add(pigButton);

        // Create a panel for the radio buttons
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new BoxLayout(radioPanel, BoxLayout.Y_AXIS));
        radioPanel.setBorder(BorderFactory.createTitledBorder("Select an Animal"));
        radioPanel.add(birdButton);
        radioPanel.add(catButton);
        radioPanel.add(dogButton);
        radioPanel.add(rabbitButton);
        radioPanel.add(pigButton);

        // Create a label to display the selected pet image
        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        imageLabel.setPreferredSize(new Dimension(250, 250));

        // Create a panel for the image label
        JPanel imagePanel = new JPanel();
        imagePanel.setLayout(new BorderLayout());
        imagePanel.setBorder(BorderFactory.createTitledBorder("Image Display"));
        imagePanel.add(imageLabel, BorderLayout.CENTER);

        // Add the radio buttons and image panel to the frame
        add(radioPanel, BorderLayout.WEST);
        add(imagePanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Display the selected pet image
        if (e.getSource() == birdButton) {
            imageLabel.setIcon(new ImageIcon(new ImageIcon("bird.png").getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
        } else if (e.getSource() == catButton) {
            imageLabel.setIcon(new ImageIcon(new ImageIcon("cat.png").getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
        } else if (e.getSource() == dogButton) {
            imageLabel.setIcon(new ImageIcon(new ImageIcon("dog.png").getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
        } else if (e.getSource() == rabbitButton) {
            imageLabel.setIcon(new ImageIcon(new ImageIcon("rabbit.png").getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
        } else if (e.getSource() == pigButton) {
            imageLabel.setIcon(new ImageIcon(new ImageIcon("pig.png").getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RadioButtonDemo().setVisible(true);
        });
    }
}
