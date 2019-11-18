import java.util.Arrays;
public class Two {
//deletes value
    static int zer(int[] zeroy) {
        for (int d = 0; d < zeroy.length; d++) {
            if (zeroy[d] == 6) {
                zeroy[d] = 0;
                return zeroy[d];
            }

        }
        return 0;
    }
    //inserts value
        static int on (int[] oney){
            for (int e = 0; e < oney.length; e++) {
                if (oney[e] == 2) {
                    oney[e] = 8;
                    return oney[e];
                }
            }
            return 0;
        }

    public static void main(String[] args) {
//deletion array
                int[] zeroy=new int[6];
                //insertion array
                int[] oney=new int[6];
                for(int a=0; a<zeroy.length; a++){
                    zeroy[a]=a+1;
                }
                for(int b=0; b<oney.length; b++){
                    if(oney[b]==2){
                        System.out.println("a");
                    }else{
                        oney[b]=b+1;}
                }
        System.out.println(Arrays.toString(zeroy));
        System.out.println(Arrays.toString(oney));
                int ho= zer(zeroy);
                int lo= on(oney);
                System.out.println(Arrays.toString(zeroy));
                System.out.println(Arrays.toString(oney));



    }
}
