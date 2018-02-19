import static org.junit.Assert.*;
import org.junit.*;


import org.junit.Test;

public class main {

	@Test
	public void test() {
		
		dave m = new dave();
		
		int a = m.addition(2,3);
		
		if (a!=5)
		fail("Not yet implemented");
		
	//	assertEquals(a,5);
	//	assertTrue(a==5);
	//	assertFalse(a!=5);
		
	}
	
	@Before
	public void message() {
		System.out.println("A");
	}
	
	@After
	public void message1()
	{
		System.out.println("B");
	}

	
	// can run before and after each test to prove it's running correctly
}
