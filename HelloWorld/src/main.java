import java.util.ArrayList;

public class main {
	
	static ArrayList<Person> People = new ArrayList<>();
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	int[] arrayInts = new int[10];
		
		//for (int i=0; i<10; i++) {
						
		//	arrayInts[i] = i+1;
		//	System.out.println(i+1);
		//}
			
		//for (int x=0; x<10; x++) {
			
		//System.out.println(tooHot(50,true));
		//}		
	
		Person p = new Person("Jeff",37,"Lead Developer");
		Person p2 = new Person("Dave", 18,"Office Assistant");
		Person p3 = new Person("Luke", 27,"Human Resources");
		Person p4 = new Person("Jeffrey", 56,"CEO");
			//System.out.println(p.toString());
			//System.out.println(p2.toString());
		
		
		People.add(p);
		People.add(p2);
		People.add(p3);
		People.add(p4);
		
		System.out.println(dave("Jeff"));
					
	}
	
	public static String HelloWorld() 
	{
		
		return "Hello World!";
	}
	
	public static int parametersOperators(int x, int y) 
	{
		
		return x+y;
	}

	public static int conditionals(boolean add, int x, int y) 
	{
		
		if (add) {
			return x+y;
		}

			return x*y;
		
	}
	
	public static int conditionals2(int x, int y) 
	{
		
		if (x == 0) {
			return y;
		}		
		
		else if (y == 0) {
			return x;
					
		}
		return x+y;
		}
		
	public static int iterationsArrays2(int f) 
	{
		
	return f*10;
	}
	
	public static int blackjack(int x, int y)
	{
			
		if (y<=21 && x<=21 && x<y){
				return y;
		}
		else if (x<=21 && y<=21 && y<x){
				return x;
		}
		else if (x>21 && y<=21) {
				return y;
		}
		else if (x<=21 && y>21) {
				return x;
		}
		return 0;
	}

	public static int usum(int x, int y, int z) 
	{
			
			int sum = 0;
			
			if (x != y) {
				sum = x + y;
			}
			if (z != x && z != y) {
				sum = sum + z;
			}
			
			return sum;
	}
	
	public static boolean tooHot(int temp, boolean isSummer)
	{
			
		boolean range = true;
	
		if (temp>60) {
				if (isSummer && temp>100) {
					range = false;
					}
				if (!isSummer && temp>90) {
					range = false;
						}
			}
		else {range = false;}
		
		return range;
	}

	public static String dave(String name)
	{

		String found = "default value";
		
		for (Person person : People)
		{
			if (person.Name.equals(name))
			{				
				found = person.toString();
			}
		
		}
			
			return found;
		
	}

}
	
