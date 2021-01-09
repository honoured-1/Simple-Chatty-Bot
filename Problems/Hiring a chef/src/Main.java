import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstname = scanner.next();
        scanner.next();
        scanner.next();
        scanner.next();
        String cuisinePreference = scanner.next();

        System.out.println("The form for" + firstname + "is completed." +  "We will contact you if we need a chef that cooks" + cuisinePreference + "dishes.");
    }
}