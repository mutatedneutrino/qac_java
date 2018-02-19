import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class WindowsXP implements ActionListener {
	
	JMenuItem item1,item2,item3,item4;
	Calculations calc;
	
	public WindowsXP() {
		
		JFrame win = new JFrame("Windows KP");
		JMenuBar menuBar = new JMenuBar();
		JMenu menu1 = new JMenu("Maths");
		
		
		item1 = new JMenuItem("Addition");
		item2 = new JMenuItem("Subtraction");
		item3 = new JMenuItem("Multiplication");
		item4 = new JMenuItem("Division");
		
		item1.addActionListener(this);
		item2.addActionListener(this);
		item3.addActionListener(this);
		item4.addActionListener(this);

		menu1.add(item1);
		menu1.add(item2);
		menu1.add(item3);
		menu1.add(item4);
		
		menuBar.add(menu1);
		
		win.setJMenuBar(menuBar);
		win.setSize(100,100);
		win.setVisible(true);
		
		calc = new Calculations();
	}
	
	
	public void actionPerformed(ActionEvent x)
	{
		JMenuItem I = (JMenuItem) x.getSource();
		
		if (I == item1)
		{
			calc.showWindow("Addition");
		}
		if (I == item2)
		{
			calc.showWindow("Subtraction");
		}
		if (I == item3)
		{
			calc.showWindow("Multiplication");
		}
		if (I == item4)
		{
			calc.showWindow("Division");
		}
		}
	}

