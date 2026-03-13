class BiTree{
    
    Node AT[];
    Node head;
    
    class Node{
        int d;
        Node l,r;
        // constructor 
        Node(int d){
            this.d=d;
            this.l=this.r=null;
        }
        
    }
    
    Node ArrayTOBiTree(int a[]){
        int n= a.length;
        AT=new Node[n];
        // convert all array element into nodes
        for(int i=0;i<n;i++){
            Node nn=new Node(a[i]);
            AT[i]=nn;
        }
        
        // linking
        for(int i=0;i<n;i++){
            int lci=2*i+1;
            int rci = 2*i+2;
            if(lci<n) AT[i].l=AT[lci];
            if(rci<n) AT[i].r=AT[rci];
        }
        
        return AT[0];
        }
        
        void inorder(Node n){
            if(n==null)return;// base condition
            inorder(n.l);
            System.out.println(n.d);
            inorder(n.r);
            
        }
        
    }



class Main {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        BiTree t=new BiTree();
        
        int a[]={7,2,9,4,6,2};
        t.inorder(t.ArrayTOBiTree(a));
        
    }
}
