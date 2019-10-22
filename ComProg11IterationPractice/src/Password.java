import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String pass;
        String npass;

do{
    System.out.println("enter your password");
    pass=scan.next();
    System.out.println("reenter your password");
    npass=scan.next();
}
while(!pass.equals(npass));
        System.out.println("correct");
    }

}
