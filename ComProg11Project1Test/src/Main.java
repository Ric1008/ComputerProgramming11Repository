
// Java to find the number of substrings
// in alphabetical order
import java.util.*;
public class Main
{

    // Function to find number of substrings
    static int findSubstringCount(String str)
    {
        int result = 0;
        int n = str.length();
        int counter=0;

        // Iterate over string length
        for (int i = 0; i < n - 1; i++) {
            // if any two chars are in alphabetic order
            if (str.charAt(i) + 1 == str.charAt(i+1)) {
                result++;
                counter++;
                // find next char not in order
                while (str.charAt(i) + 1 == str.charAt(i+1)) {
                    i++;
                    counter++;
                }
            }
        }

        // return the result
        return result;
    }

    // Driver function
    public static void main(String args[])
    {
        String str = "abcafadfadsabcdefghiiiuijyggg";

        System.out.println(findSubstringCount(str));
        System.out.println(str.charAt(2));
        String a="bone";
        a="pizza";
        System.out.println(a);

    }

}
//contributed by Arnab Kundu

for (int a = 0; a < s.substring(a,a+big).length() - 1; a++){
        char[] chain=a;
        char[a] chain = s.charAt(a);
        }
