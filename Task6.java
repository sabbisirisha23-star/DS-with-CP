// implementation of stack LInked List

class stack {
    
    private class Node{
        int data;
        Node next;
        
        Node(int a){
            this.data=a;
            this.next=null;
        }
    }
    
    Node top =null;
    
    public void push(int a){
        Node newNode= new Node(a);
        
        newNode.next=top;
        top=newNode;
        
    }
    
    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty we cann't perform pop now");
            return -1;
        }
        
        int poppedVal=top.data;
        top=top.next;
        
        
        return poppedVal;
        
    }
    
     public boolean isEmpty(){
        return top==null;
    }
    
    public int peek(){
        if(isEmpty()){
            System.out.println("stack is empty there is no top element");
            return -1;
        }
        return top.data;
    }
    
    public void currstateStack(){
        if(isEmpty()){
            System.out.println("stack is empty ");
            return;
            
        }
        // System.out.println("top is at "+ top.data);
        System.out.print("[");
        for(Node i=top;i!=null;i=i.next){
            System.out.print(i.data+",");
        }
        System.out.println("]");
        
        return;
        
    }
    
    
 
}

class Main {
    public static void main(String[] args) {
        System.out.println("");
        
        stack s= new stack();
        s.currstateStack();
         System.out.println("top element is "+s.peek());
         System.out.println("is this stack empty  "+s.isEmpty());
        s.push(10);
        System.out.println("_____________After Appending 10_______________ ");
        s.currstateStack();
        System.out.println("top element is "+s.peek());
        System.out.println("is this stack empty : "+s.isEmpty());
        s.push(20);
        System.out.println("_________________After Appending 20____________________ ");
        s.currstateStack();
        System.out.println("top element is "+s.peek());
        System.out.println("is this stack empty : "+s.isEmpty());
        
        s.pop();
        System.out.println("__________________After pop oparation_______________________ ");
        s.currstateStack();
        System.out.println("top element is "+s.peek());
        System.out.println("is this stack empty : "+s.isEmpty());
    }
}
