	import java.awt.TextField;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

public class Div extends Calculator implements ActionListener {
	
		TextField Box1;
	
		public Div(TextField T1, boolean divBoo, int Tempo)
		{
			Box1 = T1;
			div = divBoo;
			Temp = Tempo;
		}

		public void actionPerformed(ActionEvent x) 
		{							
					 Temp = Integer.parseInt(Box1.getText());					 
			         Box1.setText("");
			         
			         div=true;
			         
			         System.out.println(sub);
		}
}
