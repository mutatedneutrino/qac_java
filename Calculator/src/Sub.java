	import java.awt.TextField;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

public class Sub extends Calculator implements ActionListener {
	
		TextField Box1;
	
		public Sub(TextField T1, boolean subBoo, int Tempo)
		{
			Box1 = T1;
			sub = subBoo;
			Temp = Tempo;
		}

		public void actionPerformed(ActionEvent x) 
		{							
					 Temp = Integer.parseInt(Box1.getText());					 
			         Box1.setText("");
			         
			         sub=true;
			         
			         System.out.println(sub);
		}
}
