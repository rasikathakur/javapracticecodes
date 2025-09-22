# python code for leap year
from datetime import datetime

def isLeap(current_year):
    if (current_year%4 == 0 and current_year%100 != 0) or current_year%400 == 0:
        return True
    return False;

current_year = datetime.now().year;
count = 20;
while count > 0:
    if isLeap(current_year):
        count = count - 1
        print("Leap Year: ",current_year)
    current_year = current_year + 1

// java code for leap year
import java.util.Calendar;

class Main {
    public static boolean isLeap(int num){
        if((num % 4 == 0 && num % 100 != 0) || num % 400 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        
        int count = 20;
        int current_year = Calendar.getInstance().get(Calendar.YEAR);
        while(count > 0){
            if(isLeap(current_year)){
                count --;
                System.out.println("Leap Year: "+current_year);
            }
            current_year++;
            
        }
        
        System.out.println();
    }
}
