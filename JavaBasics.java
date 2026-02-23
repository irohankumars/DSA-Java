import java.util.*;

public class JavaBasics {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
       // average of 3 numbers
        System.out.print("Enter the side of Square to find out the Area: ");
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("Area of the square is: " + area);
      
    }
}
