import java.util.ArrayList;

class Undirected_Graph_Struc{
    public void addEdge(ArrayList<ArrayList<Integer>> al, int u, int v){
        //for directed graph;
        //al.get(u).add(v);
        //for undirected graph
        al.get(u).add(v);
         al.get(v).add(u);
    }
    public boolean contiansCycle( ArrayList<ArrayList<Integer>> al){
        boolean[] visited = new boolean[al.size()];
        for(int i=0;i<al.size();i++){
            if(!visited[i]){
                if(cycleUtil(al,i,visited,-1)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean cycleUtil( ArrayList<ArrayList<Integer>> al,int i,boolean[] visited,int parent){
        visited[i] = true;
        for(int j=0;i<al.get(i).size();j++){
            int currVal = al.get(i).get(j);
            if(!visited[currVal]){
                //make curr number "i" as parent
                if(cycleUtil(al,currVal,visited,i)){
                    return true;
                }
                else if(currVal != parent){
                    return true;
                }
            }
        }
        return false;

    }
}
public class CycleInUnDriectedGraph {
    public static void main(String[] args) {
        int numOfVertices = 5;
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < numOfVertices; i++) {
            al.add(new ArrayList<Integer>());
        }
        Cycel_Graph g = new Cycel_Graph();
        g.addEdge(al,1, 0);
        g.addEdge(al,0, 2);
        g.addEdge(al,2, 4);
        g.addEdge(al,0, 3);
        g.addEdge(al,3, 4);
        if(g.containsCycle(al)){
            System.out.println("Graph contains cycle");
        }
        else{
            System.out.println("Graph does not contain cycle");
        }
    }
}
