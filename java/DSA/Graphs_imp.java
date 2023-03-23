import java.util.*;
import java.lang.*;

class Graphs_imp{
    int v;
    ArrayList<Integer> adj[];
    Graphs_imp(int noOfVertex){
        v=noOfVertex;
        adj=new ArrayList[noOfVertex];
        for(int i=0;i<noOfVertex;i++){
            adj[i]=new ArrayList<>(); 
        }
    }

    void edge(int x, int y){
        adj[x].add(y);
    }
    void bfs(int sourceVertex){
        boolean[] visited=new boolean[v];
        ArrayList<Integer> a1=new ArrayList<>();
        visited[sourceVertex]=true;
        a1.add(sourceVertex); 
        while(!a1.isEmpty()){
            sourceVertex=a1.remove(0);
            System.out.println(sourceVertex);
            Iterator It=adj[sourceVertex].iterator( );
            while(It.hasNext()){
                int n=(int) It.next();
                if(!visited[n]){
                    visited[n]=true;
                    a1.add(n);
                }
            }
        } 
    }

    public static void main(String[] args){

        Graphs_imp g=new Graphs_imp(6);
        g.edge(0, 1);
        g.edge(0, 2);
        g.edge(0, 5);
        g.edge(1, 0);
        g.edge(1, 2);
        g.edge(2, 0);
        g.edge(2, 1);
        g.edge(2, 3);
        g.edge(2, 4);
        g.edge(3, 2);
        g.edge(4, 2);
        g.edge(4, 5);
        g.edge(5, 0);
        g.edge(5, 4);
        g.bfs(0);

    }
}