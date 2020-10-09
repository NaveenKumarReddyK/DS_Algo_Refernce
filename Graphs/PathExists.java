import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Graph_Path_Struc{
    public void addEdge(ArrayList<ArrayList<Integer>> al, int u, int v){
        al.get(u).add(v);
//        al.get(v).add(u);
    }
    public void printGraph(ArrayList<ArrayList<Integer>> al){
        for(int i=0;i<al.size();i++){
            System.out.println("Adjaceny list of vertex "+ i);
            for (int j=0;j<al.get(i).size();j++){
                System.out.print(al.get(i).get(j)+" -> ");
            }System.out.println(" ");
        }
    }
    //
    public boolean pathExists(ArrayList<ArrayList<Integer>> al,int src,int dest){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[al.size()];
         q.add(src);
         visited[src] = true;
        while (!q.isEmpty()){
            int currVertex = q.poll();

            for(int i=0;i<al.get(currVertex).size();i++){
                if(al.get(currVertex).get(i) == dest){
                    return true;
                }
               if( !visited[al.get(currVertex).get(i)]){
                   visited[al.get(currVertex).get(i)] = true;
                   q.add(al.get(currVertex).get(i));
               }
            }
        }

        return false;
    }
}

public class PathExists {
    public static void main(String[] args) {
        int graphLength = 4;
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        while (graphLength>0){
            al.add(new ArrayList<Integer>());
            graphLength--;
        }

        Graph_Path_Struc gb = new Graph_Path_Struc();


        gb.addEdge(al,0, 1);
        gb.addEdge(al,0, 2);
        gb.addEdge(al,1, 2);
        gb.addEdge(al,2, 0);
        gb.addEdge(al,2, 3);
        gb.addEdge(al,3, 3);
        System.out.println(gb.pathExists(al,3,1));
    }
}
