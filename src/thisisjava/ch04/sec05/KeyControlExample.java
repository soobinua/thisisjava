package thisisjava.ch04.sec05;

import java.util.Scanner; //Scanner 사용하기 위해 필요

public class KeyControlExample {

	public static void main(String[] args) {
		// while문 조건식 true 사용하면 while(true) 무한반복
		// 이 경우 while문 빠져나가기 위해 키보드에서 1, 2를 입력하면 속도 증속, 감속 시키고 3 입력시 프로그램 종료

		Scanner scanner = new Scanner(System.in); // Scanner 생성
		boolean run = true; // while문 조건식을 위한 변수 선언
		int speed = 0;

		// run 변수의 값에 따라 while문 반복 여부 결정
		while (run) { // 처음 run 변수의 값 true이므로 while문 무한 반복
			// 메뉴 생성
			System.out.println("-----------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("-----------------------------");
			System.out.print("선택 : ");

			String strNum = scanner.nextLine(); // 키보드에서 입력하나 내용 읽음

			if (strNum.equals("1")) {
				speed++;
				System.out.println("현재 속도 = " + speed);
			} else if (strNum.equals("2")) {
				speed--;
				System.out.println("현재 속도 = " + speed);
			} else if (strNum.equals("3")) { // 3 입력 시
				run = false; // while문의 조건식을 false로 만들어 무한 반복 종료 후 while문 탈출
				// while문의 또 다른 탈출 방법으로는 break문 이용할 수도 있다.
			}
		}

		System.out.println("프로그램 종료");

		scanner.close();
	}
}