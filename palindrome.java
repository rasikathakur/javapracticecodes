import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str1 = sc.nextLine();
        String str2 = "";
        for(int i = str1.length()-1; i >= 0; i--){
            str2 += str1.charAt(i);
        }
        
        if(str1.equals(str2)){
            System.out.println(str1+" is a palindrome");
        }else{
            System.out.println(str1+" is not a palindrome");
        }
    }
}

str1 = input("Enter a string: ")
str2 = ""

print("String palindrome check using for loop")
for char in str1:
    str2 = char + str2

if(str1 == str2):
    print("String ", str1, " is palindrome")
else:
    print("String ", str1, " is not palindrome")
    
print("String palindrome check using slicing")
if(str1 == str1[::-1]):
    print("String ", str1, " is palindrome")
else:
    print("String ", str1, " is not palindrome")
    
print("String palindrome check using two pointers")
is_palindrome = True
i, j = 0, len(str1)-1
while(i < j):
    if(str1[i] != str1[j]):
        is_palindrome = False
        break
    i+=1
    j-=1
if is_palindrome == False:
    print("String ", str1, " is not palindrome")
else:
    print("String ", str1, " is palindrome")
