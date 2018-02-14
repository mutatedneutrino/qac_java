	import java.awt.TextField;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

public class Event10 implements ActionListener {

		TextField Box1;
		
		public Event10(TextField T1)
		{
			Box1 = T1;
		}

		public void actionPerformed(ActionEvent x) 
		{							
					 String display= Box1.getText();
					 
			         Box1.setText(display + "0");				
		}
}