
public class ShowTotal {
	
	private int phy,che,mat;
	private int phyper,cheper,matper;
	private float total,per;
	
		public void showResults() 
		{
			total = phy + che + mat;
			
			per = total*100/450;
			
			int fail = failCheck(phyper,cheper,matper);
			
			switch (fail)
			{
			case 1:
				System.out.println("Retake the exam");
				break;
			case 2: 
				System.out.println("Repeat the course");
				break;
			case 3:
				System.out.println("Go home...");
				break;
			default: 
				System.out.println("Marks: " + total);
				System.out.println("Percentage: " + per);
			}
							
		}


		public void Physics(int A)
		{
			if (A<=150 & A>=0)
			{ 
				phy = A;
				phyper = A*100/150;
			}
			else 
			{
				System.out.println("This is an invalid Physics mark");
			}
			
			//System.out.println("Physics: " + phyper);
		}
		
		public void Chemistry(int A)
		{
			if (A<=150 & A>=0)
			{ 
				che = A;	
				cheper = A*100/150;
			}
			else 
			{
				System.out.println("This is an invalid Chemistry mark");
			}
			
			//System.out.println("Chemistry: "+ cheper);
		}
		public void Maths(int A)
		{
			if (A<=150 & A>=0)
			{ 
				mat = A;	
				matper = A*100/150;
			}
			else 
			{
				System.out.println("This is an invalid Maths mark");
			}
			
			//System.out.println("Maths: "+ matper);
		}
		
		public int failCheck(int phyper, int cheper, int matper)
		{
			int fail = 0;
			
			if (phyper <= 60)
			{
				fail = fail+1;
			}
			if (cheper <=60)
			{
				fail = fail+1;
			}
			if (matper <=60)
			{
				fail = fail +1;
			}
			
		return fail;
		}
}
