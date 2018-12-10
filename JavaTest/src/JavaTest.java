public class JavaTest {

	public static boolean indexOf(String target,String[] compares) {
		
	    for(int i=0; i<compares.length;i++) {
	    	if(target.equals(compares[i])) {
	    		compares[i] = null;
	    		return true;
	    	}
	    }
	    return false;
	}

	public static void test2(String[] targets, String[] compares) {
		String answer="";
		for(String target:targets) {
			if(!indexOf(target,compares)) {
				answer += target;
			}
		}
	System.out.println(answer);
	}
	public static void main(String[] args) {
		test2(new String[]{"a","a","a","b"},new String[]{"a","a"});
	}
}

