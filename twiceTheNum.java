public class twiceTheNum {
    

    public static boolean twiceTheNum(int arr[]){
        for(int i =0; i<arr.length;i++){
            int currNum = arr[i];
            for(int j=0; j<arr.length; j++){
                if(i!=j && currNum == arr[j]){
                    return  true;
                }
            }
        }
        return false;
        
    }

    public static void main(String args []){
        int arr[] = {1,2,3,1};

        System.out.println(twiceTheNum(arr));


    }
}
