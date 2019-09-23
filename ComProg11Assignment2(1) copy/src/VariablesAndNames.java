public class VariablesAndNames {
    public static void main( String[] args )
    {
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

        cars = 100;
        space_in_a_car = 4.0;
        drivers = 30;
        passengers = 90;
        cars_not_driven = cars - drivers;
        cars_driven = drivers;
        carpool_capacity = cars_driven * space_in_a_car;
        average_passengers_per_car = passengers / cars_driven;
        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car.\n");

        int Roomnumber;
        Roomnumber = 113;
        double e=2.71828;
        String Subject="Computer Science";
        System.out.println("This is room # " + Roomnumber);
        System.out.println("e is close to " + e);
        System.out.println("I am learning a bit about "+ Subject);
        System.out.println("\n");

        String OneOne="Math: Pre-Calculus 11";
        String OneOneTeacher="Ms. Ungurean";
        String OneTwo="Theatre: Drama 11";
        String OneTwoTeacher="Ms. Babcock";
        String OneThree="Science: Physics 11";
        String OneThreeTeacher="Mr. Jung";
        String OneFour="Social Studies: Law Studies 12";
        String OneFourTeacher="Lee";
        String TwoOne="English: Composition 11";
        String TwoOneTeacher="Mr. Ross";
        String TwoTwo="Information Technology: Computer Programming 11";
        String TwoTwoTeacher="Mr. Zaremba";
        String TwoThree="Science: Chemistry 11";
        String TwoThreeTeacher="Mr. Zitka";
        String TwoFour="Language: Mandarin Chinese 11";
        String TwoFourTeacher="Ms. Zhang";

        System.out.println("+-----------------------------------------------------------------------+");
        System.out.println("| 1 |                           "+OneOne+" |    "+OneOneTeacher+" |");
        System.out.println("| 2 |                               "+OneTwo+" |     "+OneTwoTeacher+" |");
        System.out.println("| 3 |                             "+OneThree+" |        "+OneThreeTeacher+" |");
        System.out.println("| 4 |                  "+OneFour+" |             "+OneFourTeacher+" |");
        System.out.println("| 5 |                         "+TwoOne+" |        "+TwoOneTeacher+" |");
        System.out.println("| 6 | "+TwoTwo+" |     "+TwoTwoTeacher+" |");
        System.out.println("| 7 |                           "+TwoThree+" |       "+TwoThreeTeacher+" |");
        System.out.println("| 8 |                   "+TwoFour+" |       "+TwoFourTeacher+" |");
        System.out.println("+-----------------------------------------------------------------------+");

    }

}
