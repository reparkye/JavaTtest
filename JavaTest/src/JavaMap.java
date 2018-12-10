import java.util.HashMap;

public class JavaMap {

	public static void test(String[] a, String[] b) {
		String result="";
		
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<a.length; j++) {
				if(b[i] == a[j]) {
					a[j] = null;
					b[i] = null;
				}
			}
		}
		for(String str : a) {
			if(str != null) {
				result += str + ",";
			}
	}
		result = result.substring(0,result.length()-1);
		System.out.println(result);
}
	
	public static void main(String[] args) {
		String[] a = {"a","a","a","b","c"};
		String[] b = {"c","b","a"};
		test(a,b);
	}
	
}
