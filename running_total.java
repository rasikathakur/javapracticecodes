import java.util.*;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers to add: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
            sum += list.get(i);
        }
        
        System.out.println("Running Total: "+sum);
    }
}

list_1 = list(map(int, input("Enter numbers: ").split()))
sum_1 = 0
for i in range(0, len(list_1)-1):
    sum_1 += list_1[i]
print("Running Total: ", sum_1)
