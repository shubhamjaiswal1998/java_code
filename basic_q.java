import java.util.ArrayList;
public class basic_q {
    static void print_subarray(){

     int arr[]={1,2,3};
     for (int i = 0; i < arr.length; i++) {
        for (int j = i; j < arr.length; j++) {
            for (int k = i; k <=j; k++) {
                System.out.print(arr[k]+" ");
            }
          System.out.println();  
        }
        
     }
    }
    ////////////////////////////////////////////////////////
     public static void gcd(int a,int b){

        int min=(a<b)?a:b;
        int i=2; int gcd=1;
        while (i<=min) {
            if (a%i==0 && b%i==0) {
                gcd=i; 
            }
            i++;
        }
         System.out.println("gcd is "+gcd);

     }
    ///////////////////////////////////////////////////////////////
    public static int reverseDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            sum = sum * 10 + r;
            n = n/10;
        }
        return sum;
    }
    ///////////////////////////////////////////////////////////////////
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int r=n%10;
            sum =sum+r;
            n = n/10;
        }
        return sum;
    }
    /////////////////////////////////////////////////////////////
  static ArrayList<Integer> findDivisors(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        // Iterate from 1 to n
        for (int i = 1; i <= n; i++) {
            // If i divides n evenly, add it to the list of divisors
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }
    ///////////////////////////////////////////////////////////////////
    static boolean check_prime(int n){
       for (int i = 2; i <n; i++) {
            if (n%i==0) {
                return false;
            }
        }
       return true;
    }
    static void print_prime(int a,int b){
      
        for (int i = a; i <=b; i++) {
            boolean r=check_prime(i);
            if (r) {
               System.out.print(i+" "); 
            }
        }
    }
    public static void main(String[] args) {
        /*System.out.println(check_prime(5));
        print_prime(2, 25);
        System.out.println();
        int n = 24;
        ArrayList<Integer> divisors = findDivisors(n);
        System.out.println("Divisors of " + n + ": " + divisors);
        System.out.println(sumOfDigits(123));
        gcd(24, 15);*/
        print_subarray();
    }
}
