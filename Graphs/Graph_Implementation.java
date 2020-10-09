import javax.sound.midi.Soundbank;
import java.util.ArrayList;

class GraphBasic{
    public void addEdge(ArrayList<ArrayList<Integer>> al,int u,int v){
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
}
public class Graph_Implementation {
    public static void main(String[] args) {
        int graphLength = 5;
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        while (graphLength>0){
            al.add(new ArrayList<Integer>());
            graphLength--;
        }

        GraphBasic gb = new GraphBasic();

        gb.addEdge(al, 0, 1);
        gb.addEdge(al, 0, 4);
        gb.addEdge(al, 1, 2);
        gb.addEdge(al, 1, 3);
        gb.addEdge(al, 1, 4);
        gb.addEdge(al, 2, 3);
        gb.addEdge(al, 3, 4);
        gb.printGraph(al);
    }
}
