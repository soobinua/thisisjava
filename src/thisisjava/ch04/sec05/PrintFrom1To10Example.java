package thisisjava.ch04.sec05;

public class PrintFrom1To10Example {

	public static void main(String[] args) {
		// while문
		// 조건식이 true일 경우 계속해서 반복하고 false가 되면 반복 멈추고 while문 종료
		int i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}
	}
}