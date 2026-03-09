import java.util.Scanner;

public class javaFunctions {

  public static boolean isPrime(int n){
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

  public static void binTodec(int binNum){
    int printNum = binNum;
    int decNum = 0;
    int pow = 0;

    while(binNum > 0){
      int lastDigit = binNum % 10;
      decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
      pow++;
      binNum = binNum / 10;
    }
    System.out.println("decimal form of "+printNum+" will be "+decNum);
  }

  public static void decTobin(int decNum){
    int printNum = decNum;
    int binNum = 0;
    int pow = 0;

    while(decNum>0){
      int rem =   decNum % 2;
      binNum = binNum + (rem * (int)Math.pow(10,pow));
      pow++;
      decNum =  decNum /2;
    }
    System.out.print("Binary form of "+printNum+" will be "+binNum);

  }

  public static void main(String[] args) {

    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the range: ");
    // int n = sc.nextInt();
    // primeRange(n);    

    //binary to dec
    binTodec(101);
    decTobin(120);
  }
}