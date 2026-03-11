class Node
{
    int data;
    Node next;
    Node(int a)
    {
        data=a;
        next=null;
    }
    
    // 
    public void getData(){
        
        System.out.println(data);
        
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println("kavya");
        
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        Node f=new Node(60);
        
        a.data=100;// updation
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=a;
        
        
        System.out.println(a.data);
        System.out.println(a.next);
        
        System.out.println(b.data);
        System.out.println(b.next);
        
        System.out.println(c.data);
        System.out.println(c.next);
        
        System.out.println(d.data);
        System.out.println(d.next);
        
        System.out.println(e.data);
        System.out.println(e.next);
        System.out.println(f.data);
        System.out.println(f.next);
        
        
        a.getData();
        b.getData();
         c.getData();
          d.getData();
           e.getData();
           f.getData();
    }
}
