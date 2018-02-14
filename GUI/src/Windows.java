import java.awt.Frame;
import java.awt.TextField;
import java.awt.Button;
import java.awt.FlowLayout;

public class Windows {

	public static void main(String x []) {
	
		Frame Win = new Frame ("QA Manchester");

		Button B1 = new Button("+");
		Button B2 = new Button("-");
		Button B3 = new Button("x");
		Button B4 = new Button("/");
				
		TextField T1 = new TextField(10);
		TextField T2 = new TextField(10);
		TextField T3 = new TextField(10);
		
		Event E1 = new Event(T1,T2,T3);
		Event2 E2 = new Event2(T1,T2,T3);
		Event3 E3 = new Event3(T1,T2,T3);
		Event4 E4 = new Event4(T1,T2,T3);		
		
		FlowLayout F = new FlowLayout();
		
		B1.addActionListener(E1);
		B2.addActionListener(E2);
		B3.addActionListener(E3);
		B4.addActionListener(E4);
		
		Win.setLayout(F);
		
		Win.add(T1);
		Win.add(T2);
		Win.add(B1);
		Win.add(B2);
		Win.add(B3);
		Win.add(B4);
		Win.add(T3);			
		
		Win.setSize(500,500);
		Win.setVisible(true);

	}

}
