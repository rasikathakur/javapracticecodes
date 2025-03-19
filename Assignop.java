class Assignop{
	public static void main(String args[]){
		System.out.println("Assignment Operators:");
		int num1 = 30;
		int num2 = 4;

		int result = num1 + num2;
		System.out.println("Addition: "+result);

		result = num1 - num2;
		System.out.println("Subtraction: "+result);

		result = num1 * num2;
		System.out.println("Multiplication: "+result);

		result = num1 / num2;
		System.out.println("Division: "+result);

		result = num1 % num2;
		System.out.println("Modulous: "+result);

		
		num1 += 2;
		System.out.println("Addassign: "+num1);

		num1 -= 2;
		System.out.println("Subassign: "+num1);

		num1 *= 2;
		System.out.println("Mulassign: "+num1);

		num1 /= 2;
		System.out.println("Divassign: "+num1);

		//it assigns z = num1 and then increments num1 by 1
		int z = num1++;
		System.out.println("Post Increment Operator:- Num:"+num1+" Z: "+z); 

		//it assigns z = num1 and then decrements num1 by 1
		int y = num1--;
		System.out.println("Post Decrement Operator:- Num:"+num1+" Y: "+y);

		//it increments num1 by 1 and then assigns z = num1 
		int w = ++num1;
		System.out.println("Pre Increment Operator:- Num:"+num1+" W: "+w);

		//it decrements num1 by 1 and then assigns z = num1 
		int v = --num1;
		System.out.println("Pre Decrement Operator:- Num:"+num1+" V: "+v);

	}
}