package BasicSorting;

public class bubbleSort {

    public static void bubbleSort(int nums[]){

        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length-1-i; j++){
                if(nums[j] > nums[j+1]){
                   int temp = nums[j];
                   nums[j] = nums[j+1];
                   nums[j+1] = temp;
                }
            }
        }
        
    }

    public static void printArray(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i] + " ");
        }
        System.out.println();
    }

    

    public static void main(String args[]){
        int nums[] = {5,3,25,67,3,2,31,1,23};
        bubbleSort(nums);
        printArray(nums);


    }
    
}
