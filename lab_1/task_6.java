package lab_1;

public class task_6 {
    public static void main(String[] args) {
        int array[]=new int[5];
        array[0]=3;
        array[1]=6 ;
        array[2]=9;
        array[3]=12;
        array[4]=15;
        System.out.println("Array before inserting");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);}
        int delete=2;
        for(int i=delete;i>array.length-1;i++){
            array[i]=array[i+1];
        }
        array[array.length-1]=0;
        System.out.println("Array before inserting");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);}
    }
}

