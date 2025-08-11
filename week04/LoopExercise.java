// Program to print a text 5 times
import java.util.Scanner;  // Import the Scanner class

class Loop01 {
  public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input





    int n = 5;
    // for loop  
    for (int i = 1; i <= n; ++i) {
      System.out.println("Java is fun"+" from: "+i+ " to: "+n);
    }
  }
}