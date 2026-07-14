import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int ch;
        int num;
        do{
            System.out.println("Enter Your choice:\n\n 1. Positive, Negative, Zero Number\n 2. Even or Odd\n 3. Greatest of Three\n 4. Leap Year\n 5. Grades based on Marks\n 6. Person categorization into age groups");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter a number");
                    num = sc.nextInt();
                    if(num > 0){
                        System.out.println("Number "+num+" is positive.");
                    }else if(num  < 0){
                        System.out.println("Number "+num+" is negative.");
                    }else{
                        System.out.println("Number "+num+" is 0.");
                    }
                    break;
                case 2:
                    System.out.println("Enter a number");
                    num = sc.nextInt();
                    if(num % 2 == 0){
                        System.out.println("Number "+num+" is even.");
                    }else{
                        System.out.println("Number "+num+" is odd.");
                    }
                    break;
                case 3:
                    System.out.println("Enter 3 numbers");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    int num3 = sc.nextInt();
                    if(num1 > num2 && num1 > num3){
                        System.out.println("Number "+num1+" is Greatest among three numbers"+num1+","+num2+","+num3);
                    }else if(num2 > num1 && num2 > num3){
                        System.out.println("Number "+num2+" is Greatest among three numbers"+num1+","+num2+","+num3);
                    }else{
                        System.out.println("Number "+num3+" is Greatest among three numbers"+num1+","+num2+","+num3);
                    }
                    break;
                case 4:
                    System.out.println("Enter a year in yyyy format:");
                    int year = sc.nextInt();
                    if((year%4==0 && year%100!=0)|| year%400==0){
                        System.out.println("Year "+year+" is Leap Year.");
                    }else{
                        System.out.println("Year "+year+" is not a Leap Year.");
                    }
                    break;
                case 5:
                    System.out.println("Enter marks:");
                    float marks = sc.nextFloat();
                    if(marks >= 90 && marks <= 100){
                        System.out.println("Your Grade is A");
                    }else if(marks >= 75 && marks < 90){
                        System.out.println("Your Grade is B");
                    }else if(marks >= 60 && marks < 75){
                        System.out.println("Your Grade is C");
                    }else if(marks >= 30 && marks < 60){
                        System.out.println("Your Grade is D");
                    }else if(marks >= 0 && marks < 30){
                        System.out.println("You are Fail");
                    }else{
                        System.out.println("Invalid Input");
                    }
                    break;
                case 6:
                    System.out.println("Enter age:");
                    int age = sc.nextInt();
                    if(age >= 60){
                        System.out.println("Senior");
                    }else if(age >= 21 && age < 60){
                        System.out.println("Adult");
                    }else if(age >= 14 && age < 21){
                        System.out.println("Teen");
                    }else if(age >= 0 && age < 14){
                        System.out.println("Child");
                    }else{
                        System.out.println("Invalid Input");
                    }
                    break;
            }
            
        
        }while(ch <= 6);
        
    }
}
