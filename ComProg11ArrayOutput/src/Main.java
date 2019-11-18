import java.util.Arrays;

public class Main {
//create a function that adds a value
     static int inte(int[] integer){
         for(int z=0; z<integer.length;z++){

         if(integer[z]==0){
             integer[z]=9;
             return integer[z];
         }


         }
         return 0;
        }

//array missing value
    public static void main(String[] args) {
        int[] integer=new int[6];
        int zero=0;
        int one=1;
                int two=2;
                        int three=3;
                                int four=4;
                                        int five=5;
                                                int six=6;

        for(int i=0; i<5; i++){
            if(integer[i]!=5){integer[i]=i+1;
            }
            else{
                integer[5]=0;
            }
        }


        //before
        System.out.println(Arrays.toString(integer));
        int hum= inte(integer);

//after added value
        System.out.println(Arrays.toString(integer));

    }
}
