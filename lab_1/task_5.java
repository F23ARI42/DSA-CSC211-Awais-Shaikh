package lab_1;

public class task_5 {
    public static void main(String[] args) {
        int array[]=new int[6];
        array[0]=3;
        array[1]=6 ;
        array[2]=9;
        array[3]=12;
        array[4]=15;
        System.out.println("Array before inserting");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);}
        int newelement=18;
        array[5]=newelement;
        System.out.println("Array after inserting ");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}

