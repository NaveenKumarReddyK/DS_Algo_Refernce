import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class GraphDFS_Struc{
    public void addEdge(ArrayList<ArrayList<Integer>> al, int u, int v){
        al.get(u).add(v);
        al.get(v).add(u);
    }
    public void printGraph(ArrayList<ArrayList<Integer>> al){
        for(int i=0;i<al.size();i++){
            System.out.println("Adjaceny list of vertex "+ i);
            for (int j=0;j<al.get(i).size();j++){
                System.out.print(al.get(i).get(j)+" -> ");
            }System.out.println(" ");
        }
    }
    // Depth First Search
    public void DFS( ArrayList<ArrayList<Integer>> al,int val){
        boolean[] visited = new boolean[al.size()];
        DFS_Util(al,val,visited);
        //handling unvisited nodes

        for (int i=0;i<visited.length;i++){
            if (visited[i] == false){
                DFS_Util(al,i,visited);
            }
        }
    }

    public void DFS_Util(ArrayList<ArrayList<Integer>> al,int val,boolean[] visited){
        visited[val] = true;
        System.out.print(val+" ");
        for(int i=0;i<al.get(val).size();i++){
            int currVal = al.get(val).get(i);
            if(!visited[currVal]){

                DFS_Util(al,currVal,visited);
            }
        }
    }

}
public class GraphDFS {
    public static void main(String[] args) {
        int graphLength = 4;
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        while (graphLength>0){
            al.add(new ArrayList<Integer>());
            graphLength--;
        }

        GraphDFS_Struc gb = new GraphDFS_Struc();


        gb.addEdge(al,0, 1);
        gb.addEdge(al,0, 2);
        gb.addEdge(al,1, 2);
        gb.addEdge(al,2, 0);
        gb.addEdge(al,2, 3);
        gb.addEdge(al,3, 3);
        gb.DFS(al,2);
    }
}
