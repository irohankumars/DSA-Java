// import java.util.*;

// public class tripletIsZero {

//     public static List<List<Integer>> threeSum(int nums[]) {

//         Set<List<Integer>> set = new HashSet<>();//is to store triplet set and to remove duplicate set

//         for (int i = 0; i < nums.length; i++) {

//             for (int j = i + 1; j < nums.length; j++) {

//                 for (int k = j + 1; k < nums.length; k++) {

//                     if (nums[i] + nums[j] + nums[k] == 0) {

//                         List<Integer> triplet = new ArrayList<>();// store 1 triplet at a time

//                         triplet.add(nums[i]);
//                         triplet.add(nums[j]);
//                         triplet.add(nums[k]);

//                         Collections.sort(triplet);

//                         set.add(triplet);
//                     }
//                 }
//             }
//         }

//         return new ArrayList<>(set);
//     }

//     public static void main(String args[]) {

//         int nums[] = {-1, 0, 1, 2, -1, -4};

//         List<List<Integer>> result = threeSum(nums);

//         System.out.println(result);
//     }
// }

import java.util.*;

public class tripletIsZero {

public static List<List<Integer>> threesum(int nums []){
    
    int n = nums.length;


    Set<List<Integer>> set = new HashSet<>();

    for(int i=0; i<n; i++){
        for(int j=i+1; j<n; j++){
            for(int k=j+1; k<n; k++){
            
                if(nums[i]+nums[j]+nums[k] == 0){
                    List<Integer> triplet = new ArrayList <> ();

                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);

                    Collections.sort(triplet);

                    set.add(triplet);

                }

            }
        }
    }
    return new ArrayList<>(set);

}


public static void main(String args[]){

    int nums[] = {-1, 0, 1, 2, -1, -4};

    List<List<Integer>> result = threesum(nums);

    System.out.println(result);



}


}