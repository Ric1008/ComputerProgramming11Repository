import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
int age;
        do{
            System.out.println("enter your age");
age=Integer.parseInt(scan.next());
        }
        while(age<10||age>50);
    }
}
