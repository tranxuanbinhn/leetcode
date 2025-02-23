package twopoint;

public class Type4 {
//	Loại bỏ các phần tử trùng trong mảng đã sắp xếp.
	static int removeDup(int[] nums)
	{
		if(nums.length == 0) {
			return 0;
		}
		int k = 1;
		for(int i = 1 ; i < nums.length ; i++)
		{
			if(nums[i]!=nums[i-1]) {
				nums[k] = nums[i];
				k++;
			}
		}
		return k;
	}
	public static void main(String[] args) {
		int [] array = {1,2,3,3,3,4,4,4,5,5,6,7,8,8,8,9};
		
		System.out.println(removeDup(array));
	}
}
