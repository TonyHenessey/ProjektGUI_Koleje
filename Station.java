public
    class Station {

    private int name;
    private int stationID;
    private static int autonumber=10;


    public Station(int name){
        this.name=name;
        this.stationID=autonumber;
        autonumber++;
    }

    public int getStationID() {
        return stationID;
    }

    public int getName(){
        return name;
    }

}
