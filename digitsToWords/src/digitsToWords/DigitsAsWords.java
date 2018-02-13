package digitsToWords;

public class DigitsAsWords 
{
	static String tenText = "";
	static String unitText = "";
	static String hundText = "";
	static String thouText = "";
	static String tenThoText = "";

	public static void main(String[] args)
		{
		int A = 65128;	
		
		int unit = A%10;
		int ten = A%100/10;
		int hund = A%1000/100;
		int thou = A%10000/1000;
		int tenTho = A/10000;

		System.out.println(syntax(unit,ten,hund,thou,tenTho));
		
		}
	

	public static String syntax(int unit, int ten, int hund, int thou, int tenTho)
	{
		
		if (tenTho == 1)
		{
			tenThoText = (big(tenTho,thou) + " thousand");
		}
		else if (thou > 0)
		{
			tenThoText =(big(tenTho,thou));
			thouText = (small(thou) + " thousand ");
		}
		
				
		if (hund > 0)
		{
			hundText = (small(hund) + " hundred and ");
		}
		else if (thou > 0)
		{
			hundText = " and ";
		}
		
		
		
		if (ten == 0)
		{
			tenText = (big(ten,unit));
		}
		else
		{
			tenText = (big(ten,unit));
			unitText = (small(unit));
		}
		
		String Text = (tenThoText + thouText + hundText + tenText + unitText);
		
		return Text;
	}

	public static String small(int units)
	{
		
		String Text = "";
		
		switch(units)
		{
		case 1:
			Text= "One";
			break;
		case 2:
			Text = "Two";
			break;
		case 3:
			Text = "Three";
			break;
		case 4:
			Text = "Four";
			break;
		case 5:
			Text = "Five";
			break;
		case 6:
			Text = "Six";
			break;
		case 7:
			Text = "Seven";
			break;
		case 8:
			Text = "Eight";
			break;
		case 9:
			Text = "Nine";
			break;
		default:
			Text = "";
			break;

		}
		
		return Text;
	}
				
	public static String big(int tens, int units)
	{		
		
		String Text = "";
		
		switch(tens)
		{
		case 1: 
			Text = teens(units);
			break;	
		case 2:
			Text = "Twenty ";
			break;
		case 3:
			Text = "Thirty ";
			break;
		case 4:
			Text = "Forty ";
			break;
		case 5:
			Text = "Fifty ";
			break;
		case 6:
			Text = "Sixty ";
			break;
		case 7:
			Text = "Seventy ";
			break;
		case 8:
			Text = "Eighty ";
			break;
		case 9:
			Text = "Ninety ";
			break;
		}
		
		return Text;
	}
	
	public static String teens(int units)
	{
		switch(units)
		{
		case 1: 
			tenText = "Eleven";
			break;
		case 2:
			tenText = "Twelve";
			break;
		case 3:
			tenText = "Thirteen";
			break;
		case 4:
			tenText = "Fourteen";
			break;
		case 5:
			tenText = "Fifteen";
			break;
		case 6:
			tenText = "Sixteen";
			break;
		case 7:
			tenText = "Seventeen";
			break;
		case 8:
			tenText = "Eighteen";
			break;
		case 9:
			tenText = "Nineteen";
			break;
		}
		
		return tenText;	
	}
}