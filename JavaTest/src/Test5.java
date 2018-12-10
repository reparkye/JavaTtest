import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("입력해주세요");
		String str = scan.nextLine();
		scan.close();
		int cnt = 0;
		
		while(str.indexOf("test") != -1) {
		str = str.substring(str.indexOf("ttest")+5);
		
		cnt++;
	}
	System.out.println(cnt);
}
}
