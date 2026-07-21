import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int ch;
        do{
            System.out.println("Menu:\n 1. Multiplication of Table.\n 2. Odd number sum\n 3. Factorial calculation\n 4. sum of digits of an integer\n 5.LCM calculator \n 6. GCD calculator \n 7. Prime number identification \n 8. Reverse digits \n 9. Fibonnacci  \n 10. Armstrong \n 11. Palindrome  \n 12.Pattern1 \n 13. Pattern2 \n 14. Pattern3 \n");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    // Develop a program that prints the multiplication table for a given number.
                    System.out.println("Enter number to calculate multiplication table:");
                    int num = sc.nextInt();
                    int j = 1;

                    while(j <= 10){
                        System.out.println(num+" x "+j+" = "+(num*j));
                        j++;
                    }
                       
                    break;
                case 2:
                    // Create a program to sum all odd numbers from 1 to a specified number N.
                    System.out.println("Enter number to calculate sum of odd numbers:");
                    int n = sc.nextInt();
                    int i = 1;
                    int sum = 0;
                    while(i <= n){
                        if(i % 2 != 0){
                            sum += i;
                        }
                        i++;
                    }
                    System.out.println("Sum of odd numbers from 1 to "+n+" is "+sum);
                    break;
                case 3:
                    // Write a function that calculates the factorial of a given number.
                    System.out.println("Enter number to calculate factorial:");
                    int number = sc.nextInt();
                    int fact = 1;
                    i = 1;
                    while(i <= number){
                        fact *= i;
                        i++;
                    }
                    System.out.println("Factorial of number "+number+" is "+fact);
                    break;
                case 4:
                    // Create a program that computes the sum of the digits of an integer.
                    System.out.println("Enter number to calculate its sum of digit:");
                    int digit = sc.nextInt();
                    int sumDigit = 0;
                    int temp = Math.abs(digit);
                    while(temp > 0){
                        int lastdigit = temp % 10; //extracts last digit
                        sumDigit += lastdigit; // adds the last digit
                        temp = temp / 10; // removes last digit
                    }
                    /*
                    eg. digit = 53094
                        temp = 53094
                        temp > 0 i.e. 53094 > 0 true enters loop
                        lastdigit = 53094 % 10 = 4
                        sumdigit - 0 + 4 = 4
                        temp = 53094 / 10 = 5309
                        
                        temp > 0 i.e. 5309 > 0 true enters loop
                        lastdigit = 5309 % 10 = 9
                        sumdigit - 4 + 9 = 13
                        temp = 5309 / 10 = 530
                        
                        temp > 0 i.e. 530 > 0 true enters loop
                        lastdigit = 530 % 10 = 0
                        sumdigit - 13 + 0 = 13
                        temp = 530 / 10 = 53
                        
                        temp > 0 i.e. 53 > 0 true enters loop
                        lastdigit = 53 % 10 = 3
                        sumdigit - 13 + 3 = 16
                        temp = 53 / 10 = 5
                        
                        temp > 0 i.e. 5 > 0 true enters loop
                        lastdigit = 5 % 10 = 5
                        sumdigit - 16 + 5 = 21
                        temp = 5 / 10 = 0
                        
                        temp > 0 i.e. 0 > 0 false exits loop
                    */
                    System.out.println("Sum of digits of "+digit+" is "+sumDigit);
                    break;
                case 5:
                    // Create a program to find the Least Common Multiple (LCM) of two numbers.
                    System.out.println("Enter number 1:");
                    int num1 = sc.nextInt();
                    System.out.println("Enter number 2:");
                    int num2 = sc.nextInt();
                    int lcm = (num1 > num2) ? num1 : num2;
                    while(true){
                        if((lcm % num1 == 0) && (lcm % num2 == 0)){
                            System.out.println("The LCM is: " + lcm);
                            break;
                        }
                        lcm++;
                    }
                    break;
                case 6:
                    // Create a program to find the Greatest Common Divisor (GCD) of two integers.
                    break;
                case 7:
                    // Create a program to check whether a given number is prime.
                    break;
                case 8:
                    // Create a program to reverse the digits of a number.
                    break;
                case 9:
                    // Create a program to print the Fibonacci series up to a certain number
                    break;
                case 10:
                    // Create a program to check if a number is an Armstrong number.
                    break;
                case 11:
                    // Create a program to verify if a number is a palindrome.
                    break;
                case 12:
                    // Create a program that print pattern 1
                    break;
                case 13:
                    // Create a program that print pattern 2
                    break;
                case 14:
                    // Create a program that print pattern 3
                    break;
            }
        }while(ch <=14);

    }
}
