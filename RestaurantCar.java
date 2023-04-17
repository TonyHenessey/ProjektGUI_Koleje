package Car;

public class RestaurantCar extends Car{
    private int tableNumber;
    boolean isProVegan;

    public RestaurantCar(int weight, int tableNumber, boolean isProVegan) {
        super(weight);
        this.tableNumber = tableNumber;
        this.isProVegan = isProVegan;
        this.setInfo("Restraunt",true);
    }
}
