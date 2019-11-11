import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String chose;

        String rechange="kjafjioaj;ofei fja   jfjafio;eaf;e'sdfhsv hci838r hvzoubpr qf8 yagvbv;z3r28tp9 4w4yq r30--rgres 4932t8ugnv8tuw";
        String rchange="guahguro3qh7 f3wu9a hr32 1re;b 'v58 t4 yt4tqa;p 6ttt43g 4  t3 yf    f3u y7f23qpuaafygeygewi32r ;iofdxw0-er48ty7ythw aia ";
        chose=scan.nextLine();

        String movey=chose.substring(chose.length()-1);
                String mover=chose.substring(chose.length()-1);
        String move=mover+movey+movey+mover;
        String change=rechange+move+rchange;
        System.out.println("\n");
        for(int i=0;i<chose.length();i++){
            if(chose.substring(i,i+1).equals("e")||chose.substring(i,i+1).equals("a")){
                System.out.println(change+=rechange);
            }

        }
        System.out.println(change);
        System.out.println("\n");
        System.out.println(chose);
    }
}
