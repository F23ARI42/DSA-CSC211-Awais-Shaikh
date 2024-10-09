package lab_6;

public class quene_array {
    static class quen {
        static int arr[];
        static int size;
        int front = -1;

        quen(int size) {
            arr = new int[size];
            this.size = size;
        }

        public boolean isempty() {
            return front == -1;
        }

        public void insert(int x) {
            if (front == size - 1) {
                System.out.println("quene is full");
                return;
            } else {
                front++;
                arr[front] = x;

            }
        }

        public int remove() {
            int front = arr[0];
            if (isempty()) {
                System.out.println("empty quene");
                return -1;
            } else {
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] == arr[i + 1]) ;
                    front--;
                }
            }
            return front;
        }
        public void display() {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        public static void main(String[] args) {
            quen quen = new quen(5);
            quen.insert(10);
            quen.insert(20);
            quen.insert(30);
            quen.insert(40);
            quen.display();
            ///System.out.println(quen.peak());
        }
    }
}

