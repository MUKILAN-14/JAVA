package DSA_Training;
import java.util.*;
public class Graph1 {
    int nodes; 
    static int count=0;
    static int []compId;
    LinkedList<Integer> [] adj;
    public Graph1(int nodes){
        this.nodes=nodes;
        this.adj=new LinkedList[nodes];
        for(int i=0;i<nodes;i++){
            this.adj[i]=new LinkedList<>();
        }
    }
    public void AddEdge(int u,int v){
        this.adj[u].add(v);
        this.adj[v].add(u);  
    }
    public void display(){
        for(int i=0;i<nodes;i++){
            System.out.println(i+" --> "+adj[i]+" ");
        }
    }
    public void dfs(int s){
       boolean[]visited=new boolean[nodes];
       Stack<Integer>stack=new Stack<>();
       stack.push(s);
       while(!stack.isEmpty()){
        int u=stack.pop();
        if(!visited[u]){
            visited[u]=true;
            System.out.print(u+" ");
        }
        for(int v:adj[u]){
            if(!visited[v]){
                stack.push(v);
            }
        }
       } 
    }
    public void DFS(){
        boolean[]visited=new boolean[nodes+1];
        compId=new int[nodes+1];
        for(int v=0;v<nodes;v++){
            if(!visited[nodes]){
                DFS(v,visited,compId,count);
                count++;
            }
        }
    }
    void DFS(int v,boolean[]visited,int[]compId,int count){
        visited[v]=true;
        compId[v]=count;
        for(int w:adj[v]){
            if(!visited[v]){
                DFS(w, visited, compId, count);
            }
        }
    }
    public int getCount(int x){
        return count;
    }
    public boolean isConnected(int x,int y){
        if(compId[x]==compId[y]){
            return true;
        }
        return false ;
    }
    public static void main(String[] args) {
        Graph1 g=new Graph1(5);
        g.AddEdge(0, 1);
        g.AddEdge(1, 2);
        g.AddEdge(2, 3);
        g.AddEdge(2, 4);
        g.AddEdge(3, 0);
        g.display();
        System.out.println("  ");
        g.dfs(0);
        g.DFS();
        System.out.println("  ");
        System.out.println(g.getCount(1));
        System.out.println(g.isConnected(2,4));
        
    }
}
