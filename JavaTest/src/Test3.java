
public class Test3 {

	public static int num = 3;
/*	Test3(){
		num = 3;
	}*/
	
	public static void main(String[] args) {
		Test3 ts = new Test3();
		System.out.println(ts.num);
		ts.num = 10;
		System.out.println(ts.num);
		ts.num = 100;
		ts = new Test3();
		System.out.println(num);
	}
}
