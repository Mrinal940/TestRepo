import java.util.Scanner;

public class SimpleCalculator {
    
    public static void main(String[] args){
        Scanner num1Scanner = new Scanner(System.in); //This is the code for the first number input
        System.out.println("Enter the first number"); 
        String num1 = num1Scanner.nextLine();

        Scanner num2Scanner = new Scanner(System.in); //This is the code for the second number input
        System.out.println("Enter the second number");
        String num2 = num2Scanner.nextLine();

        Scanner operationScanner = new Scanner(System.in);//This is the code for the operation, or type
        System.out.println("+, -, *, or /");
        String operation = operationScanner.nextLine();
        
        if (operation.equals("+")) {
            System.out.println(Double.parseDouble(num1) + Double.parseDouble(num2));
        }
        else if(operation.equals("-")) {
            System.out.println(Double.parseDouble(num1) - Double.parseDouble(num2));
        }
        else if(operation.equals("*")) {
            System.out.println(Double.parseDouble(num1) * Double.parseDouble(num2));
        }
        else if(operation.equals("/")) {
            System.out.println(Double.parseDouble(num1) / Double.parseDouble(num2));

        }
        else{
            System.out.println("ERROR!");
        }
    
    
}

}