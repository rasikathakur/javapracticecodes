import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int ch;
        int size = 0;
        int arr[] = null;
        int rev[] = null;
        int i, j;
        do{
            System.out.println("Menu:\n1. Create an array and add elements\n2. Insert an element into specific position\n3. Delete an element from specific position\n4. sort an array\n5. search an element from array and return index \n6. Sum and Average of all elements in array.\n7. Number of occurences of element in an array\n8. Maximun and Minimum element in an array\n9. Check given array is sorted\n10. New array returning after deleteing a specific element \n11. Reversing array \n12. Check array is palindrome or not \n13. Merge two sorted arrays \n14. Search an element in 2 D array  \n15. To do sum and avaerage of elements in 2D array \n16. To find sum of two diagonal elements\n");
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
                    i = 0;
                    while(i < size-1){
                        j = i+1;
                        while(j < size){
                            if(arr[i] >= arr[j]){
                                int temp = arr[i];
                                arr[i] = arr[j];
                                arr[j] = temp;
                            }
                            j++;
                        }
                        i++;
                    }
                    System.out.println("Array elements: "+ Arrays.toString(arr));
                    break;
                case 5:
                    // search an element from array and return index
                    System.out.println("Enter the element to search from array: ");
                    int searchEl = sc.nextInt();
                    i = 0;
                    index = -1;
                    while(i < size){
                        if(arr[i] == searchEl){
                            index = i;
                            break;
                        }
                        i++;
                    }
                    if(index == -1){
                        System.out.println("Element Not found");
                    }else{
                        System.out.println("Element Found at position "+i);
                    }
                    break;
                case 6:
                    // Create a program to find the sum and average of all elements in an array.
                    i = 0;
                    int sum = 0;
                    while(i < size){
                        sum += arr[i];
                        i++;
                    }
                    float average = sum/size;
                    System.out.println("Sum of array is "+sum+" and average is "+average);
                    break;
                case 7:
                    // Create a program to find number of occurrences of an element in an array
                    System.out.println("Enter the element to search from array: ");
                    int occurenceEl = sc.nextInt();
                    i = 0;
                    int count = 0;
                    while(i < size){
                        if(occurenceEl == arr[i]){
                            count++;
                        }
                        i++;
                    }
                    System.out.println("Element Found "+count+" times in array");
                    break;
                case 8:
                    // Create a program to find the maximum and minimum element in an array.
                    int min = 0;
                    int max = size-1;
                    i = 0;
                    
                    while(i < size-1){
                        j = i+1;
                        while(j < size){
                            if(arr[i] < arr[j]){
                                min = i;
                                max = j;
                            }else if(arr[i] > arr[j]){
                                min = j;
                                max = i;
                            }
                            j++;
                        }
                        i++;
                    }
                    System.out.println("Minimum Element: "+arr[min]+" Maximum element: "+arr[max]);
                    break;
                case 9:
                    // Create a program to check if the given array is sorted.
                    boolean isArraySorted = true;
                    i = 0;
                    while( i < size-1){
                        if(arr[i] > arr[i+1]){
                            isArraySorted = false;
                            break;
                        }
                        i++;
                    }
                    if(isArraySorted){
                        System.out.println("Array is sorted");
                    }else{
                        System.out.println("Array is not sorted");
                    }
                    break;
                case 10:
                    // Create a program to return a new array deleting a specific element.
                    // case 3
                    break;
                case 11:
                    // Create a program to reverse an array.
                    i = 0;
                    j = size-1;
                    
                    rev = new int[size];
                    while(i < size){
                        rev[i] = arr[i];
                        i++;
                    }
                    i=0;
                    while( i < j){
                        int temp1 = rev[i];
                        rev[i] = rev[j];
                        rev[j] = temp1;
                        
                        i++;
                        j--;
                    }
                    System.out.println("Original Array elements: "+ Arrays.toString(arr));
                    System.out.println("Reversed Array elements: "+ Arrays.toString(rev));
                    break;
                case 12:
                    // Create a program to check is the array is palindrome or not.
                    boolean isPalindrome = true;
                    i=0;
                    j= size-1;
                    while(i < j){
                        if(arr[i] != arr[j]){
                            isPalindrome = false;
                            break;
                        }
                        i++;
                        j--;
                    }
                    if(isPalindrome){
                        System.out.println("Array is palindrome");
                    }else{
                        System.out.println("Array is not palindrome");
                    }
                    break;
                case 13:
                    // Create a program to merge two sorted arrays.
                    
                    break;
                case 14:
                    // Create a program to search an element in a 2-D array.
                    
                    break;
                case 15:
                    // Create a program to do sum and average of all elements in a 2-D array
                    
                    break;
                case 16: 
                    // Create a program to find the sum of two diagonal elements.
                    break;
            }
        }while(ch <=15);

    }
}
