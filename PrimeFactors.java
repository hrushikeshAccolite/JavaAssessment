// Given a number between 1 and 2e128 print the number as
// the sum of the prime numbers using the least repeating possible
// combination.
// Example: 8 = 7 + 1
// Example: 24 = 23 + 1

// 11 -> 7
//11 - 7 = 4
// 4 -> 3
// 4 - 3 = 1
// 1 -> 1
// --> 7 + 3 + 1

import java.util.*;

public class PrimeFactors {
    static ArrayList<Integer> primeFactors = new ArrayList<Integer>();
    
    public static void main(String[] args) {
        computePrimeFactors(12);
    }

    public static void computePrimeFactors(int x) {

        int largestPrime = 0;
        for (int i = 2; i < x; i++) {
            if (isPrime(i) && i > largestPrime) {
                largestPrime = i;
            }
        }
        primeFactors.add(largestPrime);
        x = x - largestPrime;

        if(isPrime(x)){ 
                primeFactors.add(x);
                System.out.println(primeFactors);
        } else {
                computePrimeFactors(x);
        }
        
    }

    public static boolean isPrime(int x) {
        if (x == 1) {
            return true;
        }
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
