package Project;

import java.util.Scanner;

/**
 * this is user class
 * @author googel plus
 * @version 4.4.2
 * 
 */
public class User {

	private system s =new system();
	private String Name;
	private String Password;
	private String ValidEmail;
	Scanner input = new Scanner(System.in);
	public int index=0;
	
	/**
	 * Create a new account for user
	 */
	public void Register() {
		
		System.out.println("Register as ");
		System.out.println("(1)Player");
		System.out.println("(2)Owner");
		int choice= input.nextInt();
		while(choice<1 || choice>2)
		{
			System.out.println("Error please enter  a valid choice");
			choice =input.nextInt();
		}
		
		if(choice==1)
		{
			Player P = new Player();
		
			
			System.out.println("Please enter your name:");
			Scanner input1 =new Scanner(System.in);
			String Name = input1.next();
			P.setName(Name);
			
			System.out.println("Enter your password");
			Scanner input2 = new Scanner(System.in);
			String password = input2.next();
			P.setPassword(password);
			
			System.out.println("enter your email address");
			Scanner input3 = new Scanner(System.in);
			String mail = input3.next();
			P.setEmail(mail);
			
			if(system.verifyEmail()==true)
			{
				
				system.P.add(P);
			}
			else
			{
				System.out.print("your email is not verifyed try again");
			}
			
		}
		else if(choice==2)
		{
			Owner o = new Owner();
			
			
			System.out.println("Please enter your name:");
			Scanner input1 =new Scanner(System.in);
			String Name = input1.next();
			o.setName(Name);
			
			System.out.println("Enter your password");
			Scanner input2 = new Scanner(System.in);
			String password = input2.next();
			o.setPassword(password);
			
			System.out.println("enter your email address");
			Scanner input3 = new Scanner(System.in);
			String mail = input3.next();
			o.setEmail(mail);
			if(system.verifyEmail()==true)
				{
					system.O.add(o);
				}
				else
				{
					System.out.print("your email is not verifyed try again");
				}
			
		}
		
		
	}

	/**
	 * login with a created account
	 * @param user type of user
	 * @param email is the email of user
	 * @param password is the password of the email 
	 * @return bool
	 */
	public Boolean LoginAccount(String user , String email , String password) {
		Boolean found=false;
		if(user=="Player" )
		{
			for(int i=0;i<system.P.size();i++)
			{
				if(system.P.get(i).getEmail().equals(email) && system.P.get(i).getPassword().equals(password))
				{
					found= true;
					index=i;
				}
				else
					continue;
			}
		}
		else if(user=="Owner")
		{
			for(int i=0;i<system.O.size();i++)
			{
				if(system.O.get(i).getEmail().equals(email) && system.O.get(i).getPassword().equals(password))
				{
					found= true;
					index=i;
				}
				else
					continue;
			}
		}
		else
		{
			found= false;
		}
		return found;
        }
        
        

	/**
	 * set user's name 
	 * @param name is name entered by user
	 */
	public void setName(String Name) {
		this.Name=Name;
		
	}

	/**
	 * print out user's name
	 * @return user's name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * set user's password
	 * @param pass is the password entered by user
	 */
	public void setPassword(String Password) {
		this.Password=Password;
		
	}

	/**
	 * print out user's password
	 * @return user's password
	 */
	public String getPassword() {
		return this.Password;
	}

	/**
	 * set user's email
	 * @param mail is the email entered by user
	 */
	public void setEmail(String mail) {
		ValidEmail=mail;
		
	}

	/**
	 * print out user's email
	 * @return user's email
	 */
	public String getEmail() {
		return this.ValidEmail;
	}

	/**
	 * default constructor
	 */
	public User() {
		Name="User";
		Password="Password123";
		ValidEmail="Example@gmail.com";
		
		
	}

}