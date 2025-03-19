class ConditionalStatements{
	public static void main(String args[]){
		System.out.println("Conditional Statements :");

		System.out.println("\n\nIf Statement :");
		int age = 19;
		if(age>=18){
			System.out.println("You are added to the voters list!");
		}

		System.out.println("\n\nIf - Else Statement :");
		age = 17;
		if(age>=18){
			System.out.println("You are eligible for voting");
		}
		else{
			System.out.println("You are not eligible for voting");
		}


		System.out.println("\n\nIf - Else Ladder Statement :");
		int Marks = 99;
		if(Marks<=100 && Marks>75){
			System.out.println("Grade O");
		}
		else if(Marks<=75 && Marks>60){
			System.out.println("Grade A");
		}
		else if(Marks<=60 && Marks>45){
			System.out.println("Grade B");
		}
		else if(Marks<=45 && Marks>35){
			System.out.println("Grade C");
		}
		else if(Marks<=35 && Marks>0){
			System.out.println("Fail");
		}
		else{
			System.out.println("Invalid marks");
		}

		System.out.println("\n\nNested If - Else Statement :");
		char gender = 'f';
		age = 17;
		if(gender == 'f'){
			if(age>=18){
				System.out.println("Eligible to get married!");
			}
			else{
				System.out.println("Not eligible to get married!");
			}
		}
		else{
			if(age>=21){
				System.out.println("Eligible to get married!");
			}
			else{
				System.out.println("Not eligible to get married!");
			}
		}

		
		System.out.println("\n\nSwitch Case :");
		int choice = 5;
		switch(choice){
			case 1: 
				System.out.println("Monday");
				break;
			case 2: 
				System.out.println("Tuesday");
				break;
			case 3: 
				System.out.println("Wednesday");
				break;
			case 4: 
				System.out.println("Thursday");
				break;
			case 5: 
				System.out.println("Friday");
				break;
			case 6: 
				System.out.println("Saturday");
				break;
			default: 
				System.out.println("Sunday");

		}

		System.out.println("\n\nTernary Operator :");
		int num = 4;
		System.out.println((num % 2 == 0) ? "Even Number" : "Odd Number");
	}
}