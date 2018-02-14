
public class TaxCalc {

		
		public float CalcSalary (int Salary, int Absenses) throws MyException
		{
			float NetSalary = 0;
			
			if(Absenses >= 14)
			{
				MyException E = new MyException();
				throw E;
			}
			
			NetSalary = Salary*(20/100) - (Salary*(Absenses));
			
			return NetSalary;

		}

}
