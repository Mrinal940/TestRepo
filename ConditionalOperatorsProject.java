import java.util.Scanner;
// % - remainder. 4 % 2 = 0, 8 % 3 = 2
// 1. ask the user for an int
// 2. if the int is divisible by 3 and 5, print "missing 4 or 6"
// 3. if the int is divisible by 4 or 6, print "missing 3 and 5"
// 4. if the int is ((divisible by 3 and 5) and (divisible by 4 or 6)), print "yay"
// 5. if none of those are satisfied, print "nope"
 // 1. save num to variable
    // 2. in conditional statements, you want to be checking the variable % 3 or 5 or 4 or 6 or whatever == 0

    //if ((var % 3 == 0) and (var % 5 == 0))


public class ConditionalOperatorsProject {
   public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in); //Asks user for number
    System.out.println("Give me a number please");
    String num = scanner.nextLine();
    int number = Integer.parseInt(num);
    // if the number is not even (odd), print the number is even
    if(number % 2 != 0) {
        System.out.println("the number is not even");
    }

    /* this is the same as: 
    
    if (!(number % 2 == 0)) {
        System.out.println("the number is not even");
    }
        
    */

    if(((number % 3 == 0) && (number % 5 == 0)) && ((number % 4 == 0) || (number % 6 == 0))){
        System.out.println("yay");
    }
    else if((number % 3 == 0) && (number % 5 == 0)){
        System.out.println("missing 4 or 6");
    }
    else if((number % 4 == 0) || (number % 6 == 0)){
        System.out.println("missing 3 and 5");
    }
   else{
    System.out.println("nope");
   }
}
}