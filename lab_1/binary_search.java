package lab_1;

import java.util.Arrays;

public class binary_search {
    public static void main(String[] args) {
        int array[]={10,20,8,40};
        int target=30;
        Arrays.sort(array);
        int left=0;
        int rigth=array.length;
        int middle;
        boolean found=false;
        while(left<=array.length){
            middle=left+(array.length-left)/2;
            System.out.println("element"+target+"found at index"+middle);

            if(array[middle]==target){
                found=true;

            }
            if(array[middle]<target){
                left=middle+1;
            }
            else{
                rigth=middle-1;
            }

        }
        if(found==false){
            System.out.println("element"+target+"not found at index");
        }



    }
}
