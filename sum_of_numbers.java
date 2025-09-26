import java.util.*;

class Main {
    
    public static int calculateSum(ArrayList<Integer> arr, int index){
        if(index == arr.size()){
            return 0;
        }else{
            return arr.get(index) + calculateSum(arr, index+1);
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers to add: ");
        int n = sc.nextInt();
        System.out.println("Sum of numbers in a list using for loop : ");
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
            sum += list.get(i);
        }
        System.out.println("Running Total using for loop: "+sum);
        sum = 0;
        System.out.println("Sum of numbers in a list using while loop : ");
        int i = 0;
        while(i < n){
            sum += list.get(i);
            i++;
        }
        System.out.println("Running Total using while loop: "+sum);
        sum = 0;
        System.out.println("Sum of numbers in a list using recursion : ");
        sum = calculateSum(list, 0);
        System.out.println("Running Total using recursion: "+sum);
         }
}


def calculatesum(list_1, index):
    if index == len(list_1):
        return 0
    else:
        return list_1[index] + calculatesum(list_1, index+1)

list_1 = list(map(int, input("Enter numbers").split()))
sum1 = 0
for i in range(0, len(list_1)):
    sum1 += list_1[i]
print("Sum of numbers in list using for-loop: ", sum1)

i = 0
sum1 = 0
while i < len(list_1):
    sum1 += list_1[i]
    i = i + 1
print("Sum of numbers in list using while-loop: ", sum1)

sum1 = 0
sum1 = calculatesum(list_1, 0)
print("Sum of numbers in list using recursion: ", sum1)
