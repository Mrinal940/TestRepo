import java.util.Scanner;

public class SimpleCalculatorMethods {
    String num1;
    String num2;
    
    public SimpleCalculatorMethods(String number1, String number2) {
        num1 = number1;
        num2 = number2;
    }
    
    public void addition(){
        System.out.println(Double.parseDouble(num1) + Double.parseDouble(num2));
    }
    public void subtraction(){
        System.out.println(Double.parseDouble(num1) - Double.parseDouble(num2));
    }
    public void multiplication(){
        System.out.println(Double.parseDouble(num1) * Double.parseDouble(num2));
    }
    public void division(){
        System.out.println(Double.parseDouble(num1) / Double.parseDouble(num2));
    }
    public static void main(String[] args){
        Scanner num1Scanner = new Scanner(System.in); //This is the code for the first number input
        System.out.println("Enter the first number"); 
        String Num1 = num1Scanner.nextLine();

        Scanner num2Scanner = new Scanner(System.in); //This is the code for the second number input
        System.out.println("Enter the second number");
        String Num2 = num2Scanner.nextLine();

        SimpleCalculatorMethods calculator = new SimpleCalculatorMethods(Num1, Num2);

        Scanner operationScanner = new Scanner(System.in);//This is the code for the operation, or type
        System.out.println("+, -, *, or /");
        String operation = operationScanner.nextLine();
        
        if (operation.equals("+")) {
            calculator.addition();
        }
        else if(operation.equals("-")) {
            calculator.subtraction();
        }
        else if(operation.equals("*")) {
            calculator.multiplication();
        }
        else if(operation.equals("/")) {
            calculator.division();

        }
        else{
            System.out.println("ERROR!");
        }
    
    
}

}