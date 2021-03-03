package DataAccessLayer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import BusinessLogicLayer.*;


public class WriteData {

   public void SaveBooking(List<Events> events)
   {
    try {
        FileWriter myWriter = new FileWriter("Booking.txt");
        for (Events event : events) {
          String menuItems = "";
          for (MenuItem menuItem : event.getMenu()) {
            menuItems += "," + menuItem.getMenuItem() + "#" + menuItem.getMealType() + "@" + menuItem.getDescription() + "$" + menuItem.getCost();
          }
          System.out.println(event.getClientNum() + "," + event.getEventType() + "," + event.getEventDateandTime() 
          + "," + event.getEventCity() + "," + event.getEventArea() + "," + event.getEventStreet() 
          + "," + event.getEventTheme() + "," + event.getNumberOfAdults() + "," + event.getNumberOfChildren()
          + menuItems);
        }
        myWriter.close();

      } 
      catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
   }

   public void SaveClients(List<Client> clients)
   {
    try {
        FileWriter myWriter = new FileWriter("Client.txt");
        for (Client client : clients) {
          System.out.println(client.getClientNum() + "," + client.getName() + "," + client.getSurname() + "," + client.getCellNumber());
        }
        myWriter.close();
      } 
      catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
   }
}
