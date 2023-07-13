package thisisjava.ch02.sec02;

public class LongExample {

	public static void main(String[] args) {
		// 정수 타입 long 8byte
		// long 타입 수치가 큰 데이터를 다루는 프로그램에서 사용 (ex. 은행, 과학 분야)

		long var1 = 10;
		long var2 = 20L;
//		long var3 = 1000000000000; // 기본적으로 컴파일러는 int로 간주하기 때문에 에러 발생
		long var4 = 1000000000000L; // int 타입 허용 범위 초과하는 리터럴 뒤에 l 또는 L 붙여 long 타입 값임을 컴파일러에게 알려줘야 한다.

		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var4 : " + var4);
	}
}