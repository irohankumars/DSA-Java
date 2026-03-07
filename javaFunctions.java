import java.util.*;
import java.math.BigInteger;

public class javaFunctions {

    public static BigInteger fact(int n){
        BigInteger fact = BigInteger.ONE;
        for(int i = 1; i <= n; i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    public static BigInteger BiCo(int n, int r){
        BigInteger n_fact = fact(n);
        BigInteger r_fact = fact(r);
        BigInteger nr_fact = fact(n-r);

        BigInteger BiCo = n_fact.divide(r_fact.multiply(nr_fact));
        return BiCo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the n: ");
        int n = sc.nextInt();

        System.out.println("enter the r: ");
        int r = sc.nextInt();

        System.out.println("binomial Coefficient is " + BiCo(n,r));
    }
}