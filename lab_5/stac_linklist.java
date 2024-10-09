package lab_5;

public class stac_linklist {
    Node head;
    int size;
    class Node  {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
    public void push(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        }
        else{
            newNode.next = head;
            head=newNode;
        }
        size++;
    }
    public void print() {
        if(head == null){
            System.out.println("Empty");
        }
        else{
            Node current = head;
            while(current != null){
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
    }
    public void pop(){
        if(head == null){
            System.out.println("Empty");
        }
        else{
            head = head.next;
        }
        size--;
    }
    public void delte(){
        if(head == null){
            System.out.println("Empty");
        }
        else{
            Node current = head;
            while(current.next.next != null){
                current = current.next;
            }
            current.next = null;
        }

    }
    public void count(){
        int count = 0;
        for(int i=0;i<size;i++) {
            count++;
        }
        System.out.println("total node" + count);
    }
    public static void main(String[] args) {
        stac_linklist main = new stac_linklist();
        main.push(10);
        main.push(20);
        main.push(30);
        main.push(40);
        main.print();
        main.delte();
        main.print();
        main.count();


    }
}
