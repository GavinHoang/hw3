//package hw3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CarIconZoomTest {

	public static void main(String[] args){
		JFrame frame = new JFrame();
		JPanel jp = new JPanel();
		frame.add(jp);
		
		CarIcon car = new CarIcon(100);   

		JLabel label = new JLabel(car);
		label.setBounds(100, 100, 100, 100);
		jp.setLayout(null);
		
		JButton zoomIn = new JButton("Zoom In");
		zoomIn.setBounds(10, 20, 100, 40);
		JButton zoomOut = new JButton("Zoom Out");
		zoomOut.setBounds(10, 60, 100, 40);
		jp.add(zoomIn);
		jp.add(zoomOut);
		
		label.setBounds(120, 80, 200, 200); // make sure 200, 200 position are bigger than CarIcon's size and setSize
		// if it is 120, 80, 100, 200), 100 is the width, when zoom in to 200, part of Icon will disappear. 
		jp.add(label);
		
		
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) { 
			// TODO Auto-generated method stub
			if(e.getSource() == zoomIn)
				car.setIconSize(200);
			else if(e.getSource() == zoomOut)
				car.setIconSize(50);
			label.repaint();
			}
		};
		
		zoomIn.addActionListener(listener);
		zoomOut.addActionListener(listener);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setSize(400, 300);
		frame.setVisible(true);
	}	
}
