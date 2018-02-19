import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Windows7 {

	
	public static void main(String x[])
	{
		JFrame win = new JFrame();
		JTextField T1 = new JTextField();
		JTextField T2 = new JTextField();
		JTextField T3 = new JTextField();
		JButton B1 = new JButton("E");
		
		B1.addActionListener(
				new ActionListener() 
				{
					public void actionPerformed(ActionEvent E)
					{
						int A,B,C;
						C = 0;
						
						A = Integer.parseInt(T1.getText());
						B = Integer.parseInt(T2.getText());
						C = A+B;
						T3.setText(Integer.toString(C));
					}
					
				}
			);
		
		win.add(B1);
		
		win.setVisible(true);
		win.setSize(400,400);
		
	}
}
