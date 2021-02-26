package BusinessLogicLayer;

import java.util.ArrayList;
import java.util.List;

public class MenuSelection {
    
    List<MenuItem> items;
    private int people;
    public int getPeople()
    {return people;}

    public void setPeople(int People) {
        this.people =People;
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

    public Double MenuTotal() {
        Double sum = 0.00;
        Double total=0.00;
        for(MenuItem item : items)
        {
            sum += item.getCost();
        }

        Double discount =sum*0.15;
        if (people>40) {
            total = sum-discount;
            return total;
        }
        else
        {
            return sum;
        }
        
    }
}
