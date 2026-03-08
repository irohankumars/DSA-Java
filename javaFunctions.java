import java.util.Scanner;

public class javaFunctions {

  public static boolean isPrime(int n){
    boolean isPrime = true;
    if(n==2){
      return true;
    }
    for(int i=2; i<= n-1;i++){
      if(n % i ==0){
        return false;
      }
    }
    return true;

  }

  public static  void primeRange(int n){
    for(int i=2; i<=n; i++){
     if(isPrime(i)){
      System.out.print(" "+i);
     }
    }   
    
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the range: ");
    int n = sc.nextInt();
  primeRange(n);    
  }
}