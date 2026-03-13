import java.util.LinkedList;


class Graph{

   int V; // vertices
   
   LinkedList<Integer> adj[]; // networks for each vertices
   
   Graph(int v){
   this.V=v;
   
   adj = new LinkedList[V];
   
   for(int i=0;i<V;i++){
       adj[i] = new LinkedList<>();
   }
   
   }
   
   void addEdge(int v,int w){
   
   adj[v].add(w);
   }
   
   
   void printGraph(){
       for(int i=0; i<V;i++){
           System.out.print(i+ "->");
           for(int j=0; j<adj[i].size();j++){
               System.out.print(adj[i].get(j)+" ");
           }
           System.out.println();
       }
   }
   
   


}

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

      Graph g = new Graph(5);
          System.out.println(g);


            g.addEdge(0,1);
            g.addEdge(0,2);
            g.addEdge(0,3);
            g.addEdge(1,2);
            g.addEdge(2,4);
            g.addEdge(3,4);


            g.printGraph();
            
          }
}
