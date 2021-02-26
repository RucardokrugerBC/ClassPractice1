package BusinessLogicLayer;
import java.util.*;

public class Wedding implements Events{
    
    String eventType = "Wedding";
    String eventDateandTime;
    String eventAddress;
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

        System.out.println("Address: ");
        eventAddress = scn.nextLine();

        System.out.println("How many adults?");
        numberOfAdults = scn.nextInt();

        System.out.println("How many children?");
        numberOfChildren = scn.nextInt();

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