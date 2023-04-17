package Car;

public class LugageCar extends Car{
    private int maxCapacity;
     boolean isGuardHere;

    public LugageCar(int weight, int maxLoad, boolean isGuardHere) {
        super(weight);
        this.maxCapacity = maxCapacity;
        this.isGuardHere = isGuardHere;
        this.setInfo("Lugage",false);
    }
}
