import java.lang.*;
import java.util.*;

public class start {

	public static void main(String[] args) 
	{	
				
		System.out.println("Welcome to the Barren Moor");
		System.out.println("");
		System.out.println("In this moor is hidden trails and treasure, can you find them all");
		System.out.println("");
		System.out.println("");
		System.out.println("You awake to find yourself in an unfamiliar location..... try >look");
		System.out.println(">");
		
		Scanner player = new Scanner(System.in);
		
		int dist = 100;
		int item = 0;
		int westCount = 0;
		int northCount = 0;
		int eastCount = 0;
		int southCount = 0;
		
			
			String action = player.next();
		
		if (action.equalsIgnoreCase("look")) 
		{
				System.out.println("You look around and see the moor stretch around you in all directions, a thick grey fog settling along the horizon");
				System.out.println("Clumps of heather are dotted around the landscape and you see plants half submerged in murkey water to the east");
				System.out.println("you notice on your wrist is what looks like a watch, but it doesn't show time, instead it shows a distance to something");
				System.out.println("which seems to change when you point it in different directions");
				System.out.println("");
				

				System.out.println("Try >north >south >east or >west to change direction and >move to move forward");
				System.out.println("Use >continue to continue");
				
	
			
		do {
			
				
			action = player.next();
			
			if (action.equalsIgnoreCase("move"))
			{
				if (westCount == 1)
				{
					item = moveWest(item);
					westCount = 0;
				}
				//if (eastCount ==1)
				//{
				//	item = moveEast(item);
				//	eastCount =0;
				//}
				//if (northCount == 1);
				//{
				//	item = moveNorth(item);
				//	northCount = 0;
				//}
				//if (southCount ==1)
				//{
				//	item = moveSouth(item);
				//	southCount = 0;
			}
			
					
			if (action.equalsIgnoreCase("north"))
			{
				System.out.println("The moor seems to continue on past the horizon, flat and empty");
				System.out.println("Your watch reads:");
				System.out.println("30.00m");
				
				dist = 50;
				northCount = 1;
			}
			
			if (action.equalsIgnoreCase("east"))
			{
				System.out.println("The swamp gurgles about 10m away, large gas bubbles rising and popping with a sharp noise");
				System.out.println("You think you see glimmering lights on the waters surface but you'd need to be closer to be sure");
				System.out.println("Your watch reads:");
				System.out.println("25.00m");
				
				dist = 20;
				eastCount = 1;
			}
			
			if (action.equalsIgnoreCase("south"))
			{
				System.out.println("Hills rise in the distance, you think you see an opening at the base of one of them");
				System.out.println("Your watch reads:");
				System.out.println("50.00m");
				
				dist = 30;
				southCount = 1;
			}
			
			if (action.equalsIgnoreCase("west"))
			{
				System.out.println("Hills rise in the distance, you can't see anything obvious but you have a feeling there may be something interesting in that direction");
				System.out.println("Your watch reads:");
				System.out.println("15.00m");
				
				dist = 30;
				westCount = 1;
			}
			
			if (action.equalsIgnoreCase("end"))
			{
				dist = 0;
			}

		}
		while (dist>0);
		
		direction();
		}
		
	}

	public static void direction()
	{
		
		Scanner player = new Scanner(System.in);
		String action = player.next();
		
		int treasureMap1 = 2;
		int treasureMap2 =0;
		
		int currentX = 5;
		int currentY = 10;
		System.out.println((currentX-treasureMap1) + ", " + (currentY - treasureMap2));
		System.out.println("");
		System.out.println("use >north >south >east or >west to find the treasure");
		
			do
			{	
				action = player.next();
				
				switch (action) {
				
				case "west":
					currentX = currentX-1;
					break;
				case "north":
					currentY = currentY+1;
					break;
				case "south":
					currentY =currentY-1;
					break;
				case "east":
					currentX = currentX+1;
					break;
				default:
					System.out.println("choose a direction to move in");
				}
				
				System.out.println((currentX-treasureMap1) + ", " + (currentY - treasureMap2));
					
				
			}
			while (currentX != 0 && currentY != 0);
			
			System.out.println("you found the treasure");	
	}
	
	public static int moveWest(int item)
	{
		System.out.println("You begin to move West, use >move to continue in this direction");
		Scanner player = new Scanner(System.in);		
		int westCount = 1;
		int staff = 0;
		String action = player.nextLine();
		
		do {	
			action = player.nextLine();
			
			if (action.equalsIgnoreCase("move") & westCount != 0)
			{
				switch(westCount) 
				{
				case 1:
					System.out.println("You move 5m West towards a cluster of trees at the base of the hills");
					westCount = 2;
					break;
							
				case 2:
					System.out.println("Whilst walking along you see a staff stuck in some soft mud by the path, will you take it");
					System.out.println("use >take to take the staff or >leave to contiue without it");
					action = player.nextLine();
						if (action.equalsIgnoreCase("take"))
						{
							westCount =3;
							System.out.println("you took the Strange Staff");
							staff = 1;
							item = 1;
						}
						else 
						{
							westCount =3;
							System.out.println("you choose not to take the staff");
						}
					break;
					
				case 3:
					System.out.println("You reach the edge of the trees");
					westCount = 4;
					break;
				 
				case 4:
					System.out.println("As you move forward you begin see light through the trees, perhaps there is a clearing ahead?");
					westCount = 5;
					break;
				
				case 5:
					System.out.println("You enter a clearing surrounded by densly packed trees");
					System.out.println("In the centre is a small cabin");
					System.out.println("Will you try to enter >yes >no");
					action = player.nextLine();
					if (action.equalsIgnoreCase("yes"))
					{
						System.out.println("You move towards the cabin");
						System.out.println("Looking into the window you see a person moving inside");
						System.out.println("The watch reads 2m");
						System.out.println("Do you knock?");
						theWoman(staff);
						item = 3;
					}
					else
					{
						System.out.println("seeing no other way through the trees you turn and walk back the way you came");
						System.out.println("");
						System.out.println("you are returned to your starting position");
					}
					westCount =0;					
				}
			}
			else 
			{
				System.out.println("");
				System.out.println("you are returned to your starting position");
				westCount = 0;
			}
			
		}
		while (westCount > 0);
		
		player.close();
		
		return item;
	}
	
	public static int theWoman(int staff) 
	{
		
		Scanner player = new Scanner(System.in);		
		int westCount = 1;
		int item = 0;
		String action = player.nextLine();
		action = player.nextLine();
		System.out.println(">yes or >no");
		
		if (action.equalsIgnoreCase("yes"))
		{
			System.out.println("");
			System.out.println("An old woman opens the door and peers out at you, squinting");
						if (staff == 1)
						{
							System.out.println("She catches a glimpse of the strange staff you picked up");
							System.out.println("she offers to trade it for some items and you agree");
							item = 3;
							System.out.println("upon looking in the sack you see there is a sword and shield inside");
						}
						else 
						{
							System.out.println("she looks you up and down with suspicion");
							System.out.println("'No cold callers' she says before shutting the door in your face");
							System.out.println("");
							System.out.println("");
							System.out.println("");
						}
			}	
		
	player.close();
	return item;
		
	}
	
	public static int moveEast(int item)
	{
		System.out.println("under construction");
		
		return item;
	}
	
	public static int moveNorth(int item)
	{
		int northCount =0;
		System.out.println("under construction");
		northCount = 0;
		
		return item;
	}
		
	public static int moveSouth(int item)
	{
		if (item == 5)
		{
			System.out.println("under construction");
		}
		else 
		{
			System.out.println("You are not yet ready for this test");
			System.out.println("return when you have knowledge of this place");
			System.out.println("you have been returned to your starting position");
		}
		return item;
	}
	
	public static void mapTreasure()
	{
		int mapHeight = 20;
		int mapWidth = 20;
		Random rand = new Random();
		
		int[][] treasure = new int[mapHeight][mapWidth];
		
		for (int i = 0; i<=5;i++)
		{
			int randInt1 = rand.nextInt(mapHeight);
			int randInt2 = rand.nextInt(mapWidth);
			treasure[i][i] = treasure[randInt1][randInt2];
			
			System.out.print(treasure[i][i]);
		}

	}
	
	public static void mapMonster()
	{
		int mapHeight = 10;
		int mapWidth = 10;
		Random rand = new Random();
		
		int[][] monster = new int[2][5];
		
			for (int j=0;j<=1;j++)
			{
					int randInt1 = rand.nextInt(mapHeight);
					int randInt2 = rand.nextInt(mapWidth);
			
					System.out.println(randInt1);
					System.out.println(randInt2);
			
					monster[0][j] = randInt1;
					System.out.print(monster[1][j]);
			}
			
			
	}
}
	

