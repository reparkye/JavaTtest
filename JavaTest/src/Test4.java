import java.util.Scanner;

public class Test4 {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("입력해주세요");
		String str = s.nextLine();
		s.close();
		int cnt = 0;
		while(str.indexOf("test")!= -1) {
			str = str.substring(str.indexOf("test")+4);
			//test 가 0~3이므로 4를 써서 0~3 까지 자른다.
			cnt++;
		}
		System.out.println(cnt);
	}
}
