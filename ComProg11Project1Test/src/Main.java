public class Clah {
}


/* import java.util.*;



static int findSubstringCount(String str)
        {
        int result = 0;
        int n = str.length();
        int counter=0;


        for (int i = 0; i < n - 1; i++) {

        if (str.charAt(i) + 1 == str.charAt(i+1)) {
        result++;
        counter++;

        while (str.charAt(i) + 1 == str.charAt(i+1)) {
        i++;
        counter++;
        }
        }
        }


        return result;
        }


public static void main(String args[])
        {
        String str = "abcafadfadsabcdefghiiiuijyggg";

        System.out.println(findSubstringCount(str));
        System.out.println(str.charAt(2));
        String a="bone";
        a="pizza";
        System.out.println(a);

        }




        for (int a = 0; a < s.substring(a,a+big).length() - 1; a++){
        char[] chain=a;
        char[a] chain = s.charAt(a);
        }

public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s) {
        int answer = 0;
        //your code here
        for (int i = 0; i < s.length(); i++)
            if (s.substring(i, i + 1).equals("a") || s.substring(i, i + 1).equals("e") || s.substring(i, i + 1).equals("i") || s.substring(i, i + 1).equals("o") || s.substring(i, i + 1).equals("u")) {
                answer += 1;
            }
        return answer;
    }

    //Code you problem number two here
    static int problemTwo(String s) {
        int answer = 0;
        //your code here
        for (int i = 0; i < s.length() - 2; i++)
            if (s.substring(i, i + 3).equals("bob")) {
                answer += 1;
            }
        return answer;
    }

    //Code your solution to problem number 3 here
    static String problemThree(String s) {
        //your code here
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabetChars = alphabet.toCharArray();

        char[] sChars = s.toCharArray();

        int check;

        StringBuilder answer = new StringBuilder();

        String save = "";

        for (int i = 0; i < s.length(); i++) {

            check = answer.length();

            for (int j = 0; j < alphabet.length(); j++) {

                if (check == 0) {

                    answer.append(sChars[i]);
                    break;

                } else if (sChars[i] == alphabetChars[j] && alphabet.indexOf(sChars[i - 1]) <= alphabet.indexOf(sChars[i])) {

                    answer.append(alphabetChars[j]);
                    break;

                }

            }



                    if (check >= answer.length()) {

                        if (save.length() < answer.length()) {

                            save = answer.toString();

                        }

                        answer.delete(0, answer.length());
                        i--;

                    }

                }

                if (save.length() >= answer.length()) {

                    return save;

                } else {

                    return answer.toString();

                }

            }





    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */


        String s="uiegahhdjafeawhfehafhehfiaehfehafhhabcdefggghehaufheahghahdv";

        System.out.println(problemThree(s));
    }
}
public class Clah {
}


/* import java.util.*;



static int findSubstringCount(String str)
        {
        int result = 0;
        int n = str.length();
        int counter=0;


        for (int i = 0; i < n - 1; i++) {

        if (str.charAt(i) + 1 == str.charAt(i+1)) {
        result++;
        counter++;

        while (str.charAt(i) + 1 == str.charAt(i+1)) {
        i++;
        counter++;
        }
        }
        }


        return result;
        }


public static void main(String args[])
        {
        String str = "abcafadfadsabcdefghiiiuijyggg";

        System.out.println(findSubstringCount(str));
        System.out.println(str.charAt(2));
        String a="bone";
        a="pizza";
        System.out.println(a);

        }




        for (int a = 0; a < s.substring(a,a+big).length() - 1; a++){
        char[] chain=a;
        char[a] chain = s.charAt(a);
        }

