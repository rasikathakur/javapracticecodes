import java.util.*;

class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers to enter: ");
        int n = sc.nextInt();
        System.out.println("Enter numbers: ");
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }
        System.out.println("Our List: "+list);
        int max = 0;
        for(int i = 1; i <list.size(); i++){
            if(list.get(max) < list.get(i)){
                max = i;
            }
        }
        System.out.println("Our Max element: "+list.get(max));
        
    }
}

num_list = list(map(int, input("Enter numbers: ").split()))
print(num_list)
max = 0
for i in range(1, len(num_list)):
    if num_list[max] < num_list[i]:
        max = i
print("Max Element: ",num_list[max])
