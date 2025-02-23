
public class Type1 {
	static int[] findSum(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1 ;
		
		while(left < right)
		{
			int sum = nums[left] + nums[right];
			if(sum > target)
			{
				right--;
			}
			else if (sum < target)
			{
				left++;
				
			}
			else return new int[]{nums[left], nums[right]};
		}
		
		return new int[]{-1,-1};
	}
	public static void main(String[] args) {
		int array[] = {2,5,6,11,14,20,21,25,26};
		int target = 25;
		int[] result = findSum(array, target);
		for (int number : result)
		{
			System.out.println(number);
		}
	}

}
