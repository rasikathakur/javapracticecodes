class Calculator{ //class
	int iv = 6;
	public int add(int a, int b){ //method 
		return a+b;
	}

	//method-overloading->same name method with different or same return type and different parameters
	public int add(int a, int b, int c){ 
		return a+b+c;
	}
}

class Computer{ //class
	public void playMusic(){ //method -> dont want any thing to be return use void return type
		System.out.println("Playing Your Favourite Song...");
		System.out.println("Tujhe Sochta hoon mein shamo subah....");
	}

	public String getMeAPen(int cost){ //method -> want to return a String so return type is String here
		if(cost >= 10){
			String s = "Here's Your Pen of "+cost+" Rs.";
			return s;
		}
		return "Nothing";
	}
}

public class ClassnObject{//class
	public static void main(String args[]){
		int num1 = 3; //primitive variables
		int num2 = 4; //primitive variables
		int num3 = 30; //primitive variables
		int result = num1 + num2; //primitive variables
		System.out.println("Directly printing result in main "+result);
		
		Calculator c = new Calculator(); //object or instance variable
		Calculator c1 = new Calculator(); //object or instance variable
		result = c.add(num1, num2);
		System.out.println("Method add with 2 parameters "+result);

		result = c.add(num1, num2, num3);
		System.out.println("Method add with 3 parameters "+result);

		Computer c2 = new Computer(); //object or instance variable
		c2.playMusic();
		System.out.println(c2.getMeAPen(10));

		System.out.println("IV value "+c.iv);
		c.iv = 10;
		System.out.println("First Instance value "+c.iv);
		System.out.println("Second Instance value "+c1.iv);


	}
}

//Object Oriented Programming
//Object -> Properties and Behaviour


//Behind Scene what is happening
//JDK ->to convert java code into byte code

//JVM ->runs/execute the converted byte code



/*
_______________________________________________________________
|                                                                                       JVM          |
|           main stack                                                                            |
|  ------------------------                                                                   |
|  |-----c----|---101----|                                                                    |
|  |--result--|----7-----|                                          heap memory      |
|  |--num3--|---30-----|                                                                    |
|  |--num2--|----4-----|-->stack->last in first out                             |
|  |--num1--|----3-----|                                                                    |
|  ------------------------                                                                    |
|           add(a, b)  stack                       heap reference variable - 101|
|  -----------------------                        -----------------------            |
|  |-----a----|----4-----|                        iv=6                                      |
|  |----b-----|----3-----|                       -----------------------            |
|  ------------------------                        add()                                   |
|                                                           -----------------------           |
|______________________________________________________________|


Heap Memory -> c reference variable in main is in main stack and the instance variable iv is in heap first part
local variables are part of stack
instance variables are part of reference variables first part in heap and reference variables second part in heap contains methods associated with that particular reference variable class
Addressof reference variable from heap is stored in stack in this case 101
main stack c 101 is linked to heap reference variable 101 (c---->101)
Two different objects/reference variables are independent of each other to manipulate data
iv = 6 
if c.iv is changed from 6 to 10
it will not affect c1.iv value 
it will remain same
*/