package lab_5;

public class stack_array { private int arr[];
    private int top;

    public stack_array(int size) {
        arr = new int[size];
    }

    public void puch(int x) {
        if (top >=arr.length-1) {
            System.out.println("stack is overfellow");
        } else {
            top++;
            arr[top]=x;
        }
    }

    public void peak() {
        if (top<=0) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(arr[top]);
        }
    }
    public void pop() {
        if (top>arr.length) {
            System.out.println("Stack Underflow");
        }
        else {
            top--;
        }
    }
    public void full(){
        if(top==arr.length){
            System.out.println("stack is full");
        }
        else{
            System.out.println(arr[top]);
        }

    }
    public int size(){
        return top;
    }
    public static void main(String[] args) {
        stack_array stack = new stack_array(5);
        stack.puch(12);
        stack.puch(34);
        stack.puch(24);
        stack.puch(50);
        stack.puch(23);
        stack.peak();
        stack.pop();
        stack.peak();
        stack.size();
    }
}
