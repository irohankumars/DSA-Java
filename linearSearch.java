// import java.util.*;

import java.util.Scanner;

public class linearSearch {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = {1,2,3,4,5,6,78,88,99,10,12,22};

        for(int i =0; i<= arr.length - 1;i++){
            System.out.print( " "+arr[i]);
        }
        System.out.println();
        // System.out.print(Arrays.toString(arr));

      
        boolean found = false;
        System.out.print("Enter the key that needs to be found: ");
        int key = sc.nextInt();


        if(arr != null){
              for(int i=0;i<= arr.length - 1; i++){
            if(arr[i] == key){
                System.out.println("found the key "+ key + " at index: " + i);
                found = true;
                break;
            }
          }
        }

        if(!found){
            System.out.println("The key does not exist in the array");
        }
    }

}
