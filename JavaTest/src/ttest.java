import java.util.Scanner;

public class ttest {

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("입력해주셈");
	int dan = Integer.parseInt(scan.nextLine());
	String danStr = "";
	for(int i=1; i<=9; i++) {
		danStr += dan + "*" + i + "=" + (dan*i) + ","; 			
	}
	System.out.println(danStr);
	System.out.println(danStr.length());
	
	danStr = danStr.substring(0, danStr.length()-1);
		//0번째 부터 60-1=59 까지의 값들을 나타내겠다는 표현이다.
		//0번째 즉 3 부터 끝자리,지만 length()-1을 통해 끝자리,를 제거하였기에
		//3*1=3,3*2...... 3*9=27 이 된다.
	System.out.println(danStr);
}
}
