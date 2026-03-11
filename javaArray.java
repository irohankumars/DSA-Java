import java.util.*;
public class javaArray {
    public static void main(String[] args) {
                Scanner sc = new Scanner (System.in);

        int  marks[] = new int[50];

        System.out.println("Enter the number of subjects: ");
        int n = sc.nextInt();
        for(int i = 1; i<=n ; i++){
            System.out.print("Enter the marks of " + i +" Subject: ");
            int mark = sc.nextInt();
            marks[i] = mark;
        }

        System.out.println("marks entered");
        for(int i=0;i<=n;i++){
            System.out.print(marks[i]);
        }

    sc.close();
    }


}
