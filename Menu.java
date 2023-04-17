import Car.*;


import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Menu {


    public static final Scanner scanner = new Scanner(System.in);
    private static List<Locomotive>locomotives=new ArrayList<Locomotive>();
    public static void printAll(){
        System.out.println("Sklad pociagu: ");
        for (int i =0;i<locomotives.size();i++){
            Locomotive loc = locomotives.get(i);
            System.out.println(locomotives.get(i));
            System.out.println("Wagony: ");
            locomotives.get(i).printCars();
        }
    }

    @Override
    public String toString() {
        return "Skład{" + locomotives;
    }

    public static void printMenu() {
        boolean startStop = true;
        while (startStop) {
            System.out.println("""
                    Menu
                    1.Nowa gra
                    2.Zakoncz""");
            String pierwszySwitch = scanner.next();
            switch (pierwszySwitch) {
                case "1" -> {
                    boolean b = true;
                    while (b) {
                        System.out.println("""
                                1. Stwórz pociag\s
                                2. Stwórz stacje kolejowa\s
                                3. Wyswietl składy pociągu
                                4.Exit""");
                        String drugiSwitch = scanner.next();
                        switch (drugiSwitch) {
                            case "1" -> {
                                System.out.println("Podaj maksymalna ilosc wagonow");
                                int maxCars = scanner.nextInt();
                                System.out.println("Podaj maksymalną liczbę wagonów wymagających podłączenia do sieci elektrycznej");
                                int maxElectro = scanner.nextInt();
                                System.out.println("Podaj maksymalny udzwig");
                                int maxLoad = scanner.nextInt();
                                Locomotive locomotive = new Locomotive(maxCars, maxElectro, maxLoad);
                               locomotives.add(locomotive);
                                boolean b1 = true;
                                while (b1) {
                                    System.out.println(" mozesz stworzyc wagony ktore chcesz podlaczyc do lokomotywy");
                                    System.out.println("""
                                            wybierz rodzaj wagonu:\s
                                            1.Pasazerski\s
                                            2.Pocztowy
                                            3.Bagazowo-pocztowy
                                            4.Restauracyjny
                                            5.Towarowy Podstawowy
                                            6.Towarowy Ciezki
                                            7.Chlodniczy
                                            8.Na materialy ciekle
                                            9.Na materialy gazowe
                                            10.Na materaly wybuchowe
                                            11.Na materialy toksyczne
                                            12.Na ciekle materialy toksyczne
                                            13.Usun wagon
                                            14.Wyswietl sklady pociagow
                                            15.Powrot""");
                                    String wyborWagonu = scanner.next();
                                    switch (wyborWagonu) {
                                        case "1" -> {
                                            System.out.println("Podaj wage (w tonach)");
                                            int weight = scanner.nextInt();
                                            System.out.println("Podaj ilosc miejsc siedzacych");
                                            int seatsNumber = scanner.nextInt();
                                            System.out.println("Czy jest toaleta? (true or false)");
                                            boolean isToilet = scanner.nextBoolean();
                                            Car car1 = new PassengerCar(weight, seatsNumber, isToilet);
                                            System.out.println("""
                                                     Czy chcesz przypisac wagon do lokomotywy?
                                                    1.TAK
                                                    2.NIE""");
                                            String choice1 = scanner.next();
                                            switch (choice1) {
                                                case "1" -> locomotive.addCar(car1);
                                                default -> System.out.println("Nie dodano wagonu");
                                            }
                                        }
                                        case "2" -> {
                                            System.out.println("Podaj wage (w tonach)");
                                            int weight2 = scanner.nextInt();
                                            System.out.println("Podaj maksymalna pojemnosc");
                                            int maxCapacity2 = scanner.nextInt();
                                            System.out.println("Czy drzwi sa stalowe? (true or false)");
                                            boolean isDoorFromSteel = scanner.nextBoolean();
                                            Car car2 = new MailCar(weight2, maxCapacity2, isDoorFromSteel);
                                            System.out.println("""
                                                    Czy chcesz przypisac wagon do lokomotywy?
                                                    1.TAK
                                                    2.NIE""");
                                            String choice2 = scanner.next();
                                            switch (choice2) {
                                                case "1" -> locomotive.addCar(car2);
                                                default -> System.out.println("Nie dodano wagonu");
                                            }
                                        }

                                        case "3" -> {
                                            System.out.println("Podajk wage (w tonach)");
                                            int weight3 = scanner.nextInt();
                                            System.out.println("Podaj maksymalna ilosc zaladunku");
                                            int maxLoadL = scanner.nextInt();
                                            System.out.println("Czy ktos pilnuje bagazy? (true or false)");
                                            boolean isGuardHere = scanner.nextBoolean();
                                            Car car3 = new LugageCar(weight3, maxLoadL, isGuardHere);
                                            System.out.println("""
                                                    Czy chcesz przypisac wagon do lokomotywy?
                                                    1.TAK
                                                    2.NIE""");
                                            String choice3 = scanner.next();
                                            switch (choice3) {
                                                case "1" -> locomotive.addCar(car3);
                                                default -> System.out.println("Nie dodano wagonu");
                                            }
                                        }
                                        case "4" -> {
                                            System.out.println("Podaj wage (w tonach)");
                                            int weight4 = scanner.nextInt();
                                            System.out.println("Podaj ilosc stolikow");
                                            int tableNumber = scanner.nextInt();
                                            System.out.println("Czy jest jakies weganskie jedzenie? (treu or false)");
                                            boolean isProVegan = scanner.nextBoolean();
                                            Car car4 = new RestaurantCar(weight4, tableNumber, isProVegan);
                                            System.out.println("""
                                                    Czy chcesz przypisac wagon do lokomotywy?
                                                    1.TAK
                                                    2.NIE""");
                                            String choice4 = scanner.next();
                                            switch (choice4) {
                                                case "1" -> locomotive.addCar(car4);
                                                default -> System.out.println("Nie dodano wagonu");
                                            }
                                        }

                                        case "5" -> {
                                            System.out.println("Podaj wage (w tonach)");
                                            int weigth = scanner.nextInt();
                                            System.out.println("Podaj maksymalna ilosc miejsca (m^2)");
                                            int maxCapacity = scanner.nextInt();
                                            System.out.println("Czy mozna otworzyc w trakcie jazdy? (true or false)");
                                            boolean isOpen = scanner.nextBoolean();
                                            Car car5 = new FreightCar(weigth, maxCapacity, isOpen);
                                            System.out.println("""
                                                    Czy chcesz przypisac wagon do lokomotywy?
                                                    1.TAK
                                                    2.NIE""");
                                            String choice5 = scanner.next();
                                            switch (choice5) {
                                                case "1" -> locomotive.addCar(car5);
                                                default -> System.out.println("Nie dodano wagonu");
                                            }
                                        }
                                        case "6" -> {
                                            System.out.println("Podaj wage (w tonach)");
                                            int weigth = scanner.nextInt();
                                            System.out.println("Podaj maksymalna ilosc miejsca (m^2)");
                                            int maxCapacity = scanner.nextInt();
                                            System.out.println("Czy mozna otworzyc w trakcie jazdy? (true or false)");
                                            boolean isOpen = scanner.nextBoolean();
                                            Car car6 = new HeavyreightCar(weigth, maxCapacity, isOpen);
                                            System.out.println("""
                                                    Czy chcesz przypisac wagon do lokomotywy?
                                                    1.TAK
                                                    2.NIE""");
                                            String choice6 = scanner.next();
                                            switch (choice6) {
                                                case "1" -> locomotive.addCar(car6);
                                                default -> System.out.println("Nie dodano wagonu");
                                            }
                                        }

                                        case "7" -> {
                                            System.out.println("Podaj wage (w tonach)");
                                            int weigth = scanner.nextInt();
                                            System.out.println("Podaj maksymalna ilosc miejsca (m^2)");
                                            int maxCapacity = scanner.nextInt();
                                            System.out.println("Czy mozna otworzyc w trakcie jazdy? (true or false)");
                                            boolean isOpen = scanner.nextBoolean();
                                            System.out.println("Podaj temperature w srodku");
                                            double temperature = scanner.nextDouble();
                                            System.out.println("Czy jest wlaczony(true or false)");
                                            boolean isTurnedOn = scanner.nextBoolean();
                                            Car car7 = new RefrigeratedCar(weigth, maxCapacity, isOpen, temperature, isTurnedOn);
                                            System.out.println("""
                                                    Czy chcesz przypisac wagon do lokomotywy?
                                                    1.TAK
                                                    2.NIE""");
                                            String choice7 = scanner.next();
                                            switch (choice7) {
                                                case "1" -> locomotive.addCar(car7);
                                                default -> System.out.println("Nie dodano wagonu");
                                            }
                                        }

                                        case "8" -> {
                                            //                                LiquidCar
                                            System.out.println("Podaj wage (w tonach)");
                                            int weigth = scanner.nextInt();
                                            System.out.println("Podaj maksymalna ilosc miejsca (m^2)");
                                            int maxCapacity = scanner.nextInt();
                                            System.out.println("Czy mozna otworzyc w trakcie jazdy? (true or false)");
                                            boolean isOpen = scanner.nextBoolean();
                                            System.out.println("Jaki ciekly material znajduje sie w srodku?");
                                            String description = scanner.nextLine();
                                            boolean isDangerous = false;
                                            Car car8 = new ToxicLiguidCar(weigth, maxCapacity, isOpen, description, isDangerous);
                                            System.out.println("""
                                                    Czy chcesz przypisac wagon do lokomotywy?
                                                    1.TAK
                                                    2.NIE""");
                                            String choice8 = scanner.next();
                                            switch (choice8) {
                                                case "1" -> locomotive.addCar(car8);
                                                default -> System.out.println("Nie dodano wagonu");
                                            }
                                        }

                                        case "9" -> {
                                            System.out.println("Podaj wage (w tonach)");
                                            int weigth = scanner.nextInt();
                                            System.out.println("Podaj maksymalna ilosc miejsca (m^2)");
                                            int maxCapacity = scanner.nextInt();
                                            System.out.println("Czy mozna otworzyc w trakcie jazdy? (true or false)");
                                            boolean isOpen = scanner.nextBoolean();
                                            System.out.println("Jaka jest gestosc tego gazu");
                                            double gestosc = scanner.nextDouble();
                                            System.out.println("Jaki gaz znajduje sie w srodku?");
                                            String gasDecription = scanner.nextLine();
                                            Car car9 = new GasCar(weigth, maxCapacity, isOpen, gestosc, gasDecription);
                                            System.out.println("""
                                                    Czy chcesz przypisac wagon do lokomotywy?
                                                    1.TAK
                                                    2.NIE""");
                                            String choice9 = scanner.next();
                                            switch (choice9) {
                                                case "1" -> locomotive.addCar(car9);
                                                default -> System.out.println("Nie dodano wagonu");
                                            }
                                        }

                                        case "10" -> {
                                            System.out.println("Podaj wage (w tonach)");
                                            int weigth = scanner.nextInt();
                                            System.out.println("Podaj maksymalna ilosc miejsca (m^2)");
                                            int maxCapacity = scanner.nextInt();
                                            System.out.println("Czy mozna otworzyc w trakcie jazdy? (true or false)");
                                            boolean isOpen = scanner.nextBoolean();
                                            System.out.println("Jaki material wybuchowy znajduje sie w srodku?");
                                            String type = scanner.nextLine();
                                            System.out.println("Czy jest niebezpieczne? (true or false)");
                                            boolean isDangerous = scanner.nextBoolean();
                                            Car car10 = new ExplosiveCar(weigth, maxCapacity, isOpen, type, isDangerous);
                                            System.out.println("""
                                                    Czy chcesz przypisac wagon do lokomotywy?
                                                    1.TAK
                                                    2.NIE""");
                                            String choice10 = scanner.next();
                                            switch (choice10) {
                                                case "1" -> locomotive.addCar(car10);
                                                default -> System.out.println("Nie dodano wagonu");
                                            }
                                        }

                                        case "11" -> {
                                            System.out.println("Podaj wage (w tonach)");
                                            int weigth = scanner.nextInt();
                                            System.out.println("Podaj maksymalna ilosc miejsca (m^2)");
                                            int maxCapacity = scanner.nextInt();
                                            System.out.println("Czy mozna otworzyc w trakcie jazdy? (true or false)");
                                            boolean isOpen = scanner.nextBoolean();
                                            System.out.println("Jaki material toksyczny znajduje sie w srodku?");
                                            String type = scanner.nextLine();
                                            System.out.println("Czy jest zabójczy? (true or false)");
                                            boolean isDeadly = scanner.nextBoolean();
                                            Car car11 = new ToxicCar(weigth, maxCapacity, isOpen, type, isDeadly);
                                            System.out.println("""
                                                    Czy chcesz przypisac wagon do lokomotywy?
                                                    1.TAK
                                                    2.NIE""");
                                            String choice11 = scanner.next();
                                            switch (choice11) {
                                                case "1" -> locomotive.addCar(car11);
                                                default -> System.out.println("Nie dodano wagonu");
                                            }
                                        }

                                        case "12" -> {
                                            System.out.println("Podaj wage (w tonach)");
                                            int weigth = scanner.nextInt();
                                            System.out.println("Podaj maksymalna ilosc miejsca (m^2)");
                                            int maxCapacity = scanner.nextInt();
                                            System.out.println("Czy mozna otworzyc w trakcie jazdy? (true or false)");
                                            boolean isOpen = scanner.nextBoolean();
                                            System.out.println("Jaki ciekly material toksyczny znajduje sie w srodku?");
                                            String description = scanner.nextLine();
                                            System.out.println("Czy jest niebezpieczny? (true or false)");
                                            boolean isDangerous = scanner.nextBoolean();
                                            Car car12 = new ToxicLiguidCar(weigth, maxCapacity, isOpen, description, isDangerous);
                                            System.out.println("""
                                                    Czy chcesz przypisac wagon do lokomotywy?
                                                    1.TAK
                                                    2.NIE""");
                                            String choice12 = scanner.next();
                                            switch (choice12) {
                                                case "1" -> locomotive.addCar(car12);
                                                default -> System.out.println("Nie dodano wagonu");
                                            }
                                        }

                                        case "13" -> {
                                            locomotive.printCars();
                                            System.out.print("ID wagonu do usuniecia: ");
                                            int id = scanner.nextInt();
                                            if (locomotive.removeCar(locomotive.getCar(id))) {
                                                System.out.println("pomyslnie usunieto");
                                            } else {
                                                System.out.println("nie udalo sie usunac");
                                            }
                                        }
                                        case "14"->{
                                            System.out.println("Skład pociagu: ");
                                            System.out.println(locomotive.toString());
                                            System.out.println("Wagony: ");
                                            locomotive.printCars();
                                        }
                                        case "15" -> b1 = false;
                                    }
                                }

                            }
                            case "2" -> {
                                boolean b2 = true;
                                List<Connection> list = new ArrayList<>();
                                System.out.println("Podaj nazwe stacji: (INTEGER)");
                                int statioName = scanner.nextInt();
                                Station station = new Station(statioName);
                                while (b2) {
                                    System.out.println("""
                                            Czy chcesz stworzyc polaczenie z tą stacją?
                                            1.TAK
                                            2.NIE""");
                                    String polaczenie = scanner.next();
                                    switch (polaczenie) {
                                        case "1" -> {
                                            System.out.println("Podaj stacje koncowa (int)");
                                            int name2 = scanner.nextInt();
                                            Station destination = new Station(name2);
                                            System.out.println("Podaj odległosc miedzy stacjami (km/h)");
                                            int distance = scanner.nextInt();
                                            list.add(new Connection(station, destination, distance));
                                        }
                                        case "2" -> b2 = false;
                                    }
                                }
                            }
                            case "3" -> {
                               Menu.printAll();

                            }
                            default -> { b=false;

                            }
                        }
                    }
                }
                case "2"->{
                    startStop=false;
                    System.out.println("Do zobaczenia :D");
                }
            }
        }
    }
}
