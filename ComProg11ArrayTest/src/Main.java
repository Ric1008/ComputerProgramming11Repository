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
        System.out.println("\n");

        //practice problems start here

//1
        int[] twenty=new int[20];
        int count=0;
        for(int a=0; a<twenty.length; a++){
            int rNG =(int)(Math.random()*6)+1;
                twenty[a]=rNG;
                if(twenty[a]==1){
                    count++;
            }

        }
        System.out.println(Arrays.toString(twenty));
        System.out.println("Number of ones: "+count);
        System.out.println("\n");
//2
        int[] ten=new int[10];
        double avg=0;
        int keep=0;
        for(int b=0; b<ten.length; b++){
            int rNGesus = (int)(Math.random()*100)+1;
            ten[b]=rNGesus;
            avg+=ten[b];
        }
        System.out.println(Arrays.toString(ten));
        System.out.println("Average: "+avg/ten.length);
        System.out.println("\n");
//3
        keep+=ten[1];
        ten[1]=ten[2];
        ten[2]=keep;

        System.out.println(Arrays.toString(ten));
        System.out.println("\n");
//4
        int oneish=0;
        int twoish=0;
        int threeish=0;
        int fourish=0;
        int fiveish=0;
        int sixish=0;
        int sevenish=0;
        int eightish=0;
        int nineish=0;
        int tenish=0;
         oneish=ten[0];
         twoish=ten[1];
        threeish=ten[2];
                fourish=ten[3];
                fiveish=ten[4];
                        sixish=ten[5];
                        sevenish=ten[6];
                                eightish=ten[7];
                                nineish=ten[8];
                                        tenish=ten[9];

        ten[0]=tenish;
        ten[1]=nineish;
        ten[2]=eightish;
        ten[3]=sevenish;
        ten[4]=sixish;
        ten[5]=fiveish;
        ten[6]=fourish;
        ten[7]=threeish;
        ten[8]=twoish;
        ten[9]=oneish;

        System.out.println(Arrays.toString(ten));

//end of practice problems
        System.out.println("\n");

        int[] tenTwo=new int[10];
int hold=0;
        for(int b=0; b<tenTwo.length; b++){
            int rNGesusTwo = (int)(Math.random()*100)+1;
            if(tenTwo[b]==0){
                tenTwo[b]=rNGesusTwo;

            }
            else if(tenTwo[b]==1){
                hold+=tenTwo[b];
                tenTwo[b]=tenTwo[0];
                tenTwo[0]=hold;
            }
            else{
                tenTwo[b]=rNGesusTwo;
            }

        }



        System.out.println(Arrays.toString(tenTwo));

    }
}
