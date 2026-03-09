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

  public static void avgThree(int n, int n1, int n2){
  int avg = (n + n1 + n2) / 3;
  System.out.println(" the avg of three numbers you entered is "+ avg);
  }
 
  public static void isEven(int n){
    if(n % 2 == 0){
      System.out.println("The Number is Even");
    }else{
      System.out.println("The Number is Odd");
    }
  }

  public static void isPali(int number){
    int copyNum = number;
    int reverse = 0;
    if(number < 0){
      System.out.println("Enter positive integer only"); 
    }else{
      while(number != 0){
      int digit = number % 10;
      reverse = (reverse * 10 );
      reverse  +=  digit;
      number /= 10;
    }

    if(copyNum == reverse){
      System.out.println("the Entered Number " + copyNum +" is Plaindrome");
    }else{
      System.out.println("Entered Number " + copyNum +" is not Palindrome");
    }
    }

    
  }

  public static void sumOfDigits(int number){
    int sum = 0;
    if(number < 0){
      System.out.println("Enter the Valid digit to add");
    }else{
      while(number != 0){
        int digit = number % 10;
        sum = sum + digit;
        number /= 10;
      }
      System.out.println("the sum of the digits you enterd is " + sum);
    }
  }
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number: ");
    int n = sc.nextInt();
    sumOfDigits(n);

    // int n1 = sc.nextInt();
    // int n2 = sc.nextInt();

    // avgThree(n, n1, n2);

    // primeRange(n);    

    //binary to dec
    // binTodec(101);
    // decTobin(120);
  }
}