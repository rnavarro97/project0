package project0;

import java.util.Scanner;

public class Client {
/*
 * This class will be the client for the user. Whether they are a new or returning user,
 * or whether they are patrons or employees of the bank, this class and its subclasses will
 * direct the user to the inputs they need.
 */
	
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Welcome to the banking application! Are you a \r(1)New \ror"
							+ "\r(2)Returning user?");//initial query
		String uType=s.nextLine();//requests user to input 1)new or 2) returning type

		
		
//		System.out.println(!uType.equals("1")&&!uType.equals("2"));
		if(uType=="1")//New User
		{
			//Creating new login
			System.out.println("Welcome to Your Banking App! Please enter your name.");
			String uName=s.nextLine();
			System.out.println("Please create a password");
			String pWord=s.nextLine();
			
			System.out.println("An admin will review your request to create an account.");
		}
		else if(uType=="2")
		{
			System.out.println("Welcome back! Please enter your username.");
			String uName=s.nextLine();
			//Code for serializer to fetch login info for Username.
		}
		else
		{
			System.out.println("We're sorry, that is not a valid input.\r"
					+ "Please start again, and enter \"1\" or \"2\"");
		}
		//if uType is 1, run New routine
		//else if uType is 2, run Return routine
		//else throw exception
		//is there a button method? Could possibly reduce need for coding exceptions
	}
	
}
