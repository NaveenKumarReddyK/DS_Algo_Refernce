public class Trios_In_Graph {
   public static int trios(int[][] graph,int len){
        //make graph
        List<List<Integer>> arr = new ArrayList<>();
        for(int i=0;i<=len;i++){
            arr.add(i,new ArrayList<>());
        }
        for(int i=0;i<graph.length;i++){
            int u = graph[i][0];
            int v = graph[i][1];
            arr.get(u).add(v);
            arr.get(v).add(u);
        }
        int count = 0;
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.size();j++){
                for(int k=0;k<arr.size();k++){
                    if(arr.get(i).contains(j) && arr.get(j).contains(k) && arr.get(k).contains(i)){
                        count++;
                    }
                }
            }
        }
        count/=6;
        return count;
    }
    public static void main(String[] args) {
        int[][] graph = {{0,1}, {3,0}, {0,2}, {3,2}, {1,2}, {4,0}, {3,4}, {3,5}, {4,5}, {1,5}, {1,3}};
        int len = 5;
        System.out.println(trios(graph,len));
    }
}
