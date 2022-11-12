import java.util.Scanner;
public class VowelsOrConsonants_SwitchCase {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the alphabet: ");
        char var = s.next().charAt(0);

        switch (var){
            case 'a' -> System.out.println("Vowel...");
            case 'e' -> System.out.println("Vowel...");
            case 'i' -> System.out.println("Vowel...");
            case 'o' -> System.out.println("Vowel...");
            case 'u' -> System.out.println("Vowel...");
            case 'A' -> System.out.println("Vowel...");
            case 'E' -> System.out.println("Vowel...");
            case 'I' -> System.out.println("Vowel...");
            case 'O' -> System.out.println("Vowel...");
            case 'U' -> System.out.println("Vowel...");
            default -> System.out.println("Consonant...");
        }
        System.out.println("Thank you for using my code...");
    }
}
