import java.awt.Frame;
import java.awt.Button;
import java.awt.Color;
import java.awt.Label;

import java.awt.event.*;

public class BackgroundButtons extends Frame implements ActionListener {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    Button RedButton, GreenButton, BlueButton;

    BackgroundButtons() {
        RedButton = new Button("Red");
        RedButton.setBounds(50, 100, 100, 20);
        BlueButton = new Button("Blue");
        BlueButton.setBounds(50, 150, 100, 20);
        GreenButton = new Button("Green");
        GreenButton.setBounds(50, 200, 100, 20);

        add(RedButton);
        add(BlueButton);
        add(GreenButton);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);

        RedButton.addActionListener(this);
        BlueButton.addActionListener(this);
        GreenButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String clickedButton = e.getActionCommand();
        System.out.println(clickedButton + "button clicked");
        if (e.getSource() == RedButton) {
            setBackground(Color.red);
        } else if (e.getSource() == GreenButton) {
            setBackground(Color.green);
        } else {
            setBackground(Color.blue);
        }
    }

    public static void main(String[] args) {
        new BackgroundButtons();
    }
}
