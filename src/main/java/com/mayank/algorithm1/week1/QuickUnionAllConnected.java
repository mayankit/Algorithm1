package com.mayank.algorithm1.week1;

public class QuickUnionAllConnected {

    private int[] id;
    private int[] size;
    private boolean allConnected;

    public QuickUnionAllConnected(int N){

        id = new int[N];
        size = new int[N];
        for(int i=0;i < N; i++){
            id[i] = i;
            size[i] = 1;
        }
    }

    public boolean isConnected(int p, int q){

        return root(p) == root(q);
    }

    private int root(int p) {

        while(p != id[p]){
            id[p] = id[id[p]];//this is further improvement as a part of path compression algorithm
            p = id[p];
        }

        return p;
    }

    public void union(int p, int q,long timestamp){
        int i = root(p);
        int j = root(q);

        if(size[i] < size[j]){
            id[i] = j;
            size[j] = size[j] + size[i];
        }else{
            id[j] = i;
            size[i] = size[i] + size[j];
        }

        if(size[i] == size.length || size[j] == size.length){
            allConnected = true;
            System.out.println("All the nodes are now connected at time stamp "+timestamp);
        }
    }

    public static void main(String[] args) {
        QuickUnionAllConnected qu = new QuickUnionAllConnected(10);
        qu.union(4,3,1);
        qu.union(3,8,2);
        qu.union(6,5,3);
        qu.union(9,4,4);
        qu.union(2,1,5);
        qu.union(5,0,6);
        qu.union(7,2,7);
        qu.union(6,1,8);
        qu.union(7,3,9);
    }

}
