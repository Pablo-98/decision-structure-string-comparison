import java.util.Scanner;

public class stringComparison{
    public static void main (String[] args){

        // algorithm that will order three string in ascending order 
        // order in probability
        // two ways of ordering data: 1. combinations: when the order doesnt matter
        // 2. Permutations: when order does matter

        //java offers two methods to compare strings: .equals .compareTo


        //create scanner named input
        Scanner input = new Scanner(System.in);
        
        // provide a prompt for the user. \n means insert a newline in the text at this point
        System.out.println("\nInput three words");
        System.out.print("\nWord 1: ");
        // scan for users input of first word
        String word1 = input.next();

        System.out.print("\nWord 2: ");
        //scan for users input of second word
        String word2 = input.next();

        System.out.print("\n Word 3: ");
        //scan for users input of third word
        String word3 = input.next();

        System.out.println();
        // not sure why we need to 'close' the scanner 
        input.close();



    }
}