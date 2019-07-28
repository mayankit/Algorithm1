package com.mayank.algorithm1.week1;

public class QuickUnion {

    private int[] id;

    public QuickUnion(int N){

        id = new int[N];

        for(int i=0;i < N; i++){
            id[i] = i;
        }
    }

    public boolean isConnected(int p, int q){

        return root(p) == root(q);
    }

    private int root(int p) {

        while(p != id[p]){
            p = id[p];
        }

        return p;
    }

    public void union(int p, int q){
        int i = root(p);
        int j = root(q);
        id[i] = j;

    }

    public static void main(String[] args) {
        QuickUnion qu = new QuickUnion(10);
        qu.union(4,3);
        qu.union(3,8);
        qu.union(6,5);
        qu.union(9,4);
        qu.union(2,1);
        qu.union(5,0);
        qu.union(7,2);
        qu.union(6,1);
        qu.union(7,3);
        System.out.println(qu.isConnected(4,8));
    }

}
