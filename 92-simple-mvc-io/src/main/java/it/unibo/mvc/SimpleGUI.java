package it.unibo.mvc;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * A very simple program using a graphical interface.
 * 
 */
public final class SimpleGUI {

    private final static JFrame frame = new JFrame();

    public SimpleGUI() {
        final JPanel myPanel = new JPanel();
        final BorderLayout layout = new BorderLayout();
        final JTextArea textA = new JTextArea("Write here: ");
        final JButton save = new JButton("Save");
        final Controller controller = new Controller();
        
        myPanel.setLayout(layout);
        myPanel.add(textA, BorderLayout.CENTER);
        myPanel.add(save, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        save.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               controller.writeonFile(textA.getText());
            }
            
        });

        frame.setContentPane(myPanel);
    }

    public void display() {
        frame.pack();
        frame.setVisible(true);
        
    }

    public static void main(String[] args) {
        new SimpleGUI().display();
    }

}
