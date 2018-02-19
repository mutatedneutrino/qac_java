	import java.awt.TextField;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

public class Add extends Calculator implements ActionListener {
	
		TextField Box1;

		public Add(TextField T1, boolean addBoo, int Tempo)
		{
			Box1 = T1;
			add = addBoo;
			Temp = Tempo;
		}

		public void actionPerformed(ActionEvent x) 
		{							
					 Temp = Integer.parseInt(Box1.getText());					 
			         Box1.setText("");
			         
			         add=true;
		}
}
