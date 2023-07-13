package thisisjava.ch02.sec12;

public class PrintfExample {

	public static void main(String[] args) {
		// 콘솔로 변수값 출력
		// 표준 출력 장치인 모니터(명령 프롬프트, 터미널, 콘솔)에 값을 출력하기 위해 System.out.println() 이용
		// 괄호 () 안에 리터럴을 넣으면 리터럴이 그대로 출력되고 변수를 넣으면 저장된 값 출력
		// 시스템으로 출력하는데 괄호 안의 내용을 출력하고 행을 바꿔라
		// System. + out. + println(리터럴 또는 변수);

		// % 형식문자열 시작
		// conversion(변환 문자) 제공되는 값의 타입에 따라 d(정수), f(실수), s(문자열)
		// 형식문자열 포함될 값 두 개 이상인 경우에는 값의 순번(argument_index$) 포함해야한다.
		// flag는 빈 공간 채우는 방법으로 생략되면 왼쪽으로 공백 채워진다
		// -가 오면 오른쪽 공백. 0은 공백 대신 0으로 채운다.
		// width는 소수점 포함한 전체 자릿수
		// .precision은 소수 이하 자릿수
		// % [argument_index$] [flags] [width] [.precision] conversion
		// %와 conversion(변환 문자)는 필수이며 그 외 항목은 모두 생략 가능

		// printf("형식문자열", 형식문자열에 제공될 값)
		// 형식문자열에 맞춰 뒤의 값 출력
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value); // %d : 정수
		System.out.printf("상품의 가격:%6d원\n", value); // %6d : 6자리 정수. 왼쪽 빈자리 공백
		System.out.printf("상품의 가격:%-6d원\n", value); // %-6d : 6자리 정수. 오른쪽 빈자리 공백
		System.out.printf("상품의 가격:%06d원\n", value); // %06 : 6자리 정수. 왼쪽 빈자리 0 채움

		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area); // %10.2f : 정수 7자리 + 소수점 + 소수 2자리. 왼쪽 빈자리 공백

		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
		// %6d : 6자리 정수. 왼쪽 빈자리 공백
		// %-10s : 10자리 문자열. 오른쪽 빈자리 공백
		// %10s :10자리 문자열. 왼쪽 빈자리 공백
	}
}