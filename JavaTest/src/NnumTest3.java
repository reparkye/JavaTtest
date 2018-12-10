
public class NnumTest3 {

	public static void test(int[] nums,int[][] comp) {
		for(int[] com:comp) {
			int idx = com[0] + com[2]-2;
			System.out.println(nums[idx]);
		}
	}
	
	
	public static void main(String[] args) {
		test(new int[] {1,5,2,6,3,7,4},new int[][] {{2,5,3},{4,4,1},{1,7,3}});
	}
}
