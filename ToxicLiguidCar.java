package Car;

public class ToxicLiguidCar extends HeavyreightCar implements LiquidCar{

    boolean isToxic;
    private String descripton;

    public ToxicLiguidCar(int weight, int maxCapacity, boolean isOpen,  String descripton,boolean isDangerous) {
        super(weight, maxCapacity, isOpen);
        this.isToxic = isToxic;
        this.descripton = descripton;
    }

    @Override
    public void WhatsInside() {


    }

    @Override
    public void LiquidDescreption() {

    }
}
