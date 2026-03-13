
 
class TreeNode{
    int d;
    TreeNode l,r;
    TreeNode (int d){
        this.d = d;
        this.l=this.r=null;
    }
    
        void preorder(TreeNode n){
            if (n==null) return;
            System.out.println(n.d);
            preorder(n.l);
            preorder(n.r);
        }
        
        void postorder(TreeNode n){
            if (n==null) return;// base condition
            
            postorder(n.l);
            postorder(n.r);
            System.out.println(n.d);
        }
        
        void inorder(TreeNode n){
            if (n==null) return;
            
            inorder(n.l);
            System.out.println(n.d);
            inorder(n.r);
        }
}


class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        TreeNode a = new TreeNode (5); // root
        TreeNode b = new TreeNode (10); 
        TreeNode c = new TreeNode (15); 
        TreeNode d = new TreeNode (20); 
        TreeNode e = new TreeNode (25); 
        TreeNode f = new TreeNode (30); 
        System.out.println(a.d);
        System.out.println(b.d);
        
        a.l=b;
        a.r=c;
        b.l=d;
        b.r=e;
        c.l=f;
        
        System.out.println(" inorder");
        a.inorder(a);
        
        System.out.println(" postorder");
        a.postorder(a);
        
        System.out.println(" pre order");
        a.preorder(a);
    }
          }
