import java.util.List;

public class Connection {

    private Station source;
    private Station destination;
    private int distance;

    public Connection(Station source, Station destination, int distance ){
        this.source=source;
        this.destination= destination;
        this.distance= distance;
    }
    public int getDistance(){
        return distance;
    }

    public int getSourceName(){
        return source.getName();
    }

    public int  getDestinationName(){
        return destination.getName();
    }

    public  void createConnection(Station source,Station destination,int distance){
//        Connection connection = new Connection(source,destination,distance);
        Dijkstry graph = new Dijkstry();
        graph.addEdge(source.getStationID(),destination.getStationID(),distance);
    }

    public void showPath(Dijkstry graph){
        List<Integer>path = graph.dijkstra(getSourceName(),getDestinationName());

        System.out.println("Shortest path: " + path);
    }

}
