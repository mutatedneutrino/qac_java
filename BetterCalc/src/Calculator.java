import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.BorderLayout;
import java.awt.Button;

public class Calculator {
	
	static int Temp;

	public static void main(String x []) {
		
		Frame Win = new Frame ("The Best Calculator tm");
		Panel Box = new Panel();
		Panel Button = new Panel();
		
		Win.add(Box, BorderLayout.NORTH);
		Win.add(Button, BorderLayout.CENTER);
		
		Button B1 = new Button("1");
		Button B2 = new Button("2");
		Button B3 = new Button("3");
		Button B4 = new Button("4");
		Button B5 = new Button("5");
		Button B6 = new Button("6");
		Button B7 = new Button("7");
		Button B8 = new Button("8");
		Button B9 = new Button("9");
		Button B10 = new Button("0");
		Button B11 = new Button("C");
		Button B12 = new Button("=");
		Button B13 = new Button("+");
		Button B14 = new Button("-");
		Button B15 = new Button("/");
		Button B16 = new Button("*");
			
		TextField T4 = new TextField(60);
		
		Numbers E1 = new Numbers(T4);
		Opts E2 = new Opts(T4);
		
		GridLayout B = new GridLayout(4,4);
		
		B1.addActionListener(E1);
		B2.addActionListener(E1);
		B3.addActionListener(E1);
		B4.addActionListener(E1);
		B5.addActionListener(E1);
		B6.addActionListener(E1);
		B7.addActionListener(E1);
		B8.addActionListener(E1);
		B9.addActionListener(E1);
		B10.addActionListener(E1);
		
		B11.addActionListener(E2);		
		B12.addActionListener(E2);
		B13.addActionListener(E2);
		B14.addActionListener(E2);
		B15.addActionListener(E2);
		B16.addActionListener(E2);
		
		Button.setLayout(B);
		
		Box.add(T4);
		
		Button.add(B1);
		Button.add(B2);
		Button.add(B3);
		Button.add(B4);
		Button.add(B5);
		Button.add(B6);
		Button.add(B7);
		Button.add(B8);
		Button.add(B9);
		Button.add(B10);
		Button.add(B11);
		Button.add(B12);
		Button.add(B13);
		Button.add(B14);
		Button.add(B15);
		Button.add(B16);
			
		
		Win.setSize(500,500);
		Win.setVisible(true);

	}

}

