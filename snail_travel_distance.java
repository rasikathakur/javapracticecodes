
import java.util.*;
class Main {
    public static boolean[] integerBoolean(String bits) {
        int n = bits.length();
        boolean str[] = new boolean[n];
        int i = 0;
		for(char c: bits.toCharArray()){
		    if(c == '1'){
		        str[i] = true;
		    }else if(c == '0'){
		        str[i] = false;
		    }
		    i++;
		}
		return str;
	}
    public static void main(String[] args) {
        System.out.println("Try programiz.pro"+Arrays.toString(integerBoolean("1001")));
    }
}
