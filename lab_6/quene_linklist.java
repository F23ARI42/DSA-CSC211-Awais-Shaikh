package lab_6;

public class quene_linklist {
        class Node {
            int data;
            Node next;

            Node(int r) {
                data = r;
                next = null;
            }
        }

        private Node rear;
        private Node front;

        public void enquene(int data) {
            Node newNode = new Node(data);
            if (front == null) {
//                System.out.println("quene is empty");
                front = rear = newNode;
            } else {
                newNode.next = rear;
                rear = newNode;

            }
        }

        public void print() {
            if (front == null) {
                System.out.println("null");
            } else {
                Node temp = front;
                while (temp != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }

            }
        }

        public void dequene() {
            if (front == null) {
                System.out.println("null");
            } else {
                Node temp = front;
//                while(temp.next!=null){
                temp = temp.next;
            }
        }
    public static void main(String[] args) {
        quene_linklist quene=new quene_linklist();
        quene.enquene(10);
        quene.enquene(23);
        quene.enquene(30);
        quene.enquene(21);
        quene.print();

    }
}
