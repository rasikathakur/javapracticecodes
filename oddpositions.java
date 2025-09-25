import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        System.out.println("Enter how many elements to add: ");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements: ");
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }
        System.out.println(" ");
        
       for(int i = 0; i < n; i++){
           if(i % 2 != 0){
               System.out.println(list.get(i));
           }
            
        }
    }
}

list_1 = list(map(int, input("Enter numbers: ").split()))
print(list_1)

for i in range(0, len(list_1)):
    if i%2 != 0:
        print(list_1[i])
