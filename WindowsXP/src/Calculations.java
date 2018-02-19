import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculations implements ActionListener {
		
		JTextField T1, T2, T3;
		JButton btn;
		JLabel L1, L2, L3, EMPTY;
		JFrame F;
		
		public Calculations() {
			 F = new JFrame();
			T1 = new JTextField(10);
			T2 = new JTextField(10);
			T3 = new JTextField(10);
			L1 = new JLabel("First Number");
			L2 = new JLabel("Second Number");
			L3 = new JLabel("Result");
			EMPTY = new JLabel("");
			btn = new JButton("Calculate");
			F.setLayout(new GridLayout(5,2));
			
			btn.addActionListener(this);
			F.add(L1); 
			F.add(T1);
			F.add(L2);
			F.add(T2);
			F.add(EMPTY);
			F.add(btn);
			F.add(L3);
			F.add(T3);
			F.setSize(400, 400);			
		
		}

		public void showWindow(String Title) {
			F.setTitle(Title);
			F.setVisible(true);
			F.setSize(400, 400);
		}
		
		public void actionPerformed(ActionEvent X) {
			int A, B, C = 0;
			String T;
			try {
			A = Integer.parseInt(T1.getText());
			B = Integer.parseInt(T2.getText());
			T = F.getTitle();
			if (T.equals("Addition")) { C = A + B; }
			if (T.equals("Subtraction")) { C = A - B; }
			if (T.equals("Division")) { C = A / B; }
			if (T.equals("Multiplication")) { C = A * B; }
			T3.setText(String.valueOf(C));
			} catch (Exception ArithmeticException) {
				T3.setText("I hate you.");
			}
		}
}


