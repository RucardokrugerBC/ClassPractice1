package PresentingLayer;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import javax.xml.crypto.Data;

import DataAccessLayer.ReadData;
import java.util.List;
import BusinessLogicLayer.*;

public class MainForm {

    public static List<Events> events = new ArrayList<Events>();
    public static List<Client> clients = new ArrayList<Client>();
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int Mainoption = 0;
        ReadData reader = new ReadData();

        ////////////////////////////////////Start Up//////////////////////////////////////
        System.out.println("---------START UP---------");
        while (events.size() == 0) {
            System.out.println("Enter File Name (Hint: Booking");
            String fileName = scn.nextLine();
            reader.Read(fileName);
            events = reader.getEvents();
            clients = reader.getClients();
        }

        while (Mainoption !=4)
        ////////////////////////////////////Main Menu//////////////////////////////////////
        System.out.println("---------MAIN MENU---------");
        System.out.println("1. Display Bookings");
        System.out.println("2. Display Clients");
        System.out.println("3. Add new booking");
        System.out.println("4. Exit");
        Mainoption = scn.nextInt();
        System.out.println("\n\n");
        int count = 1;

        switch(Mainoption) {
            case 1:
            System.out.println("---------DISPLAY BOOKINGS---------\n");
            System.out.println("ID\t\t\tEvent Type\t\t\tDateAndTime\t\t\tCity\t\t\tArea\t\t\tStreet\t\t\tTheme\t\t\t# of Adults\t\t\t# of Children");
            
            for (Events event : events) {
                System.out.println(count + "\t\t\t" + event.getEventType() + "\t\t\t" + event.getEventDateandTime() + "\t\t\t" + event.getEventCity() + "\t\t\t" + event.getEventArea() + "\t\t\t" + event.getEventStreet() + "\t\t\t" + event.getEventTheme() + "\t\t\t" + event.getNumberOfAdults() + event.getNumberOfChildren());
                System.out.println("-------Menu");
                System.out.println("ID\t\t\tMenu Item\t\t\tDescription\t\t\tType\t\t\tCosts"); 
                int countb = 1;
                for (MenuItem menuItem : event.getMenu()) {
                    System.out.println(countb + "\t\t\t" + menuItem.getMenuItem() + "\t\t\t" + menuItem.getDescription() + "\t\t\t" + menuItem.getMealType() + "\t\t\t" + menuItem.getCost()); 
                    countb++;
                }
            }
            break;
            case 2:
            System.out.println("---------DISPLAY EMPLOYEES---------");
            System.out.println("Which client? \n");
            System.out.println("ID\t\t\tName\t\t\tSurname\t\t\tPhone");
            for (Client client : clients) {
                System.out.println(count + "\t\t\t" + client.getName() + "\t\t\t" + client.getSurname() + "\t\t\t" + client.getCellNumber());
                count++;
            }

            break;
            case 3:
            System.out.println("---------ADD NEW BOOKING---------");
            System.out.println("Which client? \n");
            System.out.println("ID\t\t\tName\t\t\tSurname\t\t\tPhone");
            for (Client client : clients) {
                System.out.println(count + "\t\t\t" + client.getName() + "\t\t\t" + client.getSurname() + "\t\t\t" + client.getCellNumber());
                count++;
            }

            int option;
            System.out.println("What Type of event is this?");
            System.out.println("1. Baby Shower");
            System.out.println("2. Baptism");
            System.out.println("3. Birthday");
            System.out.println("4. Wedding");
            System.out.println("5. Year End Function");
            System.out.println("6. Cancel");
            option = scn.nextInt();
            List<MenuItem> menu = new ArrayList<MenuItem>();


            String eventType;
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

                if (option != 6) {

                    System.out.println("Date & Time: ");
                    DateTime eventDateandTime = scn.nextLine();

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
        }


        scn.close();//commit 
    }
}
