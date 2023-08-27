import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Exercise
//        //print number from input number till 0 in the descending order
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("please enter the number");
//        int number = scanner.nextInt();//15 -> 15,14,13,12 ... 0
//        while (number > 0) {
//            number--;
//            System.out.println(number);
//        }

        //Exercise
        //get input from user
        //print number from 0 to input in ascending order
        //Example input = 8
        //output = 0,1,2,3,4,5,6,7,8
//        int i = 0;
//        System.out.println("please enter the number");
//        int number = scanner.nextInt();
//        while (i <= number) {
//            System.out.println(i);
//            i++;
//        }
        //Exercise
        //input number from user
        //calculate and print the factorial of that number
        //6 number
        // sum = number* number-1 * number- 2..   1...   6*5*4*3*2*1
//        System.out.println("enter the number to calculate factorial");
//        int number = scanner.nextInt(); //4
//        int sum = number; // 4
//        while (number > 1) {
//            sum = sum * (number-1);
//            number --;
//        }
//        System.out.println(sum);
//        int sum = 0;
//        int toContinue = 1;
//        do {
//            int card = (int) ((Math.random()*10) + 1);//random card between 1 to 11
//            sum = sum + card;
//            System.out.println("you card is: " + card);
//            System.out.println("your Sum now is : "  + sum);
//            //if the user wins or loses.
//            if (sum == 21) {
//                System.out.println("you win");
//                break;
//            }
//            if (sum > 21) {
//                System.out.println("you lost");
//                break;
//            }
//
//            System.out.println("do you want more cards 1=yes 0=no");
//            toContinue = scanner.nextInt();
//
//        } while(toContinue == 1);

        //Exercise guess the number
        //the program will make random number from 0 to 5
        //you need to guess the number
        // make many attempts until you guess the number/
//        int randomNumber = (int) (Math.random()*5); // random number 0 to 5
//        boolean isGuessed = false;
//        while (isGuessed == false) {
//            System.out.println("guess the number from 0 to 5");
//            int guessedNumber = scanner.nextInt();
//            if (randomNumber == guessedNumber) { //guessed
//                isGuessed = true;
//                System.out.println("You are right the number is: " + guessedNumber);
//            } else {
//                System.out.println("your guess is not correct");
//            }
//        }
//        System.out.println("End of the game");

//         int i = 0;
//         while (i <= 10) {
//             System.out.println(i);
//             i++;
//         }

//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("please enter the number");
//        int number = scanner.nextInt();
//
//         for (int i = 0; i<=number; i++) {
//             System.out.println(i);
//         }
//
//        for (int i = number-1; i >= 0; i--) {
//            System.out.println(i);
//        }
//
        //6

//        2    6%2 = 0 ? => not prime
//        11   2 11%2 = 0?    11%3 = 0?   11%4=0? .......  11%10 =0? no-> prime!
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int number = scanner.nextInt();
        for (int i = 2; i <= number; i++) {
            if (i == number) {
                System.out.println("Your number is prime!");
                break;
            }
            int remainder = number % i;
            if (remainder == 0) {
                System.out.println("your number is not prime");
                break;
            }

        }








         //exercise
        //take input from the user
        //print numbers from 0 to the input number\
        //example user enters 7
        //print 0,1,2,3,4,5,6,7



    }
}
