package honux.calendar;

import java.util.Scanner;//ctrl +shift +m module import

public class Calendar {
	public static void main(String[] args) {
		
		//print the calendar
		System.out.println("일       월      화      수      목      금      토");
		System.out.println("--------------------------");
		System.out.println(" 1   2   3   4   5   6   7");
		System.out.println(" 8   9  10  11  12  13  14");
		System.out.println("15  16  17  18  19  20  21");
		System.out.println("22  23  24  25  26  27  28");
		
		
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		Scanner result = new Scanner(System.in);
		System.out.println("달을 입력하세요.");
		int month = result.nextInt();
		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		//System.out.printf("해당 달의 최대 일수는 %d일입니다", maxDays[month+1]);
		System.out.printf("%d월은 %d일까지 있습니다.\n", month, maxDays[month-1]);
		result.close();
		
	}

}
