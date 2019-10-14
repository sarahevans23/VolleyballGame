import java.util.Scanner;
import java.util.ArrayList;

public class VolleyballRunner
{
	static ArrayList <String> volleyballPositions = new ArrayList <String>();
	static ArrayList <VolleyballPlayers> VolleyballPlayers = new ArrayList <VolleyballPlayers>();

	public static void main(String[] args)
	{
		//introduction();
		generateCharacters();
		generateStats();
		generateCourt();
		delay(); 
	}

	public static void introduction()
	{
		System.out.println("Welcome player to the delightful game of volleyball!");
		System.out.println("Today we will be generating custom made volleyball players and then later play a good old game of volleyball!");
		
		
		
	}

	public static void generateCharacters() 
	{
		Scanner userInputInt = new Scanner(System.in);
		Scanner userInputString = new Scanner(System.in);
		Scanner userInputDouble = new Scanner(System.in);
		System.out.println("Here is a list of volleyball players we will need to generate!");
		System.out.println("Your answers will determine how good a player is!");
		volleyballPositions.add(" 1.) Outside");
		volleyballPositions.add(" 2.) Middle");
		volleyballPositions.add(" 3.) Right Side" );
		volleyballPositions.add(" 4.) Setter");
		volleyballPositions.add(" 5.) Libero");
		volleyballPositions.add(" 6.) DS");
		
			for (String v : volleyballPositions)
			{
				System.out.println(v);
			}
			int counter = 1;
			
			if (counter <= 6)
			{
			boolean stillGenerating = true;
			while (stillGenerating == true)
			{
			System.out.println("Choose a player to generate! Click the corresponding number!");
			int positionNumber = userInputInt.nextInt();
			
			if (positionNumber == 1)
			{	
				System.out.println("How tall do you want your Outside to be? (ex. 5.9)");
				double outSideHeight = userInputDouble.nextDouble();
				VolleyballPlayers.get(VolleyballPlayers.Height).setHeight(outSideHeight);
				
				System.out.println("What do you want the name to be?");
				String outSideName = userInputString.nextLine();
				VolleyballPlayers.get(VolleyballPlayers.name).setName(outSideName);
				
				System.out.println("What number do you want your player to have?");
				int outSideNumber = userInputInt.nextInt();
				VolleyballPlayers.get(VolleyballPlayers.playerNumber).setPlayerNumber(outSideNumber);
				
				volleyballPositions.remove(0);
				for (String v : volleyballPositions)
				{
					System.out.println(v);
				}
				
				System.out.println(" ");
				counter++;
				stillGenerating = true;
			}
			
			if (positionNumber == 2)
			{
				System.out.println("How tall do you want your Middle to be? (ex. 5.9) ");
				double middleHeight = userInputInt.nextDouble();
				
				System.out.println("What do you want the name to be?");
				String middleName = userInputString.nextLine();
				
				System.out.println("What number do you want your player to have?");
				int middleNumber = userInputInt.nextInt();
				
				volleyballPositions.remove(0);
				for (String v : volleyballPositions)
				{
					System.out.println(v);
				}
				
				counter++;
				stillGenerating = true;
			}
			
			if (positionNumber == 3)
			{
				System.out.println("How tall do you want your Right Side to be? (ex. 5.9) ");
				double rightSideHeight = userInputDouble.nextDouble();
				
				System.out.println("What do you want the name to be?");
				String rightSideName = userInputString.nextLine();
				
				System.out.println("What number do you want your player to have?");
				int rightSideNumber = userInputInt.nextInt();
				
				volleyballPositions.remove(0);
				for (String v : volleyballPositions)
				{
					System.out.println(v);
				}
				
				counter++;
				stillGenerating = true;
			}
			
			if (positionNumber == 4)
			{
				System.out.println("How tall do you want your Setter to be? (ex. 5.9) ");
				double setterHeight = userInputDouble.nextDouble();
				
				System.out.println("What do you want the name to be?");
				String setterName = userInputString.nextLine();
				
				System.out.println("What number do you want your player to have?");
				int setterNumber = userInputInt.nextInt();
				
				volleyballPositions.remove(0);
				for (String v : volleyballPositions)
				{
					System.out.println(v);
				}
				
				counter++;
				stillGenerating = true;
			}
			
			if (positionNumber == 5)
			{
				System.out.println("How tall do you want your Libero to be? (ex. 5.9) ");
				double liberoHeight = userInputDouble.nextDouble();
				
				System.out.println("What do you want the name to be?");
				String liberoName = userInputString.nextLine();
				
				System.out.println("What number do you want your player to have?");
				int liberoNumber = userInputInt.nextInt();
				
				volleyballPositions.remove(0);
				for (String v : volleyballPositions)
				{
					System.out.println(v);
				}
				
				counter++;
				stillGenerating = true;
			}
			
			if (positionNumber == 6)
			{
				System.out.println("How tall do you want your DS to be? (ex. 5.9) ");
				double dSHeight = userInputDouble.nextDouble();
				
				System.out.println("What do you want the name to be?");
				String dSName = userInputString.nextLine();
				
				System.out.println("What number do you want your player to have?");
				int dSNumber = userInputInt.nextInt();
				
				volleyballPositions.remove(0);
				for (String v : volleyballPositions)
				{
					System.out.println(v);
				}
				
				counter++;
				stillGenerating = true;
			}
		}
	}
			
			else
			{
				System.out.println("Congratulations! You have finsihed generating your players! Let's get their stats!");
			}
}

	public static void generateStats()
	{
		System.out.println("Here are you players plus their information: ");
		System.out.println(VolleyballPlayers);
		
		
	}

	public static void generateCourt()
	{
		
		
	}
	
    public static void delay()
		{
			try 
			{
				Thread.sleep(1000);
			}
			
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
