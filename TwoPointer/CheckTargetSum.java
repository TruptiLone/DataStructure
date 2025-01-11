/*Example 2: Given a sorted array of unique integers and a target
 integer, return true if there exists a pair of numbers 
 that sum to target, false otherwise. 
 */

public class CheckTargetSum {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6, 8, 9, 14, 15};
        int target = 1;
        int left = 0;
        int right = nums.length - 1;
        if(target < nums[0]){
            System.out.println("Sum not found");  
        }
        while(left<right){
            int curr = nums[left] + nums[right];
            if (curr == target) {
                System.out.println("Sum found : "+nums[left]+" and "+nums[right]);
                return;
            }else if(curr > target){
                right--;

            }else{
                left++;
            }
          
            }
        System.out.println("Sum not found");
        

    }
    
}
