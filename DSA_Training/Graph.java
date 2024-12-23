package DSA_Training;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    int nodes;
    static int [][] adjMatrix;
    public Graph(int nodes){
        this.nodes=nodes;
        adjMatrix=new int[nodes][nodes];
    }
    public void addEdge(int u ,int v){
        adjMatrix[u][v]=1;
        adjMatrix[v][u]=1;
    }
    public void Display(){
        for(int i=0;i<nodes;i++){
            for(int j=0;j<nodes;j++){
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    void BFS(int s)
    {
        boolean visited[] = new boolean[V];

        LinkedList<Integer> queue
            = new LinkedList<Integer>();
        visited[s] = true;
        queue.add(s);
 
        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");
 
            Object[] adj;
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    public static void main(String[] args) {
        Graph g= new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 0);
        g.Display();
    }
}