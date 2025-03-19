class Variable_demo{
	public static void main(String args[]){
		
		System.out.println(3 + 5);
		System.out.println(8 * 5);

		System.out.println("DATA TYPES:");
		System.out.println("1. Primitive:");
		byte num1 = 1;
		System.out.println("Byte -> Range: -128 to 127 Memory Volume: 1 Byte O/P->"+num1);
		short num2 = 32766;
		System.out.println("Short -> Range: -32768 to 32767 Memory Volume: 2 Bytes O/P->"+num2);
		int num3 = 2147483646;
		System.out.println("Integer -> Range: -2147483648 to 2147483647 Memory Volume: 4 Bytes O/P->"+num3);
		long num4 = 9223372036854775806l;
		System.out.println("Long -> Range: -9223372036854775808 to 9223372036854775807 Memory Volume: 8 Bytes O/P->"+num4);
		float num5 = 8.5f;
		System.out.println("Float -> Range: -3.4E+38 to 3.4E+38 Memory Volume: 4 Bytes O/P->"+num5);
		double num6 = 1000000000000000004567.77777777777777777777;
		System.out.println("Double -> Range: -1.7E+308 to 1.7E+308 Memory Volume: 8 Bytes O/P->"+num6);
		char num7 = 'a';
		System.out.println("Char -> Range: 0 to 65536 Memory Volume: 2 Bytes O/P->"+num7);
		boolean num8 = true;
		System.out.println("Boolean -> Value: True or False Memory Volume: 1 Bit O/P->"+num8);

		System.out.println("2. Primitive:");


	    //literals
	    System.out.println("Literals: ");

            int l1 = 00000101;
	    System.out.println(l1);  //calculated in octal - 8
	    int l2 = 0x7E;
	    System.out.println(l2);
            char l3 = 'r';
	    System.out.println(l3);
	    l3++;
	    System.out.println(l3);
            int l4 = 10_00_00_00;
	    System.out.println(l4);
  	    double l5 = 12e10;
	    System.out.println(l5);

	}

}