import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class DtoB implements ActionListener{
	
	JFrame frame;
	JTextField T1, T2;
	JButton B1,B2,B3;
	int decimal,mod,a,power;
	String binary;
	Double c,position;
	int DtoB = 0;
	int BtoD = 0;
	
	public DtoB()
	{
		frame = new JFrame();
		T1 = new JTextField(10);
		T2 = new JTextField(10);
		B1 = new JButton("Convert");
		B2 = new JButton("Decimal to Binary");
		B3 = new JButton("Binary to Decimal");
		
		frame.setLayout(new FlowLayout());
		
		B2.addActionListener(this);
		B3.addActionListener(this);
		
		B1.addActionListener(this);
		
		frame.add(B2);
		frame.add(B3);		
		frame.add(T1);
		frame.add(B1);
		frame.add(T2);
		
		frame.setSize(400, 400);
		frame.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent x)
	{
		binary = "";
			
		JButton b = (JButton) x.getSource();

		if (b==B1)
		{
			if (DtoB==1)
			{
			decimal = Integer.parseInt(T1.getText());
			
			for (int i=0;i<8;i++)
				{
						mod = decimal%2;
						decimal = decimal/2;						
						binary = (Integer.toString(mod)+binary);						
				}
			T2.setText(binary);
			}
			
			if (BtoD == 1)
			{
				power = 0;
				
				for(int i = 8; i>0;i--)
				{
					a = Integer.parseInt(binary.substring(i-1,i));
					
					position = (a*(Math.pow(2,power)));
					
					c = c+position;
					power=power+1;
					
				}		
				T2.setText(Double.toString(c));
			}
				
		
		if (b == B2)
		{
			DtoB = 1;
			BtoD = 0;
			T1.setText(""); T2.setText("");
		}
		if (b==B3)
		{
			BtoD = 1;
			DtoB = 0;
			System.out.println("binary");
			
			T1.setText(""); T2.setText("");
		}
		}
	}
}

