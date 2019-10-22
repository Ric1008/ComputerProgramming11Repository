import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=0;
double grade=0;
double ograde=0;


        System.out.println("type the number of grades you wish to calculate with");
        number=Integer.parseInt(scan.next());
for(int i=0; i< number ;i++){
    System.out.println("put in a number grade");
    grade=Double.parseDouble(scan.next());
    ograde+=grade;

}
        System.out.println(ograde);
        System.out.println(ograde/number);

    }
}
