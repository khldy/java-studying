import java.util.Scanner;
public class reverseIterative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String word = scanner.nextLine();

        System.out.println("Reversed string: ");

        for(int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }

        scanner.close();
    }
}