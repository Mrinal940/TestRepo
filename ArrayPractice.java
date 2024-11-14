import java.util.Scanner;
import java.util.Arrays;
public class ArrayPractice {
    public static void main(String[] args){

        //String[] randomThings = {"Hello", "my", "name", "is"};
        String[] randomThings = new String[4];
        randomThings[0] = "Hello"; 
        randomThings[1] = "my";
        randomThings[2] = "name";
        randomThings[3] = "is";
        String betterPrintout = Arrays.toString(randomThings);
        System.out.println(betterPrintout);
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in anything lol");
        String lol = scanner.nextLine();
        randomThings[2] = lol;
        betterPrintout = Arrays.toString(randomThings);
        System.out.println(betterPrintout);
        System.out.println(randomThings.length);
    }
    // 1. Create an arrray explicitly which holds 4 strings of your choice 
    // 2. print out the array
    // 3. ask the user to enter a string, and then replace the third string in your array with the user's string
    // 4. print the length of the array 


    // 5. repeat steps 1-4 again, but create the array such that the array initially starts empty when you create it
}
