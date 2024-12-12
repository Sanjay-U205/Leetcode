public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
    int count=0;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1 && nums[i]==nums[i+1]){
                continue;
            }
            else{
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        // Solution solution = new Solution();
        int nums[] = {1,1,2};
        System.out.println(removeDuplicates(nums));
        // int newLength = solution.removeDuplicates(nums);
        // for (int i = 0; i < newLength; i++) {
        //     System.out.print(nums[i] + " ");
        // }
    }
}
