import java.util.*;
public class Arraysslists{
	public static void main(String args[]){
		

		ArrayList<Integer> arr = new ArrayList<Integer>();

		//arraylist methods
		/*1. add() -> adds single element to arraylist at a time*/
		arr.add(1);
		arr.add(3);
		arr.add(4);
		arr.add(2);
		System.out.println("Array after adding single elements: "+arr);

		/*2. addAll() -> adds multiple elements or an entire arraylist to arraylist at a time*/
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(10);
		arr1.add(9);
		arr1.add(8);
		
		arr1.addAll(arr);
		System.out.println("Array after adding multiple elements: "+arr1);

		/*3. clear() -> clears entire arraylist*/
		arr.clear();
		System.out.println("Cleared array: "+arr);

		/*4. (ArrayList)arrayname.clone() -> clears entire arraylist*/
		ArrayList arr2 = (ArrayList)arr1.clone();
		System.out.println("Cloned array: "+arr2);
		arr2.add(10);
		/*5. contains() checks whether an item is present in arraylist or not if present gives output as true otherwise false*/
		System.out.println("Conatins array element 10: "+arr2.contains(10));
		System.out.println("Conatins array element 50: "+arr2.contains(50));		

		/*6. forEach -> loops through arraylist */
		System.out.println("Loop through arraylist: ");
		arr2.forEach((n) -> {System.out.println(n);});
		
		/*7. get -> output value of specified location */
		System.out.println("Output value of specified location 2: "+arr2.get(2));
		
		/*8. indexOf -> returns index of specific element */
		System.out.println("Output index of specified element 10: "+arr2.indexOf(10));
		
		/*9. isEmpty -> returns true if arraylist is empty otherwise false */
		System.out.println("Whether the above array empty?  "+arr2.isEmpty());

		/*10. Iterator -> Loop through list using iterator */
		Iterator<Integer> it = arr2.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		/*11. lastIndexOf -> returns the last occurrence index of specific element*/
		System.out.println("Output last index of specified element 10: "+arr2.lastIndexOf(10));

		/*12. listIterator -> to loop forward and backward through a list*/
		ListIterator<Integer> lt = arr2.listIterator();
		//loop forward
		System.out.println("Forward: ");
		while(lt.hasNext()){
			System.out.print(" "+lt.next());
		}

		//loop backwards
		System.out.println("\nBackward: ");
		while(lt.hasPrevious()){
			System.out.print(" "+lt.previous());
		}

		ArrayList arr3 = (ArrayList)arr1.clone();
		ArrayList arr4 = (ArrayList)arr1.clone();
		ArrayList<Integer> arr5 = (ArrayList<Integer>)arr1.clone();

		/*13. remove - delete specific items from list*/
		arr3.remove(1);		
		System.out.println("Remove specific item 1: "+arr3);

		/*14. removeAll - delete all items from list*/
		arr4.removeAll(arr4);		
		System.out.println("Remove all items: "+arr4);

		/*15. removeIf - delete all items from list for which the specisified condition is satisfied*/
		arr5.removeIf(n -> n % 2 == 0);	//even numbers will be removed	
		System.out.println("Remove specific items matching or satisfying condition even numbers: "+arr5);

		/*16. replaceAll - replaces all the items in a list by using lambda expression*/
		arr5.replaceAll(n -> n+1); //replace existing numbers by adding 1 to each
		System.out.println("Replace all items: "+arr5);

		/*17. retainAll - removes all elements from list which do not belong to list*/
		ArrayList<Character> a1 = new ArrayList<Character>();
		ArrayList<Character> a2 = new ArrayList<Character>();	
		a1.add('a');
		a1.add('b');
		a1.add('c');
		a1.add('d');
		a1.add('e');
		a1.add('f');
		a1.add('g');
		a1.add('h');
		a1.add('i');

		a2.add('a');
		a2.add('e');
		a2.add('i');
		a2.add('o');
		a2.add('u');
		System.out.println("Original Array 1: "+a1);
		System.out.println("Original Array 2: "+a2);
		a1.retainAll(a2);
		System.out.println("Retained Array 1: "+a1);

		/*18. set(index, item) - replaces the item at specified index location by new item*/
		a1.set(2, 'o');
		System.out.println("Set location 2 from Array 1 as O: "+a1);
		
		/*19. size - returns size of list*/
		System.out.println("Size of Array 1: "+a1.size());

		/*20. sort - sort list items in ascending order*/
		arr2.sort(null);
		System.out.println("Sorted Arr2: "+arr2);

		/*21. subList(start, end) maintains a separate list between start and end indices */
		System.out.println("Sublist Arr2: "+arr2.subList(3, 8));		

		/*22. toArray() - coverts list to array*/
		Object[] arrr2 = arr2.toArray();
		System.out.println("Arraylist to Array Arr2: "+arr2.toString());
		

	}
}