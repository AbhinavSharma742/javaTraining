import java.util.Scanner;
public class AlphabetOrNot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the input: ");
        char c = s.next().charAt(0);
        if ((c>=65) && (c<=91) || (c>=97) && (c<=123) ){
            System.out.println(c + " is an alphabet");
        }else{
            System.out.println(c + " is not an alphabet...");
        }
    }
}