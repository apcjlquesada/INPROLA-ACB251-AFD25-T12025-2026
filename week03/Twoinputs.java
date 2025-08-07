import java.util.Scanner; // import the Scanner class 

class Twoinputs {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter two integers");

    // Numerical input
    int a = myObj.nextInt();
    int a = myObj.nextInt();


    // Output input by user
    System.out.println("First number " + a); 
    System.out.println("Second Number " + b); 

// addition operator
    System.out.println("a + b = " + (a + b));

    // subtraction operator
    System.out.println("a - b = " + (a - b));

    // multiplication operator
    System.out.println("a * b = " + (a * b));

    // division operator
    System.out.println("a / b = " + (a / b));

    
  }
}