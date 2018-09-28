package hw3;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ButtonChangeColor implements Icon {

    private Color color;
    private int size = 25; // default size

    public ButtonChangeColor() {
        color = Color.red;
    }

    @Override
    public int getIconWidth() {
        return size;
    }

    @Override
    public int getIconHeight() {
        return size;
    }

    public void setColor(Color color) { // user defined method
        this.color=color;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D.Double circle = new Ellipse2D.Double(0, 0, size, size);
        g2.setColor(color);
        g2.fill(circle);
    }    

    public static void main(String[] args) 
    {
    		final int FIELD_WIDTH = 20;
        JFrame frame = new JFrame();
        JButton redButton = new JButton("RED");
		JButton greenButton = new JButton("GREEN");
		JButton blueButton = new JButton("BLUE"); 
		
		JTextField textField = new JTextField(FIELD_WIDTH);
        textField.setText("Click a button!");

        ButtonChangeColor myCircle = new ButtonChangeColor();
        JLabel myLabel = new JLabel(myCircle);

        frame.setLayout(new FlowLayout());
        frame.add(myLabel);
        frame.add(redButton);
        frame.add(greenButton);
        frame.add(blueButton);

		
        ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 if(e.getSource() == redButton)
					 myCircle.setColor(Color.red);
				 else if(e.getSource() == greenButton)
					 myCircle.setColor(Color.green);
				 else if(e.getSource() == blueButton)
					 myCircle.setColor(Color.blue); 
				 myLabel.repaint();
			}
        };

       redButton.addActionListener(listener);
       greenButton.addActionListener(listener);
       blueButton.addActionListener(listener);
        

       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
       frame.pack();
       frame.setSize(500, 150);
       frame.setVisible(true); 
    }	
}
