import java.util.Arrays;

    

    public class zer {private int zer(int[] zeroy){
        for(int d=0; d<zeroy.length; d++){
            if(zeroy[d]==5){
                zeroy[d]=0;
            }
        }
        public int on (int[] oney){
            for(int e=0; e<oney.length; e++){
                if(oney[e]==2){
                    oney[e]=100;
                }
            }
            public static void Main(String[] args) {
                int[] zeroy=new int[5];
                int[] oney=new int[5];
                for(int a=0; a<zeroy.length; a++){
                    zeroy[a]=a++;
                }
                for(int b=0; b<oney.length; b++){
                    if(oney[b]==2){
                        oney[b]=0;
                    }else{
                        oney[b]=b++;}
                }
                int ho= zer(zeroy);
                int lo= on(oney);
                System.out.println(Arrays.toString(zeroy));
                System.out.println(Arrays.toString(oney));

            }
        }


