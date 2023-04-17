import Car.*;
import java.util.ArrayList;
import java.util.List;

public
    class Locomotive {

    private int maxCars;
    private int maxLoad;

    private int maxElectrical;
    private String name;
    private Station current;
    private Station source;
    private Station end;
    private int id;
    private static int autonumber =1 ;
    private double velocity = 100;

    private List<Car> cars = new ArrayList<>();


    public String getName() {
        return name;
    }

    public int getMaxCars() {
        return maxCars;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public int getMaxElectrical() {
        return maxElectrical;
    }

    public Locomotive(int maxCars, int maxElectrical, int maxLoad){
        this.maxCars=maxCars;
        this.maxElectrical=maxElectrical;
        this.maxLoad=maxLoad;
        this.id=autonumber++;
    }
    public  void velocityChange() throws RailroadHazard {
        double i= Math.random();
        if (i>0.5){
            velocity= velocity + (velocity*0.03);
        }else velocity = velocity - (velocity*0.03);
        if (velocity>200){
            throw new RailroadHazard("Uwaga! Pociąg przekroczył dozwoloną prędkość!");
        }
    }
    public Car getCar(int id){
        return cars.get(id);
    }

    public int getId() {
        return id;
    }
    public void addLocomotive(Locomotive locomotive){
        List<Locomotive>locomotives=new ArrayList<>();
        locomotives.add(locomotive);
    }
    public void addCar(Car car){
        int result = 0;
        int counter=0;
        for(Car x : cars){
            result = result + x.getWeight();
            if(x.isElectrical()){
                counter++;
            }
        }
        if(car.isElectrical())
            counter++;

        if(result + car.getWeight() > maxLoad || cars.size() >= maxCars || counter > maxElectrical){
            System.out.println("Nie udalo sie przyoisac wagonu do lokomotywy");
        } else {
            cars.add(car);
            System.out.println("Udalo sie przypisac wagon do lokomotywy");
        }

    }
    public boolean removeCar(Car car){
        if (cars.remove(car)){
            return true;
        } else {
            return false;
        }
    }

    public void move(Locomotive locomotive){

    }

    @Override
    public String toString() {
        return ("Lokomotywa " + "["+ getId()+ "]\n" +
                "Ilosc wagnow: " + getMaxCars() + "\n" +
                "Ilosc wagnowo wymagajacych do podlaczenia do sieci elektrycznej "+ getMaxElectrical() + "\n" +
                "Waga: " + getMaxLoad() );
    }

    public void printCars(){
        for (int i = 0; i < cars.size(); i++){
            System.out.println("[" + i + "]" + " - " + cars.get(i).getName());
        }
    }

    public List<Car> getCars(){
        return this.cars;
    }

//    public void printLocomotives(){
//        for (int i=0;i<locomotives.size();i++){
//            System.out.println("[" + i + "]" + "-"+locomotives.get(i).getName());
//        }
//    }

}
