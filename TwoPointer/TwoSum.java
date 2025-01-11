class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
           for(int i=0; i<nums.length; i++){
                for (int j=i+1; j<nums.length; j++){
                    if(nums[i]+nums[j] == target){
                        int[] indx = new int[2];
                        indx[0] = i;
                        indx[1] = j;
                        return indx;
                    }
                }
            }
            return null;
        }
        public static void main(String[] args) {
            int[] nums = {2,7,11,15};
            int target = 9;
            int[] output = twoSum(nums,target);
    }
}