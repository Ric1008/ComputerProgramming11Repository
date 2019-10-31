import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Note the below are comments from the original RPS.
        /*
        In Rock Paper Scissors there are only three options. Rock, Paper, or Scissors. As of now I do not know how to
        make a program randomly spit out options. I do not even know if it's possible. However it doesn't matter, the
        computer really only needs numbers. So assign an integer that gives me a random number between one and three.
        3 integers 1-3 representing rock, paper, and scissors. An integer for what the player chooses, and a bunch of
        strings for some words I have to repeat a lot. Theoretically I think I can make it so that the player inputs the
        word Rock, Paper, or Scissors and gets an answer, however that is more complicated and time consuming as well as
        forcing the player to type out a whole word. Faster on both ends to just use numbers. Use print to place some
        starting text and instructions, then use if/else statements to do the rest. Have the statements evaluate what
        numbers were chosen. If a certain combination is evaluated as true, display a certain line of text. If none of
        the combinations match the combination that happened, the player must have inputed a number that was not 1-3.
        We know this because the computer only spits out 1-3 and we have an answer for every combination of 1-3 and 1-3.
        So we display a different message.
         */
        //End of old comments.
        /*
        It is possible to have the player enter a String and make it all work. I made a couple more Strings that represent
        some words. Then I found a way to compare Strings. After that it works much the same. Also edited the instructions
        a little to make more sense.
         */
        Scanner scan= new Scanner(System.in);
        int oneToThree =(int)(Math.random()*3)+1;
        int rock=1;
        int paper=2;
        int scissors=3;
        String chose;
        String rocky="Rock";
        String papery="Paper";
        String scissorsy="Scissors";

        String win=("You won! :) Good job! Rerun program to play agian.");
        String tie=("You tied, good game. Rerun program to play again.");
        String lose=("RPS Bot won, good game. Rerun program to play again.");
        String y="y";
        String Y="Y";
        String Yes="Yes";
        String yes="yes";
        String X="X";
        String x="x";
        String N="N";
        String n="n";
        String No="No";
        String no="no";
        String go;
        int scr=0;
        int comscr=0;


do{
    System.out.println("Would you like to play Rock Paper Scissors? ");
    go=scan.next();
    System.out.println("Your Score: "+scr+" Com Score: "+comscr);
        System.out.println("Let's play Rock Paper Scissors against RPS Bot! (Robotic Player Systems)\n" +
                "Click right under this mesasage, then type Rock for Rock, Paper for Paper, or Scissors for Scissors and press enter! \n" +
                "The game will ONLY accept the above words in upercase! NOTHING ELSE! \nIf you " +
                "need to rerun the program press the green arrow.");
        chose=scan.next();

        if(oneToThree==rock&&chose.equals(rocky)) {
            System.out.println("You both chose Rock. "+tie);
        }
        else if(oneToThree==rock&&chose.equals(scissorsy)){
            System.out.println("RPS Bot chose Rock and you chose Scissors. "+lose);
            comscr++;
        }
        else if(oneToThree==rock&&chose.equals(papery)){
            System.out.println("RPS Bot chose Rock and you chose Paper. "+win);
            scr++;
        }
        else if(oneToThree==paper&&chose.equals(rocky)){
            System.out.println("RPS Bot chose Paper and you chose Rock. "+lose);
            comscr++;
        }
        else if(oneToThree==paper&&chose.equals(papery)){
            System.out.println("You both chose Paper. "+tie);

        }
        else if(oneToThree==paper&&chose.equals(scissorsy)){
            System.out.println("RPS Bot chose Paper and you chose Scissors. "+win);
            scr++;
        }
        else if(oneToThree==scissors&&chose.equals(rocky)){
            System.out.println("RPS Bot chose Scissors and you chose Rock. "+win);
            scr++;
        }
        else if(oneToThree==scissors&&chose.equals(papery)){
            System.out.println("RPS Bot chose Scissors and you chose Paper. "+lose);
            comscr++;
        }
        else if(oneToThree==scissors&&chose.equals(scissorsy)){
            System.out.println("You both chose Scissors. "+tie);
        }
        else{
            System.out.println("I don't know what you entered into the game and I can't understand it" +
                    ", \nbut it wasn't a valid choice and RPS Bot" +
                    " doesn't understand what you did either. \nRemember there are only 3 choices in Rock Paper Scissors." +
                    " \nNow press the green triangle to rerun the program, \nthen click underneath the message that appears at the start. \nType" +
                    " Rock to choose Rock, Paper for Paper, or Scissors for Scissors. \nThe game will ONLY accept the above words in uppercase! NOTHING ELSE!" +
                    "\nThen, press enter to try your luck!");}
        }while((go.equals(Y)||go.equals(y)||go.equals(Yes)||go.equals(yes))||(!go.equals(x)&&!go.equals(X)&&!go.equals(n)&&!go.equals(N)&&!go.equals(No)&&!go.equals(no)) );

    }
}
