	import java.awt.TextField;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

public class Mul extends Calculator implements ActionListener {
	
		TextField Box1;
	
		public Mul(TextField T1, boolean mulBoo, int Tempo)
		{
			Box1 = T1;
			mul = mulBoo;
			Temp = Tempo;
		}

		public void actionPerformed(ActionEvent x) 
		{							
					 Temp = Integer.parseInt(Box1.getText());					 
			         Box1.setText("");
			         
			         mul=true;
			         
			         System.out.println(sub);
		}
}
