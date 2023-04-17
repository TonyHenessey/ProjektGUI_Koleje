package Car;

public class GasCar extends FreightCar{
    private  double gestosc;
    private String gasDescription;

    public GasCar(int weight, int maxCapacity, boolean isOpen, double gestosc, String gasDescriptio) {
        super(weight, maxCapacity, isOpen);
        this.gestosc = gestosc;
        this.gasDescription = gasDescription;
        this.setInfo("Gas",false);
    }
}
