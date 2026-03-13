class BiTree{
    
    Node Ntree[];
    Node head;
    
    
    
    class Node{
        int d;
        Node l,r;
        Node(int d){
            this.d=d;
            this.l=null;
            this.r=null;
        }
        
    }
    
    // convert array into binary tree as-is
    public Node ArrayToBiTree(int a[]){
        int n=a.length;
        Ntree= new Node[n];
        
        for(int i=0;i<n;i++){
            Node newN= new Node(a[i]);
            Ntree[i]= newN;
        }
        // linking with 2*i+1 Lc and 2*i+2
        for(int i=0;i<n;i++){
            int lci=i*2+1;
            int rci=i*2+2;
            if(lci<n)Ntree[i].l=Ntree[lci];
            if(rci<n)Ntree[i].r=Ntree[rci];
        }
        
        return Ntree[0];// return head to well linked tree for traversal
    }
    
    void printT(Node n){
        if(n==null) return;
        printT(n.l);
        printT(n.r);
        System.out.println(n.d);
    }
    
}


class ArraytoMaxHeapTree {

    int[] cbt;
    int size = -1;

    ArraytoMaxHeapTree(int a[]) {
        int n = a.length;
        this.cbt = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Before insertion CBT");
            System.out.print("[");
            for(int j=0;j<=size;j++){
               System.out.print(cbt[j]+",");
            }
            System.out.println("]");
            insertionToMaxHeap(a[i]);
            int m=i+1;
            System.out.println("After insertion CBT");
            System.out.print("[");
            for(int j=0;j<=size;j++){
               System.out.print(cbt[j]+",");
            }
            System.out.println("]");
            System.out.println("After Step "+m);
            BiTree t= new BiTree();
            t.printT(t.ArrayToBiTree(cbt));
        }
    }

    void insertionToMaxHeap(int val) {
        size++;
        cbt[size] = val;
        int i = size;

        while (i > 0) {
            int pN = (i - 1) / 2;
            if (cbt[pN] >= cbt[i]) {
                break;
            } else {
                int temp = cbt[i];
                cbt[i] = cbt[pN];
                cbt[pN] = temp;
                i = pN;
            }
        }
    }

int deletionMaxHeap() {
    int poppedElement = cbt[0];
    
    cbt[0] = cbt[size];
    cbt[size] = poppedElement; // ← PUT IT BACK at freed index, instead of discarding
    size--;                    // ← shrink heap boundary

    // heapify down (same as before)
    int i = 0;
    while (true) {
        int lci = i * 2 + 1;
        int rci = i * 2 + 2;
        if (lci > size) break;

        int idxofmaxBothChilds;
        if (rci > size) {
            idxofmaxBothChilds = lci;
        } else {
            idxofmaxBothChilds = (cbt[lci] > cbt[rci]) ? lci : rci;
        }

        if (cbt[i] >= cbt[idxofmaxBothChilds]) break;

        int temp = cbt[i];
        cbt[i] = cbt[idxofmaxBothChilds];
        cbt[idxofmaxBothChilds] = temp;
        i = idxofmaxBothChilds;
    }

    return poppedElement;
}

// Heap Sort — call deletion n times
void heapSort() {
    int n = size;
    // System.out.println("cbt ");
    for (int i = 0; i <= n; i++) {
        deletionMaxHeap();
    }
    // cbt[] is now sorted ascending!
}


}


class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int []a={1,2,3,4,5};
        System.out.print("[");
        for(int i=0;i<a.length;i++){
        System.out.print(a[i]+",");
        }
        System.out.println("]");
        ArraytoMaxHeapTree mh=new ArraytoMaxHeapTree(a);
    }
}
