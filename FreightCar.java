package Car;

public class FreightCar extends Car{
    private int maxCapacity;
    boolean isOpen;

    public FreightCar(int weight, int maxCapacity, boolean isOpen) {
        super(weight);
        this.maxCapacity = maxCapacity;
        this.isOpen = isOpen;
        this.setInfo("Freight",false);
    }
}
