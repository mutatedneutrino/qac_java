	import java.awt.Button;
import java.awt.TextField;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

public class Opts extends Calculator implements ActionListener {

		TextField Box1;
		int Temp;
		String opt;

		public Opts(TextField T1)
		{
			Box1 = T1;
		}

		public void actionPerformed(ActionEvent x) 
		{
			Button Btn = (Button)x.getSource();
			
			String l = Btn.getLabel();
			
			if (l.equals("C"))
			{
				Box1.setText("");
			}
			else if (l.equals("="))
			{
				int A = 0;
				int B = 0;
				
				switch(opt)
				{
				case "*":
					A = Integer.parseInt(Box1.getText());
					B = Temp*A;
					break;
				case "+":
					A = Integer.parseInt(Box1.getText());
					B = Temp+A;
					break;
				case "/":
					A = Integer.parseInt(Box1.getText());
					B = Temp/A;
					break;
				case "-":
					A = Integer.parseInt(Box1.getText());
					B = Temp-A;
					break;
				}
				
				Box1.setText(Integer.toString(B));
			}
			else 
			{
				Temp = Integer.parseInt(Box1.getText());
				opt = l;
				Box1.setText("");
			}
			
				
		}
}
