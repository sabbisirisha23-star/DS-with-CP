class singleLL {

    private class Node {
        int data;
        Node next;

        Node(int a) {
            this.data = a;
            this.next = null;
        }
    }

    Node head = null;

    // --- INSERTION OPERATIONS ---

    // Insert at the beginning (O(1))
    public void addFirst(int a) {
        Node newNode = new Node(a);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Insert at the end (O(n))
    public void addLast(int a) {
        Node newNode = new Node(a);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        
        // Traversal to find the last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert at a specific index (0-based)
    public void addAt(int index, int a) {
        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }
        
        if (index == 0) {
            addFirst(a);
            return;
        }

        Node newNode = new Node(a);
        Node temp = head;
        
        // Traverse to the node just BEFORE the target index
        for (int i = 0; i < index - 1; i++) {
            if (temp == null) {
                System.out.println("Index out of bounds");
                return;
            }
            temp = temp.next;
        }

        // Connect new node to the list
        if(temp != null){
            newNode.next = temp.next;
            temp.next = newNode;
        } else {
             System.out.println("Index out of bounds");
        }
    }

    // --- DELETION OPERATIONS ---

    // Remove from the beginning (O(1))
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List is empty, cannot remove first");
            return;
        }
        head = head.next;
    }

    // Remove from the end (O(n))
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List is empty, cannot remove last");
            return;
        }

        if (head.next == null) { // Only one element
            head = null;
            return;
        }

        // Traverse to second to last node
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // Remove at specific index
    public void removeAt(int index) {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        
        if (index == 0) {
            removeFirst();
            return;
        }

        Node temp = head;
        // Traverse to the node just BEFORE the one we want to delete
        for (int i = 0; i < index - 1; i++) {
            if (temp == null || temp.next == null) {
                System.out.println("Index out of bounds");
                return;
            }
            temp = temp.next;
        }

        // If the node to be deleted exists
        if (temp.next != null) {
            temp.next = temp.next.next;
        } else {
            System.out.println("Index out of bounds");
        }
    }

    // --- TRAVERSAL / UTILS ---

    public boolean isEmpty() {
        return head == null;
    }

    // This method serves as our Traversal logic
    public void currstateLL() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("[");
        // Traversal logic: visiting every node
        for (Node i = head; i != null; i = i.next) {
            System.out.print(i.data + ",");
        }
        System.out.println("]");
    }
}

class Main {
    public static void main(String[] args) {
        singleLL list = new singleLL();
        
        System.out.println("--- Insertion Tests ---");
        
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println("Initial List (AddLast 10, 20, 30):");
        list.currstateLL();

        System.out.println("___AddFirst 5___");
        list.addFirst(5);
        list.currstateLL(); // Expected: [5, 10, 20, 30]

        System.out.println("___AddAt index 2 value 15___");
        list.addAt(2, 15);
        list.currstateLL(); // Expected: [5, 10, 15, 20, 30]
        
        System.out.println("___AddAt index 0 (Edge Case)___");
        list.addAt(0, 1);
        list.currstateLL(); 

        System.out.println("\n--- Deletion Tests ---");

        System.out.println("___RemoveFirst___");
        list.removeFirst();
        list.currstateLL(); 

        System.out.println("___RemoveLast___");
        list.removeLast();
        list.currstateLL(); 
        
        System.out.println("___RemoveAt index 2___");
        list.removeAt(2);
        list.currstateLL();
        
        System.out.println("___RemoveAt index 10 (Invalid)___");
        list.removeAt(10);
        list.currstateLL();
    }
}
