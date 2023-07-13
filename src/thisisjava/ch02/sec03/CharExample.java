package thisisjava.ch02.sec03;

public class CharExample {

	public static void main(String[] args) {
		// 정수 타입 char 2byte
		// 하나의 문자를 ''로 감싼 것을 문자 리터럴이라 한다.
		// 문자 리터럴은 유니코드로 변환되어 저장된다.

		char c1 = 'A'; // 문자 저장 'A'문자와 매핑되는 유니코드 65로 대입된다.
		char c2 = 65; // char 타입 정수 타입으로 정수인 유니코드 숫자로 직접 대입할 수도 있다.

		char c3 = '가'; // 문자 저장
		char c4 = 44032; // 유니코드 직접 저장

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

//		char c = ''; // char 타입 변수에 어떤 문자도 대입하지 않고 단순히 초기화 목적으로 '' 빈문자 대입하면 컴파일 에러
		char c = ' '; // 공백(유니코드 32) 포함해 초기화
		System.out.println("/" + c + "/");
	}
}