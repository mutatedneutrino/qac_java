	import java.awt.TextField;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

public class Equals extends Calculator implements ActionListener {

		TextField Box1;

		public Equals(TextField T1, boolean addBoo, int Tempo, boolean subBoo)
		{
			Box1 = T1;
			Temp = Tempo;
			
			add = addBoo;
			sub = subBoo;
		}

		public void actionPerformed(ActionEvent x) 
		{			
					 int dave = Integer.parseInt(Box1.getText());
					 if (add)
					 {
						 dave = Temp + dave;
						 add = false;
					 }
					 
					 else if (sub)
					 {
						 dave = Temp - dave;
						 sub = false;
					 }
					 	
					 else if (div)
					 {
						 dave = Temp/dave;
						 div = false;
					 }
					 
					 else if (mul)
					 {
						 dave = Temp*dave;
						 mul = false;
					 }
					 
			         Box1.setText(Integer.toString(dave));				
		}
		

}