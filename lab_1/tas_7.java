package lab_1;

public class tas_7 {
    public static void main(String[] args) {
        int array[]=new int[5];
        array[0]=3;
        array[1]=6 ;
        array[2]=9;
        array[3]=12;
        array[4]=65;
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);}
        if(array[4]==65){
            System.out.println("65 is found");
        }
        else{
            System.out.println("65 is  not found");
        }


    }
}
