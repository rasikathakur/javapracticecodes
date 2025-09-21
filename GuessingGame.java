// Write a guessing game where the user has to guess a secret number. After every guess the program tells the user whether their number was too large or too small. At the end the number of tries needed should be printed. It counts only as one try if they input the same number multiple times consecutively.
import java.util.*;

class Main {
    
    public static void main(String[] args) {
        int secret = 30;
        Scanner sc = new Scanner(System.in);
        int prev = -1;
        int count = 0;
        int guess_count = 0;
        int num;
        do{
            System.out.println("Guess the number: ");
            num = sc.nextInt();
            if(prev != num){
                count++;
            }
            if(num == secret){
                System.out.println("You guessed correct!!");
                System.out.println("Count: "+ count);
            }else if(num < secret){
                System.out.println("O!o! Your guess is too small");
            }else if(num > secret){
                System.out.println("O!o! Your guess is too large");
            }
            
            prev = num;
        }while(num != secret);
    }
}
