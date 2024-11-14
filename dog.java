public class dog {
    String breed;
    int age;
    boolean hasOwner;
    
    public dog(String dogBreed, int dogAge, boolean dogHasOwner) {

        breed = dogBreed;
        age = dogAge;
        hasOwner = dogHasOwner;
    }
public static void main(String[] args) {
    dog fido = new dog("stinky", 44, true);
    dog lary = new dog("binky", 14, false);
    System.out.println(fido.breed);
    System.out.println(lary.hasOwner);
    
}
}