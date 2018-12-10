
public class NnumTest {

	public static boolean isPreFix(String[] nums) {
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length; j++) {
				if(i!=j && nums[i].indexOf(nums[j])==0) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isPreFix(new String[] {"123","12","412"}));
	}
}