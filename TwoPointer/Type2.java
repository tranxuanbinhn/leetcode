package twopoint;

public class Type2 {
//	Tìm độ dài chuỗi con liên tiếp có tổng nhỏ hơn hoặc bằng k
	
	static int maxSubArrayLen(int []nums, int k)
	{
		int left = 0; int sum = 0;int max = 0;
		for (int right = 0 ; right < nums.length ; right++)
		{
			sum += nums[right];
			while(sum > k)
			{
				sum -= nums[left];
				left ++;
			}
			max = Math.max(max, (right-left)+1);
		}			
		return max;
	}
	public static void main(String[] args) {
		int array[]= {2,3,5,7,11,13,17,23};
		int k = 20;
		System.out.println(maxSubArrayLen(array, k));
	}

}
