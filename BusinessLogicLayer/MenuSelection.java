package BusinessLogicLayer;

import java.util.ArrayList;
import java.util.List;

public class MenuSelection {
    
    List<MenuItem> items;
    private int numAdults;
    private int numKids;
    public int getNumAdults()
    {return numAdults;}
    public void setNumAdults(int NumAdults) {
        this.numAdults =NumAdults;
    }

    public int getNumKids()
    {return numKids;}
    public void setNumKids(int NumKids) {
        this.numKids = NumKids;
    }
    
    public MenuSelection() {
        this.items= new ArrayList<MenuItem>();
    }

    public void addMenuItem(MenuItem item)
    {
        this.items.add(item);
    }

    public void removeMenuItem(MenuItem item)
    {
        this.items.remove(item);
    }

    public Double MenuTotal() {    //Total and Discount Calculation Method
        int totalpeople= numAdults+numKids; 

        Double sum = 0.00;
        Double total=0.00;
        for(MenuItem item : items)
        {
            sum += item.getCost();
        }

        Double discount =sum*0.15;

        if (totalpeople>40) {
            total = sum-discount;
            return total;
        }
        else
        {
            return sum;
        }
        
    }
}
