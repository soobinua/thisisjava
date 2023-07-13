package thisisjava.ch02.sec05;

public class BooleanExample {

	public static void main(String[] args) {
		// 논리 타입
		// 논리 리터럴 true(참), false(거짓)

		// boolean 타입 변수는 주로 두 가지 상태값을 저장할 필요 있을 경우 사용
		// 상태값에 따라 조건문과 제어문의 실행 흐름을 변경하는데 사용
		boolean stop = true;
		if (stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}

		int x = 10;
		boolean result1 = (x == 20); // 변수 x의 값이 20인가?
		boolean result2 = (x != 20); // 변수 x의 값이 20이 아닌가?
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);

	}
}