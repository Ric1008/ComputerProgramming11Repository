public class DeMorganTesting {
    public static void main(String[] args) {
        //Question 1
        int x = 5;
        int y = 7;
        System.out.println(((x*4) < (y + 15)) && x < y);
        System.out.println((20 < (y + 15)) && x < y);


        //Question 2
        System.out.println("\n");
        x = 10;
        y = 20;
        int z = 30;
        System.out.println((( x == y) || (x < z)) && (x*2 + y)/5 > z);

        //Question 3
        System.out.println("\n");
        boolean a = true;
        boolean b = false;
        System.out.println((a || b) && ((a == b) || a));

        //Question 4
        System.out.println("\n");
        a = false;
        b = false;
        x = 5;
        y = 10;
        System.out.println((a == b) && (x * 4) == (y % 6) * 5);

        //Question 5
        System.out.println("\n");
        System.out.println((Math.abs(-2) == 2) || (Math.sqrt(Math.pow(9,2)) <= 9 && (-4 <= 4)));
    }
}
