import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class test123 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력");
		int dan = Integer.parseInt(scan.nextLine());
		String danStr = "";
		for(int i=1; i<=9; i++) {
			danStr += dan + "*" + i + "=" + (dan*i) +",";
		}
		danStr = danStr.substring(0, danStr.length());
		System.out.println(danStr);
		System.out.println(danStr.length());
	}
}
