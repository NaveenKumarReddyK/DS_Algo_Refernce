import java.util.ArrayList;
import java.util.Stack;

public class Strongly_Connected_Graph {
    static ArrayList<ArrayList<Integer>> graph ;
    static ArrayList<ArrayList<Integer>> graphReverse ;
    public  Strongly_Connected_Graph(int graphlengh){
        graph = new ArrayList<ArrayList<Integer>>();
        graphReverse = new ArrayList<ArrayList<Integer>>();
       for(int i=0;i<graphlengh;i++){
           graph.add( new ArrayList<Integer>());
           graphReverse.add( new ArrayList<Integer>());
       }
    }
    public static void addEdge(int u,int v){
        //Directed garph
        graph.get(u).add(v);
        graphReverse.get(v).add(u);
    }

    public static void DFS(){
        boolean[] visited = new boolean[graph.size()];
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                DFS_UTIL(i,visited,s);
            }
        }
         for(int i=0;i<visited.length;i++){
             visited[i] = false;
         }
        while (!s.isEmpty()){
            int curr = s.pop();
             if(!visited[curr]){
                 DFS_UTIL_REVERSE(curr,visited);
                 System.out.println();
             }
        }

    }
    public static void DFS_UTIL(int curr, boolean[] visited, Stack<Integer> s){
        visited[curr] = true;
         for(int j=0;j<graph.get(curr).size();j++){
             if(!visited[graph.get(curr).get(j)]){
                 DFS_UTIL(graph.get(curr).get(j),visited,s);
             }
         }
         s.push(curr);
    }

    public static void DFS_UTIL_REVERSE(int curr, boolean[] visited){
        visited[curr] = true;
        for(int j=0;j<graphReverse.get(curr).size();j++){
            if(!visited[graphReverse.get(curr).get(j)]){
                DFS_UTIL_REVERSE(graphReverse.get(curr).get(j),visited);
            }
        }
        System.out.print(curr);
    }

    public static void main(String[] args){
        Strongly_Connected_Graph g = new Strongly_Connected_Graph(5);
        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 1);
        g.addEdge(0, 3);
        g.addEdge(3, 4);
        g.DFS();
//        System.out.println(graph);
    }
}
