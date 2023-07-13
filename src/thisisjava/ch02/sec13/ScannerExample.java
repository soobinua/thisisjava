package thisisjava.ch02.sec13;

import java.util.Scanner; //Scanner가 java.util 패키지에 있다는 것을 컴파일러에게 알려주는 역할

public class ScannerExample {

	public static void main(String[] args) throws Exception {
		// 키보드 입력 데이터를 변수에 저장
		Scanner scanner = new Scanner(System.in); // 변수 scanner 선언 후 Scanner 객체를 생성하고 생성된 Scanner를 변수에 대입한다.

		System.out.print("x 값 입력 : ");
		String strX = scanner.nextLine(); // 엔터키 입력 전까지 블로킹(대기) 상태가 되며 엔터키 입력 되면 지금까지 입력된 모든 내용을 문자열로 읽는다.
		int x = Integer.parseInt(strX);

		System.out.print("y 값 입력 : ");
		String strY = scanner.nextLine(); // 키보드로 입력된 문자열을 String 변수에 저장
		int y = Integer.parseInt(strY);

		int result = x + y;
		System.out.println("x + y : " + result);
		System.out.println();

		while (true) { // 중괄호{} 안을 무한히 반복 실행
			System.out.print("입력 문자열 : ");
			String data = scanner.nextLine();
			// 자바 기본타입(byte, short, int, long, float, double, boolean) 값 동일한지 비교할 때 == 사용
			// String 타입 값 동일한지 비교할 때 equals() 사용
			if (data.equals("q")) { // 입력된 문자열이 q라면 반복 중지
				break;
			}
			System.out.println("출력 문자열 : " + data);
			System.out.println();
		}
		System.out.println("종료");

		scanner.close();
	}
}