import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=0;
int grade=0;



        System.out.println("type the number of grades you wish to calculate with");
        number=Integer.parseInt(scan.next());
for(int i=0; i< number ;i++){
    System.out.println("put in a number grade");
    grade=Integer.parseInt(scan.next());
}
        System.out.println(grade);

    }
}
