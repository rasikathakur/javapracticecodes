
class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        
        int andresult = a & b;
        System.out.println("Bitwise and: "+andresult);
        
        int orresult = a | b;
        System.out.println("Bitwise or: "+orresult);
        
        int xorresult = a ^ b;
        System.out.println("Bitwise xor: "+xorresult);
        
        int notresult = ~a;
        System.out.println("Bitwise not: "+andresult);
        
        int lshiftresult = a << 3;
        System.out.println("Bitwise left shift by 3: "+lshiftresult);
        
        int rshiftresult = a >> 3;
        System.out.println("Bitwise right shift by 3: "+rshiftresult);
        
        
    }
}
