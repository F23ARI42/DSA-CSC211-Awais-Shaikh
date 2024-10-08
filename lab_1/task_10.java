package lab_1;

public class task_10 {
    public static void main(String[] args) {
        String str="level";
        char array[]=str.toCharArray();
        int length=array.length;
        boolean palindrone=false;
        for(int i=0;i<length;i++){
            if(array[i]==array[length-1-i]){
                palindrone=true;
                break;
            }
        }
        System.out.println(palindrone);
    }
    }

