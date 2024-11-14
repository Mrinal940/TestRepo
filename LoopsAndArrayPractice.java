import java.util.Scanner;
import java.util.Arrays;
public class LoopsAndArrayPractice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //Asks user for string
        String[] words = new String[5];
        //int count = 0;
        
    //     while(count < 5){
            
    // System.out.println("Give me a string");
    // String random = scanner.nextLine();
    //         words[count] = random;
    //         count++;
    //     }
    for (int count = 0; count < 5; count++){
        System.out.println("Give me a string");
    String random = scanner.nextLine();
           words[count] = random;
             
    }

        String betterPrintout = Arrays.toString(words);
        System.out.println(betterPrintout);
    }

}
