import java.util.*;

public class searchTechniques {
    
    public static void linearSearchArray(){
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

        sc.close();
    }

    public static void largestInArray(){
        int arr[] = {1,2,3,4,5,6,78,88,99,10,12,22,101,222};
        int largest = arr[0];
        for(int i=0;i<arr.length; i++){
                if(arr[i] >largest){
                    largest =  arr[i];
                } 
        }
        System.out.println(largest);


    }


    public static int BSt(int arr[],int key){
        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter the number of elements in the array: ");
        // int n = sc.nextInt();

        // System.out.print("Enter the elements of the array: ");
        // for(int i=0;i<=n-1;i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println("The Elemets of the Array: "+ Arrays.toString(arr));
        // Arrays.sort(arr);
        // System.out.println("Sorted Array: " +  Arrays.toString(arr));
        // System.out.print("Enter the key that needs to be searched: ");
        // int key = 22;//sc.nextInt();

        int start = 0, end = arr.length - 1;

        while(start <= end){
            int mid = (start + end)/2;

            //comparisons
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void reverseArray(){
        // int arr[] = {11,22,33,44,55,88,99};
        // int revArr[] = new int[arr.length];

        // for(int i = 0; i < arr.length; i++){
        //     revArr[i] = arr[arr.length - 1 - i];
        // }

        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(revArr));

        //method -2 
        int arr[] = {11,22,33,44,55,88,99};
        int start = 0;
        int end = arr.length -1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        
        System.out.println(Arrays.toString(arr));

    }

    public static void pairsOfArray(){
        int arr[] = {1,2,3,4,5,6,7};
        for(int i=0;i<=arr.length-1;i++){
            int currentElement = arr[i];
            for(int j=i+1;j<= arr.length-1;j++){
                System.out.print(" ("+ currentElement+","+arr[j]+") ");
            }
            System.out.println();
        }
    }

    public static void subArray(){
        int ts = 0;
        int arr[] = {1,2,3,4,5,6,7,8};
        for(int i=0 ; i<=arr.length-1;i++){
            for(int j = i+1;j<= arr.length-1;j++){
                for(int k=i;k<= j;k++){
                    System.out.print(arr[k]);
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The Total subArray is "+ts);
    }
    

    public static void subarray2(){
        int arr[] = {111,222,333,444};
        for(int i =0;i<= arr.length-1; i++){
            for(int j = i+1; j<= arr.length-1; j++){
                for(int k = i; k<= j;k++){
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
        System.out.println();
        }

    }

    public static void subarray23(){
        int arr[] = {111,222,333,444};
        for(int i =0;i<= arr.length-1; i++){
            for(int j = i+1; j<= arr.length-1; j++){
                for(int k = i; k<= j;k++){
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
        System.out.println();
        }

    }

     public static void subarray22(){
        int arr[] = {111,222,333,444};
        for(int i =0;i<= arr.length-1; i++){
            for(int j = i+1; j<= arr.length-1; j++){
                for(int k = i; k<= j;k++){
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
        System.out.println();
        }

    }
    public static void subarray3(){
        int arr[] = {111,222,333,444};
        for(int i =0;i<= arr.length-1; i++){
            for(int j = i+1; j<= arr.length-1; j++){
                for(int k = i; k<= j;k++){
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
        System.out.println();
        }

    }
    
     public static void subarray35(){
        int arr[] = {111,222,333,444};
        for(int i =0;i<= arr.length-1; i++){
            for(int j = i+1; j<= arr.length-1; j++){
                for(int k = i; k<= j;k++){
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
        System.out.println();
        }

    }
    public static void main(String[] args) {
        
        // linearSearch();
        // largestInArray();
        // int arr[] = {11,22,33,44,55,88,99};
        // int key = 88;
        // System.out.println("the index for key is: "+ BSt(arr,key));
        // pairsOfArray();
    //    subArray();
    subarray2();
    }

}



