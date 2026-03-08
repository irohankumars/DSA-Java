// import java.util.*;
// import java.math.BigInteger;

// public class javaFunctions {

//     public static BigInteger fact(int n){
//         BigInteger fact = BigInteger.ONE;
//         for(int i = 1; i <= n; i++){
//             fact = fact.multiply(BigInteger.valueOf(i));
//         }
//         return fact;
//     }

//     public static BigInteger BiCo(int n, int r){
//         BigInteger n_fact = fact(n);
//         BigInteger r_fact = fact(r);
//         BigInteger nr_fact = fact(n-r);

//         BigInteger BiCo = n_fact.divide(r_fact.multiply(nr_fact));
//         return BiCo;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter the n: ");
//         int n = sc.nextInt();

//         System.out.println("enter the r: ");
//         int r = sc.nextInt();

//         System.out.println("binomial Coefficient is " + BiCo(n,r));
//     }
// }

public class javaFunctions {
  //function to return int sum
  public static int mult(int a,int b){
    return a * b;
  }
  //function to return float sum
  public static float mult(float a,float b){
    return a * b;
  }

  //function to check if the given number is prime or not
  public static void prime(int n){
     for(int i=2; i<=n-1; i++){
      if(n % i == 0){
         System.out.println("The number is not prime");  
         break;
      }else{
         System.out.println("The number is  prime");
    }

     }
       
    }
  
  public static void main(String[] args) {

  prime(4);
    

  }
}