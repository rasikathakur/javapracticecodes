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
        //manual 
        List<Integer> reversed = new ArrayList<Integer>();
        
        for(int i = list.size()-1; i >= 0; i--){
            reversed.add(list.get(i));
        }
        System.out.println("Our manual Reversed list: "+reversed);
        
        //in-place
        Collections.reverse(list);
        System.out.println("Our in-place Reversed list: "+list);
    }
}

num_list = list(map(int, input("Enter numbers: ").split()))
print(num_list)
# slicing
reversed_list = num_list[::-1]
print(reversed_list)
# in_place
num_list.reverse()
print(num_list)
