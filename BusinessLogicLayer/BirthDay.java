package BusinessLogicLayer;
import java.util.*;

public class BirthDay implements Events{
    
    String eventType = "BirthDay";
    String eventDateandTime;
    String eventAddress;
    String eventTheme;
    int eventNumPeople;
    
    //menu
    String adultMeal;
    String kidsMeal;
    String Desert;

	@Override
	public void getDetails() 
    {
		
        Scanner scn = new Scanner(System.in);
        System.out.println("Date & Time: ");
        eventDateandTime = scn.nextLine();

        System.out.println("Address: ");
        eventAddress = scn.nextLine();

        System.out.println("How many people?");
        eventNumPeople = scn.nextInt();

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
