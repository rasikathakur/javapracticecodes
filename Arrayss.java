import java.util.*;

class Student{
	int rollno;
	String name;
	int marks;
}

public class Arrayss{
	public static void main(String args[]){
		/*
			Array is a set of elements with similar datatypes
		*/

		//declaring an array with elements directly
		int[] arr = {30, 03, 2004};	
		int[] arr2 = {30, 03, 2004};	

		//initialize array with specific size given 
		int arr1[] = new int[5];

		System.out.println("\n\nArray elements declared without size");
		for (int a = 0; a<3; a++){
			System.out.println(arr[a]);
		}

		System.out.println("\n\nArray with size");
		for (int a = 0; a<5; a++){
			if(a==1)
				arr1[a] = 30;
			System.out.println(arr1[a]);
		}

		System.out.println("\n\nMultidimentional array");

		//initializing a Multidimensional array - 2D, 3D, etc.
		int num[][] = new int[3][4]; //3 arrays/rows with 4 elements/columns each or 3*4 array
		
		for(int i = 0; i<3; i++){
			for(int j = 0; j<4; j++){
				num[i][j] = (int)(Math.random() * 10);
				System.out.print(num[i][j]+" ");
			}
			System.out.println();

		}

		System.out.println("\n\nEnhanced For loop");

		//Enhanced For loops
		for(int[] n: num){
			for(int m: n){
				System.out.print(m+" ");
			}
			System.out.println();
		}

		System.out.println("\n\nJagged Array");

		//Jagged Array
		int num2[][] = new int[3][]; //need to mention the rows but columns for each row can be mentioned afterwards 
		num2[0] = new int[3]; //diffrent column sizes for different rows can be mentioned as shown
		num2[1] = new int[5];
		num2[2] = new int[6];
				


		for(int i = 0; i<num2.length; i++){
			for(int j = 0; j<num2[i].length; j++){
				num2[i][j] = (int)(Math.random() * 10);
				System.out.print(num2[i][j]+" ");
			}
			System.out.println();

		}
		System.out.println("\n\nArray of Objects");

		//Array of Objects
		Student s1 = new Student();
		s1.rollno = 65;		
		s1.name = "Soham";		
		s1.marks = 99;	

		Student s2 = new Student();
		s2.rollno = 64;		
		s2.name = "Varad";		
		s2.marks = 98;	

		Student s3 = new Student();
		s3.rollno = 63;		
		s3.name = "Rasika";		
		s3.marks = 97;		

		Student students[] = new Student[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		System.out.println("| Sr No. | Roll No. | Name | Marks |");
		for(int i = 0; i < students.length; i++){
			System.out.println(" | " + (i+1) + " | " + students[i].rollno + " | " + students[i].name + " | " + students[i].marks + " | ");

		}
		//enhanced for loop or for-each loop
		for(Student stud: students){
			System.out.println(" | " + stud.rollno + " | " + stud.name + " | " + stud.marks + " | ");
		}

		//array methods
		System.out.println("\n\nArray Methods:");

		/*1. compare(array1, array2): 
		returns 0 if arrays are equal
		Returns a negative integer if the array1 is less than array2 lexicographically
		Returns a positive integer if array1 is greater than array2 lexicographically.
		*/

		int comp_arr = Arrays.compare(arr, arr2);
		System.out.println("\n\nCompare "+Arrays.toString(arr)+"and"+Arrays.toString(arr2)+": "+comp_arr);



		/*2. copyOf(array1, size): 
		copy entire array with same size
		copy entire array with smaller size truncates array
		copy entire array with larger size adds elemnts with value 0
		*/

		int[] copy_arr1 = Arrays.copyOf(arr, 3); //copy entire array
		System.out.println("\n\nCopy of "+Arrays.toString(arr)+" with same size: "+Arrays.toString(copy_arr1));

		int[] copy_arr2 = Arrays.copyOf(arr, 2); //copy entire array
		System.out.println("\n\nCopy of "+Arrays.toString(arr)+" with smaller size: "+Arrays.toString(copy_arr2));

		int[] copy_arr3 = Arrays.copyOf(arr, 5); //copy entire array
		System.out.println("\n\nCopy of "+Arrays.toString(arr)+" with larger size: "+Arrays.toString(copy_arr3));
		
		/*3. deepEquals(array1, array2): 
		compares two multidimensional arrays to check whether they are deeply equal or not if equal returns true otherwise false
		*/

		int[][] de1 = {{1, 2, 3}, {4, 5, 6}};
        	int[][] de2 = {{1, 2, 3}, {4, 5, 6}};
        	int[][] de3 = {{1, 2, 3}, {4, 5, 7}};

		boolean de1_de2_result = Arrays.deepEquals(de1, de2); 
		System.out.println("\n\nArray 1: "+Arrays.deepToString(de1)+" is deeply equal with Array 2: "+Arrays.deepToString(de2)+":- "+de1_de2_result);

		boolean de2_de3_result = Arrays.deepEquals(de2, de3); 
		System.out.println("\n\nArray 2: "+Arrays.deepToString(de2)+" is deeply equal with Array 3: "+Arrays.deepToString(de3)+":- "+de2_de3_result);

		/*4. equals(array1, array2): 
		compares two arrays to check whether they are equal and have same elements in same order or not if equal returns true otherwise false
		*/
		System.out.println("\n\nArray 1: "+Arrays.toString(arr)+" is equal with Array 2: "+Arrays.toString(arr2)+":- "+Arrays.equals(arr, arr2));
		System.out.println("\n\nArray 1: "+Arrays.toString(arr)+" is equal with Array 3: "+Arrays.toString(arr1)+":- "+Arrays.equals(arr, arr1));

		
		/*5. sort(arr, start, end)
		sorts the array in ascending order start -> from which index sorting must be started(optional) end-> end-1 upto which index sorting must be stopped		
		*/
		int[] s_num = {3, 9, 4, 0, 10, 5, 2, 6, 8, 7, 1};
		System.out.println("Unsorted Array: "+Arrays.toString(s_num));
		Arrays.sort(s_num);
		System.out.println("Sorted Array: "+Arrays.toString(s_num));
		int[] s_num2 = {3, 9, 4, 0, 10, 5, 2, 6, 8, 7, 1};
		Arrays.sort(s_num2, 1, 5);
		System.out.println("Sorted Array with start and end: "+Arrays.toString(s_num2));

		/*6. fill(arr, start, end, value)
		fills entire array with specific value if start and end are not given
		fills the array from start index location upto end-1 index location with specific value		
		*/
		char[] alpha = {'a', 'e', 'i', 'o', 'u'}; 
		char[] alpha1 = {'a', 'e', 'i', 'o', 'u'}; 
		System.out.println("Original Array: "+Arrays.toString(alpha));
		Arrays.fill(alpha, 'z');
		System.out.println("Entirely Filled Array: "+Arrays.toString(alpha));
		Arrays.fill(alpha1, 1, 3, 'r');
		System.out.println("Entirely Filled Array: "+Arrays.toString(alpha1));

		/*length ->finds total number of elements in array*/
		System.out.println("Length of array: "+alpha1.length);

		
	}

}