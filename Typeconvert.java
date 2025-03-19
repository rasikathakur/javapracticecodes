class Typeconvert{
	public static void main(String args[]){
		System.out.println("Type Conversion and Casting:");
		byte b = 127;
		int a = 257;
		System.out.println("b:"+b);
		//implicit conversion
		a = b; 
		System.out.println("a:"+a);

		byte c = 127;
		int d = 257;
		//b = a -->lossy conversion int to byte
		c = (byte)d;//explicit conversion
		//int to byte conversion  a % 256(256 total range of byte from -128 to 127)
		System.out.println("c:"+c);
		
		float f = 5.6f;
		int x = (int)f;
		//values after point will be removed in float to int conversion
		System.out.println("x:"+x);

		//type promotion
		byte e = 10;
		byte g = 30;
		int result = e * g;
		System.out.println(result);//byte to int promoted as 10*30 is 300 which is out of range

		
	}
}