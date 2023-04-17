import java.util.*;
public class Dijkstry {
    private Map<Integer,Map<Integer, Integer>> graph;

    public Dijkstry(){
        graph = new HashMap<>();
    }
    public void addEdge(Integer start,Integer end,int distance){

//        jezeli nie ma nic to dodaje do hasmapy
        graph.putIfAbsent(start,new HashMap<>());
//        pobierramy poczatek i wklejamy koniec i odlegloscc
        graph.get(start).put(end,distance);
//        jezeli nie ma nic to dodaje
        graph.putIfAbsent(end,new HashMap<>());
//        pobierramy koniec i wklejamy poczatek i odlegloscc
        graph.get(end).put(start,distance);
    }

    public List<Integer>dijkstra(Integer start,Integer end){
        Map<Integer,Integer>distances =  new HashMap<>();
        Map<Integer,Integer> previous = new HashMap<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparing(distances::get));

        distances.put(start,0);
        queue.offer(start);

        while (!queue.isEmpty()){
            Integer current = queue.poll();

            if (current.equals(end)){
                break;
            }

            for (Map.Entry<Integer,Integer> neighbor : graph.get(current).entrySet()){
                Integer next = neighbor.getKey();
                int distance = neighbor.getValue();
                int totalDistance = distances.get(current)+distance;

                if (!distances.containsKey(next) || totalDistance < distances.get(next)){
                    distances.put(next,totalDistance);
                    previous.put(next, totalDistance);
                    previous.put(next,current);
                    queue.offer(next);
                }
            }
        }

        List<Integer> path = new ArrayList<>();
        Integer current = end;

        while (previous.containsKey(current)){
            path.add(current);
            current=previous.get(current);
        }
        path.add(start);
        Collections.reverse(path);
        return path;
    }


}
