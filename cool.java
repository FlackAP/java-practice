import java.util.Scanner;
class password {
  public static void main(String[] args) {
    System.out.println("Password Checker");
    Scanner input = new Scanner(System.in);
    String userInput;
    String password;
    password = "Test";
    
    System.out.println("Please enter your username.");
    userInput = input.nextLine();
    
    boolean correct = false;
    while (correct == false) {
      System.out.println("Please enter your password.");
      userInput = input.nextLine();

      if (userInput == password {
        correct = true;
      }

      else if (!userInput == password) {
        System.out.println("Incorrect, please try again.");
      }
    }
      System.out.println("Correct, access granted.");
  }
}