import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;


public class Calculator {
	
	static boolean add;
	static boolean sub;
	static boolean div;
	static boolean mul;
	
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
		
		Event1 E1 = new Event1(T4);
		Event2 E2 = new Event2(T4);
		Event3 E3 = new Event3(T4);
		Event4 E4 = new Event4(T4);
		Event5 E5 = new Event5(T4);
		Event6 E6 = new Event6(T4);
		Event7 E7 = new Event7(T4);
		Event8 E8 = new Event8(T4);
		Event9 E9 = new Event9(T4);
		Event10 E10 = new Event10(T4);
		
		Clear E11 = new Clear(T4,sub, add);
		Add E12 = new Add(T4,add,Temp);
		Equals E16 = new Equals(T4,add,Temp,sub);
		Sub E13 = new Sub(T4,sub,Temp);
		Div E14 = new Div(T4, div,Temp);
		Mul E15 = new Mul (T4,mul,Temp);
		
		GridLayout B = new GridLayout(4,4);
		
		B1.addActionListener(E1);
		B2.addActionListener(E2);
		B3.addActionListener(E3);
		B4.addActionListener(E4);
		B5.addActionListener(E5);
		B6.addActionListener(E6);
		B7.addActionListener(E7);
		B8.addActionListener(E8);
		B9.addActionListener(E9);
		B10.addActionListener(E10);
		
		B11.addActionListener(E11);		
		B12.addActionListener(E16);
		B13.addActionListener(E12);
		B14.addActionListener(E13);
		B15.addActionListener(E14);
		B16.addActionListener(E15);
		
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

