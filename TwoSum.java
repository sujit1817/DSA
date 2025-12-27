
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumUsingHashMap {
    public static int[] twoSum(int nums[], int target){
    
    Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
        int complement = target - nums[i];
        //if map contains complement return i and complement index else put num and i in map
            if(!map.containsKey(complement)){
                map.put(nums[i], i);
            }
            else{
               return new int[] {map.get(complement) , i};
            }
        }
        return new int[]{-1 ,-1};
  }
  public static void main(String[] args){
    int nums[] = {2, 7, 11, 15};
    int target  = 9;
    System.out.println(Arrays.toString(twoSum(nums, target)));
  }
    
}
/* Brute Force */
public class TwoSum {
    public static int[] twoSum(int numbers[], int target){
        for(int i = 0; i < numbers.length ; i++){
            for(int j = i+1; j < numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1}; // invalid data case
    }
    public static void main(String[] args) {
        int numbers[] = {2, 7, 11, 17};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));  
    }
}

