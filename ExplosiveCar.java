package Car;

public class ExplosiveCar extends HeavyreightCar{
    private String type;
    boolean isDangerous;

    public ExplosiveCar(int weight, int maxCapacity, boolean isOpen, String type, boolean isDangerous) {
        super(weight, maxCapacity, isOpen);
        this.type = type;
        this.isDangerous = isDangerous;
        this.setInfo("Explosive",false);
    }
}
