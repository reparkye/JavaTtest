import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		int rNum = r.nextInt(10) + 1;
		System.out.println("숫자를 입력해주세요");
		int num = 0;
		
		while(rNum != num) {
			
		}
		
		/*while(rNum != num) {
			String numStr = scan.next();
			num = Integer.parseInt(numStr);
			if(rNum == num) {
				
			}
		}
		*/
	}
}
