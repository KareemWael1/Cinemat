public class Menu {
    String food;
    String drinks;
    float foodPrice;
    float drinksPrice;
    
    public Menu() {
    }

    public Menu(String food, String drinks, float foodPrice, float drinksPrice) {
        this.food = food;
        this.drinks = drinks;
        this.foodPrice = foodPrice;
        this.drinksPrice = drinksPrice;
    }

    public Menu(String food, float foodPrice) {
        this.food = food;
        this.foodPrice = foodPrice;
    }

    public void setFoodPrice(float foodPrice) {
        this.foodPrice = foodPrice;
    }

    public float getFoodPrice() {
        return foodPrice;
    }

    public void setDrinksPrice(float drinksPrice) {
        this.drinksPrice = drinksPrice;
    }

    public float getDrinksPrice() {
        return drinksPrice;
    }
    
}