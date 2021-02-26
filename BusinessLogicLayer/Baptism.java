package BusinessLogicLayer;
import java.util.*;

public class Baptism implements Events{
    
    String eventType = "Baptism";
    String eventDateandTime;
    String eventAddress;
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

        System.out.println("Address: ");
        eventAddress = scn.nextLine();

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

        scn.close();//commit
    }
}