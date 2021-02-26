package DataAccess;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.List;
import BusinessLogicLayer.*;

public class ReadData 
{
    //List<Client> clients = new List<Client>();
    //List<Event> events = new List<Client>();
    public static void main(String[] args) {
        try {
          File myObj = new File("Booking.txt");
          Scanner myReader = new Scanner(myObj);
          while (myReader.hasNextLine()) {
            String data = myReader.nextLine(); 
            //Split the fields up into an array     
            String[] SeperatedData = data.split(",");
            //Create Client Object
            clients.Add(new Client(seperatedData[0],seperatedData[1],seperatedData[2])) //Name, Surname, Phone Number

            List<String> menu = new ArrayList<String>(); //A list that will contain all the menu options
            int offset = 0;                             //This is to help determine where the next field is after the list of menu items
            
            //Find the menu items in the string and add them to the menu list
            for (String string : SeperatedData) {
                if(string.contains("#")) {
                    menu.add(string.substring(1, string.length()));
                    offset++;
                }
            }

            //Create Event Object
            events.Add(new Event(seperatedData[3],seperatedData[4],seperatedData[5],seperatedData[6],seperatedData[7],menu,seperatedData[8+offset],seperatedData[9+offset],seperatedData[10+offset]))
            
            System.out.println(data);
          }
          myReader.close();
        } catch (FileNotFoundException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
      }
}
