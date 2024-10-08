package lab_1;

public class task_4 {
    public static void main(String[] args) {
        int array[] = new int[6];
        array[0] = 100;
        array[1] = 200;
        array[2] = 300;
        array[3] = 400;
        array[4] = 500;
        System.out.println("Array before inserting");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int newelement = 250;
        int postion = 2;
        for (int i = array.length - 1; i > postion; i--) {
            array[i] = array[i - 1];

        }
        array[2] = newelement;
        System.out.println("Array after inserting ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
