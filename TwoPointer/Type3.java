package twopoint;

public class Type3 {
//	Kiểm tra xem một chuỗi có phải là Palindrome (đối xứng) không.
	static boolean isPalindrome (String s) {
		int left = 0;
		int right = s.length()-1;
		while (left < right)
		{
			if(s.charAt(left)!=s.charAt(right))
			{
				return false;
			}
			left++;
			right --;
		}
		return true;
	}
	public static void main(String[] args) {
		String s1 = "HelleH";
		String s2 = "chuot";
		System.out.println(isPalindrome(s1)?"Yes":"No");
		System.out.println(isPalindrome(s2)?"Yes":"No");
		
	}
}
