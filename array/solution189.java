package array;

/**
 * Leetcode189: Rotate array.
 * 给定一个数组，知道数组的长度和移动的步数（往右移动），要求输出移动后的数组。
 * 思路： 首先将移动的步数取余数组的长度，得到规范化后的移动步数。
 * 解法1: 因为是往右移动，因此移动的步数表示最右边会有几个数字移到数组前面，因此可以采用将原数组一分为二，在将两个数组
 * 合并；较笨的方法；
 * 解法2: 要完成rotate。首先将整个数组reverse，然后reverse数组的［0，k－1］，最后reverse数组的［k－1，n－1］
 * 解法3: 解法2的另一种形式，将解法2的三步中的第一步放在最后。
 * 
 * @author qiuyi
 *
 */
public class solution189 {
	/**
	 * 解法2，3
	 * @param nums
	 * @param start
	 * @param end
	 */
	void reverse(int[] nums, int start, int end) {  
        while(start < end) {  
            int temp = nums[start];  
            nums[start] = nums[end];  
            nums[end] = temp;  
            ++start;  
            --end;  
        }  
    }  
    public void rotate(int[] nums, int k) {  
        k = k % nums.length;  
        reverse(nums, 0, nums.length - 1 );  
        reverse(nums, 0, k - 1 );  
        reverse(nums, k, nums.length - 1 );  
    }  
    
    /**
     * 解法1
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        if(k%length == 0) return;
        k = k%length;
        int[] part1 = new int[length-k];
        int[] part2 = new int[k];
        for(int i=0;i<length-k;i++) {
            part1[i] = nums[i];
        }
        for(int i=0;i<k;i++) {
            nums[i] = nums[i+length-k];
        }
        for(int i=k;i<length;i++) {
            nums[i] = part1[i-k];
        }
        
    }
}
