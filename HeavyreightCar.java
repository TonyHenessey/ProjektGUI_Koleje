package Car;

public class HeavyreightCar extends Car{
    private int maxCapacity;
    boolean isOpen;

    public HeavyreightCar(int weight, int maxCapacity, boolean isOpen) {
        super(weight);
        this.maxCapacity = maxCapacity;
        this.isOpen = isOpen;
        this.setInfo("Heavy freight",false);
    }
}
