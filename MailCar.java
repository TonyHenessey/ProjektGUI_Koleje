package Car;

public class MailCar  extends Car{
    private int maxCapacity;
     boolean isDoorFromSteel;

    public MailCar(int weight, int maxCapacity, boolean isDoorFromSteel) {
        super(weight);
        this.maxCapacity = maxCapacity;
        this.isDoorFromSteel = isDoorFromSteel;
        this.setInfo("mail",true);
    }
}
