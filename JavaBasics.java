import java.util.*;

public class JavaBasics {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        // average of 3 numbers
        // float pen = 12.0f;
        // float pencil = 112.0f;
        // float paper = 120.0f;
        // float Subtotal = pen + pencil  + paper;
        // float tax = Subtotal * 0.18f;
        // float Total = Subtotal + tax;
        // System.out.println("Total cost with GST 18% is :: " + Total);
        // operating on operators
        // System.out.println(!(1>3));
        // Assignment operators
        // int A = 10;
        // // System.out.println(A+=10);               
        // // System.out.println(A+=10);
        // System.out.println(A *= 10);
        // System.out.println(A /= 10);

        // int x, y, z;
        // x = y = z = 2;
        // x += y;
        // y -= z;
        // z /= (x + y);
        // System.out.println(x + " " + y + " " + z);

        // odd number
        // System.out.println("Enter the Number: ");
        // int Num = sc.nextInt();
        // if(Num % 2 == 0){
        //     System.out.println("The given number is even!");
        // }else{
        //     System.out.println("The given number is odd!");

        // }

        // //Income
        // System.out.println("Enter your Income in lac: ");
        // int Income = sc.nextInt();

        // if(Income <= 50000){
        //     System.out.println("your tax is 0%" );
        //     System.out.println("0% tax for the income less than 5 Lac");
        // }else if(Income >= 50000 && Income <= 1000000){
        //     double tax = Income * 0.2;
        //     System.out.println("your tax is 20%= " + tax);
        // }else{
        //     double tax = Income * 0.3;
        //     System.out.println("your tax is 30%= " + tax);

        // }


        // Switch
        int A[] = new int[2];
        System.out.println("Enter the numbers: ");
        for(int i=0;i<2;i++){
            A[i] = sc.nextInt();
        }
        System.out.println("Enter the operation to be performed: ");
        char ch = sc.next().charAt(0);

        switch(ch){
            case '+' : System.out.println("Calculated: " + (A[0] + A[1]));break;
            case '*' : System.out.println("Calculated: " + (A[0] * A[1]));break;
            case '%' : System.out.println("Calculated: " + (A[0] % A[1]));break;
            case '/' : System.out.println("Calculated: " + (A[0] / A[1]));break;
            case '-' : System.out.println("Calculated: " + (A[0] - A[1]));break;
            default: System.out.println("Enter the valid operation");
        }

    }
}
