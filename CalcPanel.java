import java.util.*;
import javax.swing.*;
import javax.swing.text.JTextComponent;

import java.awt.*;
import java.awt.event.*;

public class CalcPanel extends JPanel implements ActionListener 
{

    JFrame frame;
    java.util.Timer timer;
    JTextField equation;
    JTextArea outputField;
    public CalcPanel(JFrame frame) 
    {
        this.frame = frame;
        this.setLayout(new FlowLayout());

        equation = new JTextField("Enter equation here", 50);
        equation.setEditable(true);
        equation.addActionListener(this);
        this.add(equation);

        outputField = new JTextArea("sigma rizz");
        outputField.setEditable(false);
        this.add(outputField);


        timer = new java.util.Timer();
        timer.schedule(new java.util.TimerTask()
        {
            @Override
            public void run()
            {
                repaint();
            }
        }, 0, 17);
    }

    public void paint(Graphics g) 
    {
        super.paint(g); 
        Graphics2D dogman = (Graphics2D) g;
    }



    @Override
    public void actionPerformed(ActionEvent e) 
    {
        int answer = preformCalculation(equation.getText());
        outputField.setText(String.valueOf(answer));

    }


    public int preformCalculation(String input) 
    {
        int answer = 0;

        return answer;
    }

}


