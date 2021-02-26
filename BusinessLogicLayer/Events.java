package BusinessLogicLayer;

import java.util.Scanner;

public interface Events {
    
    int UserInput;

            UserInput = input.nextInt();

            int evnt = UserInput;

            String EventName;
            switch (evnt) {
                case 1:  EventName = "Baptism";
                         break;
                case 2:  EventName = "Wedding";
                         break;
                case 3:  EventName = "Year - end function";
                         break;
                case 4:  EventName = "Birthday";
                         break;
                case 5:  EventName = "Parties";
                         break;
                case 6:  EventName = "Other";
                         break;
                default: EventName = "Invalid option";
                         break;

      void getdetails()
      {}                   
}
    

