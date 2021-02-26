package BusinessLogicLayer;
import java.util.*;

public class YearEndFunction implements Events{
    
    String eventType = "Year-end Function";
    String eventDateandTime;
    String eventCity;
    String eventArea;
    String eventStreet;
    String eventAdress;
    String eventHuoseNumber;
    String eventTheme;
    int numberOfAdults;
    int numberOfChildren;
    
    //menu
    String adultMeal;
    String kidsMeal;
    String Desert;

	@Override
	public void getdetails() 
    {
		
        Scanner scn = new Scanner(System.in);
        System.out.println("Date & Time: ");
        eventDateandTime = scn.nextLine();

        //Get adress Details
        System.out.println("City: ");
        eventCity = scn.nextLine();
        System.out.println("Area: ");
        eventArea = scn.nextLine();      
        System.out.println("Street: ");
        eventStreet = scn.nextLine();
        System.out.println("House Number: ");
        eventHuoseNumber = scn.nextLine();
        //Compress adress
        eventAdress = eventCity + " , " + eventArea + " , " + eventStreet + " , " + eventHuoseNumber + ". ";

        System.out.println("How many adults?");
        numberOfAdults = scn.nextInt();

        System.out.println("How many children?");
        numberOfChildren = scn.nextInt();

        System.out.println("Do you want a theme?(Yes/No)");
        eventTheme = scn.nextLine();


        System.out.println("==================================Menu:=============================");
        System.out.println("Do you want kids preset menu? ");
        adultMeal = scn.nextLine();

        System.out.println("Do you want adult preset menu? ");
        kidsMeal = scn.nextLine();

        System.out.println("Do you want desert? ");
        Desert = scn.nextLine();

        scn.close();
    }
}