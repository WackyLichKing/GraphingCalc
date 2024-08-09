import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator
{

  public static void main(String args[])
  {
    // Making the frame for the gui
  CalcFrame test = new CalcFrame();
    // what should the gui do when you press x
  test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  // resolution
  test.setSize(new Dimension(1250, 1000));

  // This is how I decided the position of the frame
  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
  test.setLocation((int) (screenSize.getWidth()/2 - test.getSize().getWidth()/2), (int)(screenSize.getHeight()/2 - test.getSize().getHeight()/2));

  // Basic things, cant change window size, title of program, and if they can see it running
  test.setResizable(false);
  test.setTitle("Graphing Calculator");
  test.setVisible(true);
  }
}
