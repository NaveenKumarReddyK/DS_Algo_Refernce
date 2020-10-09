class Unique_BST {
    public int numTrees(int n) {
        int[] tree = new int[n+1];
        tree[0] = tree[1] = 1;
        
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                tree[i] += tree[i-j]*tree[j-1];
            }
        }
        return tree[n];
    }
}
