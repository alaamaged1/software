package Project;

import java.util.Scanner;

/**
 * this is player class
 * @author googel plus
 * @version 4.4.2
 *
 */
public class Player extends User {

	private String Location;
	private Playground pg;
	private Integer totalPay;
	private final Player[] Team;
	private String message;

	
	Scanner input = new Scanner(java.lang.System.in);
	
	/**
	 * print out all team members
	 * @param player which his team will be printed
	 */
	void ViewTeam(Player player)
	{
		for(int i=0;i<11;i++)
		{
			java.lang.System.out.println("Player number" + (i+1));
			java.lang.System.out.println("player password " + player.Team[i].getPassword());
			java.lang.System.out.println("player message " + player.Team[i].getMessage());
                        java.lang.System.out.println("player name " + player.Team[i].getName());
			java.lang.System.out.println("player email " + player.Team[i].getEmail());

			
		}
	}
	
	/**
	 * send email to all team members
	 * @param obj is the player with which will send his team an email
	 */
	void SendEmail(Player player)
	{
		java.lang.System.out.println("enter your message");
		String m = input.next();
		for(int i=0;i<11;i++)
		{
			system.P.get(player.index).Team[i].setMessage(m);
		}
		
	}
	
	/**
	 * print out all playgrounds
	 * @param pg is the playground object
	 */
	public void AvailablePlaygrounds(Playground playground) 
	{
		pg = new Playground();
		if(system.pg.size()==0)
		{
			java.lang.System.out.println("list is empty");
		}
		else
		{
			for(int i=0 ; i<system.pg.size();i++)
			{
				java.lang.System.out.println("the available playground :");
				java.lang.System.out.println("price :" +system.pg.get(i).getPricePerHour());
				java.lang.System.out.println("size :" +system.pg.get(i).getSize());
                                java.lang.System.out.println("playground #" + (i+1) + " :");
				java.lang.System.out.println("location : " +system.pg.get(i).getLocation());

			}
		}
	}

	/**
	 * filtering playgrounds according user's choice 
	 * @param pg is the playground object
	 * @param choice is the user's choice
	 */
	public void FilterPlaygrounds(Playground playground, Integer choice) 
	{
		if(choice == 1)
		{
			java.lang.System.out.println("enter the location");
			String loc = "";
			loc = input.nextLine();
			for(int i=0 ; i<system.pg.size();i++)
			{
				if(system.pg.get(i).getLocation().equals(loc))
				{
					java.lang.System.out.println("Playground #" + (i+1) );
					java.lang.System.out.println("price :" +system.pg.get(i).getPricePerHour());
					java.lang.System.out.println("size :" +system.pg.get(i).getSize());
                                        java.lang.System.out.println("location : " +system.pg.get(i).getLocation());

					
				}
				else
				{
					continue;
				}
			}
		}
		
		else if(choice == 2)
		{
			java.lang.System.out.println("enter the size");
			int size = 0;
			size = input.nextInt();
			for(int i=0 ; i<system.pg.size();i++)
			{
				if(size == system.pg.get(i).getSize())
				{
					java.lang.System.out.println("Playground #" + (i+1) );
					java.lang.System.out.println("location : " +system.pg.get(i).getLocation());
					java.lang.System.out.println("price :" +system.pg.get(i).getPricePerHour());
					java.lang.System.out.println("size :" +system.pg.get(i).getSize());
					
				}
				else
				{
					continue;
				}
			}
		}
		
		else if(choice == 3)
		{
			java.lang.System.out.println("enter the price");
			float price = 0;
			price = input.nextInt();
			for(int i=0 ; i<system.pg.size();i++)
			{
				if(price == system.pg.get(i).getPricePerHour())
				{
					java.lang.System.out.println("Playground #" + (i+1) );
					java.lang.System.out.println("location : " +system.pg.get(i).getLocation());
					java.lang.System.out.println("price :" +system.pg.get(i).getPricePerHour());
					java.lang.System.out.println("size :" +system.pg.get(i).getSize());
					
				}
				else
				{
					continue;
				}
			}
		}
		
		else
		{
			java.lang.System.out.println("you entered an invalid number");
		}
	
	}

	/**
	 * makes player be able to book number of hours to play
	 * @param noOfHours is number of hours that the player wants
	 * @param time is the time at which the playing will begin
	 */
	public void bookPlayground(Integer noOfHours, Integer time) 
	{
		java.lang.System.out.println("enter the number of the playground that you want to book");
		int ground_choice;
		ground_choice = input.nextInt();
		while(ground_choice>system.pg.size() || ground_choice<1)
		{
			java.lang.System.out.println("enter a valid number");
			ground_choice = input.nextInt();
		}
		int end_time = time;
		for(int i=0;i<system.pg.size();i++)
		{
			if(system.pg.get(ground_choice-1) != null)
			{
				if(system.pg.get(ground_choice-1).getSlots(time) == 0)
				{
					for(int j=0;j<noOfHours;j++)
					{
						if(system.pg.get(ground_choice-1).getSlots(time+j) == 0)
						{
							system.pg.get(ground_choice-1).setSlots(1,time+j);
							end_time++;
						}
					}
					java.lang.System.out.println("you booked playground with location " + system.pg.get(ground_choice-1).getLocation());
					java.lang.System.out.println("you booked playground with size " + system.pg.get(ground_choice-1).getSize());
					java.lang.System.out.println("you booked playground with price " + system.pg.get(ground_choice-1).getPricePerHour());
				}
			}
		}	
		java.lang.System.out.println("your booking start from " + time + " and end at " + end_time);
	}

	/**
	 * enables player to create his own team
	 * @param obj is the player that will create a team
	 */
	public void createTeam(Player player) {
		
		player.Team[0]=player;
		for(int i=1;i<11;i++)
		{
			java.lang.System.out.println("enter player number " +(i+1));
			Player p=new Player();
			
			
			
			java.lang.System.out.println("Please enter your name:");
			String Name = input.next();
			p.setName(Name);
			
			java.lang.System.out.println("Enter your password");
			String password = input.next();
			p.setPassword(password);
			
			java.lang.System.out.println("enter your email address");
			String mail = input.next();
			p.setEmail(mail);
			
			if(system.verifyEmail()==true)
			{
				
				system.P.add(p);
				player.Team[i]=p;
			}
			else
			{
				java.lang.System.out.print("your email is discarded");
			}
			
			
		}
		
	}

	/**
	 * add or remove players
	 * @param Team is the team to be modified
	 * @return null
	 */
	public Player modifyTeam(Player[] Team) {
		return null;
		// TODO - implement Player.modifyTeam
	}

	/**
	 * canceling time booked by a player
	 * @param p is the playground booked by the player
	 * @return playground
	 */
	public Playground cancelBooking(Playground p) {
		return p;
		// TODO - implement Player.cancelBooking
	}

	/**
	 * set location that the player wants
	 * @param location is the location entered by the player
	 */
	public void setLocation(String location) {
		this.Location = location;
	}

	/**
	 * get the location entered by user
	 * @return location
	 */
	public String getLocation() {
		return Location;
	}

	/**
	 * set total payment to a player
	 * @param total is the total payment
	 */
	public void setTotal(Integer total) {
		this.totalPay = total;
	}

	/**
	 * print out total payment
	 * @return total payment
	 */
	public Integer getTotal() {
		return totalPay;
	}

	/**
	 * enables the player to pay for his booking
	 * @param walletNo is the e-wallet of the player
	 * @param password is the e-wallet's password
	 */
	

	public Player() {
		Team = new Player [11];
		message=" ";
	}

	/**
	 * print out the message that will be sent to all team members
	 * @return message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * set the message that will be sent to all team members
	 * @param message is the message that will be sent
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}