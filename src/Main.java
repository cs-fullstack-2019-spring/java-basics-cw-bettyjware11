import java.util.Scanner;

public class Main {
//    Exercise 1:
//    Create a program that prints “It’s a great day today”. Then ask the user “What is your name?. Then print “Hello [NAME]”

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("It's a great day today");
//        System.out.println("What is your name?");
//        String name = scan.nextLine();
//        System.out.println("Hello" + name);

//      Exercise 2:
//Ask for the user to enter a number. Ask the user for another number. Print the sum of the two numbers, then the difference of the two numbers.
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int num1 = reader.nextInt();
//        System.out.println("Enter another number");
//        int num2 = reader.nextInt();
//        System.out.println(num1 + num2);
//        System.out.println(num1 - num2);

//   Exercise 3:
//Ask the user to enter their balance. Print “I’ve granted you $1.50 more!. Your new balance is: [BALANCE]”
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Enter your balance");
//        int origBal = reader.nextInt();
//        double num1 = 1.50;
//        System.out.println("I've granted you $1.50 more!. Your new balance is:" + (origBal +num1));

//Exercise 4:
//Ask a user to enter a password. Enter a password. Ask user to reenter password. Check to see if they are correct.
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Enter a password");
//        System.out.println("Re-enter password");
//        String pass1 = reader.nextLine();
//        String pass2 = reader.nextLine();
//        if (pass1.equals(pass2)){
//            System.out.println("Passwords match");
//        }
//        else {
//            System.out.println("Passwords do not match");
//        }

//Exercise 5:
//Print “CORRECT” if 1, 2, or 3 is entered. If anything else is entered print "ERROR".
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int num1 = reader.nextInt();
//        if (num1==1){
//            System.out.println("CORRECT");
//        }
//        else if (num1==2){
//            System.out.println("CORRECT");
//        }
//        else if (num1==3){
//            System.out.println("CORRECT");
//        }
//        else {
//            System.out.println("ERROR");
//        }

// Exercise 6:
//Ask the user to enter a number. If it’s positive, print “POSITIVE”. If it’s negative, print “NEGATIVE”. If it’s zero, print "ZERO".
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int num1 = reader.nextInt();
//        if (num1 > 0){
//            System.out.println("POSITIVE");
//        }
//        else if (num1 < 0){
//            System.out.println("NEGATIVE");
//        }
//        else if (num1 == 0){
//            System.out.println("ZERO");
//        }
//        else{
//            System.out.println("ERROR");
//        }

//Exercise 7:
//Ask the user for 3 card numbers. If it equals 21 print BLACKJACK!, if it’s greater than 21 print BUST!, if it’s less than 21 print “The total is [TOTAL]”
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Enter three card numbers");
//        int num1 = reader.nextInt();
//        int num2 = reader.nextInt();
//        int num3 = reader.nextInt();
//        int total = (num1+num2+num3);
//        if (total==21){
//            System.out.println("BLACKJACK!!");
//        }
//        else if (total > 21){
//            System.out.println("BUST");
//        }
//        else {
//            System.out.println("The total is" + total);
//        }

//       Exercise 8:
//Ask the user to enter a number grade. It should print according to the following:
//
//A 90 - 100 B 80 - 89 C 70 - 79 D 60 - 69 F 0 - 59
//
//If it's negative or over 100 print "Error".
//         Scanner reader = new Scanner(System.in);
//         System.out.println("Enter a number grade");
//         int grade = reader.nextInt();
//         if (grade >= 90 && grade <= 100) {
//             System.out.println("Your Letter grade is A");
//         }
//         else if (grade >= 80 && grade <= 89) {
//             System.out.println("Your letter grade is B");
//         }
//         else if (grade >= 70 && grade <=79) {
//             System.out.println("Your letter grade is C");
//         }
//         else if (grade >= 60 && grade <= 69) {
//             System.out.println("Your letter grade is D");
//         }
//         else if (grade >= 50 && grade <= 59) {
//             System.out.println("Your letter grade is F");
//         }
//         else if (grade > 100 | grade < 0) {
//             System.out.println("Error");
//        }

// Exercise 9:
//   Ask the user for their height in centimeters. Print their height in feet and inches.
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Enter height in centimeters");
//        double height = reader.nextInt();
//        double feet = height * .0328;
//        double inches = height * .3937;
//        System.out.println("You are " + feet + "feet" + inches + "inches" );


// Exercise 10:
//   Ask the user to enter three numbers. Find the largest of three numbers using only things we learned today.
//          Scanner reader = new Scanner(System.in);
//          System.out.println("Enter three numbers");
//          int num1 = reader.nextInt();
//          int num2 = reader.nextInt();
//          int num3 = reader.nextInt();
//          if (num1 > num2 && num1 > num3) {
//              System.out.println("The largest is:" + num1);
//          }
//          else if (num2 > num3 && num2 > num1)  {
//              System.out.println("The largest is:" + num2);
//          }
//          else if (num3 > num1 && num3 > num2) {
//              System.out.println("The largest is:" + num3);
//          }

//  Exercise 11:
//    Create a program that can calculate the quadratic equation. Google it if you don't know the equation
        Scanner input = new Scanner(System.in);

        double a = 0;
        double b = 0;
        double c = 0;
        double discriminant = 0;
        double d = 0;
        double x = 1;
        System.out.println("Enter the value of a : ");
        a = input.nextDouble();
        System.out.println("Enter the value of b : ");
        b = input.nextDouble();
        System.out.print("Enter the value of c : ");
        c = input.nextDouble();
        discriminant = (b * b - 4 * a * c);

        d = Math.sqrt(discriminant);

        if (discriminant >= 0.0) {
           System.out.println("First root of the equation : " + (-b + d) / (2.0 * a));
           System.out.println("Second root of the equation : " +(-b - d) / (2.0*a));
        }
        else {
             System.out.println("The roots are not real numbers.");
        }
    }
}
