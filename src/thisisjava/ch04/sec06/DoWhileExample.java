package thisisjava.ch04.sec06;

import java.util.Scanner; //Scanner 사용하기 위해 필요

public class DoWhileExample {

	public static void main(String[] args) {
		// do-while문
		// 실행문 먼저 실행 후 조건식의 결과에 따라 반복 실행 결정
		// while() 뒤에 반드시 ; 붙어야 한다.

		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");

		Scanner scanner = new Scanner(System.in); // Scanner 생성
		String inputString;

		do {
			System.out.print(">");
			inputString = scanner.nextLine(); // 키보드로부터 읽기
			System.out.println(inputString);
		} while (!inputString.equals("q")); // 입력된 내용이 q가 아니라면 계속 반복

		System.out.println();
		System.out.println("프로그램 종료");

		scanner.close();
	}
}