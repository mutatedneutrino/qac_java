
public class main2 {

	public static void main(String[] args) {
		
		try 
		{
			TaxCalc T = new TaxCalc();
			float NetSalary = T.CalcSalary(2000,15);
			
			System.out.println(NetSalary);
		}
		
		catch(MyException E)
		{			
			System.out.println("nope");
		}

	}

}
