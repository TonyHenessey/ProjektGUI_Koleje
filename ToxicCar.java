package Car;

public class ToxicCar extends HeavyreightCar{
    private String Type;
    boolean isDeadly;

    public ToxicCar(int weight, int maxCapacity, boolean isOpen, String type, boolean isDeadly) {
        super(weight, maxCapacity, isOpen);
        Type = type;
        this.isDeadly = isDeadly;
        this.setInfo("Toxic",false);
    }
}
