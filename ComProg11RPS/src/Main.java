import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        In Rock Paper Scissors there are only three options. Rock, Paper, or Scissors. As of now I do not know how to
        make a program randomly spit out options. I do not even know if it's possible. However it doesn't matter, the
        computer really only needs numbers. So assign an integer that gives me a random number between one and three.
        3 intergers 1-3 representing rock, paper, and scissors. An integer for what the player chooses, and a bunch of
        strings for some words I have to repeat a lot. Theoretically I think I can make it so that the player inputs the
        word Rock, Paper, or Scissors and gets an answer, however that is more complicated and time consuming as well as
        forcing the player to type out a whole word. Faster on both ends to just use numbers. Use print to place some
        starting text and instructions, then use if/else statements to do the rest. Have the statements evaluate what
        numbers were chosen. If a certain combination is evaluated as true, display a certain line of text. If none of
        the combinations match the combination that happened, the player must have inputed a number that was not 1-3.
        We know this because the computer only spits out 1-3 and we have an answer for every combination of 1-3 and 1-3.
        So we display a different message.

         */
        Scanner scan= new Scanner(System.in);
        int oneToThree =(int)(Math.random()*3+1);
        int rock=1;
        int paper=2;
        int scissors=3;
        int chose;

        String win=("You won! :) Good job! Rerun program to play agian.");
        String tie=("You tied, good game. Rerun program to play again.");
        String lose=("RPS Bot won, good game. Rerun program to play again.");



        System.out.println("Let's play Rock Paper Scissors against RPS Bot! (Robotic Player Systems)\n" +
                "Click right under this mesasage, then type 1 for Rock, 2 for Paper, or 3 for Scissors and press enter! \n" +
                "The game will only accept numerals. NO letters or other characters. \nIf you " +
                "need to rerun the program press the green arrow.");
        chose=Integer.parseInt(scan.next());

        if(oneToThree==rock&&chose==rock) {
            System.out.println("You both chose Rock. "+tie);
        }
        else if(oneToThree==rock&&chose==scissors){
System.out.println("RPS Bot chose Rock and you chose Scissors. "+lose);
        }
        else if(oneToThree==rock&&chose==paper){
            System.out.println("RPS Bot chose Rock and you chose Paper. "+win);
        }
        else if(oneToThree==paper&&chose==rock){
            System.out.println("RPS Bot chose Paper and you chose Rock. "+lose);
        }
        else if(oneToThree==paper&&chose==paper){
            System.out.println("You both chose Paper. "+tie);

        }
        else if(oneToThree==paper&&chose==scissors){
            System.out.println("RPS Bot chose Paper and you chose Scissors. "+win);
        }
        else if(oneToThree==scissors&&chose==rock){
            System.out.println("RPS Bot chose Scissors and you chose Rock. "+win);
        }
        else if(oneToThree==scissors&&chose==paper){
            System.out.println("RPS Bot chose Scissors and you chose Paper. "+lose);
        }
        else if(oneToThree==scissors&&chose==scissors){
            System.out.println("You both chose Scissors. "+tie);
        }
        else{
            System.out.println("I don't know what you entered into the game and I can't understand it" +
                    ", \nbut it wasn't a valid choice and RPS Bot" +
                    " doesn't understand what you did either. \nRemember there are only 3 choices in Rock Paper Scissors." +
                    " \nNow press the green triangle to rerun the program, \nthen click underneath the message that appears at the start. \nType" +
                    " 1 to choose Rock, 2 for Paper, or 3 for Scissors. \nThe game will only accept numerals, NO letters or other characters." +
                    "\nPress enter to try your luck!");
        }

    }
}
