import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("First type a number you want to double. Press enter then type how many times you wish to " +
                "double that number. Press enter again.");

        int n=Integer.parseInt(scan.next());
        int p=Integer.parseInt(scan.next());
        System.out.println(n*Math.pow(2,p));

    }
}
