// Challenege 
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //arithmetic operations
        int a;
        int b;
        float p, r, t;
        int ch;
        do{
            System.out.println("Enter Your choice: \n 1. Add\n 2. Subtract\n 3. Multiply\n 4. Divide\n 5. Modulo\n 6.product of floating numbers\n 7. Perimeter of rectangle\n 8. Area of triangle\n 9. Simple Interest\n 10. Compound Ineterst\n 11. Farehneit to Celcius Conversion");
            ch = sc.nextInt();
            int result=0;
            switch(ch){
                case 1: 
                    System.out.println("Enter Number 1:");
                    a = sc.nextInt();
                    System.out.println("Enter Number 2:");
                    b = sc.nextInt();
                    result = a+b;
                    System.out.println(a+" + "+b+" = "+result);
                    break;
                case 2:
                    System.out.println("Enter Number 1:");
                    a = sc.nextInt();
                    System.out.println("Enter Number 2:");
                    b = sc.nextInt();
                    result = a-b;
                    System.out.println(a+" - "+b+" = "+result);
                    break;
                case 3:
                    System.out.println("Enter Number 1:");
                    a = sc.nextInt();
                    System.out.println("Enter Number 2:");
                    b = sc.nextInt();
                    result = a*b;
                    System.out.println(a+" * "+b+" = "+result);
                    break;
                case 4:
                    System.out.println("Enter Number 1:");
                    a = sc.nextInt();
                    System.out.println("Enter Number 2:");
                    b = sc.nextInt();
                    result = a/b;
                    System.out.println(a+" / "+b+" = "+result);
                    break;
                case 5:
                    System.out.println("Enter Number 1:");
                    a = sc.nextInt();
                    System.out.println("Enter Number 2:");
                    b = sc.nextInt();
                    result = a%b;
                    System.out.println(a+" % "+b+" = "+result);
                    break;
                case 6:
                    //product of two floating point numbers
                    System.out.println("Enter Number 1:");
                    float c = sc.nextFloat();
                    System.out.println("Enter Number 2:");
                    float d = sc.nextFloat();
                    float result2 = c*d;
                    System.out.println(c+" * "+d+" = "+result2);
                    break;
                case 7:
                    //perimeter of rectangle
                    System.out.println("Enter length:");
                    float l = sc.nextFloat();
                    System.out.println("Enter breadth:");
                    float br = sc.nextFloat();
                    float perimeter = 2*(l+br);
                    System.out.println("Perimeter of Rectangle with length "+l+" and breadth "+br+" is "+perimeter);
                    break;
                case 8:
                    //area of triangle
                    System.out.println("Enter base:");
                    float bs = sc.nextFloat();
                    System.out.println("Enter height:");
                    float h = sc.nextFloat();
                    double area = 0.5*bs*h;
                    System.out.println("Area of Triangle with base "+bs+" and height "+h+" is "+area);
                    break;
                case 9:
                     //simple interest
                    System.out.println("Enter principal:");
                    p = sc.nextFloat();
                    System.out.println("Enter rate:");
                    r = sc.nextFloat();
                    System.out.println("Enter time in years:");
                    t = sc.nextFloat();
                    float si = (p*r*t)/100;
                    float total = p + si;
                    System.out.println("Simple Interst on Principal amount "+p+" Rate "+r+" and Time Period of "+t+" years is "+si+". So total amount is "+total);
                    break;
                case 10:
                    //compound ineterst
                    System.out.println("Enter principal:");
                    p = sc.nextFloat();
                    System.out.println("Enter rate:");
                    r = sc.nextFloat();
                    System.out.println("Enter time in years:");
                    t = sc.nextFloat();
                    double ci = p * Math.pow((1 + r / 100), t);
                    //p*(1+(r/100))^t;
                    double totalc = p + ci;
                    System.out.println("Compound Interst on Principal amount "+p+" Rate "+r+" and Time Period of "+t+" years is "+ci+". So total amount is "+totalc);
                    break;
                case 11:
                    //farehnit to celcius conversion
                    System.out.println("Enter temperature in farehneit degrees:");
                    float f = sc.nextFloat();
                    
                    float celcius = (f - 32) * 5/9;
                    System.out.println("Farehneit temperature "+f+" after converting to celcius is "+celcius);
                    break;
            }
        }while(ch <= 11);
        
        
        
        
        
        
        
       
        
        
      
        
    }
}
