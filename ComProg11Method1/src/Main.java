public class Main {
    static double pyth(double a, double b){
        return squareRoot(a*a + b*b);
    }
    static double squareRoot(double num){
        //guess and check algorithm
        //square root of num is equal ans when ans*ans = num
        double epsilon=.01;
        double ans=0;
        double increment=.001;
        int count=0;
        while(Math.abs(ans*ans-num)>epsilon){
            System.out.println(ans);
            ans+=increment;
        }
        if (Math.abs(ans*ans-num)<epsilon){
            System.out.println("Found square at count: "+count+" It is: "+ans);
            return ans;
        }
        else {
            System.out.println("Failed to find square root");
            return ans;
        }
    }

    public static void main(String[] args) {
        double a=3;
        double b=4;
        double c=pyth(a,b);
        System.out.println("Hypotenuse: "+ c);
        System.out.println(1+2+3);
        System.out.println(squareRoot(25));
    }
}
