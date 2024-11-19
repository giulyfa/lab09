package it.unibo.mvc;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


/**
 * A very simple program using a graphical interface.
 * 
 */
public final class SimpleGUIWithFileChooser extends SimpleGUI{

    private final JFrame frame = new JFrame();
    
    private SimpleGUIWithFileChooser() {
        super();
        final JPanel secondPanel = new JPanel();
        final BorderLayout seclayout = new BorderLayout();
        final JButton browse = new JButton("Browse");
        final JTextField textF = new JTextField("Write here:");

        secondPanel.add(browse, BorderLayout.NORTH);
        secondPanel.setLayout(seclayout);



    }
}
