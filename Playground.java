package Project;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * this is playground class
 * @author googel plus
 * @version 4.4.2
 */
public class Playground {

	private static final ArrayList<Playground> Playgrounds = null;
	private String Name;
	private String description;
	private String Location;
	private int BookingNumber;
	private float PricePerHour;
	private int Size;
	private String availability;
	private int cancellationPeriod;
	private final int[] slots;


	public Playground()
        {
		slots = new int[12];
		for(int i=0;i<12;i++)
		{
			slots[i]=0;
		}
	}
        
        
	/**
	 * set name of playground
	 * @param name is the name entered by owner
	 */
	public void setName(String name) {
		this.Name = name;
	}
        
         /**
	 * get name of the playground
	 * @return playground's name
	 */
	public String getName() {
		return Name;
	}

        
        
        
	/**
	 * set location of the playground
	 * @param location is the location entered by owner
	 */
	public void setLocation(String location) {
		this.Location = location;
	}

	/**
	 * get location of the playground
	 * @return playground's location
	 */
	public String getLocation() {
		return Location;
	}

        
        
	/**
	 * set number of the booking
	 * @param BookingNumber is the booking number
	 */
	public void setBookingNo(int BookingNumber) {
		this.BookingNumber = BookingNumber;
	}

	/**
	 * get booking number
	 * @return booking number
	 */
	public int getBookingNo() {
		return BookingNumber;
	}

        
        
	/**
	 * set size of playground
	 * @param size is the size entered by owner
	 */
	public void setSize(int size) {
		this.Size = Size;
	}

	/**
	 * get size of the playground
	 * @return size
	 */
	public int getSize() {
		return Size;
	}

        
        
	/**
	 * set price of playground per hour
	 * @param PricePerHour is the price of playground per hour
	 */
	public void setPricePerHour(float PricePerHour) {
		this.PricePerHour = PricePerHour;
	}

	/**
	 * get price of playground per hour
	 * @return PricePerHour
	 */
	public float getPricePerHour() {
		return PricePerHour;
	}

        
        
	/**
	 * cancels a booked time
	 * @param CancellationPeriod to be canceled
	 */
	public void setCancellationPeriod(int CancellationPeriod) {
		this.cancellationPeriod = CancellationPeriod;
	}

	/**
	 * get the canceled period
	 * @return canceled period
	 */
	public int getCancellationPeriod() {
		return cancellationPeriod;
	}

        
        
	/**
	 * set the available slots 
	 * @param slot is the slot hour
	 * @param i is the slot number
	 */
	public void setSlots(Integer slot,Integer i) 
	{
			slots[i]=slot;
	}

	/**
	 * print out slots 
	 * @return slots
	 */
	public Integer getSlots() 
	{
		Integer x = null;
		for(int i=0;i<12;i++)
		{
			x = slots[i];
		}
		return x;
	}
	
	/**
	 * print slots
	 * @param i is the slot number
	 * @return slots
	 */
	public Integer getSlots(int i) 
	{
		return slots[i];
	}

        
        

	/**
	 * enables to verify a field
	 * @return bool
	 */
	public boolean fieldVerification()
        {
		return false;
	}

}

