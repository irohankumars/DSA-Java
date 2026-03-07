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

  public static int mult(int a,int b){
    return a * b;
  }
  public static float mult(float a,float b){
    return a * b;
  }
  public static void main(String[] args) {
    System.out.println(mult(11.3f , 3.3f));
        System.out.println(mult(11 , 3));

  }
}