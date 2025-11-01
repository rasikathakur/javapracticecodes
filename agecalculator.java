// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
import java.time.*;

class Main {
    public static boolean isLeapYear(int currentyear){
        if(currentyear % 4 == 0 && currentyear % 100 != 0 || currentyear % 400 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many days had passed till your age");
        int age;
        do{
            System.out.println("Enter Age: ");
            age = sc.nextInt();
        }while(age <=0 || age > 110);
        
        
        int currentyear = Year.now().getValue();
        int count = age;
        int leapYearCount = 0;
        do{
            boolean leapyear = isLeapYear(currentyear);
            if(leapyear){
                leapYearCount++;
            }
            count --;
            currentyear --;
        }while(count >= 0);
        int normalyearcount = age-leapYearCount;
        int result = normalyearcount*365 + leapYearCount*366;
        System.out.println("Age to Days: "+result);
    }
}
