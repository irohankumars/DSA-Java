import java.util.*;

public class JavaBasics {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("input radius:");
        int rad = sc.nextInt();
        float area = 3.14f * rad * rad;
        System.out.println(area);
    }
}
