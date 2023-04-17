package Car;

public abstract class Car {

    private static int autoNumber= 1;
    private int id;
    private String name;
    private int weight;
    private boolean isElectrical;

    public Car(int weight){
        this.weight=weight;
        this.id=autoNumber++;
    }

    public void setInfo(String name, boolean isElectrical){
        this.name=name;
        this.isElectrical=isElectrical;
    }


    public int getWeight(){
        return weight;
    }

    public boolean isElectrical(){
        return isElectrical;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return "Wagon " + name + " o wadze " + weight + " ton";
    }

    public int getId() {
        return id;
    }
}
