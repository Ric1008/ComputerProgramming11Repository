public class Main {
    static double pyth(double a, double b){
        return Math.sqrt(a*a+b*b);
    }

    public static void main(String[] args) {
        System.out.println(1+2+3);
        double a=3;
        double b=4;
        double c=pyth(a,b);
        System.out.println("hypotenuse: "+c);
    }
}
