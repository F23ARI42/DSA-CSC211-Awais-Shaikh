package lab_1;

public class task_9 {
    public static void main(String[] args) {
        System.out.println("array before reserve");
        int array[]={1,3,5,7,9};
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        int n=array.length;
        int reserve[]=new int[n];
        for(int i=0;i<n;i++){
            reserve[i]=array[n-1-i];

        }
        System.out.println("array after reserve");
        for(int num: reserve){
            System.out.println(num);
        }

    }
}
