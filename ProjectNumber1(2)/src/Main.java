public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){
        int answer = 0;
        //your code here
        for(int i=0; i<s.length(); i++)
            if(s.substring(i,i+1).equals("a")||s.substring(i,i+1).equals("e")||s.substring(i,i+1).equals("i")||s.substring(i,i+1).equals("o")||s.substring(i,i+1).equals("u")){
                answer+=1;
            }
        return answer;
    }
    //Code you problem number two here
    static int problemTwo(String s){
        int answer = 0;
        //your code here
        for(int i=0; i<s.length()-2; i++)
            if(s.substring(i,i+3).equals("bob")){
                answer+=1;
            }
        return answer;
    }
    //Code your solution to problem number 3 here
    static String problemThree(String s){
        //your code here
        String alph = "abcdefghijklmnopqrstuvwxyz";
        char[] alphChars = alph.toCharArray();
        char[] sChars = s.toCharArray();

        int see;
        StringBuilder find = new StringBuilder();
        String save = "";
        for (int i = 0; i < s.length(); i++) {

            see = find.length();
            for (int a = 0; a < alph.length(); a++) {
                if (see == 0) {
                    find.append(sChars[i]);
                    break;
                } else if (sChars[i] == alphChars[a] && alph.indexOf(sChars[i - 1]) <= alph.indexOf(sChars[i])) {
                    find.append(alphChars[a]);
                    break;
                } }

            if (see >= find.length()) {
                if (save.length() < find.length()) {
                    save = find.toString(); }

                find.delete(0, find.length());
                i--;
            } }
        if (save.length() >= find.length()) {
            return save;
        } else {
            return find.toString();

        } }
    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */

        String s="uiegahhdjafeawhfehafhehfiaehfehafhhabcdefggghehaufheahghahdv";

        System.out.println();
        System.out.println('c'<'d');
        System.out.println('c'+'d');
        System.out.println('d');
        System.out.println('a'+'b');
        System.out.println('a'+'a');
        System.out.println('a'+'q');
        System.out.println('a'+'a'+'a');
        System.out.println('a');
        System.out.println('a'+'a');
        System.out.println('a'+'a'+'a');
        System.out.println('a'+'a'+'a'+'a');
        System.out.println('a'+'a'+'a'+'a'+'a');
        System.out.println('a'<'b');
        System.out.println(problemThree(s));
    }
}
