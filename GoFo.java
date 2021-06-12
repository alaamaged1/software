package Project;


import java.util.Scanner;
import java.util.Timer; 
import java.util.TimerTask;



public class GoFo {
	/**
	 * the main method of the application
	 * @param args array of strings arguments
	 */
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		Boolean access=false;
		system s = new system();
		Player p = new Player();
		Owner o = new Owner();
		Playground pg = new Playground();
		Administrator ad = new Administrator();
		
		boolean again = true;
		do{
		System.out.println("Welcome to GoFo application");
		System.out.println("please choose one option of the following");
		System.out.println("(1)signup");
		System.out.println("(2)signin");
		System.out.println("(3)Exit");
		int choice = input.nextInt();
		while(choice<1 || choice>3)
		{
			System.out.println("Error please enter a valid choice");
			choice = input.nextInt();
		}
		if(choice==1) //Registerr
		{
			p.Register();
		}
		else if(choice==2)//Login
		{
			System.out.println("Login as");
			System.out.println("1)player");
			System.out.println("2)Owner");
			int choice2 = input.nextInt();
			while(choice2<1 || choice2>2)
			{
				System.out.println("Error please enter a valid choice");
				choice2= input.nextInt();
			}
			
			if(choice2==1)//login as player
			{
				
				System.out.println("enter email");
				String email = input.next();
				
				System.out.println("enter password");
				String password = input.next();
				
				if(p.LoginAccount("Player", email , password)==true)
				{
					System.out.println("found");
				}
				else
				{
					System.out.println("not found");
				}
				
				while(p.LoginAccount("Player",email , password)==false)
				{
					System.out.print("there's an error please enter your valid email and password");
					email = input.next();
					password = input.next();
				}
					
				access=true;
				
				if(access==true)
				{
					int statue_1;
					System.out.println("Welcome..choose what you want to do");
					System.out.println("1)view playgrounds and filter them");
					System.out.println("2)Book a time slot");
					System.out.println("3)Create team");
					System.out.println("4)Send email");
					statue_1 = input.nextInt();
					
					while(statue_1<1 ||statue_1>4)
					{
						System.out.println("Error please enter a valid choice");
						statue_1 = input.nextInt();
					}
					
					if(statue_1 == 1)
					{
						Player player = new Player();
						Playground playground = new Playground();
						player.AvailablePlaygrounds(playground);
						System.out.println("choose the type of filter that you want ...");
						System.out.println("1)filter by location");
						System.out.println("2)filter by size");
						System.out.println("3)filter by price");
						int statue_2;
						statue_2 = input.nextInt();
						while(statue_2<1 || statue_2>3)
						{
							System.out.println("you entered an invalid number, please enter a valid one ...");
							statue_2 = input.nextInt();
						}
						player.FilterPlaygrounds(playground, statue_2);
					}
					
					else if(statue_1 == 2)
					{
						Player player = new Player();
						Playground playground = new Playground();
						player.AvailablePlaygrounds(playground);
						Integer hours,time;
						System.out.println("enter the number of hours that you want to book");
						hours = input.nextInt();
						System.out.println("enter the time that you want to book (from 1 to 12)");
						time = input.nextInt();
						while(time>12 || time<1)
						{
							System.out.println("you entered an invalid time, please enter a valid one ...");
							time = input.nextInt();
						}
						player.bookPlayground(hours, time);
					}
					else if(statue_1==3)
					{
						system.P.get(p.index).createTeam(system.P.get(p.index));
					}
					else if(statue_1 ==4)
					{
						system.P.get(p.index).SendEmail(system.P.get(p.index));
						system.P.get(p.index).ViewTeam(system.P.get(p.index));
					}
				}
				
			}
			
			else if(choice2==2)//login as owner
			{
				
				System.out.println("enter email");
				
				String email = input.next();
				
				System.out.println("enter password");
				String password = input.next();
				
				if(o.LoginAccount("Owner",email , password)==true)
				{
					System.out.println("found");
				}
				else
				{
					System.out.println("not found");
				}
				
				while(o.LoginAccount("Owner", email , password)==false)
				{
					System.out.print("there's an error please enter your valid email and password");
					email = input.next();
					password = input.next();
					
				}
					
				access=true;
				
				if(access==true)
				{
					System.out.println("Welcome..choose what you want to do");
					System.out.println("1)Create profile");
					System.out.println("2)Add playground");
					int cho = input.nextInt();
					while(cho<1 || cho>2)
					{
						System.out.println("Error please enter a valid choice");
						cho=input.nextInt();
					}
					if(cho==1)//create profile
					{
						System.out.println("enter your phone number");
						int phone = input.nextInt();
						
						System.out.println("enter your address");
						String address = input.next();
						
						o.createProfile(phone, address);
						
					}
					else if(cho==2)//Add playground
					{
						boolean approve_bool;
						
						System.out.println("enter location");
						String location= input.next();
						
						System.out.println("enter size");
						int size = input.nextInt();
						
						System.out.println("enter price");
						int price = input.nextInt();
						
						o.addPlayground(location, size , price);
						
						
					}
							
					
				}
			}
		}
		else if(choice==3)
		{
			again=false;
			break;
		}
		
		}
		while(again);
		
	}

	
}
