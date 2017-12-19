package letters;

import java.util.Scanner;

public class letterGuessing
	{

		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("What is your name?");
				String name = userInput.nextLine();
				System.out.println("Cool, nice to meet you, " + name + "!");
				
				try
					{
						Thread.sleep(500);
					} catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

						
						
						System.out.println("Pick a letter");
						String letter = userInput.nextLine();
						
						
						while(!letter.equals("q"))
						{
						System.out.println("Wrong, pick a new letter");
						letter = userInput.nextLine();
						}
						
						System.out.println("ok " + name + ", have a nice day");
						
			}

	}
