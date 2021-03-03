package BusinessLogicLayer;

import java.util.List;
import java.util.ArrayList;

public class Events {

      String eventType;
      String eventDateandTime;
      String eventCity;
      String eventArea;
      String eventStreet;
      //The address = city + area + street thus it is redundant
      //String eventAdress;
      //House Number is specified in the street ex. 29 Carnival Lane Unless the place is within a complex
      //String eventHouseNumber;
      String eventTheme;
      int numberOfAdults;
      int numberOfChildren;

    //This is a lot more flexible for menu option
      List<MenuItem> menu = new ArrayList<MenuItem>();

      public Events(String eventType, String eventDateandTime, String eventCity, String eventArea, String eventStreet,
                  String eventTheme, int numberOfAdults, int numberOfChildren, List<MenuItem> menu) {
            this.eventType = eventType;
            this.eventDateandTime = eventDateandTime;
            this.eventCity = eventCity;
            this.eventArea = eventArea;
            this.eventStreet = eventStreet;
            this.eventTheme = eventTheme;
            this.numberOfAdults = numberOfAdults;
            this.numberOfChildren = numberOfChildren;
            this.menu = menu;
      }

        
}
    

