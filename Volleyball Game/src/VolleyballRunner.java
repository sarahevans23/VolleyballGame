import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

import java.util.ArrayList;


public class VolleyballRunner
{
	static ArrayList <String> volleyballPositions = new ArrayList <String>();

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
		System.out.println("Here is a list of volleyball players we will need to generate!");
		System.out.println("Your answers will determine how good a player is!");
		volleyballPositions.add(" 1.) Outside");
		volleyballPositions.add(" 2.) Middle");
		volleyballPositions.add(" 3.) Right Side");
		volleyballPositions.add(" 4.) Setter");
		volleyballPositions.add(" 5.) Libero");
		volleyballPositions.add(" 6.) DS");
		
			for (String v : volleyballPositions)
			{
				System.out.println(v);
			}
			System.out.println("Which one would you like to generate first? Choose the corresponding number to which position you want!");
			int positionNumber = userInputInt.nextInt();
			
			if (positionNumber == 1)
			{
				volleyballPositions.remove(0);
				System.out.println(volleyballPositions);
			}
		
		
	}

	public static void generateStats()
	{
		
		
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
