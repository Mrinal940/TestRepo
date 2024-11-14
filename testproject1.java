import java.util.Scanner;

public class testproject1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Hello! What is your name?");
        String name = scanner.nextLine();
       
        System.out.println("Hello " + name +"! How old are you?");
        String stringAge = scanner.nextLine();
        int age = Integer.parseInt(stringAge);
        int birthYear = 2024 - age;
        System.out.println("Great! By my calculations, you were born in " + birthYear);
    }
}