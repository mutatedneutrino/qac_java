
	import java.awt.Button;
import java.awt.TextField;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

public class Numbers implements ActionListener {

		TextField Box1;
		
		public Numbers(TextField T1)
		{
			Box1 = T1;
		}

		public void actionPerformed(ActionEvent x) 
		{						
			Button Btn = (Button)x.getSource();
			
			Box1.setText(Box1.getText() + Btn.getLabel());
		}
}