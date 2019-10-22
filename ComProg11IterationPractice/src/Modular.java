import java.util.Scanner;

public class Modular {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double frange=0;
        double lrange=0;
        int numfactor=0;
        double range=0;
        double seven=0;
        double total=0;
        int time=0;
        double morerange=0;
        double eight=0;
        System.out.println("input the first number of the range(the smaller one) you want then input the second number you want for the range (the larger one)");
        frange=Double.parseDouble(scan.next());
        lrange=Double.parseDouble(scan.next());
        for (double i=frange; i<lrange+1; i++){

            seven=i%7;
            eight=i/7;
            morerange=frange++;
            if(seven==0){time+=1;}
            if(seven==0){total=(eight*7);}
            /*for(int f=0; f<time;f++){
                System.out.println(total/time);*/
            if(seven==0){System.out.println(total);}





        }
        System.out.println("number of factors "+time);





    }
}
