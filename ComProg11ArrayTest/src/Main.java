import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] integers=new int[5];
        System.out.println(integers);
        integers[2]=10;
        System.out.println(Arrays.toString(integers));
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=i*2;
        }
        System.out.println(Arrays.toString(arr));


        int[] twenty=new int[20];
        for(int a=0; a<twenty.length; a++){
            int rNG =(int)(Math.random()*6)+1;
                twenty[a]=rNG;

        }
        System.out.println(Arrays.toString(twenty));
    }
}
