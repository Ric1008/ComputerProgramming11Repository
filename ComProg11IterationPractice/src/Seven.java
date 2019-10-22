import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        int s=0;

        Scanner scan=new Scanner(System.in);


        do{
            System.out.println("enter the correct number");
            s=Integer.parseInt(scan.next());
        }
        while(s!=7);
        {
            System.out.println("yeah");
        }
    }
}
