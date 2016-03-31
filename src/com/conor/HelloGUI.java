package com.conor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by conor on 3/31/16.
 */
public class HelloGUI extends JFrame{
    private JPanel rootPanel;
    private JButton clickMeButton;
    private JLabel myFirstLabel;

    HelloGUI() {
        setContentPane(rootPanel);
        pack();
        setVisible(true);

        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Add code events here

                myFirstLabel.setText("You just clicked a button!");
            }
        });
    }

}
