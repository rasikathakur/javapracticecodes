import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int ch;
        int size = 0;
        int arr[] = null;
        int i;
        do{
            System.out.println("Menu:\n1.Create an array and add elements\n2.Insert an element into specific position\n3.Delete an element from specific position\n3.sort an array\n4.search an element from array and return index \n 5. Sum and Average of all elements in array.\n 6. Number of occurences of element in an array\n 7. Maximun and Minimum element in an array\n 8. Check given array is sorted\n 9.New array returning after deleteing a specific element \n 10. Reversean array \n 11. Check array is palindrome or not \n 12. Merge two sorted arrays \n 13. Search an element in 2 D array  \n 14. To do sum and avaerage of elements in 2D array \n 15. To find sum of two diagonal elements\n");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    // Create an array and add elements
                    System.out.println("Enter array size: ");
                    size = sc.nextInt();
                    arr = new int[size];  //initialized array
                    i = 0;
                    System.out.println("Enter array elements: ");
                    while(i<size){
                        arr[i] = sc.nextInt();
                        i++;
                    }
                    System.out.println("Array elements: "+ Arrays.toString(arr));
                    break;
                case 2:
                    // Insert an element into specific position
                    System.out.println("Enter the elemnt to insert: ");
                    int element = sc.nextInt();
                    
                    System.out.println("Enter the position to insert an element: ");
                    int position = sc.nextInt();
                    
                    int newArr[] = new int[size+1];
                    
                    i = 0;
                    //copy elements before position
                    while(i<position){
                        newArr[i] = arr[i];
                        i++;
                    }
                    
                    //insert elemet at position
                    newArr[position] = element;
                    
                    //copy elememts after position
                    while(i<(size)){
                        newArr[i+1] = arr[i];
                        i++;
                    }
                    
                    //new array equals old array and increase size
                    arr = newArr;
                    size++;
                    System.out.println("Array elements: "+ Arrays.toString(arr));
                    break;
                case 3:
                    // Delete an element from specific position
                    System.out.println("Enter the element to delete from array: ");
                    int el = sc.nextInt();
                    int index = -1;
                    i = 0;
                    while(i < size){
                        if(arr[i] == el){
                            index = i;
                            break;
                        }
                        i++;
                    }
                    
                    if(index == -1){
                        System.out.println("Element not found");
                        break;
                    }
                    int newDelArr[] = new int[size-1];
                    i = 0;
                    while(i < index){
                        newDelArr[i] = arr[i];
                        i++;
                    }
                    while(i < (size-1)){
                        newDelArr[i] = arr[i+1];
                        i++;
                    }
                    arr = newDelArr;
                    size--;
                    System.out.println("Array elements: "+ Arrays.toString(arr));
                    break;
                case 4:
                    // sort an array
                    
                    break;
                case 5:
                    // search an element from array and return index
                    
                    break;
                case 6:
                    // Create a program to find number of occurrences of an element in an array
                    
                    break;
                case 7:
                    // Create a program to find the maximum and minimum element in an array.
                    
                    break;
                case 8:
                    // Create a program to check if the given array is sorted.
                    break;
                case 9:
                    // Create a program to return a new array deleting a specific element.
                    
                    break;
                case 10:
                    // Create a program to reverse an array.
                    
                    break;
                case 11:
                    // Create a program to check is the array is palindrome or not.
                    
                    break;
                case 12:
                    // Create a program to merge two sorted arrays.
                    
                    break;
                case 13:
                    // Create a program to search an element in a 2-D array.
                    
                    break;
                case 14:
                    // Create a program to do sum and average of all elements in a 2-D array
                    
                    break;
                case 15:
                    // Create a program to find the sum of two diagonal elements.
                    
                    break;
            }
        }while(ch <=15);

    }
}
