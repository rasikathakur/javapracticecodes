Write a program that computes the sum of an alternating series where each element of the series is an expression of the form 
from 1 to a million, multiplied by 4. Or, in more mathematical notation

4⋅k=1∑106​2k−1(−1)k+1​
4⋅(11​−31​+51​−71​+91​−111​+⋯)

class Main {
    public static void main(String[] args) {
        double approximate_pi;
        double total = 0.0;
        int n = 1_000_000;
        for(int k = 1; k <= n; k++){
            total += ((Math.pow(-1, k+1)) / (2*k-1));
        }
        approximate_pi = 4 * total;
        System.out.println("Approximate pi value upto "+n+" terms is "+approximate_pi);
    }
}

def approx_pi(n):
    total = 0.0
    for k in range(1, n+1):
        total += (((-1) ** (k+1)) / (2.0*k - 1))
    return 4 * total;
n = 1_000_000
approximate_pi = approx_pi(n)
print(f"Approximate pi value upto {n} terms is {approximate_pi}")
