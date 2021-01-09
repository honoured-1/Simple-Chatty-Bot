import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextLong();
        int b = scanner.nextLong();
        int multiply = 1;

        for (int i = a; i < b; i++) {
            multiply *= i;
        }
        System.out.println(multiply);
    }
}
