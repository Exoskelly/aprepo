import java.util.Scanner;

public class lp516 {
    private String secretPassword;

    public void setPassword(String password) {
        this.secretPassword = password;
    }

    public String getPassword() {
        return secretPassword;
    }

    public static void main(String[] args) {
        lp516 passwordManager = new lp516();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a secret password: ");
        String password = scanner.nextLine();
        passwordManager.setPassword(password);
        
        System.out.println("Password stored successfully!");

        System.out.print("Do you want to retrieve the password? (yes/no): ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            System.out.println("Your secret password is: " + passwordManager.getPassword());
        } else {
            System.out.println("Password retrieval canceled.");
        }

        scanner.close();
    }
}
