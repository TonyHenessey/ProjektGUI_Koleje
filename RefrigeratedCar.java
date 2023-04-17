package Car;

public class RefrigeratedCar extends FreightCar{
    private double temperature;
    boolean isTurnedOn;

    public RefrigeratedCar(int weight, int maxCapacity, boolean isOpen, double temperature, boolean isTurnedOn) {
        super(weight, maxCapacity, isOpen);
        this.temperature = temperature;
        this.isTurnedOn = isTurnedOn;
        this.setInfo("Refrigrated",true);
    }
}
