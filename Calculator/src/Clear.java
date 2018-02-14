	import java.awt.TextField;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

public class Clear implements ActionListener {

		TextField Box1;
		boolean add;
		boolean sub;
		
		public Clear(TextField T1, boolean sub, boolean add)
		{
			Box1 = T1;
		}

		public void actionPerformed(ActionEvent x) 
		{												 
			         Box1.setText("");	
			         add = false;
			         sub = false;
			         
		}
}