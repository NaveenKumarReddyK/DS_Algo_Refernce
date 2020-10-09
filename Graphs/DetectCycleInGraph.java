import java.util.ArrayList;

class Cycel_Graph{
    public void addEdge(ArrayList<ArrayList<Integer>> al,int u,int v){
        //for directed graph;
        al.get(u).add(v);
        //for undirected graph
        //al.get(u).add(v)
        // al.get(v).add(u)
        }
    public boolean containsCycle(ArrayList<ArrayList<Integer>> al){
        boolean[] visited =new boolean[al.size()];
        boolean[] recarr = new boolean[al.size()];
        for(int i=0;i<al.size();i++){
            if(cycleUtil(al,i,visited,recarr)){
                return true;
            }
        }
        return false;
    }
    public boolean cycleUtil(ArrayList<ArrayList<Integer>> al,int i,boolean[] visited,boolean[] recarr){
        visited[i] = true;
        recarr[i] = true;
        for(int j=0;j<al.get(i).size();j++){
            int currVal = al.get(i).get(j);
            if(!visited[currVal] && cycleUtil(al,currVal,visited,recarr)){
                return true;
            }
            else if(recarr[currVal]){
                return true;
            }
        }
        recarr[i] = false;
        return false;
    }
}
public class DetectCycleInGraph {
    public static void main(String[] args) {
        int numOfVertices = 5;
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<numOfVertices;i++){
            al.add(new ArrayList<Integer>());
        }
        Cycel_Graph g = new Cycel_Graph();
        g.addEdge(al,0,1);
        g.addEdge(al,1,2);
        g.addEdge(al,2,3);
        g.addEdge(al,3,4);
        if(g.containsCycle(al)){
            System.out.println("There exists a cycle");
        }
        else {
            System.out.println("There exists no cycle");
        }
    }
}
