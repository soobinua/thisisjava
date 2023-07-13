package thisisjava.ch03.sec10;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		// 대입 연산자
		// 우측 피연산자의 값을 좌측 피연산자인 변수에 대입
		// 우츨 피연산자에는 리터럴, 변수, 다른 연산식이 올 수 있다.
		// 복합 대입 연산자
		// 정해진 연산을 수행한 후 결과를 대입

		int result = 0; // 우측 피연산자의 값을 변수에 저장
		result += 10; // 변수 = 변수 + 피연산자
		System.out.println("result=" + result);
		result -= 5; // 변수 = 변수 - 피연산자
		System.out.println("result=" + result);
		result *= 3; // 변수 = 변수 * 피연산자
		System.out.println("result=" + result);
		result /= 5; // 변수 = 변수 / 피연산자
		System.out.println("result=" + result);
		result %= 3; // 변수 = 변수 % 피연산자
		System.out.println("result=" + result);
	}
}