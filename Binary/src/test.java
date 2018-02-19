

public class test {
	
	
	static int decimal;
	static int mod,a,power;
	static double b;
	static double c;
	static String binary ="";
	

	public static void main(String[] args) {
		
		decimal = 18;
		binary = "11111111";
		

		//System.out.println(DtoB(decimal));
		System.out.println(BtoD(binary));
	}

	public static String DtoB(int decimal)
	{
		for (int i=0;i<8;i++)
		{
			mod = decimal%2;
			decimal = decimal/2;						
			binary = (Integer.toString(mod)+binary);
			
		}
		
		return binary;
	}
	
	public static Double BtoD(String binary)
	{
		power = 0;
		
		for(int i = 8; i>0;i--)
		{
			a = Integer.parseInt(binary.substring(i-1,i));
			
			b = (a*(Math.pow(2,power)));
			
			c = c+b;
			
			b=0;
			power=power+1;
		}
		
		return c;
	}
}
