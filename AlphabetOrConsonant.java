import java.util.Scanner;
public class AlphabetOrConsonant {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the input: ");
        char c = s.next().charAt(0);

        if ((c=='a') || (c=='e') || (c=='i')|| (c=='o')|| (c=='u')|| (c=='A')|| (c=='E')|| (c=='I')|| (c=='O')|| (c=='U')){
            System.out.println(c + " is a vowel...");
        }else {
            System.out.println(c + " is a consonant... ");
        }
    }
}
