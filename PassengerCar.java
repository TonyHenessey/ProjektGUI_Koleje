package Car;

public class PassengerCar extends Car {

        private int seatsNumber;
        boolean isToilet;

    public PassengerCar(int weight, int seatsNumber, boolean isToilet) {
        super(weight);
        this.seatsNumber = seatsNumber;
        this.isToilet = isToilet;
        this.setInfo("passenger",true);
    }


}
