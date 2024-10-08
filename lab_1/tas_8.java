package lab_1;

public class tas_8 {
    public static void main(String[] args) {

        int array[]={10,20,8,40};
        int target=30;
        boolean found=false;
        for(int i=0;i<array.length-1;i++){
            if(array[i]==target){
                System.out.println("element of "+target+"index of"+i);
                found=true;
            }
        }

        if(found==false){
            System.out.println("element of "+target+"not fount im the array");


        }
    }
}

