import java.util.ArrayList;
import java.util.Stack;
/*
* Topological Sort
* for every vertex u,v
* if writeen linearly
* u always comes before v
* */

class TSort_Graph{
    public void addEdge(ArrayList<ArrayList<Integer>> al,int u,int v){
        al.get(u).add(v);
    }
    public void TopologigiacalSort(ArrayList<ArrayList<Integer>> al ){
        boolean[] visited = new boolean[al.size()];
        Stack<Integer> stack = new Stack<>();
        for(int j=0;j<al.size();j++){
            if(!visited[j]){
                TS_Util(al,j,visited,stack);
            }
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }

    public void TS_Util(ArrayList<ArrayList<Integer>> al,int curr,boolean[] visited,Stack<Integer> s){
        visited[curr] = true;
        for (int i=0;i<al.get(curr).size();i++){
            int currVal = al.get(curr).get(i);
            if(!visited[currVal]){
                TS_Util(al,currVal,visited,s);
            }
        }
        s.push(curr);
    }
}
public class Topological_Sort {
    public static void main(String[] args) {
        int numOfVertices = 6;
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<numOfVertices;i++){
            al.add(new ArrayList<Integer>());
        }
    TSort_Graph g = new TSort_Graph();
        g.addEdge(al,5, 2);
        g.addEdge(al,5, 0);
        g.addEdge(al,4, 0);
        g.addEdge(al,4, 1);
        g.addEdge(al,2, 3);
        g.addEdge(al,3, 1);

        g.TopologigiacalSort(al);

    }
}
