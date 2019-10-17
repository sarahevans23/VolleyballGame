import java.util.Scanner; 
import java.util.ArrayList;

public class VolleyballRunner
{
	static ArrayList <String> volleyballPositions = new ArrayList <String>();
	static ArrayList <VolleyballPlayers> VolleyballPlayers = new ArrayList <VolleyballPlayers>();
	static double outSideHeight;
	static String outSideName;
	static int outSideNumber;
	static double middleHeight;
	static String middleName;
	static int middleNumber;
	static double rightSideHeight;
	static String rightSideName; 
	static int rightSideNumber;
	static double setterHeight;
	static String setterName;
	static int setterNumber;
	static double liberoHeight;
	static String liberoName;
	static int liberoNumber;
	static double dSHeight;
	static String dSName;
	static int dSNumber; 

	public static void main(String[] args)
	{
		introduction();
		generateCharacters();
		generateStats();
		//generateCourt();
		delay(); 
	}

	public static void introduction()
	{
		System.out.println("Welcome player to the delightful game of volleyball!");
		System.out.println("Today we will be generating custom made volleyball players and then later play a good old game of volleyball!");
		System.out.println("Let's get started!");	
	}

	public static void generateCharacters() 
	{
		Scanner userInputInt = new Scanner(System.in);
		Scanner userInputString = new Scanner(System.in);
		Scanner userInputDouble = new Scanner(System.in);
		System.out.println("Here is a list of volleyball players we will need to generate!");
		System.out.println("Your answers will determine the stats of the player!");
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
			
			boolean stillGenerating = true;
			while (stillGenerating == true)
			{
		
			System.out.println("Choose a player to generate! Click the corresponding number!");
			int positionNumber = userInputInt.nextInt();
			if (positionNumber == 1)
			{	
				VolleyballPlayers.add(new VolleyballPlayers(0.0, "", "", 0));
				
				System.out.println("How tall do you want your Outside to be? (ex. 5.9)");
				outSideHeight = userInputDouble.nextDouble();
				VolleyballPlayers.get(0).setHeight(outSideHeight);
				
				System.out.println("What do you want the name to be?");
				outSideName = userInputString.nextLine();
				VolleyballPlayers.get(0).setName(outSideName);
				
				System.out.println("What number do you want your player to have?");
				outSideNumber = userInputInt.nextInt();
				VolleyballPlayers.get(0).setPlayerNumber(outSideNumber);
				
				VolleyballPlayers.get(0).setPosition("Outside");
				
				volleyballPositions.remove(0);
				for (String v : volleyballPositions)
				{
					System.out.println(v);
				}
				stillGenerating = true;
			}
			
			if (positionNumber == 2)
			{
				VolleyballPlayers.add(new VolleyballPlayers(0.0, "", "", 0));
				System.out.println("How tall do you want your Middle to be? (ex. 5.9) ");
				middleHeight = userInputInt.nextDouble();
				VolleyballPlayers.get(1).setHeight(middleHeight);
				
				System.out.println("What do you want the name to be?");
				middleName = userInputString.nextLine();
				VolleyballPlayers.get(1).setName(middleName);
				
				System.out.println("What number do you want your player to have?");
				middleNumber = userInputInt.nextInt();
				VolleyballPlayers.get(1).setPlayerNumber(middleNumber);
				
				VolleyballPlayers.get(1).setPosition("Middle");
				
				volleyballPositions.remove(0);
				for (String v : volleyballPositions)
				{
					System.out.println(v);
				}
				stillGenerating = true;
			}
			
			if (positionNumber == 3)
			{
				VolleyballPlayers.add(new VolleyballPlayers(0.0, "", "", 0));
				System.out.println("How tall do you want your Right Side to be? (ex. 5.9) ");
				rightSideHeight = userInputDouble.nextDouble();
				VolleyballPlayers.get(2).setHeight(rightSideHeight);
				
				System.out.println("What do you want the name to be?");
				rightSideName = userInputString.nextLine();
				VolleyballPlayers.get(2).setName(rightSideName);
				
				System.out.println("What number do you want your player to have?");
				rightSideNumber = userInputInt.nextInt();
				VolleyballPlayers.get(2).setPlayerNumber(rightSideNumber);
				
				VolleyballPlayers.get(2).setPosition("Right Side");
				
				volleyballPositions.remove(0);
				for (String v : volleyballPositions)
				{
					System.out.println(v);
				}
				stillGenerating = true;
			}
			
			if (positionNumber == 4)
			{
				VolleyballPlayers.add(new VolleyballPlayers(0.0, "", "", 0));
				System.out.println("How tall do you want your Setter to be? (ex. 5.9) ");
				setterHeight = userInputDouble.nextDouble();
				VolleyballPlayers.get(3).setHeight(setterHeight);
				
				System.out.println("What do you want the name to be?");
				setterName = userInputString.nextLine();
				VolleyballPlayers.get(3).setName(setterName);
				
				System.out.println("What number do you want your player to have?");
				setterNumber = userInputInt.nextInt();
				VolleyballPlayers.get(3).setPlayerNumber(setterNumber);
				
				VolleyballPlayers.get(3).setPosition("Setter");
				
				volleyballPositions.remove(0);
				for (String v : volleyballPositions)
				{
					System.out.println(v);
				}
				stillGenerating = true;
			}
			
			if (positionNumber == 5)
			{
				VolleyballPlayers.add(new VolleyballPlayers(0.0, "", "", 0));
				System.out.println("How tall do you want your Libero to be? (ex. 5.9) ");
				liberoHeight = userInputDouble.nextDouble();
				VolleyballPlayers.get(4).setHeight(liberoHeight);
				
				System.out.println("What do you want the name to be?");
				liberoName = userInputString.nextLine();
				VolleyballPlayers.get(4).setName(liberoName);
				
				System.out.println("What number do you want your player to have?");
				liberoNumber = userInputInt.nextInt();
				VolleyballPlayers.get(4).setPlayerNumber(liberoNumber);
				
				VolleyballPlayers.get(4).setPosition("Libero");
				
				volleyballPositions.remove(0);
				for (String v : volleyballPositions)
				{
					System.out.println(v);
				}
				stillGenerating = true;
			}
			
			if (positionNumber == 6)
			{
				VolleyballPlayers.add(new VolleyballPlayers(0.0, "", "", 0));
				System.out.println("How tall do you want your DS to be? (ex. 5.9) ");
				dSHeight = userInputDouble.nextDouble();
				VolleyballPlayers.get(5).setHeight(dSHeight);
				
				System.out.println("What do you want the name to be?");
				dSName = userInputString.nextLine();
				VolleyballPlayers.get(5).setName(dSName);
				
				System.out.println("What number do you want your player to have?");
				dSNumber = userInputInt.nextInt();
				VolleyballPlayers.get(5).setPlayerNumber(dSNumber);
				
				VolleyballPlayers.get(5).setPosition("DS"); 
				
				volleyballPositions.remove(0);
				for (String v : volleyballPositions)
				{
					System.out.println(v);
				}
				stillGenerating = false;
			}
			}
		}

	public static void generateStats()
	{
		int oHAttackPoints = 0;
		int oHPassingPoints = 0;
		int oHBlockingPoints = 0; 
		int mAttackPoints = 0;
		int mPassingPoints = 0;
		int mBlockingPoints = 0;
		int rAttackPoints = 0;
		int rPassingPoints = 0;
		int rBlockingPoints = 0;
		int sAttackPoints = 0;
		int sPassingPoints = 0;
		int sBlockingPoints = 0;
		int settingPoints = 0;
		int lAttackPoints = 0;
		int lPassingPoints = 0;
		int lBlockingPoints = 0;
		int dSAttackPoints = 0;
		int dSPassingPoints = 0;
		int dSBlockingPoints = 0;
		
		Scanner userInputString1 = new Scanner(System.in);
		Scanner userInputInt1 = new Scanner(System.in); 

		System.out.println("Now let's get their stats!");
		System.out.println(" ");
		
		//outside player 
		System.out.println("Let's start with the outside player ...");
		if (outSideHeight >= 5.8 && outSideHeight <= 6.4)
		{
			oHAttackPoints = 7;
			oHPassingPoints = 5;
			oHBlockingPoints = 6;
			
		}
		else 
		{
			oHAttackPoints = 5;
			oHPassingPoints = 7;
			oHBlockingPoints = 5;
		}
		if (outSideName.contentEquals("Sydney") || outSideName.contentEquals("Macy"))
		{
			oHAttackPoints = oHAttackPoints + 2;
			oHPassingPoints = oHPassingPoints + 2;
			oHBlockingPoints = oHBlockingPoints + 2;
		}
		else
		{
			oHAttackPoints = oHAttackPoints - 2;
			oHPassingPoints = oHPassingPoints - 2;
			oHBlockingPoints = oHBlockingPoints - 2; 
		}
		delay();
		System.out.println("Attacking Points : " + oHAttackPoints + "      Passing Points: " +oHPassingPoints + "      Blocking Points: " +oHBlockingPoints); 
		System.out.println(" ");
		
		//middle player 
		System.out.println("Next is the Middle...");
		if (middleHeight >= 5.10 && middleHeight <= 6.8)
		{
			mAttackPoints = 8;
			mPassingPoints = 3;
			mBlockingPoints = 8;
		}
		else
		{
			mAttackPoints = 7;
			mPassingPoints = 5;
			mBlockingPoints = 7;
		}
		if (middleName.contentEquals("Katie") || middleName.contentEquals("Sophie"))
		{
			mAttackPoints = mAttackPoints + 2;
			mPassingPoints = mPassingPoints + 2;
			mBlockingPoints = mBlockingPoints + 2;
		}
		else 
		{
			mAttackPoints = mAttackPoints - 2;
			mPassingPoints = mPassingPoints -2;
			mBlockingPoints = mBlockingPoints -2;
		}
		delay();
		System.out.println("Attacking Points: " + mAttackPoints + "      Passing Points: " + mPassingPoints + "      BlockingPoints: " + mBlockingPoints );
		System.out.println(" ");
		
		//right side player 
		System.out.println("Next is the Right Side... ");
		if (rightSideHeight >= 5.9 && rightSideHeight <= 6.3)
		{
			rAttackPoints = 7;
			rPassingPoints = 4;
			rBlockingPoints = 8;
			
		}
		else 
		{
			rAttackPoints = 5;
			rPassingPoints = 6;
			rBlockingPoints = 6;
		}
		if (rightSideName.contentEquals("Sarah") || rightSideName.equals("Margret"))
		{
			rAttackPoints = rAttackPoints + 2;
			rPassingPoints = rPassingPoints + 2;
			rBlockingPoints = rBlockingPoints + 2; 
		}
		else 
		{
			rAttackPoints = rAttackPoints - 2;
			rPassingPoints = rPassingPoints - 2;
			rBlockingPoints = rBlockingPoints - 2; 
		}
		delay();
		System.out.println("Attacking Points: " + rAttackPoints + "      Passing Points: " + rPassingPoints + "      Blocking Points: " + rBlockingPoints);
		System.out.println(" ");
		
		//setter player 
		System.out.println("Next is the Setter...");
		if (setterHeight >= 5.7 || setterHeight <= 6.0)
		{
			sAttackPoints = 4;
			sPassingPoints = 6;
			sBlockingPoints = 0;
			settingPoints = 8;
		}
		
		else 
		{
			sAttackPoints = 2;
			sPassingPoints = 4;
			sBlockingPoints = 0;
			settingPoints = 6;
		}
		if (setterName.contentEquals("Henri") || setterName.contentEquals("CeCe"))
		{
			sAttackPoints = sAttackPoints + 2;
			sPassingPoints = sPassingPoints + 2;
			sBlockingPoints = sBlockingPoints + 2;
			settingPoints = settingPoints + 2; 
		}
		else 
		{
			sAttackPoints = sAttackPoints - 2;
			sPassingPoints = sPassingPoints - 2;
			sBlockingPoints = 0;
			settingPoints = settingPoints - 2;
		}
		delay();
		System.out.println("Attacking Points: " + sAttackPoints + "      Passing Points: " + sPassingPoints + "      Blocking Points: " + sBlockingPoints + "      Setting Points: " + settingPoints);
		System.out.println(" ");
		
		//libero player 
		System.out.println("Next is the libero...");
		if (liberoHeight >= 5.0 || liberoHeight <= 5.5)
		{
			lAttackPoints = 2;
			lPassingPoints = 8;
			lBlockingPoints = 0;
		}
		else 
		{
			lAttackPoints = 3;
			lPassingPoints = 7;
			lBlockingPoints = 0;
		}
		if (liberoName.contentEquals("Molly") || liberoName.contentEquals("Bella"))
		{
			lAttackPoints = lAttackPoints + 2;
			lPassingPoints = lPassingPoints + 2;
			lBlockingPoints = 0;
		}
		else 
		{
			lAttackPoints = lAttackPoints - 2;
			lPassingPoints = lPassingPoints -2;
			lBlockingPoints = 0;
		}
		delay();
		System.out.println("Attacking Points: " + lAttackPoints + "      Passing Points: " + lPassingPoints + "      BlockingPoints: " + lBlockingPoints);
		System.out.println(" ");
		
		//DS player 
		System.out.println("Lastly is the DS..."); 
		if (dSHeight >= 5.3 || dSHeight <= 5.7)
		{
			dSAttackPoints = 3;
			dSPassingPoints = 7;
			dSBlockingPoints = 0;
		}
		else 
		{
			dSAttackPoints = 2;
			dSPassingPoints = 6;
			dSBlockingPoints = 0;
		}
		if (dSName.contentEquals("Aubrey") || dSName.contentEquals("Emily"))
		{
			dSAttackPoints = dSAttackPoints + 2;
			dSPassingPoints = dSPassingPoints + 2;
			dSBlockingPoints = 0;
		}
		else 
		{
			dSAttackPoints = dSAttackPoints - 2;
			dSPassingPoints = dSPassingPoints - 2;
			dSBlockingPoints = 0;
		}
		delay();
		System.out.println("Attacking Points: " + dSAttackPoints + "      Passing Points: " + dSPassingPoints + "      Blocking Points: " + dSBlockingPoints);
		System.out.println(" ");
		
		System.out.println("Congratulations! You have created your team!"); 
		System.out.println("What team name do you want for your team?");
		String teamName = userInputString1.nextLine(); 
		System.out.println("Your team name is: " + teamName); 
		
		System.out.println("Who do you want your captain to be?");
		
		volleyballPositions.add(" 1.) Outside");
		volleyballPositions.add(" 2.) Middle");
		volleyballPositions.add(" 3.) Right Side" );
		volleyballPositions.add(" 4.) Setter");
		volleyballPositions.add(" 5.) Libero");
		volleyballPositions.add(" 6.) DS");
		
		for ( String v : volleyballPositions)
		{
			System.out.println(v);
		}
		
		int captainPosition = userInputInt1.nextInt(); 
		
		if (captainPosition == 1)
		{
			System.out.println("Your captain is: " + outSideName);
		}
		if (captainPosition == 2)
		{
			System.out.println("Your captain is: " + middleName);
		}
		if (captainPosition == 3)
		{
			System.out.println("Your captain is: " + rightSideName); 
		}
		if (captainPosition == 4)
		{
			System.out.println("Your captain is: " + setterName);
		}
		if (captainPosition == 5)
		{
			System.out.println("Your captain is: " + liberoName); 
		}
		if (captainPosition == 6)
		{
			System.out.println("Your captain is: " + dSName); 
		}
	}
	
	public static void delay()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupted();
		}
	}

	public static void generateCourt()
	{
		
		
	}

}
