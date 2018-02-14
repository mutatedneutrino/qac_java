import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event2 implements ActionListener {
	
	TextField Box1;
	TextField Box2;
	TextField Box3;
	
	public Event2(TextField T1, TextField T2, TextField T3)
	{
		Box1 = T1;
		Box2 = T2;
		Box3 = T3;
	}

	public void actionPerformed(ActionEvent x) 
	{
			int A,B,C;
			
			A=B=C=0;
						
			try
			{
				A = Integer.parseInt(Box1.getText());
				B = Integer.parseInt(Box2.getText());
				
				C = A - B;
						
				Box3.setText(Integer.toString(C));
				
			}
			catch (NumberFormatException G)
			{
				System.out.println("no");
			}

	}


}
