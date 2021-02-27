package BusinessLogicLayer;

public class MenuItem {
    private String menuItem; // Either Starter, Main, Dessert or Drinks.
    private String description; // Describes the meal e.g Fennel salad with blue cheese dressing
    private String mealType; // Could be changed to a boolean, this is just to specify if the meal is for a child or adult
    private Double cost; // The cost of the meal per person

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

    public String getDescription() {
        return description;
    }
    public void setDescription(String Description) {
        this.description=Description;
    }

    public String getMealType() {
        return mealType;
    }
    public void setCost(String MealType) {
        this.mealType =MealType;
    }

    public MenuItem(String MenuItem,String Description,String MealType, Double Cost) {
        this.menuItem =MenuItem;
        this.description =Description;
        this.mealType =MealType;
        this.cost=Cost;
    }

    
}

