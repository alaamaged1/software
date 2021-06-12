package Project;

import java.util.ArrayList;
import java.util.Scanner;


class timer extends Thread{
public void run(){
    for(int i=1200;i>=0;i--){ //1200 seconds 
        System.out.print(i+" ");
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if(i==0)
        {
        	boolean activated = false;
        	System.out.println("your verification is expired try again ");
        }
    }
}



}
/**
 * this is system class
 * @author googel plus
 * @version 4.4.2
 * 
 */

public class system {

	
	static ArrayList<Player> P = new ArrayList<Player>();
	static ArrayList<Owner> O = new ArrayList<Owner>();
	static ArrayList<Playground> pg = new ArrayList<Playground>();



	/**
	 * get email address and verify if it is correct or wrong
	 * @return bool
	 */
	public static boolean verifyEmail() {
		timer t=new timer();
		t.start();
		boolean activated=false;
		System.out.println("Please enter code");
		while (t.isAlive()) {
			Scanner input = new Scanner(System.in);
		    String code=input.next();
		    activated=true;
			if(!t.isAlive())
			{
				activated=false;
				break;
			}
		    
		    if(activated==true){
		        System.out.println("Your email is verified");
		        
		        t.stop();
		        break;
		    }   
		        
		}
		return activated;
		
	}
	
	/**
	 * enable the owner to add his playground to the system to be rented by players
	 * @param playground is the playground to be added
	 */
	public void AddPlayground(Playground playground)
	{
		pg.add(playground);
	}




	/**
	 * calculates total payment for the player
	 * @param noofhours is the number of hours that the player wants to reserve
	 * @return number of hours
	 */
	public Integer calculateTotal(Integer noofhours) {
		return noofhours;
		
	}

	
	
}