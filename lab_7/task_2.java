package lab_7;
public class task_2 {
    public static void main(String[] args) {
        int arr[]={4,5,6,8,9,1,2};
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;

                }
            }
            if(!flag) {
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
