package lab_1;

public class task_3 {
    public static void main(String[] args) {
        int array[]=new int[6];
        array[0]=12;
        array[1]=24 ;
        array[2]=36;
        array[3]=48;
        array[4]=60;
        System.out.println("Array before inserting");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);}
        int newelement=6;
        for(int i=array.length-1;i>0;i--){
            array[i]=array[i-1];
        }
        array[0]=newelement;
        System.out.println("Array after inserting ");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
