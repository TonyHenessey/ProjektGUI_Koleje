import Car.Car;
import Car.PassengerCar;
import Car.*;


import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Connection> connections = new ArrayList<>();
    static List<Station> stations=new ArrayList<>();

    static List<Locomotive> locomotives = new ArrayList<>();


    public static void main(String[] args) {

        Locomotive loc = new Locomotive(5,2,20);
        Car car1 =new PassengerCar(10, 10,true);
        Car car2 = new PassengerCar(12,15,true);

        loc.addCar(car1);
        loc.addCar(car2);

        Station michalin = new Station(1);
        Station otwock = new Station(2);
        Station karczew = new Station(3);

        stations.add(michalin);
        stations.add(otwock);
        stations.add(karczew);

        connections.add(new Connection(michalin, otwock,10));
        connections.add(new Connection(otwock,karczew,5));

        Locomotive locomotive2 = new Locomotive(6,3,40);
        Car car3= new ExplosiveCar(20,200,true,"Dynamit",true);
        locomotive2.addCar(car3);

         Dijkstry grap = new Dijkstry();

         grap.addEdge(otwock.getStationID(), karczew.getStationID(), 5);
         grap.addEdge(karczew.getStationID(), michalin.getStationID(), 20);
//         grap.addEdge(michalin.getStationID(), ,7);
//         grap.addEdge(4,3,4);
//         grap.addEdge(2,4,3);

         List<Integer>path = grap.dijkstra(otwock.getStationID(), michalin.getStationID());

        System.out.println( "Loc1");

        Locomotive loc1 = new Locomotive(5,3,30);
        Car car = new PassengerCar(10,60,true);
        Car car5 = new MailCar(10,60,true);
        Car car6 = new PassengerCar(8,60,true);
        loc1.addCar(car);
        loc1.addCar(car5);
        loc1.addCar(car6);
        loc1.printCars();
        loc1.removeCar(car);
        System.out.println("po usunieciu");
        loc1.printCars();
        System.out.println("Locomotive2");
        locomotive2.printCars();
        System.out.println("loc");
        loc.printCars();
        System.out.println("Składy: ");
        locomotive2.addLocomotive(locomotive2);
        loc1.addLocomotive(loc1);
        System.out.println(loc.toString());
        System.out.println(loc1.toString());
        System.out.println("nic");
        Menu.printMenu();



















    }


}