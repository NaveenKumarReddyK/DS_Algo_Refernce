import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class GraphBFS_Struc{
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
    // Breadth FIrst Search
    public void BFS(ArrayList<ArrayList<Integer>> al,int val){
        //Create visited array
        boolean[] visited = new boolean[al.size()];

        //Creating a queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(val);
        visited[val] = true;
        while (!queue.isEmpty()){
            int currVal = queue.poll();
            System.out.print(currVal+" ");
            for(int i=0;i<al.get(val).size();i++){
                    int num = al.get(val).get(i);
                    if(!visited[num]){
                        visited[num] = true;
                        queue.add(num);
                    }
            }
        }
    }
}
public class GraphBFS {
    public static void main(String[] args) {
        int graphLength = 4;
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        while (graphLength>0){
            al.add(new ArrayList<Integer>());
            graphLength--;
        }

        GraphBFS_Struc gb = new GraphBFS_Struc();


        gb.addEdge(al,0, 1);
        gb.addEdge(al,0, 2);
        gb.addEdge(al,1, 2);
        gb.addEdge(al,2, 0);
        gb.addEdge(al,2, 3);
        gb.addEdge(al,3, 3);
        gb.BFS(al,2);
    }
}
