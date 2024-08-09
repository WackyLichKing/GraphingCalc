import java.util.*;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

import java.awt.*;
import java.awt.event.*;

public class CalcFrame extends javax.swing.JFrame{
    // constructor
    public CalcFrame() {
    // abstraction, adding panel to the frame, initializing panel
    CalcPanel panel = new CalcPanel(this); 

    // inserting panel at 0,0
    panel.setLocation(0,0);

    //size
    panel.setSize(new DimensionUIResource(1000,1000));

    // background color, find out if we can make the background a grid
    panel.setBackground(Color.white);
    panel.setVisible(true);
    this.add(panel);

   // addKeyListener(new KeyChecker(panel));
    }
}