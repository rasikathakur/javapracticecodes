class Logicalnop{
	public static void main(String args[]){
		System.out.println("Logical Operators:");
		
		System.out.println("And(&&) Operator:");
		/*
		A B Result
		T T  T
		T F  F
		F T  F
		F F  F
		*/
		System.out.println("6 is less than(<) 7 and 7 is greater than(>) 6: "+(6<7 && 7>6));
		
		System.out.println("Or(||) Operator:");
		/*
		A B Result
		T T  T
		T F  T
		F T  T
		F F  F
		*/
		System.out.println("6 is greater than(>) 7 or 7 is greater than(>) 6: "+(6>7 || 7>6));


		System.out.println("Not(!) Operator:");
		/*
		A Result
		T  F
		F  T
		*/
		System.out.println("Not 6 is less than(<) 7 : "+!(6<7));

	}
}