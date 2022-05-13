public class Menu {
    String food;
    float foodPrice;

    
    public Menu() {
    }

    public Menu(String food,  float foodPric) {
        this.food = food;
        this.foodPrice = foodPrice;
    }


    public void setFoodPrice(float foodPrice) {
        this.foodPrice = foodPrice;
    }

    public float getFoodPrice() {
        return foodPrice;
    }

}