
package honux.calendar;
import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		
		//my solution
		//입력: 키보드로 두 수의 입력을 받는다.
//		Scanner result = new Scanner(System.in);
//		System.out.println("두 수를 입력하세요.");
//		int input1 = result.nextInt();
//		int input2 = result.nextInt();
//		//출력: 화면에 두 수의 합을 출력한다. 
//		System.out.println("두 수의 합은"+ (input1+input2)+"입니다.");
//		
		
		//풀이
		int a, b; //define variables as integer
		Scanner scanner = new Scanner(System.in); //define scanner
		String s1, s2; //define string
		System.out.println("두 수를 입력하세요."); //print question
		s1 = scanner.next(); //take input
		s2 = scanner.next(); //take input
		a = Integer.parseInt(s1); //change input a as integer
		b = Integer.parseInt(s2); //change input b as integer
//		int c = a+b;
//		System.out.println("두 수의 합은 "+ (a+b)+ "입니다.");
		
		System.out.printf("%d와  %d의 수의 합은 %d입니다", a, b, a+b); //printf get the number 
		scanner.close(); //열었던 걸 반드시 끝내야 한다. you need to close if you open the file 
		

	}
}