package lab_1;

import java.util.Arrays;

public class task_11 {
    public static void main(String[] args) {
    String str1="listen";
    String str2="silent";
    char[] array1=str1.toCharArray();
    char[] array2=str2.toCharArray();
         Arrays.sort(array1);
         Arrays.sort(array2);
         if(array1.length==array2.length){
        System.out.println("Anagram");
    }
         else{
        System.out.println("not Anagram");
    }
}
}

