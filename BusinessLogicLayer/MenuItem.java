package BusinessLogicLayer;

public class MenuItem {
    private String menuItem;
    private Double cost;

    public String getMenuItem() {
        return menuItem;
    }
    public void setMenuItem(String MenuItem) {
        this.menuItem=MenuItem;
    }

    public Double getCost() {
        return cost;
    }
    public void setCost(Double Cost) {
        this.cost =Cost;
    }

    public MenuItem(String MenuItem,Double Cost) {
        this.menuItem =MenuItem;
        this.cost=Cost;
    }

    
}

