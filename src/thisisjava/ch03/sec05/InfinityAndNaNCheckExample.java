package thisisjava.ch03.sec05;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		// 나눗셈 연산 후 NaN과 Infinity 처리
		// 나눗셈(/), 나머지(%) 연산에서 좌축 피연산자가 정수이고 우측 피연선자가 0일 경우
		// 무한대의 값을 정수로 표현할 수 없어 예외(ArithmeticException) 발생
		// 하지만 좌측 피연산자가 실수이거나 우측 피연산자가 0.0 또는 0,0f인 경우
		// 예외 발생이 아닌 연산 결과는 Infinity(무한대) 또는 NaN(Not a Number)가 된다.

		int x = 5;
		double y = 0.0;
		double z = x / y; // Infinity
//		double z = x % y; // NaN

		// 잘못된 코드
		// Infinity 또는 NaN 상태에서 계속해 연산 수행하면 안된다.
		System.out.println(z + 2); // 어떤 연산을 하더라도 결과는 계속해서 Infinity와 NaN이 되므로 데이터가 엉망이 될 수 있다.

		// 알맞은 코드
		if (Double.isInfinite(z) || Double.isNaN(z)) { // /와 %의 연산 결과가 Infinity 또는 NaN인지 먼저 확인하고
			System.out.println("값 산출 불가");
		} else {
			System.out.println(z + 2); // false인 경우 다음 연산 실행
		}
	}
}