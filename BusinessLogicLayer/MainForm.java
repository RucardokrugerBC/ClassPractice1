package BusinessLogicLayer;

import java.util.ArrayList;
import java.util.Scanner;
import DataAccessLayer.ReadData;
import java.util.List;

public class MainForm {

    public static List<Events> events = new ArrayList<Events>();
    public static List<Client> client = new ArrayList<Client>();
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int Mainoption = 0;
        ReadData reader = new ReadData();
        System.out.println("---------START UP---------");

        ////////////////////////////////////Start Up//////////////////////////////////////
        while (events.size() == 0) {
            
            System.out.println("Enter File Name (Hint: Booking");
            String fileName = scn.nextLine();
            reader.Read(fileName);
            events = reader.getEvents();
            client = reader.getClients();
        }

        while (Mainoption !=4)
        ////////////////////////////////////Main Menu//////////////////////////////////////
        System.out.println("---------MAIN MENU---------");
        System.out.println("1. Display Bookings");
        System.out.println("2. Display Clients");
        System.out.println("3. Add new booking");
        System.out.println("4. Exit");
        Mainoption = scn.nextInt();

        switch(Mainoption) {
            case 1:
            
            break;
            case 2:
            
            break;
            case 3:
            int option;
            System.out.println("What Type if event is this?");
            System.out.println("1. Baby Shower");
            System.out.println("2. Baptism");
            System.out.println("3. Birthday");
            System.out.println("4. Wedding");
            System.out.println("5. Year End Function");
            option = scn.nextInt();
            String eventType = "";
            List<MenuItem> menu = new ArrayList<MenuItem>();

            switch(option) {
                case 1:
                eventType = "BabyShower";
                break;

                case 2:
                eventType = "Baptism";
                break;

                case 3:
                eventType = "Birthday";
                break;

                case 4:
                eventType = "Wedding";
                break;

                case 5:
                eventType = "Year_End_Function";
                break;
                
                }

            System.out.println("Date & Time: ");
            eventDateandTime = scn.nextLine();

            //Get todays Date
            Date date = Calendar.getInstance().getTime();  
            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
            String strDate = dateFormat.format(date);  

            //Given Date in String format	  
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	        Calendar c = Calendar.getInstance();
	        try
            {
	        //Setting the date to the given date
	        c.setTime(sdf.parse(strDate));
	        }catch(ParseException e)
            {
		    e.printStackTrace();
	        }
	        //Number of Days to add
	        c.add(Calendar.DAY_OF_MONTH, 15);  
    	    //Date after adding the days to the given date
	        String newDate = sdf.format(c.getTime());  
	        //Displaying the new Date after addition of Days
	        System.out.println("This will be the next available slot: "+ newDate);

            if(eventDateandTime => newDate,"Available","Not available")
            {
                System.out.println("Booking date available.");
                System.out.println("Event date sucessfully set.");
            }
            else
            {
                System.out.println("We do not have the date you selected available, please note that you have to place the booking 15 days in advance");
            }
        
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

            switch(option) {
                case 1:
                System.out.println("==================================Menu:=============================");
                System.out.println("Do you want the preset Baby shower snack menu? ");
                if (scn.nextLine() == "yes"){
                    menu.add(new MenuItem());
                }
                
                break;
                
                case 2,3,4,5:
                System.out.println("==================================Menu:=============================");
                bool adult_or_child = true;

                System.out.println("Do you want a starter?");
                if (scn.nextLine() == "yes"){
                    menu.add("#starter");
                }

                System.out.println("Do you want kids preset or adult menu? ");
                if (scn.nextLine() == "yes"){
                    menu.add("#kids-meal");
                }
        
                System.out.println("Do you want adult preset menu? ");
                if (scn.nextLine() == "yes"){
                    menu.add("#adult-meal");
                }

                System.out.println("Do you want desert?");
                if (scn.nextLine() == "yes"){
                    menu.add("#adult-meal");
                }
                
                  
            }
            events.add(new Events(eventType,eventDateandTime,eventCity,eventArea,eventStreet,eventTheme,numberOfAdults,numberOfChildren));
            break;
        }


        scn.close();//commit 
    }
}
