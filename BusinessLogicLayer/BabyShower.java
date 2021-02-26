package BusinessLogicLayer;
import java.util.*;

public class BabyShower implements Events{
    
    String eventType = "Baby Shower";
    String eventDateandTime;
    String eventAddress;
    String eventTheme;
    int numberOfAdults;
    int numberOfChildren;
    
    //menu
    String BabyShowerBouquet;

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
        System.out.println("Do you want the preset Baby shower snack menu? ");
        BabyShowerBouquet = scn.nextLine();

        scn.close();
    }
}