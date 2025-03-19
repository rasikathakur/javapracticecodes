class LoopsInJava{
	public static void main(String args[]){
		System.out.println("Loops In Java:");
				

		System.out.println("1. while:");
		int i = 5;
		while(i>=0){
			System.out.println(i);
			i--;
		}

		System.out.println("2. do-while:");
		int j = 5;
		do{
			System.out.println(j);
			j--;
		}while(j>=0);

		System.out.println("3. for:");
		for(int k = 0; k<=5; k++){
			System.out.println(k);
		}

		System.out.println("4. for each:");
		char[] alphabets = {'a', 'e', 'i', 'o', 'u'};
		for(char m: alphabets){
			System.out.println(m);
		}

		int[] nums = {22, 25, 30};
		for(int m: nums){
			System.out.println(m);
		}
		
	}
}