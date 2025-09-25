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
        
        System.out.println("Enter element to search: ");
        int search = sc.nextInt();
        ArrayList<Integer> search_element_positions = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            if(list.get(i) == search){
                search_element_positions.add(i+1);
            }
        }
        if(!search_element_positions.isEmpty()){
            System.out.println("Search element "+search+" is found at position"+search_element_positions);
        }else{
            System.out.println("Search element not found");
        }
    }
}



list_1 = list(map(int, input("Enter numbers: ").split()))
print(list_1)

search = int(input("Enter element to search: "))
search_list = []
for i in range(0, len(list_1)):
    if list_1[i] == search:
        search_list.append(i+1)
        
if not search_list:
    print("Search element not found")
else:
    print("Search element ",search," is found at position",search_list)
